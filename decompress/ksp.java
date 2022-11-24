import java.util.ArrayList;
import android.graphics.PointF;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksp extends wm1<esp, Path>
{
    public final esp i;
    public final Path j;
    
    public ksp(final List<zre<esp>> list) {
        super((List)list);
        this.i = new esp();
        this.j = new Path();
    }
    
    public final Object g(final zre zre, final float n) {
        final esp esp = (esp)zre.b;
        final esp esp2 = (esp)zre.c;
        final esp i = this.i;
        if (i.b == null) {
            i.b = new PointF();
        }
        final boolean c = esp.c;
        final int n2 = 0;
        i.c = (c || esp2.c);
        if (esp.a.size() != esp2.a.size()) {
            final StringBuilder f = ehk.f("Curves must have the same number of control points. Shape 1: ");
            f.append(esp.a.size());
            f.append("\tShape 2: ");
            f.append(esp2.a.size());
            kag.b(f.toString());
        }
        final int min = Math.min(esp.a.size(), esp2.a.size());
        if (i.a.size() < min) {
            for (int j = i.a.size(); j < min; ++j) {
                i.a.add(new u87());
            }
        }
        else if (i.a.size() > min) {
            for (int k = i.a.size() - 1; k >= min; --k) {
                final ArrayList a = i.a;
                a.remove(a.size() - 1);
            }
        }
        final PointF b = esp.b;
        final PointF b2 = esp2.b;
        final float x = b.x;
        final float x2 = b2.x;
        final PointF a2 = bch.a;
        final float d = va.d(x2, x, n, x);
        final float y = b.y;
        final float d2 = va.d(b2.y, y, n, y);
        if (i.b == null) {
            i.b = new PointF();
        }
        i.b.set(d, d2);
        for (int l = i.a.size() - 1; l >= 0; --l) {
            final u87 u87 = esp.a.get(l);
            final u87 u88 = esp2.a.get(l);
            final PointF a3 = u87.a;
            final PointF b3 = u87.b;
            final PointF c2 = u87.c;
            final PointF a4 = u88.a;
            final PointF b4 = u88.b;
            final PointF c3 = u88.c;
            final u87 u89 = i.a.get(l);
            final float x3 = a3.x;
            final float d3 = va.d(a4.x, x3, n, x3);
            final float y2 = a3.y;
            u89.a.set(d3, va.d(a4.y, y2, n, y2));
            final u87 u90 = i.a.get(l);
            final float x4 = b3.x;
            final float d4 = va.d(b4.x, x4, n, x4);
            final float y3 = b3.y;
            u90.b.set(d4, va.d(b4.y, y3, n, y3));
            final u87 u91 = i.a.get(l);
            final float x5 = c2.x;
            final float d5 = va.d(c3.x, x5, n, x5);
            final float y4 = c2.y;
            u91.c.set(d5, va.d(c3.y, y4, n, y4));
        }
        final esp m = this.i;
        final Path j2 = this.j;
        j2.reset();
        final PointF b5 = m.b;
        j2.moveTo(b5.x, b5.y);
        bch.a.set(b5.x, b5.y);
        for (int n3 = n2; n3 < m.a.size(); ++n3) {
            final u87 u92 = m.a.get(n3);
            final PointF a5 = u92.a;
            final PointF b6 = u92.b;
            final PointF c4 = u92.c;
            if (a5.equals((Object)bch.a) && b6.equals((Object)c4)) {
                j2.lineTo(c4.x, c4.y);
            }
            else {
                j2.cubicTo(a5.x, a5.y, b6.x, b6.y, c4.x, c4.y);
            }
            bch.a.set(c4.x, c4.y);
        }
        if (m.c) {
            j2.close();
        }
        return this.j;
    }
}
