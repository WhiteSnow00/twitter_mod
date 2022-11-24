// 
// Decompiled by Procyon v0.6.0
// 

public final class leq implements keq
{
    public final boolean a;
    public final hub<nud, nud, w0b<nud>> b;
    
    public leq(final boolean a, final hub<? super nud, ? super nud, ? extends w0b<nud>> b) {
        this.a = a;
        this.b = (hub<nud, nud, w0b<nud>>)b;
    }
    
    public final w0b<nud> a(final long n, final long n2) {
        return (w0b<nud>)this.b.invoke((Object)new nud(n), (Object)new nud(n2));
    }
    
    public final boolean i() {
        return this.a;
    }
}
