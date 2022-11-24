import android.view.View;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import java.util.Objects;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.util.Collections;
import java.util.List;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.ArrayList;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ceg extends Drawable implements Drawable$Callback, Animatable
{
    public final Matrix F0;
    public udg G0;
    public final reg H0;
    public float I0;
    public boolean J0;
    public boolean K0;
    public final ArrayList<o> L0;
    public final ceg$f M0;
    public l6d N0;
    public String O0;
    public k6d P0;
    public mkb Q0;
    public boolean R0;
    public cf6 S0;
    public int T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    
    public ceg() {
        this.F0 = new Matrix();
        final reg h0 = new reg();
        this.H0 = h0;
        this.I0 = 1.0f;
        this.J0 = true;
        this.K0 = false;
        this.L0 = new ArrayList<o>();
        final ValueAnimator$AnimatorUpdateListener m0 = (ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener(this) {
            public final ceg F0;
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final ceg f0 = this.F0;
                final cf6 s0 = f0.S0;
                if (s0 != null) {
                    s0.q(f0.H0.f());
                }
            }
        };
        this.M0 = m0;
        this.T0 = 255;
        this.X0 = true;
        this.Y0 = false;
        ((bn1)h0).addUpdateListener((ValueAnimator$AnimatorUpdateListener)m0);
    }
    
    public final <T> void a(final xqe xqe, final T t, final seg seg) {
        final cf6 s0 = this.S0;
        if (s0 == null) {
            this.L0.add((o)new ceg$e(this, xqe, (Object)t, seg));
            return;
        }
        final xqe c = xqe.c;
        boolean b = true;
        if (xqe == c) {
            s0.e(t, seg);
        }
        else {
            final yqe b2 = xqe.b;
            if (b2 != null) {
                b2.e((Object)t, seg);
            }
            else {
                int i = 0;
                final ArrayList list = new ArrayList();
                this.S0.f(xqe, 0, list, new xqe(new String[0]));
                while (i < list.size()) {
                    ((xqe)list.get(i)).b.e((Object)t, seg);
                    ++i;
                }
                b = (true ^ list.isEmpty());
            }
        }
        if (b) {
            this.invalidateSelf();
            if (t == jeg.C) {
                this.u(this.g());
            }
        }
    }
    
    public final void b() {
        final udg g0 = this.G0;
        final jie.a a = vve.a;
        final Rect j = g0.j;
        final tve tve = new tve((List)Collections.emptyList(), g0, "__container", -1L, 1, -1L, (String)null, (List)Collections.emptyList(), new s80(), 0, 0, 0, 0.0f, 0.0f, j.width(), j.height(), (p80)null, (q80)null, (List)Collections.emptyList(), 1, (f80)null, false);
        final udg g2 = this.G0;
        final cf6 s0 = new cf6(this, tve, g2.i, g2);
        this.S0 = s0;
        if (this.V0) {
            s0.p(true);
        }
    }
    
    public final void c() {
        final reg h0 = this.H0;
        if (h0.P0) {
            h0.cancel();
        }
        this.G0 = null;
        this.S0 = null;
        this.N0 = null;
        final reg h2 = this.H0;
        h2.O0 = null;
        h2.M0 = -2.14748365E9f;
        h2.N0 = 2.14748365E9f;
        this.invalidateSelf();
    }
    
    public final void d(final Canvas canvas) {
        final udg g0 = this.G0;
        int n2;
        final int n = n2 = 1;
        if (g0 != null) {
            if (this.getBounds().isEmpty()) {
                n2 = n;
            }
            else {
                final Rect bounds = this.getBounds();
                final float n3 = bounds.width() / (float)bounds.height();
                final Rect j = g0.j;
                if (n3 == j.width() / (float)j.height()) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
            }
        }
        int save = -1;
        if (n2 == 0) {
            if (this.S0 != null) {
                final Rect bounds2 = this.getBounds();
                float n4 = bounds2.width() / (float)this.G0.j.width();
                float n5 = bounds2.height() / (float)this.G0.j.height();
                int save2 = save;
                float n6 = n4;
                float n7 = n5;
                if (this.X0) {
                    final float min = Math.min(n4, n5);
                    float n8;
                    if (min < 1.0f) {
                        n8 = 1.0f / min;
                        n4 /= n8;
                        n5 /= n8;
                    }
                    else {
                        n8 = 1.0f;
                    }
                    save2 = save;
                    n6 = n4;
                    n7 = n5;
                    if (n8 > 1.0f) {
                        save2 = canvas.save();
                        final float n9 = bounds2.width() / 2.0f;
                        final float n10 = bounds2.height() / 2.0f;
                        final float n11 = n9 * min;
                        final float n12 = min * n10;
                        canvas.translate(n9 - n11, n10 - n12);
                        canvas.scale(n8, n8, n11, n12);
                        n7 = n5;
                        n6 = n4;
                    }
                }
                this.F0.reset();
                this.F0.preScale(n6, n7);
                this.S0.g(canvas, this.F0, this.T0);
                if (save2 > 0) {
                    canvas.restoreToCount(save2);
                }
            }
        }
        else if (this.S0 != null) {
            final float i0 = this.I0;
            float min2 = Math.min(canvas.getWidth() / (float)this.G0.j.width(), canvas.getHeight() / (float)this.G0.j.height());
            float n13;
            if (i0 > min2) {
                n13 = this.I0 / min2;
            }
            else {
                min2 = i0;
                n13 = 1.0f;
            }
            if (n13 > 1.0f) {
                save = canvas.save();
                final float n14 = this.G0.j.width() / 2.0f;
                final float n15 = this.G0.j.height() / 2.0f;
                final float n16 = n14 * min2;
                final float n17 = n15 * min2;
                final float i2 = this.I0;
                canvas.translate(n14 * i2 - n16, i2 * n15 - n17);
                canvas.scale(n13, n13, n16, n17);
            }
            this.F0.reset();
            this.F0.preScale(min2, min2);
            this.S0.g(canvas, this.F0, this.T0);
            if (save > 0) {
                canvas.restoreToCount(save);
            }
        }
    }
    
    public final void draw(final Canvas canvas) {
        this.Y0 = false;
        if (this.K0) {
            try {
                this.d(canvas);
            }
            finally {
                Objects.requireNonNull(kag.a);
            }
        }
        else {
            this.d(canvas);
        }
        tpz.y();
    }
    
    public final float e() {
        return this.H0.g();
    }
    
    public final float f() {
        return this.H0.h();
    }
    
    public final float g() {
        return this.H0.f();
    }
    
    public final int getAlpha() {
        return this.T0;
    }
    
    public final int getIntrinsicHeight() {
        final udg g0 = this.G0;
        int n;
        if (g0 == null) {
            n = -1;
        }
        else {
            n = (int)(g0.j.height() * this.I0);
        }
        return n;
    }
    
    public final int getIntrinsicWidth() {
        final udg g0 = this.G0;
        int n;
        if (g0 == null) {
            n = -1;
        }
        else {
            n = (int)(g0.j.width() * this.I0);
        }
        return n;
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final int h() {
        return ((ValueAnimator)this.H0).getRepeatCount();
    }
    
    public final boolean i() {
        final reg h0 = this.H0;
        return h0 != null && h0.P0;
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        final Drawable$Callback callback = this.getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable((Drawable)this);
    }
    
    public final void invalidateSelf() {
        if (this.Y0) {
            return;
        }
        this.Y0 = true;
        final Drawable$Callback callback = this.getCallback();
        if (callback != null) {
            callback.invalidateDrawable((Drawable)this);
        }
    }
    
    public final boolean isRunning() {
        return this.i();
    }
    
    public final void j() {
        if (this.S0 == null) {
            this.L0.add((o)new ceg$g(this));
            return;
        }
        if (this.J0 || this.h() == 0) {
            final reg h0 = this.H0;
            h0.P0 = true;
            ((bn1)h0).c(h0.i());
            float n;
            if (h0.i()) {
                n = h0.g();
            }
            else {
                n = h0.h();
            }
            h0.l((float)(int)n);
            h0.J0 = 0L;
            h0.L0 = 0;
            h0.j();
        }
        if (!this.J0) {
            float n2;
            if (this.H0.H0 < 0.0f) {
                n2 = this.f();
            }
            else {
                n2 = this.e();
            }
            this.l((int)n2);
            this.H0.e();
        }
    }
    
    public final void k() {
        if (this.S0 == null) {
            this.L0.add((o)new ceg$h(this));
            return;
        }
        if (this.J0 || this.h() == 0) {
            final reg h0 = this.H0;
            h0.P0 = true;
            h0.j();
            h0.J0 = 0L;
            if (h0.i() && h0.K0 == h0.h()) {
                h0.K0 = h0.g();
            }
            else if (!h0.i() && h0.K0 == h0.g()) {
                h0.K0 = h0.h();
            }
        }
        if (!this.J0) {
            float n;
            if (this.H0.H0 < 0.0f) {
                n = this.f();
            }
            else {
                n = this.e();
            }
            this.l((int)n);
            this.H0.e();
        }
    }
    
    public final void l(final int n) {
        if (this.G0 == null) {
            this.L0.add((o)new ceg$c(this, n));
            return;
        }
        this.H0.l((float)n);
    }
    
    public final void m(final int n) {
        if (this.G0 == null) {
            this.L0.add((o)new ceg$k(this, n));
            return;
        }
        final reg h0 = this.H0;
        h0.m(h0.M0, n + 0.99f);
    }
    
    public final void n(final String s) {
        final udg g0 = this.G0;
        if (g0 == null) {
            this.L0.add((o)new ceg$n(this, s));
            return;
        }
        final dmg c = g0.c(s);
        if (c != null) {
            this.m((int)(c.b + c.c));
            return;
        }
        throw new IllegalArgumentException(c0e.h("Cannot find marker with name ", s, "."));
    }
    
    public final void o(final float n) {
        final udg g0 = this.G0;
        if (g0 == null) {
            this.L0.add((o)new ceg$l(this, n));
            return;
        }
        final float k = g0.k;
        final float l = g0.l;
        final PointF a = bch.a;
        this.m((int)va.d(l, k, n, k));
    }
    
    public final void p(final int n, final int n2) {
        if (this.G0 == null) {
            this.L0.add((o)new ceg$b(this, n, n2));
            return;
        }
        this.H0.m((float)n, n2 + 0.99f);
    }
    
    public final void q(final String s) {
        final udg g0 = this.G0;
        if (g0 == null) {
            this.L0.add((o)new ceg$a(this, s));
            return;
        }
        final dmg c = g0.c(s);
        if (c != null) {
            final int n = (int)c.b;
            this.p(n, (int)c.c + n);
            return;
        }
        throw new IllegalArgumentException(c0e.h("Cannot find marker with name ", s, "."));
    }
    
    public final void r(final int n) {
        if (this.G0 == null) {
            this.L0.add((o)new ceg$i(this, n));
            return;
        }
        final reg h0 = this.H0;
        h0.m((float)n, (float)(int)h0.N0);
    }
    
    public final void s(final String s) {
        final udg g0 = this.G0;
        if (g0 == null) {
            this.L0.add((o)new ceg$m(this, s));
            return;
        }
        final dmg c = g0.c(s);
        if (c != null) {
            this.r((int)c.b);
            return;
        }
        throw new IllegalArgumentException(c0e.h("Cannot find marker with name ", s, "."));
    }
    
    public final void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
        final Drawable$Callback callback = this.getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable((Drawable)this, runnable, n);
    }
    
    public final void setAlpha(final int t0) {
        this.T0 = t0;
        this.invalidateSelf();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        kag.b("Use addColorFilter instead.");
    }
    
    public final void start() {
        final Drawable$Callback callback = this.getCallback();
        if (callback instanceof View && !((View)callback).isInEditMode()) {
            this.j();
        }
    }
    
    public final void stop() {
        this.L0.clear();
        this.H0.e();
    }
    
    public final void t(final float n) {
        final udg g0 = this.G0;
        if (g0 == null) {
            this.L0.add((o)new ceg$j(this, n));
            return;
        }
        final float k = g0.k;
        final float l = g0.l;
        final PointF a = bch.a;
        this.r((int)va.d(l, k, n, k));
    }
    
    public final void u(final float n) {
        final udg g0 = this.G0;
        if (g0 == null) {
            this.L0.add((o)new ceg$d(this, n));
            return;
        }
        final reg h0 = this.H0;
        final float k = g0.k;
        final float l = g0.l;
        final PointF a = bch.a;
        h0.l((l - k) * n + k);
        tpz.y();
    }
    
    public final void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
        final Drawable$Callback callback = this.getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable((Drawable)this, runnable);
    }
    
    public interface o
    {
        void run();
    }
}
