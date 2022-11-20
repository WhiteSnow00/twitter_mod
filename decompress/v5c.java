import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.LinearGradient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v5c implements ji9, a, cqe
{
    public final String a;
    public final boolean b;
    public final tm1 c;
    public final ecg<LinearGradient> d;
    public final ecg<RadialGradient> e;
    public final Path f;
    public final ose g;
    public final RectF h;
    public final List<nzj> i;
    public final int j;
    public final rm1<q5c, q5c> k;
    public final rm1<Integer, Integer> l;
    public final rm1<PointF, PointF> m;
    public final rm1<PointF, PointF> n;
    public rm1<ColorFilter, ColorFilter> o;
    public iow p;
    public final idg q;
    public final int r;
    
    public v5c(final idg q, final tm1 c, final u5c u5c) {
        this.d = (ecg<LinearGradient>)new ecg();
        this.e = (ecg<RadialGradient>)new ecg();
        final Path f = new Path();
        this.f = f;
        this.g = new ose(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.c = c;
        this.a = u5c.g;
        this.b = u5c.h;
        this.q = q;
        this.j = u5c.a;
        f.setFillType(u5c.b);
        this.r = (int)(q.E0.b() / 32.0f);
        final rm1<q5c, q5c> v = u5c.c.V();
        this.k = (s5c)v;
        v.a((rm1.a)this);
        c.d((rm1)v);
        final rm1 v2 = u5c.d.V();
        this.l = (qtd)v2;
        v2.a((rm1.a)this);
        c.d(v2);
        final rm1 v3 = u5c.e.V();
        this.m = (yok)v3;
        v3.a((rm1.a)this);
        c.d(v3);
        final rm1 v4 = u5c.f.V();
        this.n = (yok)v4;
        v4.a((rm1.a)this);
        c.d(v4);
    }
    
    public final void a() {
        this.q.invalidateSelf();
    }
    
    public final void b(final List<qk6> list, final List<qk6> list2) {
        for (int i = 0; i < list2.size(); ++i) {
            final qk6 qk6 = list2.get(i);
            if (qk6 instanceof nzj) {
                this.i.add(qk6);
            }
        }
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); ++i) {
            this.f.addPath(((nzj)this.i.get(i)).r(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
    
    public final int[] d(int[] array) {
        final iow p = this.p;
        int[] array2 = array;
        if (p != null) {
            final Integer[] array3 = (Integer[])p.f();
            final int length = array.length;
            final int length2 = array3.length;
            final int n = 0;
            int n2 = 0;
            if (length == length2) {
                while (true) {
                    array2 = array;
                    if (n2 >= array.length) {
                        break;
                    }
                    array[n2] = array3[n2];
                    ++n2;
                }
            }
            else {
                array = new int[array3.length];
                int n3 = n;
                while (true) {
                    array2 = array;
                    if (n3 >= array3.length) {
                        break;
                    }
                    array[n3] = array3[n3];
                    ++n3;
                }
            }
        }
        return array2;
    }
    
    public final <T> void e(final T t, final ydg ydg) {
        if (t == pdg.d) {
            ((rm1)this.l).k(ydg);
        }
        else if (t == pdg.E) {
            final iow o = this.o;
            if (o != null) {
                this.c.n((rm1)o);
            }
            if (ydg == null) {
                this.o = null;
            }
            else {
                ((rm1)(this.o = new iow(ydg, (Object)null))).a((rm1.a)this);
                this.c.d((rm1)this.o);
            }
        }
        else if (t == pdg.F) {
            final iow p2 = this.p;
            if (p2 != null) {
                this.c.n((rm1)p2);
            }
            if (ydg == null) {
                this.p = null;
            }
            else {
                this.d.c();
                this.e.c();
                ((rm1)(this.p = new iow(ydg, (Object)null))).a((rm1.a)this);
                this.c.d((rm1)this.p);
            }
        }
    }
    
    public final void f(final aqe aqe, final int n, final List<aqe> list, final aqe aqe2) {
        lbh.e(aqe, n, (List)list, aqe2, (cqe)this);
    }
    
    public final void g(final Canvas canvas, final Matrix localMatrix, int n) {
        if (this.b) {
            return;
        }
        this.f.reset();
        for (int i = 0; i < this.i.size(); ++i) {
            this.f.addPath(((nzj)this.i.get(i)).r(), localMatrix);
        }
        this.f.computeBounds(this.h, false);
        Object shader;
        if (this.j == 1) {
            final int h = this.h();
            final ecg<LinearGradient> d = this.d;
            final long n2 = h;
            shader = d.g(n2, (Object)null);
            if (shader == null) {
                final PointF pointF = ((rm1<K, PointF>)this.m).f();
                final PointF pointF2 = ((rm1<K, PointF>)this.n).f();
                final q5c q5c = ((rm1<K, q5c>)this.k).f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, this.d(q5c.b), q5c.a, Shader$TileMode.CLAMP);
                this.d.j(n2, shader);
            }
        }
        else {
            final int h2 = this.h();
            final ecg<RadialGradient> e = this.e;
            final long n3 = h2;
            shader = e.g(n3, (Object)null);
            if (shader == null) {
                final PointF pointF3 = ((rm1<K, PointF>)this.m).f();
                final PointF pointF4 = ((rm1<K, PointF>)this.n).f();
                final q5c q5c2 = ((rm1<K, q5c>)this.k).f();
                final int[] d2 = this.d(q5c2.b);
                final float[] a = q5c2.a;
                final float x = pointF3.x;
                final float y = pointF3.y;
                float n4 = (float)Math.hypot(pointF4.x - x, pointF4.y - y);
                if (n4 <= 0.0f) {
                    n4 = 0.001f;
                }
                shader = new RadialGradient(x, y, n4, d2, a, Shader$TileMode.CLAMP);
                this.e.j(n3, shader);
            }
        }
        ((Shader)shader).setLocalMatrix(localMatrix);
        ((Paint)this.g).setShader((Shader)shader);
        final iow o = this.o;
        if (o != null) {
            ((Paint)this.g).setColorFilter((ColorFilter)o.f());
        }
        n = (int)(n / 255.0f * ((rm1<K, Integer>)this.l).f() / 100.0f * 255.0f);
        ((Paint)this.g).setAlpha(lbh.c(n));
        canvas.drawPath(this.f, (Paint)this.g);
        uli.m();
    }
    
    public final String getName() {
        return this.a;
    }
    
    public final int h() {
        final int round = Math.round(this.m.d * this.r);
        final int round2 = Math.round(this.n.d * this.r);
        final int round3 = Math.round(((rm1)this.k).d * this.r);
        int n;
        if (round != 0) {
            n = round * 527;
        }
        else {
            n = 17;
        }
        int n2 = n;
        if (round2 != 0) {
            n2 = n * 31 * round2;
        }
        int n3 = n2;
        if (round3 != 0) {
            n3 = n2 * 31 * round3;
        }
        return n3;
    }
}
