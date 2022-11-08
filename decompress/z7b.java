import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.view.View;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.animation.StateListAnimator;
import android.os.Build$VERSION;
import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z7b extends d
{
    public z7b(final FloatingActionButton floatingActionButton, final nqp nqp) {
        super(floatingActionButton, nqp);
    }
    
    public final float e() {
        return ((View)super.w).getElevation();
    }
    
    public final void f(final Rect rect) {
        if (((FloatingActionButton.b)super.x).a.N0) {
            super.f(rect);
        }
        else if (super.f && super.w.getSizeDimension() < super.k) {
            final int n = (super.k - super.w.getSizeDimension()) / 2;
            rect.set(n, n, n, n);
        }
        else {
            rect.set(0, 0, 0, 0);
        }
    }
    
    public final void g(final ColorStateList tintList, final PorterDuff$Mode tintMode, final ColorStateList list, final int n) {
        final pqp a = super.a;
        Objects.requireNonNull(a);
        (super.b = new a(a)).setTintList(tintList);
        if (tintMode != null) {
            super.b.setTintMode(tintMode);
        }
        super.b.n(((View)super.w).getContext());
        Object b6;
        if (n > 0) {
            final Context context = ((View)super.w).getContext();
            final pqp a2 = super.a;
            Objects.requireNonNull(a2);
            final r72 d = new r72(a2);
            final int b = eo6.b(context, 2131099842);
            final int b2 = eo6.b(context, 2131099841);
            final int b3 = eo6.b(context, 2131099839);
            final int b4 = eo6.b(context, 2131099840);
            d.i = b;
            d.j = b2;
            d.k = b3;
            d.l = b4;
            final float h = (float)n;
            if (d.h != h) {
                d.h = h;
                d.b.setStrokeWidth(h * 1.3333f);
                d.n = true;
                ((Drawable)d).invalidateSelf();
            }
            d.b(tintList);
            super.d = d;
            final r72 d2 = super.d;
            Objects.requireNonNull(d2);
            final qng b5 = super.b;
            Objects.requireNonNull(b5);
            b6 = new LayerDrawable(new Drawable[] { (Drawable)d2, (Drawable)b5 });
        }
        else {
            super.d = null;
            b6 = super.b;
        }
        final RippleDrawable rippleDrawable = new RippleDrawable(mzm.b(list), (Drawable)b6, (Drawable)null);
        super.c = (Drawable)rippleDrawable;
        super.e = (LayerDrawable)rippleDrawable;
    }
    
    public final void j() {
    }
    
    public final void k() {
        this.v();
    }
    
    public final void l(final int[] array) {
        if (Build$VERSION.SDK_INT == 21) {
            if (((View)super.w).isEnabled()) {
                super.w.setElevation(super.h);
                if (((View)super.w).isPressed()) {
                    super.w.setTranslationZ(super.j);
                }
                else if (!((View)super.w).isFocused() && !((View)super.w).isHovered()) {
                    super.w.setTranslationZ(0.0f);
                }
                else {
                    super.w.setTranslationZ(super.i);
                }
            }
            else {
                super.w.setElevation(0.0f);
                super.w.setTranslationZ(0.0f);
            }
        }
    }
    
    public final void m(final float n, final float n2, final float n3) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT == 21) {
            ((View)super.w).refreshDrawableState();
        }
        else {
            final StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.E, this.x(n, n3));
            stateListAnimator.addState(d.F, this.x(n, n2));
            stateListAnimator.addState(d.G, this.x(n, n2));
            stateListAnimator.addState(d.H, this.x(n, n2));
            final AnimatorSet set = new AnimatorSet();
            final ArrayList list = new ArrayList();
            list.add(ObjectAnimator.ofFloat((Object)super.w, "elevation", new float[] { n }).setDuration(0L));
            if (sdk_INT >= 22 && sdk_INT <= 24) {
                final FloatingActionButton w = super.w;
                list.add(ObjectAnimator.ofFloat((Object)w, View.TRANSLATION_Z, new float[] { ((View)w).getTranslationZ() }).setDuration(100L));
            }
            list.add(ObjectAnimator.ofFloat((Object)super.w, View.TRANSLATION_Z, new float[] { 0.0f }).setDuration(100L));
            set.playSequentially((Animator[])list.toArray(new Animator[0]));
            set.setInterpolator((TimeInterpolator)d.D);
            stateListAnimator.addState(d.I, (Animator)set);
            stateListAnimator.addState(d.J, this.x(0.0f, 0.0f));
            ((View)super.w).setStateListAnimator(stateListAnimator);
        }
        if (this.s()) {
            this.v();
        }
    }
    
    public final void q(final ColorStateList list) {
        final Drawable c = super.c;
        if (c instanceof RippleDrawable) {
            ((RippleDrawable)c).setColor(mzm.b(list));
        }
        else if (c != null) {
            pd9.b.h(c, mzm.b(list));
        }
    }
    
    public final boolean s() {
        final boolean n0 = ((FloatingActionButton.b)super.x).a.N0;
        boolean b = false;
        if (n0 || (super.f && super.w.getSizeDimension() < super.k)) {
            b = true;
        }
        return b;
    }
    
    public final void u() {
    }
    
    public final Animator x(final float n, final float n2) {
        final AnimatorSet set = new AnimatorSet();
        set.play((Animator)ObjectAnimator.ofFloat((Object)super.w, "elevation", new float[] { n }).setDuration(0L)).with((Animator)ObjectAnimator.ofFloat((Object)super.w, View.TRANSLATION_Z, new float[] { n2 }).setDuration(100L));
        set.setInterpolator((TimeInterpolator)d.D);
        return (Animator)set;
    }
    
    public static final class a extends qng
    {
        public a(final pqp pqp) {
            super(pqp);
        }
        
        public final boolean isStateful() {
            return true;
        }
    }
}
