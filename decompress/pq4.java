import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pq4
{
    public static final boolean a(final List<egp> list) {
        final int size = list.size();
        boolean b = true;
        if (size < 2) {
            return true;
        }
        Object c0;
        if (list.size() != 0 && list.size() != 1) {
            final ArrayList list2 = new ArrayList();
            egp value = list.get(0);
            final int s = tdy.S((List)list);
            int n = 0;
            while (true) {
                c0 = list2;
                if (n >= s) {
                    break;
                }
                ++n;
                final egp value2 = list.get(n);
                final egp egp = value2;
                final egp egp2 = value;
                list2.add(new qfj(ukg.m(Math.abs(qfj.d(egp2.d().b()) - qfj.d(egp.d().b())), Math.abs(qfj.e(egp2.d().b()) - qfj.e(egp.d().b())))));
                value = value2;
            }
        }
        else {
            c0 = v2a.C0;
        }
        long n2;
        if (((Collection)c0).size() == 1) {
            n2 = ((qfj)or4.G1((List)c0)).a;
        }
        else {
            if (((List)c0).isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object g1 = or4.G1((List)c0);
            final int s2 = tdy.S((List)c0);
            Object o = g1;
            if (1 <= s2) {
                int n3 = 1;
                while (true) {
                    g1 = (o = new qfj(qfj.h(((qfj)g1).a, ((qfj)((List)c0).get(n3)).a)));
                    if (n3 == s2) {
                        break;
                    }
                    ++n3;
                }
            }
            n2 = ((qfj)o).a;
        }
        if (qfj.e(n2) >= qfj.d(n2)) {
            b = false;
        }
        return b;
    }
    
    public static final boolean b(final egp egp) {
        final xfp f = egp.f();
        final hgp a = hgp.a;
        return yfp.a(f, hgp.g) != null || yfp.a(egp.f(), hgp.f) != null;
    }
    
    public static final void c(egp egp, final ng ng) {
        final xfp f = egp.f();
        final hgp a = hgp.a;
        final oq4 oq4 = (oq4)yfp.a(f, hgp.g);
        if (oq4 != null) {
            ng.G((Object)ng$b.a(oq4.a, oq4.b, 0));
            return;
        }
        final ArrayList list = new ArrayList();
        if (yfp.a(egp.f(), hgp.f) != null) {
            final List e = egp.e(false);
            for (int size = e.size(), i = 0; i < size; ++i) {
                egp = (egp)e.get(i);
                final xfp f2 = egp.f();
                final hgp a2 = hgp.a;
                if (f2.g(hgp.x)) {
                    list.add(egp);
                }
            }
        }
        final boolean empty = list.isEmpty();
        int size2 = 1;
        if (empty ^ true) {
            final boolean a3 = a(list);
            int size3;
            if (a3) {
                size3 = 1;
            }
            else {
                size3 = list.size();
            }
            if (a3) {
                size2 = list.size();
            }
            ng.G((Object)ng$b.a(size3, size2, 0));
        }
    }
    
    public static final void d(final egp egp, final ng ng) {
        final xfp f = egp.f();
        final hgp a = hgp.a;
        if (yfp.a(f, hgp.h) != null) {
            ng.H((Object)ng$c.a(0, 0, 0, 0, false, (boolean)egp.f().l(hgp.x, (otb)qq4.C0)));
        }
        final egp g = egp.g();
        if (g == null) {
            return;
        }
        if (yfp.a(g.f(), hgp.f) != null) {
            final oq4 oq4 = (oq4)yfp.a(g.f(), hgp.g);
            if (oq4 != null && (oq4.a < 0 || oq4.b < 0)) {
                return;
            }
            if (!egp.f().g(hgp.x)) {
                return;
            }
            final ArrayList<egp> list = new ArrayList<egp>();
            final List e = g.e(false);
            final int size = e.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                final egp egp2 = e.get(i);
                final xfp f2 = egp2.f();
                final hgp a2 = hgp.a;
                int n2 = n;
                if (f2.g(hgp.x)) {
                    list.add(egp2);
                    n2 = n;
                    if (egp2.c.V0 < egp.c.V0) {
                        n2 = n + 1;
                    }
                }
                ++i;
                n = n2;
            }
            if (list.isEmpty() ^ true) {
                final boolean a3 = a(list);
                int n3;
                if (a3) {
                    n3 = 0;
                }
                else {
                    n3 = n;
                }
                if (!a3) {
                    n = 0;
                }
                final xfp f3 = egp.f();
                final hgp a4 = hgp.a;
                ng.H((Object)ng$c.a(n3, 1, n, 1, false, (boolean)f3.l(hgp.x, (otb)pq4$a.C0)));
            }
        }
    }
}
