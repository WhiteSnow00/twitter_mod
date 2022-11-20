// 
// Decompiled by Procyon v0.6.0
// 

public final class q4s implements v4s
{
    public final qsb D0;
    public final v4s<Object, Object> E0;
    
    public q4s(final qsb d0, final v4s e0) {
        this.D0 = d0;
        this.E0 = (v4s<Object, Object>)e0;
    }
    
    public final Object V2(final Object o) {
        return this.D0.invoke(this.E0.V2(o));
    }
    
    public final v4s Y2(final p4s p4s) {
        return w1e.v((v4s)this, p4s, true);
    }
    
    public final void close() {
    }
    
    public final v4s e2(final v4s v4s, final p4s p4s) {
        return w1e.r((v4s)this, v4s, p4s);
    }
    
    public final v4s n(final p4s p4s) {
        return w1e.u((v4s)this, p4s);
    }
    
    public final v4s o(final qsb qsb) {
        return w1e.p((v4s)this, qsb);
    }
    
    public final v4s q1(final vw0 vw0) {
        return w1e.t((v4s)this, vw0, true);
    }
    
    public final v4s s2(final vw0 vw0) {
        return w1e.s((v4s)this, vw0);
    }
}
