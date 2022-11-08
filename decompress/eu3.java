import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class eu3<T extends pi1> implements x2d
{
    public T a;
    public List<flc> b;
    
    public eu3(final T a) {
        this.b = new ArrayList();
        this.a = a;
    }
    
    public flc a(final float n, final float n2) {
        final ffg g = this.g(n, n2);
        final float n3 = (float)g.b;
        ffg.c(g);
        return this.e(n3, n, n2);
    }
    
    public List<flc> b(final s2d s2d, final int n, final float n2, z78$a e0) {
        e0 = z78$a.E0;
        final ArrayList list = new ArrayList();
        List list3;
        final List list2 = list3 = s2d.v(n2);
        if (list2.size() == 0) {
            final z7a r = s2d.R(n2, Float.NaN, e0);
            list3 = list2;
            if (r != null) {
                list3 = s2d.v(r.b());
            }
        }
        if (list3.size() == 0) {
            return list;
        }
        for (final z7a z7a : list3) {
            final ffg a = this.a.a(s2d.y()).a(z7a.b(), z7a.a());
            list.add(new flc(z7a.b(), z7a.a(), (float)a.b, (float)a.c, n, s2d.y()));
        }
        return list;
    }
    
    public oi1 c() {
        return this.a.getData();
    }
    
    public float d(final float n, final float n2, final float n3, final float n4) {
        return (float)Math.hypot(n - n3, n2 - n4);
    }
    
    public final flc e(float n, final float n2, final float n3) {
        this.b.clear();
        final oi1 c = this.c();
        final int n4 = 0;
        ArrayList list;
        if (c == null) {
            list = this.b;
        }
        else {
            for (int d = ((du3)c).d(), i = 0; i < d; ++i) {
                final s2d c2 = ((du3)c).c(i);
                if (c2.b0()) {
                    this.b.addAll(this.b(c2, i, n));
                }
            }
            list = this.b;
        }
        final boolean empty = list.isEmpty();
        flc flc = null;
        if (empty) {
            return null;
        }
        Enum<jux.a> c3 = jux.a.C0;
        n = this.f(list, n3, (jux.a)c3);
        final jux.a d2 = jux.a.D0;
        if (n >= this.f(list, n3, d2)) {
            c3 = d2;
        }
        n = ((fu3)this.a).getMaxHighlightDistance();
        flc flc3;
        float n5;
        for (int j = n4; j < list.size(); ++j, flc = flc3, n = n5) {
            final flc flc2 = (flc)list.get(j);
            flc3 = flc;
            n5 = n;
            if (flc2.h == c3) {
                final float d3 = this.d(n2, n3, flc2.c, flc2.d);
                flc3 = flc;
                n5 = n;
                if (d3 < n) {
                    flc3 = flc2;
                    n5 = d3;
                }
            }
        }
        return flc;
    }
    
    public final float f(final List<flc> list, final float n, final jux.a a) {
        float n2 = Float.MAX_VALUE;
        float n3;
        for (int i = 0; i < list.size(); ++i, n2 = n3) {
            final flc flc = list.get(i);
            n3 = n2;
            if (flc.h == a) {
                final float abs = Math.abs(flc.d - n);
                n3 = n2;
                if (abs < n2) {
                    n3 = abs;
                }
            }
        }
        return n2;
    }
    
    public final ffg g(final float n, final float n2) {
        return this.a.a(jux.a.C0).b(n, n2);
    }
}
