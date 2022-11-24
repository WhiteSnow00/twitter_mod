import android.view.View;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tp3 extends g0u
{
    public static final String[] j1;
    
    static {
        j1 = new String[] { "android:changeScroll:x", "android:changeScroll:y" };
    }
    
    public tp3() {
    }
    
    public tp3(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void R(final e1u e1u) {
        e1u.a.put("android:changeScroll:x", e1u.b.getScrollX());
        e1u.a.put("android:changeScroll:y", e1u.b.getScrollY());
    }
    
    public final void h(final e1u e1u) {
        this.R(e1u);
    }
    
    public final void k(final e1u e1u) {
        this.R(e1u);
    }
    
    public final Animator o(final ViewGroup viewGroup, final e1u e1u, final e1u e1u2) {
        final Animator animator = null;
        final Animator animator2 = null;
        Animator b = animator;
        if (e1u != null) {
            if (e1u2 == null) {
                b = animator;
            }
            else {
                final View b2 = e1u2.b;
                final int intValue = e1u.a.get("android:changeScroll:x");
                final int intValue2 = e1u2.a.get("android:changeScroll:x");
                final int intValue3 = e1u.a.get("android:changeScroll:y");
                final int intValue4 = e1u2.a.get("android:changeScroll:y");
                Object ofInt;
                if (intValue != intValue2) {
                    b2.setScrollX(intValue);
                    ofInt = ObjectAnimator.ofInt((Object)b2, "scrollX", new int[] { intValue, intValue2 });
                }
                else {
                    ofInt = null;
                }
                Object ofInt2 = animator2;
                if (intValue3 != intValue4) {
                    b2.setScrollY(intValue3);
                    ofInt2 = ObjectAnimator.ofInt((Object)b2, "scrollY", new int[] { intValue3, intValue4 });
                }
                b = d1u.b((Animator)ofInt, (Animator)ofInt2);
            }
        }
        return b;
    }
    
    public final String[] z() {
        return tp3.j1;
    }
}
