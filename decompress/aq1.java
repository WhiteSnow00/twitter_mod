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

public abstract class aq1 implements a, cqe, ji9
{
    public final PathMeasure a;
    public final Path b;
    public final Path c;
    public final RectF d;
    public final idg e;
    public final tm1 f;
    public final List<aq1.aq1$a> g;
    public final float[] h;
    public final ose i;
    public final rm1<?, Float> j;
    public final rm1<?, Integer> k;
    public final List<rm1<?, Float>> l;
    public final rm1<?, Float> m;
    public rm1<ColorFilter, ColorFilter> n;
    
    public aq1(final idg e, final tm1 f, final Paint$Cap strokeCap, final Paint$Join strokeJoin, final float strokeMiter, final h80 h80, final f80 f2, final List<f80> list, final f80 f3) {
        this.a = new PathMeasure();
        this.b = new Path();
        this.c = new Path();
        this.d = new RectF();
        this.g = new ArrayList();
        final ose i = new ose(1);
        this.i = i;
        this.e = e;
        this.f = f;
        ((Paint)i).setStyle(Paint$Style.STROKE);
        ((Paint)i).setStrokeCap(strokeCap);
        ((Paint)i).setStrokeJoin(strokeJoin);
        ((Paint)i).setStrokeMiter(strokeMiter);
        this.k = (qtd)h80.V();
        this.j = (m6b)f2.V();
        if (f3 == null) {
            this.m = null;
        }
        else {
            this.m = (m6b)f3.V();
        }
        this.l = new ArrayList(list.size());
        this.h = new float[list.size()];
        final int n = 0;
        for (int j = 0; j < list.size(); ++j) {
            this.l.add(((f80)list.get(j)).V());
        }
        f.d((rm1)this.k);
        f.d((rm1)this.j);
        for (int k = 0; k < this.l.size(); ++k) {
            f.d((rm1)this.l.get(k));
        }
        final m6b m = this.m;
        if (m != null) {
            f.d((rm1)m);
        }
        ((rm1)this.k).a((rm1.a)this);
        this.j.a((rm1.a)this);
        for (int l = n; l < list.size(); ++l) {
            ((rm1)this.l.get(l)).a((rm1.a)this);
        }
        final m6b m2 = this.m;
        if (m2 != null) {
            m2.a((rm1.a)this);
        }
    }
    
    @Override
    public final void a() {
        this.e.invalidateSelf();
    }
    
    public final void b(final List<qk6> list, final List<qk6> list2) {
        final ArrayList list3 = (ArrayList)list;
        int i = list3.size() - 1;
        final aq1.aq1$a aq1$a = null;
        v3u v3u = null;
        while (i >= 0) {
            final qk6 qk6 = list3.get(i);
            v3u v3u2 = v3u;
            if (qk6 instanceof v3u) {
                final v3u v3u3 = (v3u)qk6;
                v3u2 = v3u;
                if (v3u3.c == 2) {
                    v3u2 = v3u3;
                }
            }
            --i;
            v3u = v3u2;
        }
        if (v3u != null) {
            v3u.d(this);
        }
        int size = list2.size();
        aq1.aq1$a aq1$a2 = aq1$a;
        while (--size >= 0) {
            final qk6 qk7 = list2.get(size);
            aq1.aq1$a aq1$a3 = null;
            Label_0217: {
                if (qk7 instanceof v3u) {
                    final v3u v3u4 = (v3u)qk7;
                    if (v3u4.c == 2) {
                        if (aq1$a2 != null) {
                            this.g.add(aq1$a2);
                        }
                        aq1$a3 = new aq1.aq1$a(v3u4);
                        v3u4.d(this);
                        break Label_0217;
                    }
                }
                aq1$a3 = aq1$a2;
                if (qk7 instanceof nzj) {
                    if ((aq1$a3 = aq1$a2) == null) {
                        aq1$a3 = new aq1.aq1$a(v3u);
                    }
                    aq1$a3.a.add(qk7);
                }
            }
            aq1$a2 = aq1$a3;
        }
        if (aq1$a2 != null) {
            this.g.add(aq1$a2);
        }
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.b.reset();
        for (int i = 0; i < this.g.size(); ++i) {
            final aq1.aq1$a aq1$a = this.g.get(i);
            for (int j = 0; j < aq1$a.a.size(); ++j) {
                this.b.addPath(((nzj)aq1$a.a.get(j)).r(), matrix);
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
        uli.m();
    }
    
    public <T> void e(final T t, final ydg ydg) {
        if (t == pdg.d) {
            ((rm1)this.k).k(ydg);
        }
        else if (t == pdg.q) {
            this.j.k(ydg);
        }
        else if (t == pdg.E) {
            final iow n = this.n;
            if (n != null) {
                this.f.n((rm1)n);
            }
            if (ydg == null) {
                this.n = null;
            }
            else {
                ((rm1)(this.n = new iow(ydg, (Object)null))).a((rm1.a)this);
                this.f.d((rm1)this.n);
            }
        }
    }
    
    public final void f(final aqe aqe, final int n, final List<aqe> list, final aqe aqe2) {
        lbh.e(aqe, n, (List)list, aqe2, (cqe)this);
    }
    
    public void g(final Canvas canvas, final Matrix matrix, int i) {
        final float[] array = ((ThreadLocal<float[]>)hnw.d).get();
        array[1] = (array[0] = 0.0f);
        array[2] = 37394.73f;
        array[3] = 39575.234f;
        matrix.mapPoints(array);
        if (array[0] == array[2] || array[1] == array[3]) {
            uli.m();
            return;
        }
        final float n = i / 255.0f;
        final qtd k = this.k;
        i = (int)(n * k.l((dre)((rm1)k).b(), ((rm1)k).d()) / 100.0f * 255.0f);
        ((Paint)this.i).setAlpha(lbh.c(i));
        ((Paint)this.i).setStrokeWidth(hnw.d(matrix) * this.j.l());
        if (((Paint)this.i).getStrokeWidth() <= 0.0f) {
            uli.m();
            return;
        }
        if (this.l.isEmpty()) {
            uli.m();
        }
        else {
            final float d = hnw.d(matrix);
            float[] h;
            float[] h2;
            float[] h3;
            for (i = 0; i < this.l.size(); ++i) {
                this.h[i] = this.l.get(i).f();
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
            final m6b m = this.m;
            float n2;
            if (m == null) {
                n2 = 0.0f;
            }
            else {
                n2 = ((rm1<K, Float>)m).f() * d;
            }
            ((Paint)this.i).setPathEffect((PathEffect)new DashPathEffect(this.h, n2));
            uli.m();
        }
        final iow n3 = this.n;
        if (n3 != null) {
            ((Paint)this.i).setColorFilter((ColorFilter)n3.f());
        }
        aq1.aq1$a aq1$a;
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
            aq1$a = this.g.get(i);
            if (aq1$a.b != null) {
                this.b.reset();
                size = aq1$a.a.size();
                while (--size >= 0) {
                    this.b.addPath(((nzj)aq1$a.a.get(size)).r(), matrix);
                }
                this.a.setPath(this.b, false);
                length = this.a.getLength();
                while (this.a.nextContour()) {
                    length += this.a.getLength();
                }
                n4 = ((rm1<K, Float>)aq1$a.b.f).f() * length / 360.0f;
                n5 = ((rm1<K, Float>)aq1$a.b.d).f() * length / 100.0f + n4;
                n6 = ((rm1<K, Float>)aq1$a.b.e).f() * length / 100.0f + n4;
                j = aq1$a.a.size() - 1;
                n7 = 0.0f;
                while (j >= 0) {
                    this.c.set(((nzj)aq1$a.a.get(j)).r());
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
                                hnw.a(this.c, n9, Math.min(n8 / length2, 1.0f), 0.0f);
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
                                    hnw.a(this.c, n11, n12, 0.0f);
                                    canvas.drawPath(this.c, (Paint)this.i);
                                }
                            }
                        }
                    }
                    n7 += length2;
                    --j;
                }
                uli.m();
            }
            else {
                this.b.reset();
                for (l = aq1$a.a.size() - 1; l >= 0; --l) {
                    this.b.addPath(((nzj)aq1$a.a.get(l)).r(), matrix);
                }
                uli.m();
                canvas.drawPath(this.b, (Paint)this.i);
                uli.m();
            }
        }
        uli.m();
    }
}
