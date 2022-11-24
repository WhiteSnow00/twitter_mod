// 
// Decompiled by Procyon v0.6.0
// 

public abstract class tnm<A, T, R extends osc<?, ?>> implements rbq<A, T>
{
    public final tsc F0;
    
    public tnm() {
        this(null, 1, null);
    }
    
    public tnm(final tsc f0) {
        e0e.f((Object)f0, "httpRequestController");
        this.F0 = f0;
    }
    
    public tnm(tsc c, final int n, final wg8 wg8) {
        c = tsc.c();
        e0e.e((Object)c, "get()");
        this.F0 = c;
    }
    
    @Override
    public final mpg F(final stb stb) {
        return qee.e((rbq)this, stb);
    }
    
    @Override
    public bbq<T> S(final A a) {
        return (bbq<T>)bbq.v((Object)a).p((rtb)new mr0((stb)new tnm$a(this), 28)).p((rtb)new t3i((stb)new tnm$b(this), 12)).y(this.a()).w((rtb)new p1p((Object)this, 8)).y(this.b());
    }
    
    public bxo a() {
        final bxo j = iqs.j();
        e0e.e((Object)j, "mainThread()");
        return j;
    }
    
    public bxo b() {
        final bxo j = iqs.j();
        e0e.e((Object)j, "mainThread()");
        return j;
    }
    
    public abstract R c(final A p0);
    
    public void close() {
    }
    
    public abstract T d(final R p0);
    
    public boolean e() {
        return this instanceof qp5;
    }
    
    @Override
    public final mpg n1(final k9x k9x) {
        return qee.h((rbq)this, k9x);
    }
    
    @Override
    public final rbq o(final j5s j5s) {
        return qee.p((rbq)this, j5s);
    }
    
    @Override
    public final rbq p(final stb stb) {
        return qee.m((rbq)this, stb);
    }
    
    @Override
    public final x6j y0(final x6j x6j, final bx0 bx0) {
        return qee.n((rbq)this, x6j, bx0);
    }
}
