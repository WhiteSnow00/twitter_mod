import java.util.ArrayList;
import android.graphics.Paint$Style;
import android.graphics.PathEffect;
import android.util.DisplayMetrics;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Objects;
import android.graphics.Paint$Align;
import android.graphics.RectF;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public class kvx extends qe1
{
    public jvx N0;
    public Path O0;
    public float[] P0;
    public RectF Q0;
    public float[] R0;
    public RectF S0;
    public float[] T0;
    public Path U0;
    
    public kvx(final hbx hbx, final jvx n0, final xzt xzt) {
        super(hbx, xzt, (pe1)n0);
        this.O0 = new Path();
        this.P0 = new float[2];
        this.Q0 = new RectF();
        this.R0 = new float[2];
        this.S0 = new RectF();
        this.T0 = new float[4];
        this.U0 = new Path();
        this.N0 = n0;
        super.K0.setColor(-16777216);
        super.K0.setTextAlign(Paint$Align.CENTER);
        super.K0.setTextSize(xnw.c(10.0f));
    }
    
    @Override
    public void e(float n, final float n2) {
        float n3 = n;
        float n4 = n2;
        if (((hbx)super.G0).a() > 10.0f) {
            n3 = n;
            n4 = n2;
            if (!((hbx)super.G0).b()) {
                final xzt i0 = super.I0;
                final RectF b = ((hbx)super.G0).b;
                final pfg b2 = i0.b(b.left, b.top);
                final xzt i2 = super.I0;
                final RectF b3 = ((hbx)super.G0).b;
                final pfg b4 = i2.b(b3.right, b3.top);
                n = (float)b2.b;
                n4 = (float)b4.b;
                pfg.c(b2);
                pfg.c(b4);
                n3 = n;
            }
        }
        this.i(n3, n4);
    }
    
    @Override
    public final void i(final float n, final float n2) {
        super.i(n, n2);
        this.j();
    }
    
    public void j() {
        final String c = ((pe1)this.N0).c();
        final Paint k0 = super.K0;
        Objects.requireNonNull(this.N0);
        k0.setTypeface((Typeface)null);
        super.K0.setTextSize(((a26)this.N0).d);
        final epa b = xnw.b(super.K0, c);
        final float b2 = b.b;
        final float n = (float)xnw.a(super.K0, "Q");
        Objects.requireNonNull(this.N0);
        final epa d = xnw.d(b2, n);
        final jvx n2 = this.N0;
        Math.round(b2);
        Objects.requireNonNull(n2);
        final jvx n3 = this.N0;
        Math.round(n);
        Objects.requireNonNull(n3);
        final jvx n4 = this.N0;
        Math.round(d.b);
        Objects.requireNonNull(n4);
        this.N0.t = Math.round(d.c);
        epa.c(d);
        epa.c(b);
    }
    
    public void k(final Canvas canvas, final float n, final float n2, final Path path) {
        path.moveTo(n, ((hbx)super.G0).b.bottom);
        path.lineTo(n, ((hbx)super.G0).b.top);
        canvas.drawPath(path, super.J0);
        path.reset();
    }
    
    public final void l(final Canvas canvas, final String s, final float n, final float n2, final qfg qfg) {
        final Paint k0 = super.K0;
        final float fontMetrics = k0.getFontMetrics(xnw.i);
        k0.getTextBounds(s, 0, s.length(), xnw.h);
        final float n3 = 0.0f - xnw.h.left;
        final float n4 = -xnw.i.ascent + 0.0f;
        final Paint$Align textAlign = k0.getTextAlign();
        k0.setTextAlign(Paint$Align.LEFT);
        float n5 = 0.0f;
        float n6 = 0.0f;
        Label_0126: {
            if (qfg.b == 0.0f) {
                n5 = n3;
                n6 = n4;
                if (qfg.c == 0.0f) {
                    break Label_0126;
                }
            }
            n5 = n3 - xnw.h.width() * qfg.b;
            n6 = n4 - fontMetrics * qfg.c;
        }
        canvas.drawText(s, n5 + n, n6 + n2, k0);
        k0.setTextAlign(textAlign);
    }
    
    public void m(final Canvas canvas, final float n, final qfg qfg) {
        Objects.requireNonNull(this.N0);
        Objects.requireNonNull(this.N0);
        final int n2 = ((pe1)this.N0).h * 2;
        final float[] array = new float[n2];
        final int n3 = 0;
        for (int i = 0; i < n2; i += 2) {
            array[i] = ((pe1)this.N0).g[i / 2];
        }
        super.I0.f(array);
        for (int j = n3; j < n2; j += 2) {
            final float n4 = array[j];
            if (((hbx)super.G0).h(n4)) {
                final String a = ((pe1)this.N0).d().a(((pe1)this.N0).g[j / 2]);
                final jvx n5 = this.N0;
                float n6 = n4;
                if (n5.u) {
                    final int h = ((pe1)n5).h;
                    if (j == h - 1 && h > 1) {
                        final Paint k0 = super.K0;
                        final DisplayMetrics a2 = xnw.a;
                        final float n7 = (float)(int)k0.measureText(a);
                        n6 = n4;
                        if (n7 > ((hbx)super.G0).l() * 2.0f) {
                            n6 = n4;
                            if (n4 + n7 > ((hbx)super.G0).c) {
                                n6 = n4 - n7 / 2.0f;
                            }
                        }
                    }
                    else {
                        n6 = n4;
                        if (j == 0) {
                            final Paint k2 = super.K0;
                            final DisplayMetrics a3 = xnw.a;
                            n6 = (int)k2.measureText(a) / 2.0f + n4;
                        }
                    }
                }
                this.l(canvas, a, n6, n, qfg);
            }
        }
    }
    
    public RectF n() {
        this.Q0.set(((hbx)super.G0).b);
        final RectF q0 = this.Q0;
        Objects.requireNonNull(super.H0);
        q0.inset(-0.5f, 0.0f);
        return this.Q0;
    }
    
    public void o(final Canvas canvas) {
        final jvx n0 = this.N0;
        if (((a26)n0).a) {
            if (((pe1)n0).l) {
                final float c = ((a26)n0).c;
                super.K0.setTypeface((Typeface)null);
                super.K0.setTextSize(((a26)this.N0).d);
                super.K0.setColor(((a26)this.N0).e);
                final qfg b = qfg.b(0.0f, 0.0f);
                final jvx n2 = this.N0;
                final int v = n2.v;
                if (v == 1) {
                    b.b = 0.5f;
                    b.c = 1.0f;
                    this.m(canvas, ((hbx)super.G0).b.top - c, b);
                }
                else if (v == 4) {
                    b.b = 0.5f;
                    b.c = 1.0f;
                    this.m(canvas, ((hbx)super.G0).b.top + c + n2.t, b);
                }
                else if (v == 2) {
                    b.b = 0.5f;
                    b.c = 0.0f;
                    this.m(canvas, ((hbx)super.G0).b.bottom + c, b);
                }
                else if (v == 5) {
                    b.b = 0.5f;
                    b.c = 0.0f;
                    this.m(canvas, ((hbx)super.G0).b.bottom - c - n2.t, b);
                }
                else {
                    b.b = 0.5f;
                    b.c = 1.0f;
                    this.m(canvas, ((hbx)super.G0).b.top - c, b);
                    b.b = 0.5f;
                    b.c = 0.0f;
                    this.m(canvas, ((hbx)super.G0).b.bottom + c, b);
                }
                qfg.c(b);
            }
        }
    }
    
    public void p(final Canvas canvas) {
        final jvx n0 = this.N0;
        if (((pe1)n0).k) {
            if (((a26)n0).a) {
                super.L0.setColor(-7829368);
                final Paint l0 = super.L0;
                Objects.requireNonNull(this.N0);
                l0.setStrokeWidth(1.0f);
                final Paint l2 = super.L0;
                Objects.requireNonNull(this.N0);
                l2.setPathEffect((PathEffect)null);
                final int v = this.N0.v;
                if (v == 1 || v == 4 || v == 3) {
                    final RectF b = ((hbx)super.G0).b;
                    final float left = b.left;
                    final float top = b.top;
                    canvas.drawLine(left, top, b.right, top, super.L0);
                }
                final int v2 = this.N0.v;
                if (v2 == 2 || v2 == 5 || v2 == 3) {
                    final RectF b2 = ((hbx)super.G0).b;
                    final float left2 = b2.left;
                    final float bottom = b2.bottom;
                    canvas.drawLine(left2, bottom, b2.right, bottom, super.L0);
                }
            }
        }
    }
    
    public void q(final Canvas canvas) {
        final ArrayList m = ((pe1)this.N0).m;
        if (m != null) {
            if (m.size() > 0) {
                final float[] r0 = this.R0;
                r0[1] = (r0[0] = 0.0f);
                for (int i = 0; i < m.size(); ++i) {
                    if (((kcf)m.get(i)).a) {
                        final int save = canvas.save();
                        this.S0.set(((hbx)super.G0).b);
                        this.S0.inset(0.0f, 0.0f);
                        canvas.clipRect(this.S0);
                        r0[1] = (r0[0] = 0.0f);
                        super.I0.f(r0);
                        final float[] t0 = this.T0;
                        t0[0] = r0[0];
                        final RectF b = ((hbx)super.G0).b;
                        t0[1] = b.top;
                        t0[2] = r0[0];
                        t0[3] = b.bottom;
                        this.U0.reset();
                        final Path u0 = this.U0;
                        final float[] t2 = this.T0;
                        u0.moveTo(t2[0], t2[1]);
                        final Path u2 = this.U0;
                        final float[] t3 = this.T0;
                        u2.lineTo(t3[2], t3[3]);
                        super.M0.setStyle(Paint$Style.STROKE);
                        super.M0.setColor(0);
                        super.M0.setStrokeWidth(0.0f);
                        super.M0.setPathEffect((PathEffect)null);
                        canvas.drawPath(this.U0, super.M0);
                        canvas.restoreToCount(save);
                    }
                }
            }
        }
    }
}
