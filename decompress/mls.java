import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Log;
import android.content.Context;
import android.view.View;
import android.util.TypedValue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mls
{
    public static final ThreadLocal<TypedValue> a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    
    static {
        a = new ThreadLocal<TypedValue>();
        b = new int[] { -16842910 };
        c = new int[] { 16842908 };
        d = new int[] { 16842919 };
        e = new int[] { 16842912 };
        f = new int[0];
        g = new int[1];
    }
    
    public static void a(final View view, Context obtainStyledAttributes) {
        obtainStyledAttributes = (Context)obtainStyledAttributes.obtainStyledAttributes(ck1.O0);
        try {
            if (!((TypedArray)obtainStyledAttributes).hasValue(117)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
                Log.e("ThemeUtils", sb.toString());
            }
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public static int b(final Context context, int c) {
        final ColorStateList d = d(context, c);
        if (d != null && d.isStateful()) {
            return d.getColorForState(mls.b, d.getDefaultColor());
        }
        final ThreadLocal<TypedValue> a = mls.a;
        TypedValue typedValue;
        if ((typedValue = a.get()) == null) {
            typedValue = new TypedValue();
            a.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        final float float1 = typedValue.getFloat();
        c = c(context, c);
        return gs4.k(c, Math.round(Color.alpha(c) * float1));
    }
    
    public static int c(final Context context, int color) {
        final int[] g = mls.g;
        g[0] = color;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, g);
        try {
            color = obtainStyledAttributes.getColor(0, 0);
            return color;
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public static ColorStateList d(final Context context, int resourceId) {
        final int[] g = mls.g;
        g[0] = resourceId;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet)null, g);
        Label_0063: {
            final ColorStateList colorStateList;
            Label_0057: {
                try {
                    if (obtainStyledAttributes.hasValue(0)) {
                        resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        if (resourceId != 0 && qli.f(context, resourceId) != null) {
                            break Label_0057;
                        }
                    }
                }
                finally {
                    break Label_0063;
                }
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            obtainStyledAttributes.recycle();
            return colorStateList;
        }
        obtainStyledAttributes.recycle();
    }
}
