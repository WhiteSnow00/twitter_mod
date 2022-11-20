import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxe
{
    public final cy6 a;
    public final boolean b;
    public final Map<Object, x3e> c;
    public Map<Object, Integer> d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Set<Object> i;
    
    public kxe(final cy6 a, final boolean b) {
        czd.f((Object)a, "scope");
        this.a = a;
        this.b = b;
        this.c = new LinkedHashMap();
        this.d = (Map<Object, Integer>)k2a.D0;
        this.e = -1;
        this.g = -1;
        this.i = new LinkedHashSet();
    }
    
    public final int a(int n, int a, final int n2, final long n3, final boolean b, int a2, int n4, final List<hye> list, final lye lye) {
        final int g = this.g;
        boolean b2 = false;
        final boolean b3 = b ? (g > n) : (g < n);
        final int e = this.e;
        Label_0067: {
            if (!b) {
                if (e <= n) {
                    break Label_0067;
                }
            }
            else if (e >= n) {
                break Label_0067;
            }
            b2 = true;
        }
        if (b3) {
            if (!b) {
                a = g + 1;
            }
            else {
                final o4r a3 = lxe.a;
                final lye$c b4 = lye.b(lye.c(n));
                a = b4.a;
                a += b4.b.size();
            }
            if (b) {
                n = this.g;
            }
            final o4r a4 = lxe.a;
            final int a5 = lye.b(lye.c(n)).a;
            n4 = this.h;
            n = this.b(n3);
            n4 = lxe.a(lye, a, a5 - 1, n2, (List)list) + (n + (a2 + n4));
        }
        else if (b2) {
            a2 = e;
            if (!b) {
                a2 = n;
            }
            final o4r a6 = lxe.a;
            final lye$c b5 = lye.b(lye.c(a2));
            a2 = b5.a;
            n4 = b5.b.size();
            if (!b) {
                n = this.e - 1;
            }
            else {
                n = lye.b(lye.c(n)).a - 1;
            }
            n4 = this.b(n3) + this.f + -a + -lxe.a(lye, n4 + a2, n, n2, (List)list);
        }
        return n4;
    }
    
    public final int b(final long n) {
        int c;
        if (this.b) {
            c = ftd.c(n);
        }
        else {
            final ftd$a companion = ftd.Companion;
            c = (int)(n >> 32);
        }
        return c;
    }
    
    public final void c() {
        this.c.clear();
        this.d = (Map<Object, Integer>)k2a.D0;
        this.e = -1;
        this.f = 0;
        this.g = -1;
        this.h = 0;
    }
    
    public final void d(final hye hye, final x3e x3e) {
        while (x3e.d.size() > hye.f()) {
            kq4.T((List)x3e.d);
        }
        while (x3e.d.size() < hye.f()) {
            final int size = x3e.d.size();
            final long a = hye.a;
            final ArrayList d = x3e.d;
            final long c = x3e.c;
            final ftd$a companion = ftd.Companion;
            d.add(new xgk(wd.j((int)(a >> 32) - (int)(c >> 32), ftd.c(a) - ftd.c(c)), hye.d(size)));
        }
        final ArrayList d2 = x3e.d;
        for (int size2 = d2.size(), i = 0; i < size2; ++i) {
            final xgk xgk = (xgk)d2.get(i);
            final long c2 = xgk.c;
            final long c3 = x3e.c;
            final ftd$a companion2 = ftd.Companion;
            final long j = p0f.j(c3, ftd.c(c2), (int)(c2 >> 32) + (int)(c3 >> 32));
            final long b = hye.b;
            xgk.a = hye.d(i);
            final uza c4 = hye.c(i);
            if (!ftd.b(j, b)) {
                final long c5 = x3e.c;
                xgk.c = wd.j((int)(b >> 32) - (int)(c5 >> 32), ftd.c(b) - ftd.c(c5));
                if (c4 != null) {
                    xgk.a(true);
                    as2.M(this.a, (sx6)null, 0, (ftb)new ftb<cy6, go6<? super fzv>, Object>(xgk, c4, null) {
                        public int D0;
                        public final xgk E0;
                        public final uza<ftd> F0;
                        
                        public final go6<fzv> create(final Object o, final go6<?> go6) {
                            return (go6<fzv>)new ftb<cy6, go6<? super fzv>, Object>(this.E0, this.F0, go6) {
                                public int D0;
                                public final xgk E0;
                                public final uza<ftd> F0;
                            };
                        }
                        
                        public final Object invoke(final Object o, final Object o2) {
                            return ((kxe$a)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
                        }
                        
                        public final Object invokeSuspend(final Object o) {
                            final dy6 d0 = dy6.D0;
                            final int d2 = this.D0;
                            Label_0036: {
                                if (d2 == 0) {
                                    break Label_0036;
                                }
                                Label_0026: {
                                    if (d2 != 1) {
                                        break Label_0026;
                                    }
                                    try {
                                        b1n.u(o);
                                        Label_0149: {
                                            this.E0.a(false);
                                        }
                                        return fzv.a;
                                        b1n.u(o);
                                        iftrue(Label_0089:)(!(boolean)this.E0.b.d.getValue());
                                        while (true) {
                                            Block_4: {
                                                break Block_4;
                                                final xgk e0 = this.E0;
                                                final b80 b = e0.b;
                                                final ftd ftd = new ftd(e0.c);
                                                this.D0 = 1;
                                                final Object o2;
                                                iftrue(Label_0149:)(b80.c(b, (Object)ftd, (zb0)o2, (qsb)null, (go6)this, 12) != d0);
                                                return d0;
                                            }
                                            final uza<ftd> f0 = this.F0;
                                            iftrue(Label_0082:)(!(f0 instanceof o4r));
                                            Block_5: {
                                                break Block_5;
                                                Label_0082:
                                                Object o2 = lxe.a;
                                                continue;
                                                Label_0089:
                                                o2 = this.F0;
                                                continue;
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            Object o2 = f0;
                                            continue;
                                        }
                                    }
                                    catch (final CancellationException ex) {
                                        return fzv.a;
                                    }
                                }
                            }
                        }
                    }, 3);
                }
            }
        }
    }
}
