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

public final class hzm extends View
{
    public static final a Companion;
    public static final int[] H0;
    public static final int[] I0;
    public zzv C0;
    public Boolean D0;
    public Long E0;
    public h16 F0;
    public otb<oyv> G0;
    
    static {
        Companion = new a();
        H0 = new int[] { 16842919, 16842910 };
        I0 = new int[0];
    }
    
    public hzm(final Context context) {
        super(context);
    }
    
    private final void setRippleState(final boolean b) {
        final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        final h16 f0 = this.F0;
        if (f0 != null) {
            this.removeCallbacks((Runnable)f0);
            f0.run();
        }
        final Long e0 = this.E0;
        long longValue;
        if (e0 != null) {
            longValue = e0;
        }
        else {
            longValue = 0L;
        }
        if (!b && currentAnimationTimeMillis - longValue < 5L) {
            this.postDelayed((Runnable)(this.F0 = new h16((Object)this, 2)), 50L);
        }
        else {
            int[] state;
            if (b) {
                state = hzm.H0;
            }
            else {
                state = hzm.I0;
            }
            final zzv c0 = this.C0;
            if (c0 != null) {
                ((Drawable)c0).setState(state);
            }
        }
        this.E0 = currentAnimationTimeMillis;
    }
    
    private static final void setRippleState$lambda-2(final hzm hzm) {
        zzd.f((Object)hzm, "this$0");
        final zzv c0 = hzm.C0;
        if (c0 != null) {
            ((Drawable)c0).setState(hzm.I0);
        }
        hzm.F0 = null;
    }
    
    public final void b(final twk twk, final boolean b, final long n, final int n2, final long n3, final float n4, final otb<oyv> g0) {
        zzd.f((Object)twk, "interaction");
        zzd.f((Object)g0, "onInvalidateRipple");
        if (this.C0 == null || !zzd.a((Object)b, (Object)this.D0)) {
            final zzv zzv = new zzv(b);
            this.setBackground((Drawable)zzv);
            this.C0 = zzv;
            this.D0 = b;
        }
        final zzv c0 = this.C0;
        zzd.c((Object)c0);
        this.G0 = g0;
        this.e(n, n2, n3, n4);
        if (b) {
            ((Drawable)c0).setHotspot(qfj.d(twk.a), qfj.e(twk.a));
        }
        else {
            ((Drawable)c0).setHotspot((float)((Drawable)c0).getBounds().centerX(), (float)((Drawable)c0).getBounds().centerY());
        }
        this.setRippleState(true);
    }
    
    public final void c() {
        this.G0 = null;
        final h16 f0 = this.F0;
        if (f0 != null) {
            this.removeCallbacks((Runnable)f0);
            final h16 f2 = this.F0;
            zzd.c((Object)f2);
            f2.run();
        }
        else {
            final zzv c0 = this.C0;
            if (c0 != null) {
                ((Drawable)c0).setState(hzm.I0);
            }
        }
        final zzv c2 = this.C0;
        if (c2 == null) {
            return;
        }
        ((Drawable)c2).setVisible(false, false);
        this.unscheduleDrawable((Drawable)c2);
    }
    
    public final void d() {
        this.setRippleState(false);
    }
    
    public final void e(final long n, final int n2, long b, float n3) {
        final zzv c0 = this.C0;
        if (c0 == null) {
            return;
        }
        final Integer e0 = c0.E0;
        boolean c2 = false;
        Label_0132: {
            if (e0 != null) {
                if (e0 == n2) {
                    break Label_0132;
                }
            }
            c0.E0 = n2;
            if (Build$VERSION.SDK_INT < 23) {
                try {
                    if (!zzv.H0) {
                        zzv.H0 = true;
                        zzv.G0 = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    final Method g0 = zzv.G0;
                    if (g0 != null) {
                        g0.invoke(c0, n2);
                    }
                }
                catch (final Exception ex) {}
            }
            else {
                zzv$b.a.a((RippleDrawable)c0, n2);
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
        b = pr4.b(b, n3);
        final pr4 d0 = c0.D0;
        if (d0 != null) {
            c2 = pr4.c(d0.a, b);
        }
        if (!c2) {
            c0.D0 = new pr4(b);
            ((RippleDrawable)c0).setColor(ColorStateList.valueOf(m0n.F0(b)));
        }
        final Rect v0 = dml.v0(x3j.O(n));
        this.setLeft(v0.left);
        this.setTop(v0.top);
        this.setRight(v0.right);
        this.setBottom(v0.bottom);
        ((Drawable)c0).setBounds(v0);
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        zzd.f((Object)drawable, "who");
        final otb<oyv> g0 = this.G0;
        if (g0 != null) {
            g0.invoke();
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
