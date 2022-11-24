import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tfs implements ddm
{
    public final iks F0;
    public ogp G0;
    public egs H0;
    public final tfs$b I0;
    public final dlh J0;
    public dlh K0;
    public dlh L0;
    
    public tfs(final iks f0) {
        this.F0 = f0;
        this.I0 = new zqg(this) {
            public final tfs a;
            
            @Override
            public final int a(final b0e b0e, final List<? extends jzd> list, final int n) {
                e0e.f((Object)b0e, "<this>");
                this.a.F0.a.d(((qni)b0e).L0.V0);
                return this.a.F0.a.a();
            }
            
            @Override
            public final arg b(final crg crg, final List<? extends wqg> list, long c) {
                e0e.f((Object)crg, "$this$measure");
                e0e.f((Object)list, "measurables");
                final iks f0 = this.a.F0;
                final qjs f2 = f0.f;
                final qjs c2 = f0.a.c(c, ((b0e)crg).getLayoutDirection(), f2);
                if (!e0e.a((Object)f2, (Object)c2)) {
                    this.a.F0.c.invoke((Object)c2);
                    if (f2 != null) {
                        final tfs a = this.a;
                        if (!e0e.a((Object)f2.a.a, (Object)c2.a.a)) {
                            final ogp g0 = a.G0;
                            if (g0 != null) {
                                g0.g(a.F0.b);
                            }
                        }
                    }
                }
                final iks f3 = this.a.F0;
                ((cjq<vzv>)f3.i).setValue(vzv.a);
                f3.f = c2;
                if (list.size() >= c2.f.size()) {
                    final ArrayList f4 = c2.f;
                    final ArrayList list2 = new ArrayList<Object>(f4.size());
                    for (int size = f4.size(), i = 0; i < size; ++i) {
                        final p6m p6m = (p6m)f4.get(i);
                        Object o;
                        if (p6m != null) {
                            o = new awj((Object)list.get(i).W(xd.m((int)(float)Math.floor(p6m.c - p6m.a), (int)(float)Math.floor(p6m.d - p6m.b), 5)), (Object)new hud(kqe.d(jb2.B0(p6m.a), jb2.B0(p6m.b))));
                        }
                        else {
                            o = null;
                        }
                        if (o != null) {
                            list2.add(o);
                        }
                    }
                    c = c2.c;
                    return crg.J((int)(c >> 32), nud.b(c), mlg.S(new awj[] { new awj((Object)hx.a, (Object)jb2.B0(c2.d)), new awj((Object)hx.b, (Object)jb2.B0(c2.e)) }), (stb)new tfs$b$a((List)list2));
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            
            @Override
            public final int c(final b0e b0e, final List<? extends jzd> list, final int n) {
                e0e.f((Object)b0e, "<this>");
                this.a.F0.a.d(((qni)b0e).L0.V0);
                return amz.n(this.a.F0.a.b().c());
            }
            
            @Override
            public final int d(final b0e b0e, final List<? extends jzd> list, final int n) {
                e0e.f((Object)b0e, "<this>");
                return nud.b(this.a.F0.a.c(xd.h(0, n, 0, Integer.MAX_VALUE), ((qni)b0e).L0.V0, null).c);
            }
            
            @Override
            public final int e(final b0e b0e, final List<? extends jzd> list, final int n) {
                e0e.f((Object)b0e, "<this>");
                return nud.b(this.a.F0.a.c(xd.h(0, n, 0, Integer.MAX_VALUE), ((qni)b0e).L0.V0, null).c);
            }
        };
        final dlh.a companion = dlh.Companion;
        this.J0 = d4j.p0(rd9.a(kqe.U((dlh)companion, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535), (stb<? super wd9, vzv>)new wfs(this)), (stb)new tfs$a(this));
        this.K0 = jty.W((dlh)companion, false, (stb)new vfs(f0.a.a, this));
        this.L0 = (dlh)companion;
    }
    
    public static final boolean b(final tfs tfs, final long n, final long n2) {
        final qjs f = tfs.F0.f;
        boolean b2;
        final boolean b = b2 = false;
        if (f != null) {
            int length = f.a.a.F0.length();
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
    
    public final void a() {
        final ogp g0 = this.G0;
        if (g0 != null) {
            final iks f0 = this.F0;
            f0.d = g0.h((xep)new lth(f0.b, (ptb<? extends bwe>)new tfs$c(this), (ptb<qjs>)new tfs$d(this)));
        }
    }
    
    public final void c() {
        final xep d = this.F0.d;
        if (d != null) {
            final ogp g0 = this.G0;
            if (g0 != null) {
                g0.e(d);
            }
        }
    }
    
    public final void d() {
        final xep d = this.F0.d;
        if (d != null) {
            final ogp g0 = this.G0;
            if (g0 != null) {
                g0.e(d);
            }
        }
    }
    
    public final void e(final zfs a) {
        final iks f0 = this.F0;
        if (f0.a == a) {
            return;
        }
        f0.a = a;
        this.K0 = jty.W((dlh)dlh.Companion, false, (stb)new vfs(a.a, this));
    }
    
    public final void f(final ogp g0) {
        this.G0 = g0;
        Object l0;
        if (g0 != null) {
            final egs h0 = (egs)new egs(this, g0) {
                public long a;
                public long b;
                public final tfs c;
                public final ogp d;
                
                {
                    final kgj$a companion = kgj.Companion;
                    Objects.requireNonNull(companion);
                    final long b = kgj.b;
                    this.a = b;
                    Objects.requireNonNull(companion);
                    this.b = b;
                }
                
                public final void a() {
                }
                
                public final void b(final long a) {
                    final tfs c = this.c;
                    final bwe e = c.F0.e;
                    if (e != null) {
                        final ogp d = this.d;
                        if (!e.j()) {
                            return;
                        }
                        if (tfs.b(c, a, a)) {
                            d.i(c.F0.b);
                        }
                        else {
                            Objects.requireNonNull(jfp.Companion);
                            d.b(e, a);
                        }
                        this.a = a;
                    }
                    if (!rgp.a(this.d, this.c.F0.b)) {
                        return;
                    }
                    Objects.requireNonNull(kgj.Companion);
                    this.b = kgj.b;
                }
                
                public final void c() {
                }
                
                public final void d(long n) {
                    final tfs c = this.c;
                    final bwe e = c.F0.e;
                    if (e != null) {
                        final ogp d = this.d;
                        if (!e.j()) {
                            return;
                        }
                        if (!rgp.a(d, c.F0.b)) {
                            return;
                        }
                        n = kgj.h(this.b, n);
                        this.b = n;
                        n = kgj.h(this.a, n);
                        if (!tfs.b(c, this.a, n)) {
                            final long a = this.a;
                            Objects.requireNonNull(jfp.Companion);
                            if (d.f(e, n, a)) {
                                this.a = n;
                                Objects.requireNonNull(kgj.Companion);
                                this.b = kgj.b;
                            }
                        }
                    }
                }
                
                public final void j() {
                    if (rgp.a(this.d, this.c.F0.b)) {
                        this.d.j();
                    }
                }
                
                public final void onCancel() {
                    if (rgp.a(this.d, this.c.F0.b)) {
                        this.d.j();
                    }
                }
            };
            this.H0 = (egs)h0;
            l0 = q1s.a((dlh)dlh.Companion, (Object)h0, (hub)new tfs$f(this, (mp6)null));
        }
        else {
            l0 = dlh.Companion;
        }
        this.L0 = (dlh)l0;
    }
}
