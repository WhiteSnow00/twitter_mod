import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kfx extends g7r
{
    public static final String[] G0;
    
    static {
        G0 = new String[] { "android:visibilityPropagation:visibility", "android:visibilityPropagation:center" };
    }
    
    public kfx() {
        super(2);
    }
    
    public final int N(final e1u e1u) {
        if (e1u == null) {
            return 8;
        }
        final Integer n = e1u.a.get("android:visibilityPropagation:visibility");
        if (n == null) {
            return 8;
        }
        return n;
    }
    
    public final int O(final e1u e1u) {
        if (e1u != null) {
            final int[] array = e1u.a.get("android:visibilityPropagation:center");
            if (array != null) {
                return array[0];
            }
        }
        return -1;
    }
    
    public final int P(final e1u e1u) {
        if (e1u != null) {
            final int[] array = e1u.a.get("android:visibilityPropagation:center");
            if (array != null) {
                return array[1];
            }
        }
        return -1;
    }
    
    public final void l(final e1u e1u) {
        final View b = e1u.b;
        Integer value;
        if ((value = e1u.a.get("android:visibility:visibility")) == null) {
            value = b.getVisibility();
        }
        e1u.a.put("android:visibilityPropagation:visibility", value);
        final int[] array = new int[2];
        b.getLocationOnScreen(array);
        array[0] += Math.round(b.getTranslationX());
        array[0] += b.getWidth() / 2;
        array[1] += Math.round(b.getTranslationY());
        array[1] += b.getHeight() / 2;
        e1u.a.put("android:visibilityPropagation:center", array);
    }
    
    public final void t() {
    }
}
