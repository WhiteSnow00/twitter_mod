// 
// Decompiled by Procyon v0.6.0
// 

public final class wwo implements vwo
{
    public final two a;
    public final xwo b;
    
    public wwo(final two a, final xwo b) {
        e0e.f((Object)a, "subscribeDataSource");
        e0e.f((Object)b, "unsubscribeDataSource");
        this.a = a;
        this.b = b;
    }
    
    public final yz5 a(final String s) {
        e0e.f((Object)s, "roomId");
        return (yz5)new o06((idq)((tnm<xwo$a, Object, osc>)this.b).S(new xwo$a(s)));
    }
    
    public final yz5 b(final String s) {
        e0e.f((Object)s, "roomId");
        return (yz5)new o06((idq)((tnm<two$a, Object, osc>)this.a).S(new two$a(s)));
    }
}
