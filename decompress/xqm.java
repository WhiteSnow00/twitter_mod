import android.os.Looper;
import android.os.Handler;
import android.content.res.Configuration;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.graphics.Typeface;
import android.content.Context;
import android.content.res.Resources$NotFoundException;
import android.os.Build$VERSION;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
import android.util.TypedValue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xqm
{
    public static final ThreadLocal<TypedValue> a;
    public static final WeakHashMap<d, SparseArray<c>> b;
    public static final Object c;
    
    static {
        a = new ThreadLocal<TypedValue>();
        b = new WeakHashMap<d, SparseArray<c>>(0);
        c = new Object();
    }
    
    public static int a(final Resources resources, final int n, final Resources$Theme resources$Theme) throws Resources$NotFoundException {
        if (Build$VERSION.SDK_INT >= 23) {
            return xqm.b.a(resources, n, resources$Theme);
        }
        return resources.getColor(n);
    }
    
    public static Typeface b(final Context context, final int n) throws Resources$NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, n, new TypedValue(), 0, null, false, false);
    }
    
    public static Typeface c(final Context context, final int n, final TypedValue typedValue, final int n2, final e e, final boolean b, final boolean b2) {
        final Resources resources = context.getResources();
        resources.getValue(n, typedValue, true);
        final CharSequence string = typedValue.string;
        if (string == null) {
            final StringBuilder g = w48.g("Resource \"");
            g.append(resources.getResourceName(n));
            g.append("\" (");
            g.append(Integer.toHexString(n));
            g.append(") is not a Font: ");
            g.append(typedValue);
            throw new Resources$NotFoundException(g.toString());
        }
        final String string2 = string.toString();
        final boolean startsWith = string2.startsWith("res/");
        final Typeface typeface = null;
        Typeface typeface2 = null;
        Label_0350: {
            if (!startsWith) {
                typeface2 = typeface;
                if (e != null) {
                    e.a(-3);
                    typeface2 = typeface;
                }
            }
            else {
                final Typeface typeface3 = (Typeface)ilv.b.c((Object)ilv.c(resources, n, string2, typedValue.assetCookie, n2));
                if (typeface3 != null) {
                    if (e != null) {
                        e.b(typeface3);
                    }
                    typeface2 = typeface3;
                }
                else if (b2) {
                    typeface2 = typeface;
                }
                else {
                    try {
                        if (!string2.toLowerCase().endsWith(".xml")) {
                            typeface2 = ilv.b(context, resources, n, string2, typedValue.assetCookie, n2);
                            if (e != null) {
                                if (typeface2 != null) {
                                    e.b(typeface2);
                                }
                                else {
                                    e.a(-3);
                                }
                            }
                            break Label_0350;
                        }
                        final klb$b a = klb.a((XmlPullParser)resources.getXml(n), resources);
                        if (a != null) {
                            typeface2 = ilv.a(context, a, resources, n, string2, typedValue.assetCookie, n2, e, b);
                            break Label_0350;
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        typeface2 = typeface;
                        if (e != null) {
                            e.a(-3);
                            typeface2 = typeface;
                        }
                        break Label_0350;
                    }
                    catch (final IOException ex) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Failed to read xml resource ");
                        sb.append(string2);
                        Log.e("ResourcesCompat", sb.toString(), (Throwable)ex);
                    }
                    catch (final XmlPullParserException ex2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to parse xml resource ");
                        sb2.append(string2);
                        Log.e("ResourcesCompat", sb2.toString(), (Throwable)ex2);
                    }
                    typeface2 = typeface;
                    if (e != null) {
                        e.a(-3);
                        typeface2 = typeface;
                    }
                }
            }
        }
        if (typeface2 == null && e == null && !b2) {
            final StringBuilder g2 = w48.g("Font resource ID #0x");
            g2.append(Integer.toHexString(n));
            g2.append(" could not be retrieved.");
            throw new Resources$NotFoundException(g2.toString());
        }
        return typeface2;
    }
    
    public static final class a
    {
        public static Drawable a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
            return resources.getDrawable(n, resources$Theme);
        }
        
        public static Drawable b(final Resources resources, final int n, final int n2, final Resources$Theme resources$Theme) {
            return resources.getDrawableForDensity(n, n2, resources$Theme);
        }
    }
    
    public static final class b
    {
        public static int a(final Resources resources, final int n, final Resources$Theme resources$Theme) {
            return resources.getColor(n, resources$Theme);
        }
        
        public static ColorStateList b(final Resources resources, final int n, final Resources$Theme resources$Theme) {
            return resources.getColorStateList(n, resources$Theme);
        }
    }
    
    public static final class c
    {
        public final ColorStateList a;
        public final Configuration b;
        public final int c;
        
        public c(final ColorStateList a, final Configuration b, final Resources$Theme resources$Theme) {
            this.a = a;
            this.b = b;
            int hashCode;
            if (resources$Theme == null) {
                hashCode = 0;
            }
            else {
                hashCode = resources$Theme.hashCode();
            }
            this.c = hashCode;
        }
    }
    
    public static final class d
    {
        public final Resources a;
        public final Resources$Theme b;
        
        public d(final Resources a, final Resources$Theme b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && d.class == o.getClass()) {
                final d d = (d)o;
                if (!this.a.equals(d.a) || !a5j.a((Object)this.b, (Object)d.b)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return a5j.b(new Object[] { this.a, this.b });
        }
    }
    
    public abstract static class e
    {
        public static Handler c() {
            return new Handler(Looper.getMainLooper());
        }
        
        public final void a(final int n) {
            c().post((Runnable)new zqm((Object)this, n, 0));
        }
        
        public final void b(final Typeface typeface) {
            c().post((Runnable)new yqm((Object)this, (Object)typeface, 0));
        }
        
        public abstract void d(final int p0);
        
        public abstract void e(final Typeface p0);
    }
}
