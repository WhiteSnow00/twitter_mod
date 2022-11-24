import android.graphics.Rect;
import java.lang.reflect.Method;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m0n extends View
{
    public static final a Companion;
    public static final int[] K0;
    public static final int[] L0;
    public g1w F0;
    public Boolean G0;
    public Long H0;
    public x16 I0;
    public ptb<vzv> J0;
    
    static {
        Companion = new a();
        K0 = new int[] { 16842919, 16842910 };
        L0 = new int[0];
    }
    
    public m0n(final Context context) {
        super(context);
    }
    
    public static void a(final m0n rippleState$lambda-2) {
        setRippleState$lambda-2(rippleState$lambda-2);
    }
    
    private final void setRippleState(final boolean b) {
        final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        final x16 i0 = this.I0;
        if (i0 != null) {
            this.removeCallbacks((Runnable)i0);
            i0.run();
        }
        final Long h0 = this.H0;
        long longValue;
        if (h0 != null) {
            longValue = h0;
        }
        else {
            longValue = 0L;
        }
        if (!b && currentAnimationTimeMillis - longValue < 5L) {
            this.postDelayed((Runnable)(this.I0 = new x16((Object)this, 2)), 50L);
        }
        else {
            int[] state;
            if (b) {
                state = m0n.K0;
            }
            else {
                state = m0n.L0;
            }
            final g1w f0 = this.F0;
            if (f0 != null) {
                ((Drawable)f0).setState(state);
            }
        }
        this.H0 = currentAnimationTimeMillis;
    }
    
    private static final void setRippleState$lambda-2(final m0n m0n) {
        e0e.f((Object)m0n, "this$0");
        final g1w f0 = m0n.F0;
        if (f0 != null) {
            ((Drawable)f0).setState(m0n.L0);
        }
        m0n.I0 = null;
    }
    
    public final void b(final sxk sxk, final boolean b, final long n, final int n2, final long n3, final float n4, final ptb<vzv> j0) {
        e0e.f((Object)sxk, "interaction");
        e0e.f((Object)j0, "onInvalidateRipple");
        if (this.F0 == null || !e0e.a((Object)b, (Object)this.G0)) {
            final g1w g1w = new g1w(b);
            this.setBackground((Drawable)g1w);
            this.F0 = g1w;
            this.G0 = b;
        }
        final g1w f0 = this.F0;
        e0e.c((Object)f0);
        this.J0 = j0;
        this.e(n, n2, n3, n4);
        if (b) {
            ((Drawable)f0).setHotspot(kgj.d(sxk.a), kgj.e(sxk.a));
        }
        else {
            ((Drawable)f0).setHotspot((float)((Drawable)f0).getBounds().centerX(), (float)((Drawable)f0).getBounds().centerY());
        }
        this.setRippleState(true);
    }
    
    public final void c() {
        this.J0 = null;
        final x16 i0 = this.I0;
        if (i0 != null) {
            this.removeCallbacks((Runnable)i0);
            final x16 i2 = this.I0;
            e0e.c((Object)i2);
            i2.run();
        }
        else {
            final g1w f0 = this.F0;
            if (f0 != null) {
                ((Drawable)f0).setState(m0n.L0);
            }
        }
        final g1w f2 = this.F0;
        if (f2 == null) {
            return;
        }
        ((Drawable)f2).setVisible(false, false);
        this.unscheduleDrawable((Drawable)f2);
    }
    
    public final void d() {
        this.setRippleState(false);
    }
    
    public final void e(final long n, final int n2, long b, float n3) {
        final g1w f0 = this.F0;
        if (f0 == null) {
            return;
        }
        final Integer h0 = f0.H0;
        boolean c = false;
        Label_0132: {
            if (h0 != null) {
                if (h0 == n2) {
                    break Label_0132;
                }
            }
            f0.H0 = n2;
            if (Build$VERSION.SDK_INT < 23) {
                try {
                    if (!g1w.K0) {
                        g1w.K0 = true;
                        g1w.J0 = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    final Method j0 = g1w.J0;
                    if (j0 != null) {
                        j0.invoke(f0, n2);
                    }
                }
                catch (final Exception ex) {}
            }
            else {
                g1w$b.a.a((RippleDrawable)f0, n2);
            }
        }
        float n4 = n3;
        if (Build$VERSION.SDK_INT < 28) {
            n4 = n3 * 2;
        }
        n3 = n4;
        if (n4 > 1.0f) {
            n3 = 1.0f;
        }
        b = sr4.b(b, n3);
        final sr4 g0 = f0.G0;
        if (g0 != null) {
            c = sr4.c(g0.a, b);
        }
        if (!c) {
            f0.G0 = new sr4(b);
            ((RippleDrawable)f0).setColor(ColorStateList.valueOf(yru.I(b)));
        }
        final Rect m = ak1.M(jty.Y(n));
        this.setLeft(m.left);
        this.setTop(m.top);
        this.setRight(m.right);
        this.setBottom(m.bottom);
        ((Drawable)f0).setBounds(m);
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        e0e.f((Object)drawable, "who");
        final ptb<vzv> j0 = this.J0;
        if (j0 != null) {
            j0.invoke();
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public final void refreshDrawableState() {
    }
    
    public static final class a
    {
    }
}
