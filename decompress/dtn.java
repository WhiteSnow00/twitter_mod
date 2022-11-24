// 
// Decompiled by Procyon v0.6.0
// 

public final class dtn
{
    public final lhm<String> a;
    public final znl<rsn> b;
    public final lhm<vsn> c;
    public final lhm<Boolean> d;
    public final lhm<Boolean> e;
    public final lhm<Boolean> f;
    public final lhm<String> g;
    
    public dtn() {
        final lhm$a companion = lhm.Companion;
        this.a = (lhm<String>)companion.a();
        this.b = (znl<rsn>)new znl();
        this.c = (lhm<vsn>)companion.a();
        this.d = (lhm<Boolean>)companion.a();
        this.e = (lhm<Boolean>)companion.a();
        this.f = (lhm<Boolean>)companion.a();
        this.g = (lhm<String>)companion.a();
        this.e("");
    }
    
    public final void a() {
        this.d.a((Object)Boolean.TRUE);
        this.b.onNext((Object)new rsn(rj.G0, this.b()));
    }
    
    public final vsn b() {
        return (vsn)this.c.e((Object)vsn$d.a);
    }
    
    public final boolean c() {
        return this.c.c() instanceof vsn$e && e0e.a(this.f.c(), (Object)Boolean.TRUE);
    }
    
    public final void d(final String s) {
        e0e.f((Object)s, "invitedBy");
        final lhm<Boolean> f = this.f;
        final Boolean false = Boolean.FALSE;
        f.a((Object)false);
        this.d.a((Object)false);
        this.g.a((Object)s);
        rj rj;
        if (e0e.a(this.e.c(), (Object)false)) {
            this.e.a((Object)Boolean.TRUE);
            rj = rj.F0;
        }
        else {
            rj = rj.H0;
        }
        this.c.a((Object)new vsn$e(s));
        this.b.onNext((Object)new rsn(rj, (vsn)new vsn$e(s)));
    }
    
    public final void e(final String s) {
        this.a.a((Object)s);
        final lhm<Boolean> d = this.d;
        final Boolean false = Boolean.FALSE;
        d.a((Object)false);
        this.e.a((Object)false);
        this.c.a((Object)vsn$d.a);
    }
    
    public final void f(final vsn vsn) {
        this.c.a((Object)vsn);
        this.d.a((Object)Boolean.FALSE);
        this.b.onNext((Object)new rsn(rj.F0, vsn));
    }
}
