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

public final class zo3 extends xyt
{
    public static final String[] g1;
    
    static {
        g1 = new String[] { "android:clipBounds:clip" };
    }
    
    public zo3(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void R(final vzt vzt) {
        final View b = vzt.b;
        if (b.getVisibility() == 8) {
            return;
        }
        final WeakHashMap a = p5x.a;
        final Rect a2 = p5x$f.a(b);
        vzt.a.put("android:clipBounds:clip", a2);
        if (a2 == null) {
            vzt.a.put("android:clipBounds:bounds", new Rect(0, 0, b.getWidth(), b.getHeight()));
        }
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
        Object ofObject;
        final Object o = ofObject = null;
        if (vzt != null) {
            ofObject = o;
            if (vzt2 != null) {
                ofObject = o;
                if (vzt.a.containsKey("android:clipBounds:clip")) {
                    if (!vzt2.a.containsKey("android:clipBounds:clip")) {
                        ofObject = o;
                    }
                    else {
                        final Rect rect = vzt.a.get("android:clipBounds:clip");
                        final Rect rect2 = vzt2.a.get("android:clipBounds:clip");
                        final boolean b = rect2 == null;
                        if (rect == null && rect2 == null) {
                            return null;
                        }
                        Rect rect3;
                        Rect rect4;
                        if (rect == null) {
                            rect3 = vzt.a.get("android:clipBounds:bounds");
                            rect4 = rect2;
                        }
                        else {
                            rect3 = rect;
                            if ((rect4 = rect2) == null) {
                                rect4 = vzt2.a.get("android:clipBounds:bounds");
                                rect3 = rect;
                            }
                        }
                        if (rect3.equals((Object)rect4)) {
                            return null;
                        }
                        final View b2 = vzt2.b;
                        final WeakHashMap a = p5x.a;
                        p5x$f.c(b2, rect3);
                        final ObjectAnimator objectAnimator = (ObjectAnimator)(ofObject = ObjectAnimator.ofObject((Object)vzt2.b, (Property)rbx.c, (TypeEvaluator)new o5m(new Rect()), (Object[])new Rect[] { rect3, rect4 }));
                        if (b) {
                            ((Animator)objectAnimator).addListener((Animator$AnimatorListener)new zo3$a(vzt2.b));
                            ofObject = objectAnimator;
                        }
                    }
                }
            }
        }
        return (Animator)ofObject;
    }
    
    @Override
    public final String[] z() {
        return zo3.g1;
    }
}
