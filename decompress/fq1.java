import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint$Style;
import java.util.ArrayList;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import android.graphics.ColorFilter;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.PathMeasure;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fq1 implements wm1$a, zqe, lj9
{
    public final PathMeasure a;
    public final Path b;
    public final Path c;
    public final RectF d;
    public final ceg e;
    public final ym1 f;
    public final List<fq1.fq1$a> g;
    public final float[] h;
    public final lte i;
    public final wm1<?, Float> j;
    public final wm1<?, Integer> k;
    public final List<wm1<?, Float>> l;
    public final wm1<?, Float> m;
    public wm1<ColorFilter, ColorFilter> n;
    
    public fq1(final ceg e, final ym1 f, final Paint$Cap strokeCap, final Paint$Join strokeJoin, final float strokeMiter, final h80 h80, final f80 f2, final List<f80> list, final f80 f3) {
        this.a = new PathMeasure();
        this.b = new Path();
        this.c = new Path();
        this.d = new RectF();
        this.g = new ArrayList();
        final lte i = new lte(1);
        this.i = i;
        this.e = e;
        this.f = f;
        i.setStyle(Paint$Style.STROKE);
        i.setStrokeCap(strokeCap);
        i.setStrokeJoin(strokeJoin);
        i.setStrokeMiter(strokeMiter);
        this.k = (sud)h80.g();
        this.j = (o7b)f2.g();
        if (f3 == null) {
            this.m = null;
        }
        else {
            this.m = (o7b)f3.g();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        final int n = 0;
        for (int j = 0; j < list.size(); ++j) {
            this.l.add(((f80)list.get(j)).g());
        }
        f.d((wm1<?, ?>)this.k);
        f.d((wm1<?, ?>)this.j);
        for (int k = 0; k < this.l.size(); ++k) {
            f.d((wm1<?, ?>)this.l.get(k));
        }
        final o7b m = this.m;
        if (m != null) {
            f.d((wm1<?, ?>)m);
        }
        ((wm1)this.k).a((wm1$a)this);
        ((wm1)this.j).a((wm1$a)this);
        for (int l = n; l < list.size(); ++l) {
            ((wm1)this.l.get(l)).a((wm1$a)this);
        }
        final o7b m2 = this.m;
        if (m2 != null) {
            ((wm1)m2).a((wm1$a)this);
        }
    }
    
    public final void a() {
        this.e.invalidateSelf();
    }
    
    public final void b(final List<wl6> list, final List<wl6> list2) {
        final ArrayList list3 = (ArrayList)list;
        int i = list3.size() - 1;
        final fq1.fq1$a fq1$a = null;
        o4u o4u = null;
        while (i >= 0) {
            final wl6 wl6 = list3.get(i);
            o4u o4u2 = o4u;
            if (wl6 instanceof o4u) {
                final o4u o4u3 = (o4u)wl6;
                o4u2 = o4u;
                if (o4u3.c == 2) {
                    o4u2 = o4u3;
                }
            }
            --i;
            o4u = o4u2;
        }
        if (o4u != null) {
            o4u.d((wm1$a)this);
        }
        int size = list2.size();
        fq1.fq1$a fq1$a2 = fq1$a;
        while (--size >= 0) {
            final wl6 wl7 = list2.get(size);
            fq1.fq1$a fq1$a3 = null;
            Label_0217: {
                if (wl7 instanceof o4u) {
                    final o4u o4u4 = (o4u)wl7;
                    if (o4u4.c == 2) {
                        if (fq1$a2 != null) {
                            this.g.add(fq1$a2);
                        }
                        fq1$a3 = new fq1.fq1$a(o4u4);
                        o4u4.d((wm1$a)this);
                        break Label_0217;
                    }
                }
                fq1$a3 = fq1$a2;
                if (wl7 instanceof e0k) {
                    if ((fq1$a3 = fq1$a2) == null) {
                        fq1$a3 = new fq1.fq1$a(o4u);
                    }
                    fq1$a3.a.add(wl7);
                }
            }
            fq1$a2 = fq1$a3;
        }
        if (fq1$a2 != null) {
            this.g.add(fq1$a2);
        }
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.b.reset();
        for (int i = 0; i < this.g.size(); ++i) {
            final fq1.fq1$a fq1$a = this.g.get(i);
            for (int j = 0; j < fq1$a.a.size(); ++j) {
                this.b.addPath(((e0k)fq1$a.a.get(j)).s(), matrix);
            }
        }
        this.b.computeBounds(this.d, false);
        final float l = this.j.l();
        final RectF d = this.d;
        final float left = d.left;
        final float n = l / 2.0f;
        d.set(left - n, d.top - n, d.right + n, d.bottom + n);
        rectF.set(this.d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        tpz.y();
    }
    
    public <T> void e(final T t, final seg seg) {
        if (t == jeg.d) {
            ((wm1)this.k).k(seg);
        }
        else if (t == jeg.q) {
            ((wm1)this.j).k(seg);
        }
        else if (t == jeg.E) {
            final xow n = this.n;
            if (n != null) {
                this.f.n((wm1<?, ?>)n);
            }
            if (seg == null) {
                this.n = null;
            }
            else {
                ((wm1)(this.n = new xow(seg, (Object)null))).a((wm1$a)this);
                this.f.d((wm1<?, ?>)this.n);
            }
        }
    }
    
    public final void f(final xqe xqe, final int n, final List<xqe> list, final xqe xqe2) {
        bch.e(xqe, n, (List)list, xqe2, (zqe)this);
    }
    
    public void g(final Canvas canvas, final Matrix matrix, int i) {
        final float[] array = ((ThreadLocal<float[]>)wnw.d).get();
        array[1] = (array[0] = 0.0f);
        array[2] = 37394.73f;
        array[3] = 39575.234f;
        matrix.mapPoints(array);
        if (array[0] == array[2] || array[1] == array[3]) {
            tpz.y();
            return;
        }
        final float n = i / 255.0f;
        final sud k = this.k;
        i = (int)(n * k.l(((wm1)k).b(), ((wm1)k).d()) / 100.0f * 255.0f);
        this.i.setAlpha(bch.c(i));
        this.i.setStrokeWidth(wnw.d(matrix) * this.j.l());
        if (this.i.getStrokeWidth() <= 0.0f) {
            tpz.y();
            return;
        }
        if (this.l.isEmpty()) {
            tpz.y();
        }
        else {
            final float d = wnw.d(matrix);
            float[] h;
            float[] h2;
            float[] h3;
            for (i = 0; i < this.l.size(); ++i) {
                this.h[i] = (float)this.l.get(i).f();
                if (i % 2 == 0) {
                    h = this.h;
                    if (h[i] < 1.0f) {
                        h[i] = 1.0f;
                    }
                }
                else {
                    h2 = this.h;
                    if (h2[i] < 0.1f) {
                        h2[i] = 0.1f;
                    }
                }
                h3 = this.h;
                h3[i] *= d;
            }
            final o7b m = this.m;
            float n2;
            if (m == null) {
                n2 = 0.0f;
            }
            else {
                n2 = (float)((wm1)m).f() * d;
            }
            this.i.setPathEffect((PathEffect)new DashPathEffect(this.h, n2));
            tpz.y();
        }
        final xow n3 = this.n;
        if (n3 != null) {
            this.i.setColorFilter((ColorFilter)n3.f());
        }
        fq1.fq1$a fq1$a;
        int size;
        float length;
        float n4;
        float n5;
        float n6;
        int j;
        float n7;
        float length2;
        float n8;
        float n9;
        float n10;
        float n11;
        float n12;
        int l;
        for (i = 0; i < this.g.size(); ++i) {
            fq1$a = this.g.get(i);
            if (fq1$a.b != null) {
                this.b.reset();
                size = fq1$a.a.size();
                while (--size >= 0) {
                    this.b.addPath(((e0k)fq1$a.a.get(size)).s(), matrix);
                }
                this.a.setPath(this.b, false);
                length = this.a.getLength();
                while (this.a.nextContour()) {
                    length += this.a.getLength();
                }
                n4 = (float)((wm1)fq1$a.b.f).f() * length / 360.0f;
                n5 = (float)((wm1)fq1$a.b.d).f() * length / 100.0f + n4;
                n6 = (float)((wm1)fq1$a.b.e).f() * length / 100.0f + n4;
                j = fq1$a.a.size() - 1;
                n7 = 0.0f;
                while (j >= 0) {
                    this.c.set(((e0k)fq1$a.a.get(j)).s());
                    this.c.transform(matrix);
                    this.a.setPath(this.c, false);
                    length2 = this.a.getLength();
                    Label_0921: {
                        if (n6 > length) {
                            n8 = n6 - length;
                            if (n8 < n7 + length2 && n7 < n8) {
                                if (n5 > length) {
                                    n9 = (n5 - length) / length2;
                                }
                                else {
                                    n9 = 0.0f;
                                }
                                wnw.a(this.c, n9, Math.min(n8 / length2, 1.0f), 0.0f);
                                canvas.drawPath(this.c, (Paint)this.i);
                                break Label_0921;
                            }
                        }
                        n10 = n7 + length2;
                        if (n10 >= n5) {
                            if (n7 <= n6) {
                                if (n10 <= n6 && n5 < n7) {
                                    canvas.drawPath(this.c, (Paint)this.i);
                                }
                                else {
                                    if (n5 < n7) {
                                        n11 = 0.0f;
                                    }
                                    else {
                                        n11 = (n5 - n7) / length2;
                                    }
                                    if (n6 > n10) {
                                        n12 = 1.0f;
                                    }
                                    else {
                                        n12 = (n6 - n7) / length2;
                                    }
                                    wnw.a(this.c, n11, n12, 0.0f);
                                    canvas.drawPath(this.c, (Paint)this.i);
                                }
                            }
                        }
                    }
                    n7 += length2;
                    --j;
                }
                tpz.y();
            }
            else {
                this.b.reset();
                for (l = fq1$a.a.size() - 1; l >= 0; --l) {
                    this.b.addPath(((e0k)fq1$a.a.get(l)).s(), matrix);
                }
                tpz.y();
                canvas.drawPath(this.b, (Paint)this.i);
                tpz.y();
            }
        }
        tpz.y();
    }
}
