import java.util.ArrayList;
import java.util.List;
import android.graphics.PointF;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iz9 implements jzj, wm1$a, qqe
{
    public final Path a;
    public final String b;
    public final sdg c;
    public final wm1<?, PointF> d;
    public final wm1<?, PointF> e;
    public final oa4 f;
    public gzk g;
    public boolean h;
    
    public iz9(final sdg c, final ym1 ym1, final oa4 f) {
        this.a = new Path();
        this.g = new gzk(1);
        this.b = f.a;
        this.c = c;
        final wm1<PointF, PointF> g = f.c.g();
        this.d = (pok)g;
        final wm1 g2 = f.b.g();
        this.e = (wm1<?, PointF>)g2;
        this.f = f;
        ym1.d(g);
        ym1.d((wm1<?, ?>)g2);
        g.a((wm1$a)this);
        g2.a((wm1$a)this);
    }
    
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }
    
    public final void b(final List<jl6> list, final List<jl6> list2) {
        int n = 0;
        while (true) {
            final ArrayList list3 = (ArrayList)list;
            if (n >= list3.size()) {
                break;
            }
            final jl6 jl6 = list3.get(n);
            if (jl6 instanceof g3u) {
                final g3u g3u = (g3u)jl6;
                if (g3u.c == 1) {
                    this.g.c(g3u);
                    g3u.d((wm1$a)this);
                }
            }
            ++n;
        }
    }
    
    public final <T> void e(final T t, final ieg ieg) {
        if (t == zdg.i) {
            ((wm1)this.d).k(ieg);
        }
        else if (t == zdg.l) {
            this.e.k(ieg);
        }
    }
    
    public final void f(final oqe oqe, final int n, final List<oqe> list, final oqe oqe2) {
        jbh.e(oqe, n, list, oqe2, (qqe)this);
    }
    
    public final String getName() {
        return this.b;
    }
    
    public final Path r() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.h = true;
            return this.a;
        }
        final PointF pointF = (PointF)((wm1)this.d).f();
        final float n = pointF.x / 2.0f;
        final float n2 = pointF.y / 2.0f;
        final float n3 = n * 0.55228f;
        final float n4 = 0.55228f * n2;
        this.a.reset();
        if (this.f.d) {
            final Path a = this.a;
            final float n5 = -n2;
            a.moveTo(0.0f, n5);
            final Path a2 = this.a;
            final float n6 = 0.0f - n3;
            final float n7 = -n;
            final float n8 = 0.0f - n4;
            a2.cubicTo(n6, n5, n7, n8, n7, 0.0f);
            final Path a3 = this.a;
            final float n9 = n4 + 0.0f;
            a3.cubicTo(n7, n9, n6, n2, 0.0f, n2);
            final Path a4 = this.a;
            final float n10 = n3 + 0.0f;
            a4.cubicTo(n10, n2, n, n9, n, 0.0f);
            this.a.cubicTo(n, n8, n10, n5, 0.0f, n5);
        }
        else {
            final Path a5 = this.a;
            final float n11 = -n2;
            a5.moveTo(0.0f, n11);
            final Path a6 = this.a;
            final float n12 = n3 + 0.0f;
            final float n13 = 0.0f - n4;
            a6.cubicTo(n12, n11, n, n13, n, 0.0f);
            final Path a7 = this.a;
            final float n14 = n4 + 0.0f;
            a7.cubicTo(n, n14, n12, n2, 0.0f, n2);
            final Path a8 = this.a;
            final float n15 = 0.0f - n3;
            final float n16 = -n;
            a8.cubicTo(n15, n2, n16, n14, n16, 0.0f);
            this.a.cubicTo(n16, n13, n15, n11, 0.0f, n11);
        }
        final PointF pointF2 = (PointF)this.e.f();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.g.d(this.a);
        this.h = true;
        return this.a;
    }
}
