import android.util.Log;
import android.os.Build$VERSION;
import android.graphics.Color;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r0n
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final String e;
    
    static {
        a = new int[] { 16842919 };
        b = new int[] { 16842913, 16842919 };
        c = new int[] { 16842913 };
        d = new int[] { 16842910, 16842919 };
        e = r0n.class.getSimpleName();
    }
    
    public static int a(final ColorStateList list, final int[] array) {
        int colorForState;
        if (list != null) {
            colorForState = list.getColorForState(array, list.getDefaultColor());
        }
        else {
            colorForState = 0;
        }
        return ks4.k(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
    
    public static ColorStateList b(final ColorStateList list) {
        if (list != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 22 && sdk_INT <= 27 && Color.alpha(list.getDefaultColor()) == 0 && Color.alpha(list.getColorForState(r0n.d, 0)) != 0) {
                Log.w(r0n.e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return list;
        }
        return ColorStateList.valueOf(0);
    }
    
    public static boolean c(final int[] array) {
        final int length = array.length;
        final boolean b = false;
        int i = 0;
        int n = 0;
        boolean b2 = false;
        while (i < length) {
            final int n2 = array[i];
            int n3 = 0;
            Label_0075: {
                if (n2 == 16842910) {
                    n3 = 1;
                }
                else {
                    if (n2 != 16842908) {
                        if (n2 != 16842919) {
                            n3 = n;
                            if (n2 != 16843623) {
                                break Label_0075;
                            }
                        }
                    }
                    b2 = true;
                    n3 = n;
                }
            }
            ++i;
            n = n3;
        }
        boolean b3 = b;
        if (n != 0) {
            b3 = b;
            if (b2) {
                b3 = true;
            }
        }
        return b3;
    }
}
