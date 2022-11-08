import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.content.res.Resources$Theme;
import android.util.Log;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pd9
{
    public static Method a;
    public static boolean b;
    public static Method c;
    public static boolean d;
    
    public static void a(Drawable b) {
        if (Build$VERSION.SDK_INT >= 23) {
            b.clearColorFilter();
        }
        else {
            b.clearColorFilter();
            if (b instanceof InsetDrawable) {
                a(pd9.a.c((InsetDrawable)b));
            }
            else if (b instanceof atx) {
                a(((atx)b).a());
            }
            else if (b instanceof DrawableContainer) {
                final DrawableContainer$DrawableContainerState drawableContainer$DrawableContainerState = (DrawableContainer$DrawableContainerState)((DrawableContainer)b).getConstantState();
                if (drawableContainer$DrawableContainerState != null) {
                    for (int i = 0; i < drawableContainer$DrawableContainerState.getChildCount(); ++i) {
                        b = pd9.a.b(drawableContainer$DrawableContainerState, i);
                        if (b != null) {
                            a(b);
                        }
                    }
                }
            }
        }
    }
    
    public static int b(final Drawable drawable) {
        if (Build$VERSION.SDK_INT >= 23) {
            return pd9.c.a(drawable);
        }
        if (!pd9.d) {
            try {
                (pd9.c = Drawable.class.getDeclaredMethod("getLayoutDirection", (Class<?>[])new Class[0])).setAccessible(true);
            }
            catch (final NoSuchMethodException ex) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", (Throwable)ex);
            }
            pd9.d = true;
        }
        final Method c = pd9.c;
        if (c != null) {
            try {
                return (int)c.invoke(drawable, new Object[0]);
            }
            catch (final Exception ex2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", (Throwable)ex2);
                pd9.c = null;
            }
        }
        return 0;
    }
    
    public static boolean c(final Drawable drawable, final int n) {
        if (Build$VERSION.SDK_INT >= 23) {
            return pd9.c.b(drawable, n);
        }
        if (!pd9.b) {
            try {
                (pd9.a = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE)).setAccessible(true);
            }
            catch (final NoSuchMethodException ex) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", (Throwable)ex);
            }
            pd9.b = true;
        }
        final Method a = pd9.a;
        if (a != null) {
            try {
                a.invoke(drawable, n);
                return true;
            }
            catch (final Exception ex2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", (Throwable)ex2);
                pd9.a = null;
            }
        }
        return false;
    }
    
    public static <T extends Drawable> T d(final Drawable drawable) {
        Drawable a = drawable;
        if (drawable instanceof atx) {
            a = ((atx)drawable).a();
        }
        return (T)a;
    }
    
    public static Drawable e(final Drawable drawable) {
        if (Build$VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof p9t)) {
            return (Drawable)new ctx(drawable);
        }
        return drawable;
    }
    
    public static final class a
    {
        public static int a(final Drawable drawable) {
            return drawable.getAlpha();
        }
        
        public static Drawable b(final DrawableContainer$DrawableContainerState drawableContainer$DrawableContainerState, final int n) {
            return drawableContainer$DrawableContainerState.getChild(n);
        }
        
        public static Drawable c(final InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }
        
        public static boolean d(final Drawable drawable) {
            return drawable.isAutoMirrored();
        }
        
        public static void e(final Drawable drawable, final boolean autoMirrored) {
            drawable.setAutoMirrored(autoMirrored);
        }
    }
    
    public static final class b
    {
        public static void a(final Drawable drawable, final Resources$Theme resources$Theme) {
            drawable.applyTheme(resources$Theme);
        }
        
        public static boolean b(final Drawable drawable) {
            return drawable.canApplyTheme();
        }
        
        public static ColorFilter c(final Drawable drawable) {
            return drawable.getColorFilter();
        }
        
        public static void d(final Drawable drawable, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, set, resources$Theme);
        }
        
        public static void e(final Drawable drawable, final float n, final float n2) {
            drawable.setHotspot(n, n2);
        }
        
        public static void f(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
            drawable.setHotspotBounds(n, n2, n3, n4);
        }
        
        public static void g(final Drawable drawable, final int tint) {
            drawable.setTint(tint);
        }
        
        public static void h(final Drawable drawable, final ColorStateList tintList) {
            drawable.setTintList(tintList);
        }
        
        public static void i(final Drawable drawable, final PorterDuff$Mode tintMode) {
            drawable.setTintMode(tintMode);
        }
    }
    
    public static final class c
    {
        public static int a(final Drawable drawable) {
            return drawable.getLayoutDirection();
        }
        
        public static boolean b(final Drawable drawable, final int layoutDirection) {
            return drawable.setLayoutDirection(layoutDirection);
        }
    }
}
