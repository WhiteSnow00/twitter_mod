import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qfv
{
    public static final hna a;
    
    static {
        a = new hna();
    }
    
    public static eku$a a(final String s) {
        final eku$a eku$a = new eku$a();
        final y6a y6a = (y6a)((n4j)new y6a$b()).e();
        final hna a = qfv.a;
        for (final List list : rif.w((Object)a.h(s), (Object[])new List[] { a.f(s), a.d(s, true), a.a(s) })) {
            qfv.a.j(s, (List)list);
            for (final hna$b hna$b : list) {
                final int e = ib0.E(hna$b.e);
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                continue;
                            }
                            final om3$a om3$a = new om3$a();
                            ((m6a$a)om3$a).o(hna$b);
                            om3$a.d = hna$b.c;
                            ((y6a$a)eku$a.e).p((m6a)((n4j)om3$a).e());
                        }
                        else {
                            final i4h.a a2 = new i4h.a();
                            a2.o(hna$b);
                            a2.e = hna$b.c;
                            final y6a e2 = y6a.E0;
                            final int a3 = c5j.a;
                            if (!fq4.s((Iterable)e2)) {
                                final i4h i4h = (i4h)i5e.g((Iterable)e2, (xtk)new ez6((Object)hna$b, 5));
                                if (i4h != null) {
                                    a2.d = i4h.I0;
                                }
                            }
                            ((y6a$a)eku$a.c).p((m6a)((n4j)a2).e());
                        }
                    }
                    else {
                        final qfc$a qfc$a = new qfc$a();
                        ((m6a$a)qfc$a).o(hna$b);
                        qfc$a.d = hna$b.c;
                        eku$a.p((qfc)((n4j)qfc$a).e());
                    }
                }
                else {
                    final h6w h6w = (h6w)i5e.g((Iterable)y6a.D0, (xtk)new d0c((Object)hna$b, 3));
                    if (h6w != null) {
                        hna$b.f = h6w.K0;
                        hna$b.g = h6w.J0;
                    }
                    final h6w$c h6w$c = new h6w$c();
                    ((m6a$a)h6w$c).o(hna$b);
                    ((h6w.a)h6w$c).d = hna$b.c;
                    ((h6w.a)h6w$c).e = hna$b.g;
                    ((h6w.a)h6w$c).f = hna$b.f;
                    final int a4 = c5j.a;
                    eku$a.q((h6w)((n4j)h6w$c).e());
                }
            }
        }
        return eku$a;
    }
    
    public static y6a<qfc> b(final String s) {
        final hna a = qfv.a;
        final List d = a.d(s, true);
        a.j(s, d);
        final ArrayList list = new ArrayList();
        for (final hna$b hna$b : d) {
            final qfc$a qfc$a = new qfc$a();
            ((m6a$a)qfc$a).o(hna$b);
            qfc$a.d = hna$b.c;
            list.add(((n4j)qfc$a).e());
        }
        final eku$a eku$a = new eku$a();
        eku$a.o((Collection)list);
        return (y6a<qfc>)((eku)((n4j)eku$a).e()).c;
    }
}
