// 
// Decompiled by Procyon v0.6.0
// 

public final class pbi extends ahq
{
    public final ahq e;
    public final rtb<Object, oyv> f;
    
    public pbi(final int n, final dhq dhq, final rtb<Object, oyv> rtb, final ahq e) {
        zzd.f((Object)dhq, "invalid");
        zzd.f((Object)e, "parent");
        super(n, dhq);
        (this.e = e).j((ahq)this);
        Object f2;
        if (rtb != null) {
            final rtb f = e.f();
            f2 = rtb;
            if (f != null) {
                f2 = new rtb<Object, oyv>() {
                    public final Object invoke(final Object o) {
                        zzd.f(o, "state");
                        rtb.invoke(o);
                        f.invoke(o);
                        return oyv.a;
                    }
                };
            }
        }
        else {
            f2 = e.f();
        }
        this.f = (rtb<Object, oyv>)f2;
    }
    
    public final void c() {
        if (!super.c) {
            if (super.b != this.e.d()) {
                this.a();
            }
            this.e.k((ahq)this);
            super.c();
        }
    }
    
    public final rtb<Object, oyv> f() {
        return this.f;
    }
    
    public final boolean g() {
        return true;
    }
    
    public final rtb<Object, oyv> h() {
        return null;
    }
    
    public final void j(final ahq ahq) {
        zzd.f((Object)ahq, "snapshot");
        xhq.a();
        throw null;
    }
    
    public final void k(final ahq ahq) {
        zzd.f((Object)ahq, "snapshot");
        xhq.a();
        throw null;
    }
    
    public final void l() {
    }
    
    public final void m(final j8r j8r) {
        zzd.f((Object)j8r, "state");
        final fhq$a a = fhq.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }
    
    public final ahq s(final rtb rtb) {
        return new pbi(super.b, super.a, (rtb<Object, oyv>)rtb, this.e);
    }
}
