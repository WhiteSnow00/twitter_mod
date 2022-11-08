import android.graphics.Path;
import java.util.Iterator;
import android.graphics.Typeface;
import android.graphics.PathEffect;
import android.graphics.Canvas;
import android.graphics.Paint$FontMetrics;
import java.util.ArrayList;
import java.util.List;
import android.graphics.DashPathEffect;
import java.util.Objects;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "RtlHardcoded" })
public abstract class mi1<T extends oi1<? extends n2d<? extends z7a>>> extends bu3<T> implements pi1
{
    public kux A1;
    public oyt B1;
    public oyt C1;
    public bux D1;
    public long E1;
    public long F1;
    public RectF G1;
    public Matrix H1;
    public boolean I1;
    public ffg J1;
    public ffg K1;
    public float[] L1;
    public int i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public Paint q1;
    public Paint r1;
    public boolean s1;
    public boolean t1;
    public float u1;
    public boolean v1;
    public bij w1;
    public jux x1;
    public jux y1;
    public kux z1;
    
    public mi1(final Context context, final AttributeSet set) {
        super(context, set);
        this.i1 = 100;
        this.j1 = false;
        this.k1 = false;
        this.l1 = true;
        this.m1 = true;
        this.n1 = true;
        this.o1 = true;
        this.p1 = true;
        this.s1 = false;
        this.t1 = false;
        this.u1 = 15.0f;
        this.v1 = false;
        this.E1 = 0L;
        this.F1 = 0L;
        this.G1 = new RectF();
        new Matrix();
        new Matrix();
        this.H1 = new Matrix();
        new Matrix();
        this.I1 = false;
        this.J1 = ffg.b(0.0, 0.0);
        this.K1 = ffg.b(0.0, 0.0);
        this.L1 = new float[2];
    }
    
    @Override
    public final oyt a(final jux.a a) {
        if (a == jux.a.C0) {
            return this.B1;
        }
        return this.C1;
    }
    
    @Override
    public void b() {
        if (!this.I1) {
            this.m(this.G1);
            final RectF g1 = this.G1;
            final float n = g1.left + 0.0f;
            final float n2 = g1.top + 0.0f;
            final float n3 = g1.right + 0.0f;
            final float n4 = g1.bottom + 0.0f;
            float n5 = n;
            if (this.x1.f()) {
                n5 = n + this.x1.e(((re1)this.z1).f);
            }
            float n6 = n3;
            if (this.y1.f()) {
                n6 = n3 + this.y1.e(((re1)this.A1).f);
            }
            final aux k0 = super.K0;
            float n7 = n4;
            float n8 = n2;
            Label_0221: {
                if (((k16)k0).a) {
                    n7 = n4;
                    n8 = n2;
                    if (((qe1)k0).l) {
                        final float n9 = k0.t + ((k16)k0).c;
                        final int v = k0.v;
                        if (v == 2) {
                            n7 = n4 + n9;
                            n8 = n2;
                        }
                        else {
                            if (v == 1) {
                                n7 = n4;
                            }
                            else {
                                n7 = n4;
                                n8 = n2;
                                if (v != 3) {
                                    break Label_0221;
                                }
                                n7 = n4 + n9;
                            }
                            n8 = n2 + n9;
                        }
                    }
                }
            }
            final float n10 = this.getExtraTopOffset() + n8;
            final float n11 = this.getExtraRightOffset() + n6;
            final float n12 = this.getExtraBottomOffset() + n7;
            final float n13 = this.getExtraLeftOffset() + n5;
            final float c = nmw.c(this.u1);
            super.V0.n(Math.max(c, n13), Math.max(c, n10), Math.max(c, n11), Math.max(c, n12));
            if (super.C0) {
                final StringBuilder z = y70.z("offsetLeft: ", n13, ", offsetTop: ", n10, ", offsetRight: ");
                z.append(n11);
                z.append(", offsetBottom: ");
                z.append(n12);
                Log.i("MPAndroidChart", z.toString());
                final StringBuilder sb = new StringBuilder();
                sb.append("Content: ");
                sb.append(super.V0.b.toString());
                Log.i("MPAndroidChart", sb.toString());
            }
        }
        this.o();
        this.p();
    }
    
    public final void computeScroll() {
        final gu3 p0 = super.P0;
        if (p0 instanceof ni1) {
            final ni1 ni1 = (ni1)p0;
            final gfg s0 = ni1.S0;
            if (s0.b != 0.0f || s0.c != 0.0f) {
                final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                final gfg s2 = ni1.S0;
                s2.b *= ((gu3)ni1).G0.getDragDecelerationFrictionCoef();
                final gfg s3 = ni1.S0;
                s3.c *= ((gu3)ni1).G0.getDragDecelerationFrictionCoef();
                final float n = (currentAnimationTimeMillis - ni1.Q0) / 1000.0f;
                final gfg s4 = ni1.S0;
                final float b = s4.b;
                final float c = s4.c;
                final gfg r0 = ni1.R0;
                final float b2 = r0.b + b * n;
                r0.b = b2;
                final float c2 = r0.c + c * n;
                r0.c = c2;
                final MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, b2, c2, 0);
                ni1.c(obtain);
                obtain.recycle();
                final t9x viewPortHandler = ((gu3)ni1).G0.getViewPortHandler();
                final Matrix h0 = ni1.H0;
                viewPortHandler.m(h0, (View)((gu3)ni1).G0, false);
                ni1.H0 = h0;
                ni1.Q0 = currentAnimationTimeMillis;
                if (Math.abs(ni1.S0.b) < 0.01 && Math.abs(ni1.S0.c) < 0.01) {
                    ((mi1)((gu3)ni1).G0).b();
                    ((View)((gu3)ni1).G0).postInvalidate();
                    ni1.f();
                }
                else {
                    final bu3<?> g0 = ((gu3)ni1).G0;
                    final DisplayMetrics a = nmw.a;
                    ((View)g0).postInvalidateOnAnimation();
                }
            }
        }
    }
    
    public jux getAxisLeft() {
        return this.x1;
    }
    
    public jux getAxisRight() {
        return this.y1;
    }
    
    public bij getDrawListener() {
        return this.w1;
    }
    
    @Override
    public float getHighestVisibleX() {
        final oyt a = this.a(jux.a.C0);
        final RectF b = super.V0.b;
        a.c(b.right, b.bottom, this.K1);
        return (float)Math.min(((qe1)super.K0).q, this.K1.b);
    }
    
    @Override
    public float getLowestVisibleX() {
        final oyt a = this.a(jux.a.C0);
        final RectF b = super.V0.b;
        a.c(b.left, b.bottom, this.J1);
        return (float)Math.max(((qe1)super.K0).r, this.J1.b);
    }
    
    @Override
    public int getMaxVisibleCount() {
        return this.i1;
    }
    
    public float getMinOffset() {
        return this.u1;
    }
    
    public kux getRendererLeftYAxis() {
        return this.z1;
    }
    
    public kux getRendererRightYAxis() {
        return this.A1;
    }
    
    public bux getRendererXAxis() {
        return this.D1;
    }
    
    public float getScaleX() {
        final t9x v0 = super.V0;
        if (v0 == null) {
            return 1.0f;
        }
        return v0.i;
    }
    
    public float getScaleY() {
        final t9x v0 = super.V0;
        if (v0 == null) {
            return 1.0f;
        }
        return v0.j;
    }
    
    public float getVisibleXRange() {
        return Math.abs(this.getHighestVisibleX() - this.getLowestVisibleX());
    }
    
    @Override
    public float getYChartMax() {
        return Math.max(this.x1.q, this.y1.q);
    }
    
    @Override
    public float getYChartMin() {
        return Math.min(this.x1.r, this.y1.r);
    }
    
    @Override
    public void h() {
        super.h();
        this.x1 = new jux(jux.a.C0);
        this.y1 = new jux(jux.a.D0);
        this.B1 = new oyt(super.V0);
        this.C1 = new oyt(super.V0);
        this.z1 = new kux(super.V0, this.x1, this.B1);
        this.A1 = new kux(super.V0, this.y1, this.C1);
        this.D1 = new bux(super.V0, super.K0, this.B1);
        this.setHighlighter(new eu3((T)this));
        super.P0 = (gu3)new ni1(this, super.V0.a);
        (this.q1 = new Paint()).setStyle(Paint$Style.FILL);
        this.q1.setColor(Color.rgb(240, 240, 240));
        (this.r1 = new Paint()).setStyle(Paint$Style.STROKE);
        this.r1.setColor(-16777216);
        this.r1.setStrokeWidth(nmw.c(1.0f));
    }
    
    @Override
    public final void i() {
        if (super.D0 == null) {
            if (super.C0) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
            }
            return;
        }
        if (super.C0) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        final w78 t0 = super.T0;
        if (t0 != null) {
            t0.n();
        }
        this.l();
        final kux z1 = this.z1;
        final jux x1 = this.x1;
        ((re1)z1).e(x1.r, x1.q);
        final kux a1 = this.A1;
        final jux y1 = this.y1;
        ((re1)a1).e(y1.r, y1.q);
        final bux d1 = this.D1;
        final aux k0 = super.K0;
        d1.e(((qe1)k0).r, ((qe1)k0).q);
        if (super.N0 != null) {
            final k7f s0 = super.S0;
            final oi1<? extends n2d<? extends z7a>> d2 = (oi1<? extends n2d<? extends z7a>>)super.D0;
            Objects.requireNonNull(s0.e);
            s0.f.clear();
            for (int i = 0; i < ((du3)d2).d(); ++i) {
                final s2d c = ((du3)d2).c(i);
                final List s2 = c.s();
                final int z2 = c.Z();
                if (c instanceof m2d) {
                    final m2d m2d = (m2d)c;
                    if (m2d.V()) {
                        final String[] w = m2d.W();
                        for (int n = 0; n < s2.size() && n < m2d.t(); ++n) {
                            final ArrayList f = s0.f;
                            final String s3 = w[n % w.length];
                            final int a2 = c.a();
                            final float p = c.p();
                            final float m = c.M();
                            c.H();
                            f.add(new j7f(s3, a2, p, m, null, s2.get(n)));
                        }
                        if (((s2d)m2d).b() != null) {
                            s0.f.add(new j7f(c.b(), 1, Float.NaN, Float.NaN, null, 1122867));
                        }
                        continue;
                    }
                }
                if (c instanceof r3d) {
                    final r3d r3d = (r3d)c;
                    for (int n2 = 0; n2 < s2.size() && n2 < z2; ++n2) {
                        final ArrayList f2 = s0.f;
                        Objects.requireNonNull((sck)((s2d)r3d).o(n2));
                        final int a3 = c.a();
                        final float p2 = c.p();
                        final float j = c.M();
                        c.H();
                        f2.add(new j7f(null, a3, p2, j, null, s2.get(n2)));
                    }
                    if (((s2d)r3d).b() != null) {
                        s0.f.add(new j7f(c.b(), 1, Float.NaN, Float.NaN, null, 1122867));
                    }
                }
                else {
                    if (c instanceof p2d) {
                        final p2d p2d = (p2d)c;
                        if (p2d.e0() != 1122867) {
                            final int e0 = p2d.e0();
                            final int x2 = p2d.x();
                            final ArrayList f3 = s0.f;
                            final int a4 = c.a();
                            final float p3 = c.p();
                            final float l = c.M();
                            c.H();
                            f3.add(new j7f(null, a4, p3, l, null, e0));
                            final ArrayList f4 = s0.f;
                            final String b = c.b();
                            final int a5 = c.a();
                            final float p4 = c.p();
                            final float m2 = c.M();
                            c.H();
                            f4.add(new j7f(b, a5, p4, m2, null, x2));
                            continue;
                        }
                    }
                    for (int n3 = 0; n3 < s2.size() && n3 < z2; ++n3) {
                        String b2;
                        if (n3 < s2.size() - 1 && n3 < z2 - 1) {
                            b2 = null;
                        }
                        else {
                            b2 = ((du3)d2).c(i).b();
                        }
                        final ArrayList f5 = s0.f;
                        final int a6 = c.a();
                        final float p5 = c.p();
                        final float m3 = c.M();
                        c.H();
                        f5.add(new j7f(b2, a6, p5, m3, null, s2.get(n3)));
                    }
                }
            }
            Objects.requireNonNull(s0.e);
            final i7f e2 = s0.e;
            final ArrayList f6 = s0.f;
            Objects.requireNonNull(e2);
            e2.f = (j7f[])f6.toArray(new j7f[f6.size()]);
            Objects.requireNonNull(s0.e);
            s0.c.setTextSize(((k16)s0.e).d);
            s0.c.setColor(((k16)s0.e).e);
            final i7f e3 = s0.e;
            final Paint c2 = s0.c;
            final t9x t9x = (t9x)s0.b;
            Objects.requireNonNull(e3);
            final float c3 = nmw.c(8.0f);
            final float c4 = nmw.c(3.0f);
            final float c5 = nmw.c(5.0f);
            final float c6 = nmw.c(6.0f);
            final float c7 = nmw.c(0.0f);
            final j7f[] f7 = e3.f;
            final int length = f7.length;
            nmw.c(5.0f);
            final j7f[] f8 = e3.f;
            final int length2 = f8.length;
            int n4 = 0;
            float n5 = 0.0f;
            float n6 = 0.0f;
            while (n4 < length2) {
                final j7f j7f = f8[n4];
                float c8;
                if (Float.isNaN(j7f.c)) {
                    c8 = 8.0f;
                }
                else {
                    c8 = j7f.c;
                }
                final float c9 = nmw.c(c8);
                float n7 = n5;
                if (c9 > n5) {
                    n7 = c9;
                }
                final String a7 = j7f.a;
                float n8;
                if (a7 == null) {
                    n8 = n6;
                }
                else {
                    final float n9 = (float)(int)c2.measureText(a7);
                    n8 = n6;
                    if (n9 > n6) {
                        n8 = n9;
                    }
                }
                ++n4;
                n5 = n7;
                n6 = n8;
            }
            final j7f[] f9 = e3.f;
            final int length3 = f9.length;
            float n10 = 0.0f;
            float n12;
            for (int n11 = 0; n11 < length3; ++n11, n10 = n12) {
                final String a8 = f9[n11].a;
                if (a8 == null) {
                    n12 = n10;
                }
                else {
                    final float n13 = (float)nmw.a(c2, a8);
                    n12 = n10;
                    if (n13 > n10) {
                        n12 = n13;
                    }
                }
            }
            final Paint$FontMetrics e4 = nmw.e;
            c2.getFontMetrics(e4);
            final float n14 = e4.descent - e4.ascent;
            final Paint$FontMetrics e5 = nmw.e;
            c2.getFontMetrics(e5);
            final float ascent = e5.ascent;
            final float top = e5.top;
            final float bottom = e5.bottom;
            t9x.a();
            e3.i.clear();
            e3.h.clear();
            e3.j.clear();
            final float n15 = 0.0f;
            int n16 = 0;
            float n17 = 0.0f;
            int n18 = -1;
            float n19 = 0.0f;
            final float n20 = c6;
            final float n21 = c3;
            float n22 = n15;
            while (n16 < length) {
                final j7f j7f2 = f7[n16];
                final boolean b3 = j7f2.b != 1;
                float c10;
                if (Float.isNaN(j7f2.c)) {
                    c10 = n21;
                }
                else {
                    c10 = nmw.c(j7f2.c);
                }
                final String a9 = j7f2.a;
                e3.i.add(Boolean.FALSE);
                float n23;
                if (n18 == -1) {
                    n23 = 0.0f;
                }
                else {
                    n23 = n22 + c4;
                }
                float n25;
                int n26;
                if (a9 != null) {
                    e3.h.add(nmw.b(c2, a9));
                    float n24;
                    if (b3) {
                        n24 = c10 + c5;
                    }
                    else {
                        n24 = 0.0f;
                    }
                    n25 = n23 + n24 + e3.h.get(n16).b;
                    n26 = n18;
                }
                else {
                    e3.h.add(yoa.b(0.0f, 0.0f));
                    if (!b3) {
                        c10 = 0.0f;
                    }
                    final float n27 = n25 = n23 + c10;
                    n26 = n18;
                    if (n18 == -1) {
                        n26 = n16;
                        n25 = n27;
                    }
                }
                float n28;
                if (a9 == null && n16 != length - 1) {
                    n28 = n19;
                }
                else {
                    float n29;
                    if (n19 == 0.0f) {
                        n29 = 0.0f;
                    }
                    else {
                        n29 = n20;
                    }
                    n28 = n29 + n25 + n19;
                    float max = n17;
                    if (n16 == length - 1) {
                        e3.j.add(yoa.b(n28, n14));
                        max = Math.max(n17, n28);
                    }
                    n17 = max;
                }
                n18 = n26;
                if (a9 != null) {
                    n18 = -1;
                }
                ++n16;
                n22 = n25;
                n19 = n28;
            }
            final float n30 = (float)e3.j.size();
            int n31;
            if (e3.j.size() == 0) {
                n31 = 0;
            }
            else {
                n31 = e3.j.size() - 1;
            }
            e3.g = (ascent - top + bottom + c7) * n31 + n14 * n30 + ((k16)e3).c;
        }
        this.b();
    }
    
    public void l() {
        final aux k0 = super.K0;
        final oi1<? extends n2d<? extends z7a>> d0 = (oi1<? extends n2d<? extends z7a>>)super.D0;
        ((qe1)k0).a(((du3)d0).d, ((du3)d0).c);
        final jux x1 = this.x1;
        final oi1 oi1 = (oi1)super.D0;
        final jux.a c0 = jux.a.C0;
        x1.a(((du3)oi1).h(c0), ((du3)super.D0).g(c0));
        final jux y1 = this.y1;
        final oi1 oi2 = (oi1)super.D0;
        final jux.a d2 = jux.a.D0;
        y1.a(((du3)oi2).h(d2), ((du3)super.D0).g(d2));
    }
    
    public final void m(final RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        final i7f n0 = super.N0;
        if (n0 != null && ((k16)n0).a) {
            Objects.requireNonNull(n0);
            Objects.requireNonNull(super.N0);
            Objects.requireNonNull(super.N0);
            final float bottom = rectF.bottom;
            final i7f n2 = super.N0;
            final float g = n2.g;
            final float d = super.V0.d;
            Objects.requireNonNull(n2);
            rectF.bottom = Math.min(g, d * 0.95f) + ((k16)super.N0).c + bottom;
            if (((k16)this.getXAxis()).a && ((qe1)this.getXAxis()).l) {
                rectF.bottom += this.getXAxis().t;
            }
        }
    }
    
    public final void n(final jux.a a) {
        jux jux;
        if (a == jux.a.C0) {
            jux = this.x1;
        }
        else {
            jux = this.y1;
        }
        Objects.requireNonNull(jux);
    }
    
    public final void o() {
        final oyt c1 = this.C1;
        Objects.requireNonNull(this.y1);
        c1.g();
        final oyt b1 = this.B1;
        Objects.requireNonNull(this.x1);
        b1.g();
    }
    
    @Override
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (super.D0 == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.s1) {
            canvas.drawRect(super.V0.b, this.q1);
        }
        if (this.t1) {
            canvas.drawRect(super.V0.b, this.r1);
        }
        final jux x1 = this.x1;
        if (((k16)x1).a) {
            ((re1)this.z1).e(x1.r, x1.q);
        }
        final jux y1 = this.y1;
        if (((k16)y1).a) {
            ((re1)this.A1).e(y1.r, y1.q);
        }
        final aux k0 = super.K0;
        if (((k16)k0).a) {
            this.D1.e(((qe1)k0).r, ((qe1)k0).q);
        }
        this.D1.p(canvas);
        this.z1.o(canvas);
        this.A1.o(canvas);
        if (this.j1) {
            final float lowestVisibleX = this.getLowestVisibleX();
            final float highestVisibleX = this.getHighestVisibleX();
            final oi1 oi1 = (oi1)super.D0;
            final Iterator iterator = ((du3)oi1).i.iterator();
            while (iterator.hasNext()) {
                ((s2d)iterator.next()).u(lowestVisibleX, highestVisibleX);
            }
            ((du3)oi1).a();
            final aux k2 = super.K0;
            final oi1 oi2 = (oi1)super.D0;
            ((qe1)k2).a(((du3)oi2).d, ((du3)oi2).c);
            final jux x2 = this.x1;
            final oi1 oi3 = (oi1)super.D0;
            final jux.a c0 = jux.a.C0;
            x2.a(((du3)oi3).h(c0), ((du3)super.D0).g(c0));
            final jux y2 = this.y1;
            final oi1 oi4 = (oi1)super.D0;
            final jux.a d0 = jux.a.D0;
            y2.a(((du3)oi4).h(d0), ((du3)super.D0).g(d0));
            this.b();
        }
        final bux d2 = this.D1;
        final aux i = d2.i;
        if (((qe1)i).j) {
            if (((k16)i).a) {
                final int save = canvas.save();
                canvas.clipRect(d2.n());
                if (d2.k.length != ((re1)d2).c.h * 2) {
                    d2.k = new float[((qe1)d2.i).h * 2];
                }
                final float[] j = d2.k;
                for (int l = 0; l < j.length; l += 2) {
                    final float[] g = ((qe1)d2.i).g;
                    final int n = l / 2;
                    j[l] = g[n];
                    j[l + 1] = g[n];
                }
                ((re1)d2).d.f(j);
                final Paint e = ((re1)d2).e;
                Objects.requireNonNull(d2.i);
                e.setColor(-7829368);
                final Paint e2 = ((re1)d2).e;
                Objects.requireNonNull(d2.i);
                e2.setStrokeWidth(1.0f);
                final Paint e3 = ((re1)d2).e;
                Objects.requireNonNull(d2.i);
                e3.setPathEffect((PathEffect)null);
                final Path m = d2.j;
                m.reset();
                for (int n2 = 0; n2 < j.length; n2 += 2) {
                    d2.k(canvas, j[n2], j[n2 + 1], m);
                }
                canvas.restoreToCount(save);
            }
        }
        this.z1.p(canvas);
        this.A1.p(canvas);
        Objects.requireNonNull(super.K0);
        Objects.requireNonNull(this.x1);
        Objects.requireNonNull(this.y1);
        final int save2 = canvas.save();
        canvas.clipRect(super.V0.b);
        super.T0.i(canvas);
        if (this.k()) {
            super.T0.k(canvas, super.c1);
        }
        canvas.restoreToCount(save2);
        super.T0.j(canvas);
        Objects.requireNonNull(super.K0);
        this.D1.q(canvas);
        Objects.requireNonNull(this.x1);
        this.z1.q(canvas);
        Objects.requireNonNull(this.y1);
        this.A1.q(canvas);
        this.D1.o(canvas);
        this.z1.n(canvas);
        this.A1.n(canvas);
        super.T0.m(canvas);
        final k7f s0 = super.S0;
        final i7f e4 = s0.e;
        long n3;
        if (!((k16)e4).a) {
            n3 = currentTimeMillis;
        }
        else {
            s0.c.setTextSize(((k16)e4).d);
            s0.c.setColor(((k16)s0.e).e);
            final Paint c2 = s0.c;
            final Paint$FontMetrics g2 = s0.g;
            final DisplayMetrics a = nmw.a;
            c2.getFontMetrics(g2);
            final float n4 = g2.descent - g2.ascent;
            final Paint c3 = s0.c;
            final Paint$FontMetrics g3 = s0.g;
            c3.getFontMetrics(g3);
            final float ascent = g3.ascent;
            final float top = g3.top;
            final float bottom = g3.bottom;
            Objects.requireNonNull(s0.e);
            final float n5 = nmw.c(0.0f) + (ascent - top + bottom);
            final float n6 = n4 - nmw.a(s0.c, "ABC") / 2.0f;
            final j7f[] f = s0.e.f;
            final float c4 = nmw.c(5.0f);
            Objects.requireNonNull(s0.e);
            final float c5 = nmw.c(6.0f);
            Objects.requireNonNull(s0.e);
            Objects.requireNonNull(s0.e);
            Objects.requireNonNull(s0.e);
            Objects.requireNonNull(s0.e);
            Objects.requireNonNull(s0.e);
            final float c6 = nmw.c(8.0f);
            Objects.requireNonNull(s0.e);
            final float c7 = nmw.c(3.0f);
            final i7f e5 = s0.e;
            final float c8 = ((k16)e5).c;
            final float b = ((k16)e5).b;
            final t9x t9x = (t9x)s0.b;
            final float n7 = t9x.b.left + b;
            final ArrayList h = e5.h;
            final ArrayList i2 = e5.i;
            final float d3 = t9x.d;
            final float g4 = e5.g;
            final int length = f.length;
            float n8 = d3 - c8 - g4;
            float n9 = n7;
            int n10 = 0;
            while (true) {
                n3 = currentTimeMillis;
                if (n10 >= length) {
                    break;
                }
                final j7f j7f = f[n10];
                final boolean b2 = j7f.b != 1;
                float c9;
                if (Float.isNaN(j7f.c)) {
                    c9 = c6;
                }
                else {
                    c9 = nmw.c(j7f.c);
                }
                if (n10 < i2.size() && (boolean)i2.get(n10)) {
                    n8 += n4 + n5;
                    n9 = n7;
                }
                final boolean b3 = j7f.a == null;
                if (b2) {
                    s0.e(canvas, n9, n8 + n6, j7f, s0.e);
                    n9 += c9;
                }
                if (!b3) {
                    float n11 = n9;
                    if (b2) {
                        n11 = n9 + c4;
                    }
                    canvas.drawText(j7f.a, n11, n8 + n4, s0.c);
                    n9 = n11 + h.get(n10).b + c5;
                }
                else {
                    n9 += c7;
                }
                ++n10;
            }
        }
        final up8 m2 = super.M0;
        if (m2 != null && ((k16)m2).a) {
            super.I0.setTypeface((Typeface)null);
            super.I0.setTextSize(((k16)super.M0).d);
            super.I0.setColor(((k16)super.M0).e);
            super.I0.setTextAlign(super.M0.f);
            canvas.drawText("Description Label", ((View)this).getWidth() - super.V0.l() - ((k16)super.M0).b, ((View)this).getHeight() - super.V0.k() - ((k16)super.M0).c, super.I0);
        }
        if (super.f1 != null && super.e1) {
            if (this.k()) {
                int n12 = 0;
                while (true) {
                    final flc[] c10 = super.c1;
                    if (n12 >= c10.length) {
                        break;
                    }
                    final flc flc = c10[n12];
                    final s2d c11 = super.D0.c(flc.f);
                    final z7a f2 = super.D0.f(super.c1[n12]);
                    final int i3 = c11.i(f2);
                    if (f2 != null) {
                        final float n13 = (float)i3;
                        final float n14 = (float)c11.Z();
                        Objects.requireNonNull(super.W0);
                        if (n13 <= n14 * 1.0f) {
                            final float[] e6 = this.e(flc);
                            final t9x v0 = super.V0;
                            final float n15 = e6[0];
                            final float n16 = e6[1];
                            if (v0.h(n15) && v0.i(n16)) {
                                super.f1.a(f2, flc);
                                final d3d f3 = super.f1;
                                final float n17 = e6[0];
                                final float n18 = e6[1];
                                final qlg qlg = (qlg)f3;
                                final gfg offset = qlg.getOffset();
                                final gfg d4 = qlg.D0;
                                d4.b = offset.b;
                                d4.c = offset.c;
                                final bu3 chartView = qlg.getChartView();
                                final float n19 = (float)((View)qlg).getWidth();
                                final float n20 = (float)((View)qlg).getHeight();
                                final gfg d5 = qlg.D0;
                                final float b4 = d5.b;
                                if (n17 + b4 < 0.0f) {
                                    d5.b = -n17;
                                }
                                else if (chartView != null && n17 + n19 + b4 > ((View)chartView).getWidth()) {
                                    qlg.D0.b = ((View)chartView).getWidth() - n17 - n19;
                                }
                                final gfg d6 = qlg.D0;
                                final float c12 = d6.c;
                                if (n18 + c12 < 0.0f) {
                                    d6.c = -n18;
                                }
                                else if (chartView != null && n18 + n20 + c12 > ((View)chartView).getHeight()) {
                                    qlg.D0.c = ((View)chartView).getHeight() - n18 - n20;
                                }
                                final gfg d7 = qlg.D0;
                                final int save3 = canvas.save();
                                canvas.translate(n17 + d7.b, n18 + d7.c);
                                ((View)qlg).draw(canvas);
                                canvas.restoreToCount(save3);
                            }
                        }
                    }
                    ++n12;
                }
            }
        }
        if (super.C0) {
            final long n21 = System.currentTimeMillis() - n3;
            final long e7 = this.E1 + n21;
            this.E1 = e7;
            final long f4 = this.F1 + 1L;
            this.F1 = f4;
            final long n22 = e7 / f4;
            final StringBuilder d8 = c0.D("Drawtime: ", n21, " ms, average: ");
            d8.append(n22);
            d8.append(" ms, cycles: ");
            d8.append(this.F1);
            Log.i("MPAndroidChart", d8.toString());
        }
    }
    
    @Override
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        final jux.a c0 = jux.a.C0;
        final float[] l1 = this.L1;
        l1[0] = (l1[1] = 0.0f);
        if (this.v1) {
            final RectF b = super.V0.b;
            l1[0] = b.left;
            l1[1] = b.top;
            this.a(c0).e(this.L1);
        }
        super.onSizeChanged(n, n2, n3, n4);
        if (this.v1) {
            this.a(c0).f(this.L1);
            final t9x v0 = super.V0;
            final float[] l2 = this.L1;
            final Matrix n5 = v0.n;
            n5.reset();
            n5.set(v0.a);
            final float n6 = l2[0];
            final RectF b2 = v0.b;
            n5.postTranslate(-(n6 - b2.left), -(l2[1] - b2.top));
            v0.m(n5, (View)this, true);
        }
        else {
            final t9x v2 = super.V0;
            v2.m(v2.a, (View)this, true);
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        final gu3 p = super.P0;
        if (p == null || super.D0 == null) {
            return false;
        }
        if (!super.L0) {
            return false;
        }
        ((ni1)p).onTouch((View)this, motionEvent);
        return true;
    }
    
    public void p() {
        if (super.C0) {
            final StringBuilder g = w48.g("Preparing Value-Px Matrix, xmin: ");
            g.append(((qe1)super.K0).r);
            g.append(", xmax: ");
            g.append(((qe1)super.K0).q);
            g.append(", xdelta: ");
            g.append(((qe1)super.K0).s);
            Log.i("MPAndroidChart", g.toString());
        }
        final oyt c1 = this.C1;
        final aux k0 = super.K0;
        final float r = ((qe1)k0).r;
        final float s = ((qe1)k0).s;
        final jux y1 = this.y1;
        c1.h(r, s, y1.s, y1.r);
        final oyt b1 = this.B1;
        final aux k2 = super.K0;
        final float r2 = ((qe1)k2).r;
        final float s2 = ((qe1)k2).s;
        final jux x1 = this.x1;
        b1.h(r2, s2, x1.s, x1.r);
    }
    
    public final void q(final float n, final float n2, final float n3, final float n4) {
        this.I1 = true;
        ((View)this).post((Runnable)new Runnable() {
            @Override
            public final void run() {
                mi1.this.V0.n(n, n2, n3, n4);
                mi1.this.o();
                mi1.this.p();
            }
        });
    }
    
    public void setAutoScaleMinMaxEnabled(final boolean j1) {
        this.j1 = j1;
    }
    
    public void setBorderColor(final int color) {
        this.r1.setColor(color);
    }
    
    public void setBorderWidth(final float n) {
        this.r1.setStrokeWidth(nmw.c(n));
    }
    
    public void setDoubleTapToZoomEnabled(final boolean l1) {
        this.l1 = l1;
    }
    
    public void setDragEnabled(final boolean n1) {
        this.n1 = n1;
    }
    
    public void setDragOffsetX(final float n) {
        final t9x v0 = super.V0;
        Objects.requireNonNull(v0);
        v0.l = nmw.c(n);
    }
    
    public void setDragOffsetY(final float n) {
        final t9x v0 = super.V0;
        Objects.requireNonNull(v0);
        v0.m = nmw.c(n);
    }
    
    public void setDrawBorders(final boolean t1) {
        this.t1 = t1;
    }
    
    public void setDrawGridBackground(final boolean s1) {
        this.s1 = s1;
    }
    
    public void setGridBackgroundColor(final int color) {
        this.q1.setColor(color);
    }
    
    public void setHighlightPerDragEnabled(final boolean m1) {
        this.m1 = m1;
    }
    
    public void setKeepPositionOnRotation(final boolean v1) {
        this.v1 = v1;
    }
    
    public void setMaxVisibleValueCount(final int i1) {
        this.i1 = i1;
    }
    
    public void setMinOffset(final float u1) {
        this.u1 = u1;
    }
    
    public void setOnDrawListener(final bij w1) {
        this.w1 = w1;
    }
    
    public void setPinchZoom(final boolean k1) {
        this.k1 = k1;
    }
    
    public void setRendererLeftYAxis(final kux z1) {
        this.z1 = z1;
    }
    
    public void setRendererRightYAxis(final kux a1) {
        this.A1 = a1;
    }
    
    public void setScaleEnabled(final boolean b) {
        this.o1 = b;
        this.p1 = b;
    }
    
    public void setScaleXEnabled(final boolean o1) {
        this.o1 = o1;
    }
    
    public void setScaleYEnabled(final boolean p) {
        this.p1 = p;
    }
    
    public void setVisibleXRangeMaximum(float g) {
        final float n = ((qe1)super.K0).s / g;
        final t9x v0 = super.V0;
        g = n;
        if (n < 1.0f) {
            g = 1.0f;
        }
        v0.g = g;
        v0.j(v0.a, v0.b);
    }
    
    public void setVisibleXRangeMinimum(float h) {
        final float n = ((qe1)super.K0).s / h;
        final t9x v0 = super.V0;
        h = n;
        if (n == 0.0f) {
            h = Float.MAX_VALUE;
        }
        v0.h = h;
        v0.j(v0.a, v0.b);
    }
    
    public void setXAxisRenderer(final bux d1) {
        this.D1 = d1;
    }
}
