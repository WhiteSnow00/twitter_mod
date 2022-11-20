import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cls
{
    public static final int[] a;
    public static final int[] b;
    
    static {
        a = new int[] { 2130968973 };
        b = new int[] { 2130968978 };
    }
    
    public static void a(final Context context, final AttributeSet set, final int n, final int n2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, wiy.C1, n, n2);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (boolean1) {
            final TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130969866, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, cls.b, "Theme.MaterialComponents");
            }
        }
        c(context, cls.a, "Theme.AppCompat");
    }
    
    public static void b(final Context context, final AttributeSet set, final int[] array, int i, int length, final int... array2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, wiy.C1, i, length);
        final int n = 0;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        Label_0113: {
            if (array2.length == 0) {
                i = n;
                if (obtainStyledAttributes.getResourceId(0, -1) == -1) {
                    break Label_0113;
                }
            }
            else {
                final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, array, i, length);
                for (length = array2.length, i = 0; i < length; ++i) {
                    if (obtainStyledAttributes2.getResourceId(array2[i], -1) == -1) {
                        obtainStyledAttributes2.recycle();
                        i = n;
                        break Label_0113;
                    }
                }
                obtainStyledAttributes2.recycle();
            }
            i = 1;
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }
    
    public static void c(final Context context, final int[] array, final String s) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(array);
        final int n = 0;
        int i = 0;
        while (true) {
            while (i < array.length) {
                if (!obtainStyledAttributes.hasValue(i)) {
                    obtainStyledAttributes.recycle();
                    final int n2 = n;
                    if (n2 != 0) {
                        return;
                    }
                    throw new IllegalArgumentException(da8.j("The style on this component requires your app theme to be ", s, " (or a descendant)."));
                }
                else {
                    ++i;
                }
            }
            obtainStyledAttributes.recycle();
            final int n2 = 1;
            continue;
        }
    }
    
    public static TypedArray d(final Context context, final AttributeSet set, final int[] array, final int n, final int n2, final int... array2) {
        a(context, set, n, n2);
        b(context, set, array, n, n2, array2);
        return context.obtainStyledAttributes(set, array, n, n2);
    }
}
