import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfs implements rcm
{
    public final qjs D0;
    public rfp E0;
    public mfs F0;
    public final bfs$b G0;
    public final okh H0;
    public okh I0;
    public okh J0;
    
    public bfs(final qjs d0) {
        this.D0 = d0;
        this.G0 = new fqg(this) {
            public final bfs a;
            
            public final int a(final zyd zyd, final List<? extends hyd> list, final int n) {
                czd.f((Object)zyd, "<this>");
                this.a.D0.a.d(((zmi)zyd).J0.T0);
                return this.a.D0.a.a();
            }
            
            public final gqg b(final iqg iqg, final List<? extends cqg> list, long c) {
                czd.f((Object)iqg, "$this$measure");
                czd.f((Object)list, "measurables");
                final qjs d0 = this.a.D0;
                final yis f = d0.f;
                final yis c2 = d0.a.c(c, ((zyd)iqg).getLayoutDirection(), f);
                if (!czd.a((Object)f, (Object)c2)) {
                    this.a.D0.c.invoke((Object)c2);
                    if (f != null) {
                        final bfs a = this.a;
                        if (!czd.a((Object)f.a.a, (Object)c2.a.a)) {
                            final rfp e0 = a.E0;
                            if (e0 != null) {
                                e0.g(a.D0.b);
                            }
                        }
                    }
                }
                final qjs d2 = this.a.D0;
                d2.i.setValue((Object)fzv.a);
                d2.f = c2;
                if (list.size() >= c2.f.size()) {
                    final ArrayList f2 = c2.f;
                    final ArrayList list2 = new ArrayList<Object>(f2.size());
                    for (int size = f2.size(), i = 0; i < size; ++i) {
                        final c6m c6m = (c6m)f2.get(i);
                        Object o;
                        if (c6m != null) {
                            o = new lvj((Object)list.get(i).W(uoz.c((int)(float)Math.floor(c6m.c - c6m.a), (int)(float)Math.floor(c6m.d - c6m.b), 5)), (Object)new ftd(wd.j(zyz.n(c6m.a), zyz.n(c6m.b))));
                        }
                        else {
                            o = null;
                        }
                        if (o != null) {
                            list2.add(o);
                        }
                    }
                    c = c2.c;
                    return iqg.J((int)(c >> 32), ltd.b(c), tkg.n0(new lvj[] { new lvj((Object)hx.a, (Object)zyz.n(c2.d)), new lvj((Object)hx.b, (Object)zyz.n(c2.e)) }), (qsb)new bfs$b$a((List)list2));
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            
            public final int c(final zyd zyd, final List<? extends hyd> list, final int n) {
                czd.f((Object)zyd, "<this>");
                this.a.D0.a.d(((zmi)zyd).J0.T0);
                return xli.A(this.a.D0.a.b().c());
            }
            
            public final int d(final zyd zyd, final List<? extends hyd> list, final int n) {
                czd.f((Object)zyd, "<this>");
                return ltd.b(this.a.D0.a.c(uoz.b(0, n, 0, Integer.MAX_VALUE), ((zmi)zyd).J0.T0, null).c);
            }
            
            public final int e(final zyd zyd, final List<? extends hyd> list, final int n) {
                czd.f((Object)zyd, "<this>");
                return ltd.b(this.a.D0.a.c(uoz.b(0, n, 0, Integer.MAX_VALUE), ((zmi)zyd).J0.T0, null).c);
            }
        };
        final okh$a companion = okh.Companion;
        this.H0 = q3j.V(oc9.a(wj1.o((okh)companion, 0.0f, 0.0f, 0.0f, 0.0f, (frp)null, false, 65535), (qsb<? super tc9, fzv>)new efs(this)), (qsb)new bfs$a(this));
        this.I0 = oj7.n((okh)companion, false, (qsb)new dfs(d0.a.a, this));
        this.J0 = (okh)companion;
    }
    
    public static final boolean b(final bfs bfs, final long n, final long n2) {
        final yis f = bfs.D0.f;
        boolean b2;
        final boolean b = b2 = false;
        if (f != null) {
            int length = f.a.a.D0.length();
            final int l = f.l(n);
            final int i = f.l(n2);
            --length;
            if (l < length || i < length) {
                b2 = b;
                if (l >= 0) {
                    return b2;
                }
                b2 = b;
                if (i >= 0) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public final void a() {
        final rfp e0 = this.E0;
        if (e0 != null) {
            final qjs d0 = this.D0;
            d0.d = e0.h((aep)new wsh(d0.b, (nsb)new bfs$c(this), (nsb)new bfs$d(this)));
        }
    }
    
    @Override
    public final void c() {
        final aep d = this.D0.d;
        if (d != null) {
            final rfp e0 = this.E0;
            if (e0 != null) {
                e0.e(d);
            }
        }
    }
    
    @Override
    public final void d() {
        final aep d = this.D0.d;
        if (d != null) {
            final rfp e0 = this.E0;
            if (e0 != null) {
                e0.e(d);
            }
        }
    }
    
    public final void e(final hfs a) {
        final qjs d0 = this.D0;
        if (d0.a == a) {
            return;
        }
        d0.a = a;
        this.I0 = oj7.n((okh)okh.Companion, false, (qsb)new dfs(a.a, this));
    }
    
    public final void f(final rfp e0) {
        this.E0 = e0;
        Object j0;
        if (e0 != null) {
            final mfs f0 = (mfs)new mfs(this, e0) {
                public long a;
                public long b;
                public final bfs c;
                public final rfp d;
                
                {
                    final wfj$a companion = wfj.Companion;
                    Objects.requireNonNull(companion);
                    final long b = wfj.b;
                    this.a = b;
                    Objects.requireNonNull(companion);
                    this.b = b;
                }
                
                public final void a() {
                }
                
                public final void b() {
                    if (ufp.a(this.d, this.c.D0.b)) {
                        this.d.j();
                    }
                }
                
                public final void c(final long a) {
                    final bfs c = this.c;
                    final eve e = c.D0.e;
                    if (e != null) {
                        final rfp d = this.d;
                        if (!e.j()) {
                            return;
                        }
                        if (bfs.b(c, a, a)) {
                            d.i(c.D0.b);
                        }
                        else {
                            Objects.requireNonNull(mep.Companion);
                            d.b(e, a);
                        }
                        this.a = a;
                    }
                    if (!ufp.a(this.d, this.c.D0.b)) {
                        return;
                    }
                    Objects.requireNonNull(wfj.Companion);
                    this.b = wfj.b;
                }
                
                public final void d() {
                }
                
                public final void e(long n) {
                    final bfs c = this.c;
                    final eve e = c.D0.e;
                    if (e != null) {
                        final rfp d = this.d;
                        if (!e.j()) {
                            return;
                        }
                        if (!ufp.a(d, c.D0.b)) {
                            return;
                        }
                        n = wfj.h(this.b, n);
                        this.b = n;
                        n = wfj.h(this.a, n);
                        if (!bfs.b(c, this.a, n)) {
                            final long a = this.a;
                            Objects.requireNonNull(mep.Companion);
                            if (d.f(e, n, a)) {
                                this.a = n;
                                Objects.requireNonNull(wfj.Companion);
                                this.b = wfj.b;
                            }
                        }
                    }
                }
                
                public final void onCancel() {
                    if (ufp.a(this.d, this.c.D0.b)) {
                        this.d.j();
                    }
                }
            };
            this.F0 = (mfs)f0;
            j0 = u0s.a((okh)okh.Companion, (Object)f0, (ftb)new bfs$f(this, (go6)null));
        }
        else {
            j0 = okh.Companion;
        }
        this.J0 = (okh)j0;
    }
}
