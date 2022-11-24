import android.animation.Animator$AnimatorListener;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import android.view.View;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gp3 extends g0u
{
    public static final String[] j1;
    
    static {
        j1 = new String[] { "android:clipBounds:clip" };
    }
    
    public gp3(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void R(final e1u e1u) {
        final View b = e1u.b;
        if (b.getVisibility() == 8) {
            return;
        }
        final WeakHashMap a = b7x.a;
        final Rect a2 = b7x$f.a(b);
        e1u.a.put("android:clipBounds:clip", a2);
        if (a2 == null) {
            e1u.a.put("android:clipBounds:bounds", new Rect(0, 0, b.getWidth(), b.getHeight()));
        }
    }
    
    public final void h(final e1u e1u) {
        this.R(e1u);
    }
    
    public final void k(final e1u e1u) {
        this.R(e1u);
    }
    
    public final Animator o(final ViewGroup viewGroup, final e1u e1u, final e1u e1u2) {
        Object ofObject;
        final Object o = ofObject = null;
        if (e1u != null) {
            ofObject = o;
            if (e1u2 != null) {
                ofObject = o;
                if (e1u.a.containsKey("android:clipBounds:clip")) {
                    if (!e1u2.a.containsKey("android:clipBounds:clip")) {
                        ofObject = o;
                    }
                    else {
                        final Rect rect = e1u.a.get("android:clipBounds:clip");
                        final Rect rect2 = e1u2.a.get("android:clipBounds:clip");
                        final boolean b = rect2 == null;
                        if (rect == null && rect2 == null) {
                            return null;
                        }
                        Rect rect3;
                        Rect rect4;
                        if (rect == null) {
                            rect3 = e1u.a.get("android:clipBounds:bounds");
                            rect4 = rect2;
                        }
                        else {
                            rect3 = rect;
                            if ((rect4 = rect2) == null) {
                                rect4 = e1u2.a.get("android:clipBounds:bounds");
                                rect3 = rect;
                            }
                        }
                        if (rect3.equals((Object)rect4)) {
                            return null;
                        }
                        final View b2 = e1u2.b;
                        final WeakHashMap a = b7x.a;
                        b7x$f.c(b2, rect3);
                        final ObjectAnimator objectAnimator = (ObjectAnimator)(ofObject = ObjectAnimator.ofObject((Object)e1u2.b, (Property)fdx.c, (TypeEvaluator)new q6m(new Rect()), (Object[])new Rect[] { rect3, rect4 }));
                        if (b) {
                            ((Animator)objectAnimator).addListener((Animator$AnimatorListener)new gp3$a(e1u2.b));
                            ofObject = objectAnimator;
                        }
                    }
                }
            }
        }
        return (Animator)ofObject;
    }
    
    public final String[] z() {
        return gp3.j1;
    }
}
