import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rhq
{
    public static final void a(final mhq a, dlh companion, final kub<? super mhq, ? super d86, ? super Integer, vzv> kub, final d86 d86, final int n, final int n2) {
        final d86 h = d86.h(2036134589);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)a)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n3 | 0x30);
        }
        else {
            n6 = n3;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)companion)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n3 | n7);
            }
        }
        int n8;
        if ((n2 & 0x4) != 0x0) {
            n8 = (n6 | 0x180);
        }
        else {
            n8 = n6;
            if ((n & 0x380) == 0x0) {
                int n9;
                if (h.P((Object)kub)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n6 | n9);
            }
        }
        if ((n8 & 0x2DB) == 0x92 && h.i()) {
            h.H();
        }
        else {
            if (n5 != 0) {
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a2 = sa6.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(d86.Companion);
            pra pra;
            if ((pra = (pra)y) == d86$a.b) {
                pra = new pra();
                h.p((Object)pra);
            }
            h.O();
            final pra pra2 = pra;
            if (!e0e.a((Object)a, pra2.a)) {
                pra2.a = a;
                final ArrayList b = pra2.b;
                final ArrayList list = new ArrayList<Object>(nr4.d1((Iterable)b, 10));
                final Iterator iterator = b.iterator();
                while (iterator.hasNext()) {
                    list.add((T)((ora)iterator.next()).a);
                }
                final List l2 = rr4.l2((Collection)list);
                final ArrayList list2 = (ArrayList)l2;
                if (!list2.contains(a)) {
                    list2.add(a);
                }
                pra2.b.clear();
                final List a3 = rr4.A1((Iterable)l2);
                final ArrayList b2 = pra2.b;
                for (final mhq mhq : (ArrayList)a3) {
                    b2.add(new ora(mhq, (kub<? super hub<? super d86, ? super Integer, vzv>, ? super d86, ? super Integer, vzv>)w9y.i(h, -94104314, new kub<hub<? super d86, ? super Integer, ? extends vzv>, d86, Integer, vzv>(mhq, a, l2, pra2) {
                        public final mhq F0;
                        public final mhq G0;
                        public final List<mhq> H0;
                        public final pra<mhq> I0;
                        
                        public final Object h0(Object o, Object o2, final Object o3) {
                            final hub hub = (hub)o;
                            final d86 d86 = (d86)o2;
                            final int intValue = ((Number)o3).intValue();
                            e0e.f((Object)hub, "children");
                            int n = intValue;
                            if ((intValue & 0xE) == 0x0) {
                                int n2;
                                if (d86.P((Object)hub)) {
                                    n2 = 4;
                                }
                                else {
                                    n2 = 2;
                                }
                                n = (intValue | n2);
                            }
                            if ((n & 0x5B) == 0x12 && d86.i()) {
                                d86.H();
                            }
                            else {
                                final sa6$b a = sa6.a;
                                final boolean a2 = e0e.a((Object)this.F0, (Object)this.G0);
                                int n3 = 75;
                                int n4;
                                if (a2) {
                                    n4 = 150;
                                }
                                else {
                                    n4 = 75;
                                }
                                if (!a2 || ((ArrayList)rr4.A1((Iterable)this.H0)).size() == 1) {
                                    n3 = 0;
                                }
                                final jcu l0 = eg8.L0(n4, n3, (nq9)pq9.d);
                                final qhq qhq = new qhq(this.F0, (pra)this.I0);
                                o2 = af.z(d86, 1016418159, -492369756);
                                Objects.requireNonNull(d86.Companion);
                                final d86$a$a b = d86$a.b;
                                o = o2;
                                if (o2 == b) {
                                    float n5;
                                    if (!a2) {
                                        n5 = 1.0f;
                                    }
                                    else {
                                        n5 = 0.0f;
                                    }
                                    o = kqe.b(n5);
                                    d86.p(o);
                                }
                                d86.O();
                                final b80 b2 = (b80)o;
                                shw.h((Object)a2, (hub)new shq(b2, a2, (ac0)l0, (ptb)qhq, (mp6)null), d86);
                                final bc0 c = b2.c;
                                d86.O();
                                final jcu l2 = eg8.L0(n4, n3, (nq9)pq9.a);
                                d86.x(2003504988);
                                d86.x(-492369756);
                                o2 = d86.y();
                                if ((o = o2) == b) {
                                    float n6;
                                    if (!a2) {
                                        n6 = 1.0f;
                                    }
                                    else {
                                        n6 = 0.8f;
                                    }
                                    o = kqe.b(n6);
                                    d86.p(o);
                                }
                                d86.O();
                                final b80 b3 = (b80)o;
                                shw.h((Object)a2, (hub)new thq(b3, a2, (ac0)l2, (mp6)null), d86);
                                final bc0 c2 = b3.c;
                                d86.O();
                                final dlh w = jty.W(kqe.U((dlh)dlh.Companion, c2.getValue().floatValue(), c2.getValue().floatValue(), c.getValue().floatValue(), 0.0f, null, false, 65528), false, (stb)new ohq(this.F0));
                                d86.x(733328855);
                                Objects.requireNonNull(ex.Companion);
                                final zqg d87 = ob2.d((ex)ex$a.b, false, d86);
                                d86.x(-1323940314);
                                final rp8 rp8 = (rp8)d86.m((df6)ff6.e);
                                final cwe cwe = (cwe)d86.m((df6)ff6.k);
                                final l7x l7x = (l7x)d86.m((df6)ff6.o);
                                Objects.requireNonNull(w76.Companion);
                                final swe$a b4 = w76.a.b;
                                final kub<weq<w76>, d86, Integer, vzv> a3 = lwe.a(w);
                                if (!(d86.j() instanceof tr0)) {
                                    kqe.W();
                                    throw null;
                                }
                                d86.E();
                                if (d86.f()) {
                                    d86.A((ptb)b4);
                                }
                                else {
                                    d86.o();
                                }
                                d86.F();
                                jty.X(d86, d87, (hub)w76.a.e);
                                jty.X(d86, rp8, (hub)w76.a.d);
                                jty.X(d86, cwe, (hub)w76.a.f);
                                ((z36)a3).h0((Object)af.y(d86, l7x, w76.a.g, d86), (Object)d86, (Object)0);
                                zk.C(d86, 2058660585, -2137368960, -421978688);
                                hub.invoke((Object)d86, (Object)(n & 0xE));
                                d86.O();
                                d86.O();
                                d86.O();
                                d86.r();
                                d86.O();
                                d86.O();
                            }
                            return vzv.a;
                        }
                    })));
                }
            }
            final int n10 = n8 >> 3 & 0xE;
            h.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final zqg d87 = ob2.d((ex)ex$a.b, false, h);
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b3 = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a4 = lwe.a(companion);
            final int n11 = ((n10 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b3);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, d87, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a4).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)(n11 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-2137368960);
            if ((n11 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else {
                h.x(-1788016521);
                if ((((n10 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
                    h.H();
                }
                else {
                    pra2.c = kqe.K(h);
                    final ArrayList b4 = pra2.b;
                    for (int size = b4.size(), i = 0; i < size; ++i) {
                        final ora ora = (ora)b4.get(i);
                        final mhq mhq2 = (mhq)ora.a;
                        final kub<hub<? super d86, ? super Integer, vzv>, d86, Integer, vzv> b5 = ora.b;
                        h.D(-208579897, (Object)mhq2);
                        b5.h0((Object)w9y.i(h, 2041982076, new hub<d86, Integer, vzv>(kub, mhq2, n8) {
                            public final kub<mhq, d86, Integer, vzv> F0;
                            public final mhq G0;
                            public final int H0;
                            
                            public final Object invoke(final Object o, final Object o2) {
                                final d86 d86 = (d86)o;
                                if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
                                    d86.H();
                                }
                                else {
                                    final sa6$b a = sa6.a;
                                    final kub<mhq, d86, Integer, vzv> f0 = this.F0;
                                    final mhq g0 = this.G0;
                                    e0e.c((Object)g0);
                                    f0.h0((Object)g0, (Object)d86, (Object)(this.H0 >> 3 & 0x70));
                                }
                                return vzv.a;
                            }
                        }), (Object)h, (Object)6);
                        h.N();
                    }
                }
                h.O();
            }
            awg.g(h);
            final sa6$b a5 = sa6.a;
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(a, companion, kub, n, n2) {
                public final mhq F0;
                public final dlh G0;
                public final kub<mhq, d86, Integer, vzv> H0;
                public final int I0;
                public final int J0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    rhq.a(this.F0, this.G0, this.H0, d86, this.I0 | 0x1, this.J0);
                    return vzv.a;
                }
            });
        }
    }
    
    public static final void b(final uhq uhq, dlh companion, kub<? super mhq, ? super d86, ? super Integer, vzv> b, d86 h, final int n, final int n2) {
        e0e.f((Object)uhq, "hostState");
        h = h.h(431012348);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)uhq)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0143: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (h.P((Object)companion)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0143;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n10;
        if (n9 != 0) {
            n10 = (n8 | 0x180);
        }
        else {
            n10 = n8;
            if ((n & 0x380) == 0x0) {
                int n11;
                if (h.P((Object)b)) {
                    n11 = 256;
                }
                else {
                    n11 = 128;
                }
                n10 = (n8 | n11);
            }
        }
        if ((n10 & 0x2DB) == 0x92 && h.i()) {
            h.H();
        }
        else {
            if (n5 != 0) {
                companion = (dlh)dlh.Companion;
            }
            if (n9 != 0) {
                final k66 a = k66.a;
                b = k66.b;
            }
            final sa6$b a2 = sa6.a;
            final mhq mhq = ((cjq<mhq>)uhq.b).getValue();
            shw.h((Object)mhq, (hub)new rhq$d(mhq, (jg)h.m((df6)ff6.a), (mp6)null), h);
            a(((cjq<mhq>)uhq.b).getValue(), companion, (kub<? super mhq, ? super d86, ? super Integer, vzv>)b, h, (n10 & 0x70) | (n10 & 0x380), 0);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new hub<d86, Integer, vzv>(uhq, companion, b, n, n2) {
                public final uhq F0;
                public final dlh G0;
                public final kub<mhq, d86, Integer, vzv> H0;
                public final int I0;
                public final int J0;
                
                public final Object invoke(final Object o, final Object o2) {
                    final d86 d86 = (d86)o;
                    ((Number)o2).intValue();
                    rhq.b(this.F0, this.G0, this.H0, d86, this.I0 | 0x1, this.J0);
                    return vzv.a;
                }
            });
        }
    }
}
