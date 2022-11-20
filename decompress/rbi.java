// 
// Decompiled by Procyon v0.6.0
// 

public final class rbi extends thq
{
    public final thq e;
    public final qsb<Object, fzv> f;
    
    public rbi(final int n, final whq whq, final qsb<Object, fzv> qsb, final thq e) {
        czd.f((Object)whq, "invalid");
        czd.f((Object)e, "parent");
        super(n, whq);
        (this.e = e).j((thq)this);
        Object f2;
        if (qsb != null) {
            final qsb f = e.f();
            f2 = qsb;
            if (f != null) {
                f2 = new rbi$a((qsb)qsb, f);
            }
        }
        else {
            f2 = e.f();
        }
        this.f = (qsb<Object, fzv>)f2;
    }
    
    public final void c() {
        if (!super.c) {
            if (super.b != this.e.d()) {
                this.a();
            }
            this.e.k((thq)this);
            super.c();
        }
    }
    
    public final qsb<Object, fzv> f() {
        return this.f;
    }
    
    public final boolean g() {
        return true;
    }
    
    public final qsb<Object, fzv> h() {
        return null;
    }
    
    public final void j(final thq thq) {
        czd.f((Object)thq, "snapshot");
        qiq.a();
        throw null;
    }
    
    public final void k(final thq thq) {
        czd.f((Object)thq, "snapshot");
        qiq.a();
        throw null;
    }
    
    public final void l() {
    }
    
    public final void m(final f9r f9r) {
        czd.f((Object)f9r, "state");
        final qsb<whq, fzv> a = (qsb<whq, fzv>)yhq.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }
    
    public final thq s(final qsb qsb) {
        return new rbi(super.b, super.a, (qsb<Object, fzv>)qsb, this.e);
    }
}
