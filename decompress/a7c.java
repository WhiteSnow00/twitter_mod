import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.graphics.Paint$Cap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.RadialGradient;
import android.graphics.LinearGradient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a7c extends fq1
{
    public final String o;
    public final boolean p;
    public final ycg<LinearGradient> q;
    public final ycg<RadialGradient> r;
    public final RectF s;
    public final int t;
    public final int u;
    public final wm1<s6c, s6c> v;
    public final wm1<PointF, PointF> w;
    public final wm1<PointF, PointF> x;
    public xow y;
    
    public a7c(final ceg ceg, final ym1 ym1, final z6c z6c) {
        final int g = lb0.G(z6c.h);
        Paint$Cap paint$Cap;
        if (g != 0) {
            if (g != 1) {
                paint$Cap = Paint$Cap.SQUARE;
            }
            else {
                paint$Cap = Paint$Cap.ROUND;
            }
        }
        else {
            paint$Cap = Paint$Cap.BUTT;
        }
        super(ceg, ym1, paint$Cap, bng.b(z6c.i), z6c.j, z6c.d, z6c.g, z6c.k, z6c.l);
        this.q = (ycg<LinearGradient>)new ycg();
        this.r = (ycg<RadialGradient>)new ycg();
        this.s = new RectF();
        this.o = z6c.a;
        this.t = z6c.b;
        this.p = z6c.m;
        this.u = (int)(ceg.G0.b() / 32.0f);
        final wm1<s6c, s6c> g2 = z6c.c.g();
        this.v = (u6c)g2;
        g2.a((wm1$a)this);
        ym1.d(g2);
        final wm1<PointF, PointF> g3 = z6c.e.g();
        this.w = (kpk)g3;
        g3.a((wm1$a)this);
        ym1.d(g3);
        final wm1<PointF, PointF> g4 = z6c.f.g();
        this.x = (kpk)g4;
        g4.a((wm1$a)this);
        ym1.d(g4);
    }
    
    public final int[] d(int[] array) {
        final xow y = this.y;
        int[] array2 = array;
        if (y != null) {
            final Integer[] array3 = (Integer[])y.f();
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
    
    @Override
    public final <T> void e(final T t, final seg seg) {
        super.e(t, seg);
        if (t == jeg.F) {
            final xow y = this.y;
            if (y != null) {
                super.f.n((wm1<?, ?>)y);
            }
            if (seg == null) {
                this.y = null;
            }
            else {
                ((wm1)(this.y = new xow(seg, (Object)null))).a((wm1$a)this);
                super.f.d((wm1<?, ?>)this.y);
            }
        }
    }
    
    @Override
    public final void g(final Canvas canvas, final Matrix localMatrix, final int n) {
        if (this.p) {
            return;
        }
        this.c(this.s, localMatrix, false);
        Object shader;
        if (this.t == 1) {
            final int h = this.h();
            final ycg<LinearGradient> q = this.q;
            final long n2 = h;
            shader = q.g(n2, (Object)null);
            if (shader == null) {
                final PointF pointF = (PointF)((wm1)this.w).f();
                final PointF pointF2 = (PointF)((wm1)this.x).f();
                final s6c s6c = (s6c)((wm1)this.v).f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, this.d(s6c.b), s6c.a, Shader$TileMode.CLAMP);
                this.q.j(n2, shader);
            }
        }
        else {
            final int h2 = this.h();
            final ycg<RadialGradient> r = this.r;
            final long n3 = h2;
            shader = r.g(n3, (Object)null);
            if (shader == null) {
                final PointF pointF3 = (PointF)((wm1)this.w).f();
                final PointF pointF4 = (PointF)((wm1)this.x).f();
                final s6c s6c2 = (s6c)((wm1)this.v).f();
                final int[] d = this.d(s6c2.b);
                final float[] a = s6c2.a;
                final float x = pointF3.x;
                final float y = pointF3.y;
                shader = new RadialGradient(x, y, (float)Math.hypot(pointF4.x - x, pointF4.y - y), d, a, Shader$TileMode.CLAMP);
                this.r.j(n3, shader);
            }
        }
        ((Shader)shader).setLocalMatrix(localMatrix);
        super.i.setShader((Shader)shader);
        super.g(canvas, localMatrix, n);
    }
    
    public final String getName() {
        return this.o;
    }
    
    public final int h() {
        final int round = Math.round(((wm1)this.w).d * this.u);
        final int round2 = Math.round(((wm1)this.x).d * this.u);
        final int round3 = Math.round(((wm1)this.v).d * this.u);
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
