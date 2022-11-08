import android.view.View;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lp3 extends xyt
{
    public static final String[] g1;
    
    static {
        g1 = new String[] { "android:changeScroll:x", "android:changeScroll:y" };
    }
    
    public lp3() {
    }
    
    public lp3(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void R(final vzt vzt) {
        vzt.a.put("android:changeScroll:x", vzt.b.getScrollX());
        vzt.a.put("android:changeScroll:y", vzt.b.getScrollY());
    }
    
    @Override
    public final void h(final vzt vzt) {
        this.R(vzt);
    }
    
    @Override
    public final void k(final vzt vzt) {
        this.R(vzt);
    }
    
    @Override
    public final Animator o(final ViewGroup viewGroup, final vzt vzt, final vzt vzt2) {
        final Animator animator = null;
        final Animator animator2 = null;
        Animator b = animator;
        if (vzt != null) {
            if (vzt2 == null) {
                b = animator;
            }
            else {
                final View b2 = vzt2.b;
                final int intValue = vzt.a.get("android:changeScroll:x");
                final int intValue2 = vzt2.a.get("android:changeScroll:x");
                final int intValue3 = vzt.a.get("android:changeScroll:y");
                final int intValue4 = vzt2.a.get("android:changeScroll:y");
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
                b = uzt.b((Animator)ofInt, (Animator)ofInt2);
            }
        }
        return b;
    }
    
    @Override
    public final String[] z() {
        return lp3.g1;
    }
}
