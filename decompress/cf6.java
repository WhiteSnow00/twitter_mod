import java.util.Iterator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cf6 extends ym1
{
    public final List<ym1> A;
    public final RectF B;
    public final RectF C;
    public Paint D;
    public wm1<Float, Float> z;
    
    public cf6(final ceg ceg, final tve tve, final List<tve> list, final udg udg) {
        super(ceg, tve);
        this.A = new ArrayList();
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Paint();
        final f80 s = tve.s;
        if (s != null) {
            this.d(this.z = s.g());
            this.z.a((wm1$a)this);
        }
        else {
            this.z = null;
        }
        final ycg ycg = new ycg(udg.i.size());
        int n = list.size() - 1;
        ym1 ym1 = null;
        int i;
        while (true) {
            i = 0;
            if (n < 0) {
                break;
            }
            final tve tve2 = list.get(n);
            final int g = lb0.G(tve2.e);
            Object r;
            if (g != 0) {
                if (g != 1) {
                    if (g != 2) {
                        if (g != 3) {
                            if (g != 4) {
                                if (g != 5) {
                                    final StringBuilder f = ehk.f("Unknown layer type ");
                                    f.append(k5b.p(tve2.e));
                                    kag.b(f.toString());
                                    r = null;
                                }
                                else {
                                    r = new ljs(ceg, tve2);
                                }
                            }
                            else {
                                r = new lsp(ceg, tve2);
                            }
                        }
                        else {
                            r = new k2j(ceg, tve2);
                        }
                    }
                    else {
                        r = new t7d(ceg, tve2);
                    }
                }
                else {
                    r = new kmq(ceg, tve2);
                }
            }
            else {
                r = new cf6(ceg, tve2, udg.c.get(tve2.g), udg);
            }
            if (r == null) {
                r = ym1;
            }
            else {
                ycg.j(((ym1)r).o.d, r);
                if (ym1 != null) {
                    ym1.r = (ym1)r;
                    r = null;
                }
                else {
                    this.A.add(0, r);
                    final int g2 = lb0.G(tve2.u);
                    if (g2 != 1 && g2 != 2) {
                        r = ym1;
                    }
                }
            }
            --n;
            ym1 = (ym1)r;
        }
        while (i < ycg.l()) {
            final ym1 ym2 = (ym1)ycg.g(ycg.i(i), (Object)null);
            if (ym2 != null) {
                final ym1 s2 = (ym1)ycg.g(ym2.o.f, (Object)null);
                if (s2 != null) {
                    ym2.s = s2;
                }
            }
            ++i;
        }
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        super.c(rectF, matrix, b);
        for (int i = this.A.size() - 1; i >= 0; --i) {
            this.B.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((ym1)this.A.get(i)).c(this.B, super.m, true);
            rectF.union(this.B);
        }
    }
    
    @Override
    public final <T> void e(final T t, final seg seg) {
        super.e(t, seg);
        if (t == jeg.C) {
            if (seg == null) {
                final wm1<Float, Float> z = this.z;
                if (z != null) {
                    z.k((seg)null);
                }
            }
            else {
                (this.z = (wm1<Float, Float>)new xow(seg, (Object)null)).a((wm1$a)this);
                this.d(this.z);
            }
        }
    }
    
    @Override
    public final void j(final Canvas canvas, final Matrix matrix, int alpha) {
        final RectF c = this.C;
        final tve o = super.o;
        c.set(0.0f, 0.0f, (float)o.o, (float)o.p);
        matrix.mapRect(this.C);
        final boolean b = super.n.W0 && this.A.size() > 1 && alpha != 255;
        if (b) {
            this.D.setAlpha(alpha);
            wnw.f(canvas, this.C, this.D, 31);
        }
        else {
            canvas.save();
        }
        if (b) {
            alpha = 255;
        }
        for (int i = this.A.size() - 1; i >= 0; --i) {
            if (this.C.isEmpty() || canvas.clipRect(this.C)) {
                ((ym1)this.A.get(i)).g(canvas, matrix, alpha);
            }
        }
        canvas.restore();
        tpz.y();
    }
    
    @Override
    public final void o(final xqe xqe, final int n, final List<xqe> list, final xqe xqe2) {
        for (int i = 0; i < this.A.size(); ++i) {
            ((ym1)this.A.get(i)).f(xqe, n, list, xqe2);
        }
    }
    
    @Override
    public final void p(final boolean x) {
        if (x && super.y == null) {
            super.y = new lte();
        }
        super.x = x;
        final Iterator iterator = this.A.iterator();
        while (iterator.hasNext()) {
            ((ym1)iterator.next()).p(x);
        }
    }
    
    @Override
    public final void q(float n) {
        super.q(n);
        final wm1<Float, Float> z = this.z;
        float n2 = n;
        if (z != null) {
            final udg g0 = super.n.G0;
            final float l = g0.l;
            n = g0.k;
            n2 = ((float)z.f() * super.o.b.m - super.o.b.k) / (l - n + 0.01f);
        }
        n = n2;
        if (this.z == null) {
            final tve o = super.o;
            n = o.n;
            final udg b = o.b;
            n = n2 - n / (b.l - b.k);
        }
        final float m = super.o.m;
        float n3 = n;
        if (m != 0.0f) {
            n3 = n / m;
        }
        int size = this.A.size();
        while (--size >= 0) {
            ((ym1)this.A.get(size)).q(n3);
        }
    }
}
