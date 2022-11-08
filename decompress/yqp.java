import java.util.ArrayList;
import android.graphics.PointF;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yqp extends wm1<sqp, Path>
{
    public final sqp i;
    public final Path j;
    
    public yqp(final List<rre<sqp>> list) {
        super((List)list);
        this.i = new sqp();
        this.j = new Path();
    }
    
    public final Object g(final rre rre, final float n) {
        final sqp sqp = (sqp)rre.b;
        final sqp sqp2 = (sqp)rre.c;
        final sqp i = this.i;
        if (i.b == null) {
            i.b = new PointF();
        }
        final boolean c = sqp.c;
        final int n2 = 0;
        i.c = (c || sqp2.c);
        if (sqp.a.size() != sqp2.a.size()) {
            final StringBuilder g = w48.g("Curves must have the same number of control points. Shape 1: ");
            g.append(sqp.a.size());
            g.append("\tShape 2: ");
            g.append(sqp2.a.size());
            z9g.b(g.toString());
        }
        final int min = Math.min(sqp.a.size(), sqp2.a.size());
        if (i.a.size() < min) {
            for (int j = i.a.size(); j < min; ++j) {
                i.a.add(new l87());
            }
        }
        else if (i.a.size() > min) {
            for (int k = i.a.size() - 1; k >= min; --k) {
                final ArrayList a = i.a;
                a.remove(a.size() - 1);
            }
        }
        final PointF b = sqp.b;
        final PointF b2 = sqp2.b;
        final float x = b.x;
        final float x2 = b2.x;
        final PointF a2 = jbh.a;
        final float d = xk0.d(x2, x, n, x);
        final float y = b.y;
        final float d2 = xk0.d(b2.y, y, n, y);
        if (i.b == null) {
            i.b = new PointF();
        }
        i.b.set(d, d2);
        for (int l = i.a.size() - 1; l >= 0; --l) {
            final l87 l2 = sqp.a.get(l);
            final l87 l3 = sqp2.a.get(l);
            final PointF a3 = l2.a;
            final PointF b3 = l2.b;
            final PointF c2 = l2.c;
            final PointF a4 = l3.a;
            final PointF b4 = l3.b;
            final PointF c3 = l3.c;
            final l87 l4 = i.a.get(l);
            final float x3 = a3.x;
            final float d3 = xk0.d(a4.x, x3, n, x3);
            final float y2 = a3.y;
            l4.a.set(d3, xk0.d(a4.y, y2, n, y2));
            final l87 l5 = i.a.get(l);
            final float x4 = b3.x;
            final float d4 = xk0.d(b4.x, x4, n, x4);
            final float y3 = b3.y;
            l5.b.set(d4, xk0.d(b4.y, y3, n, y3));
            final l87 l6 = i.a.get(l);
            final float x5 = c2.x;
            final float d5 = xk0.d(c3.x, x5, n, x5);
            final float y4 = c2.y;
            l6.c.set(d5, xk0.d(c3.y, y4, n, y4));
        }
        final sqp m = this.i;
        final Path j2 = this.j;
        j2.reset();
        final PointF b5 = m.b;
        j2.moveTo(b5.x, b5.y);
        jbh.a.set(b5.x, b5.y);
        for (int n3 = n2; n3 < m.a.size(); ++n3) {
            final l87 l7 = m.a.get(n3);
            final PointF a5 = l7.a;
            final PointF b6 = l7.b;
            final PointF c4 = l7.c;
            if (a5.equals((Object)jbh.a) && b6.equals((Object)c4)) {
                j2.lineTo(c4.x, c4.y);
            }
            else {
                j2.cubicTo(a5.x, a5.y, b6.x, b6.y, c4.x, c4.y);
            }
            jbh.a.set(c4.x, c4.y);
        }
        if (m.c) {
            j2.close();
        }
        return this.j;
    }
}
