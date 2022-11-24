// 
// Decompiled by Procyon v0.6.0
// 

public final class u2m extends piq
{
    public final stb<Object, vzv> e;
    public int f;
    
    public u2m(final int n, final siq siq, final stb<Object, vzv> e) {
        e0e.f((Object)siq, "invalid");
        super(n, siq);
        this.e = e;
        this.f = 1;
    }
    
    @Override
    public final void c() {
        if (!super.c) {
            if (--this.f == 0) {
                this.a();
            }
            super.c();
        }
    }
    
    @Override
    public final stb<Object, vzv> f() {
        return this.e;
    }
    
    @Override
    public final boolean g() {
        return true;
    }
    
    @Override
    public final stb<Object, vzv> h() {
        return null;
    }
    
    @Override
    public final void j(final piq piq) {
        e0e.f((Object)piq, "snapshot");
        ++this.f;
    }
    
    @Override
    public final void k(final piq piq) {
        e0e.f((Object)piq, "snapshot");
        final int f = this.f - 1;
        this.f = f;
        if (f == 0) {
            this.a();
        }
    }
    
    @Override
    public final void l() {
    }
    
    @Override
    public final void m(final ear ear) {
        e0e.f((Object)ear, "state");
        final uiq$a a = uiq.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }
    
    @Override
    public final piq s(final stb<Object, vzv> stb) {
        uiq.d((piq)this);
        return (piq)new ici(super.b, super.a, (stb)stb, (piq)this);
    }
}
