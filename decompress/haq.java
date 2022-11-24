// 
// Decompiled by Procyon v0.6.0
// 

public final class haq implements k0s
{
    public static final haq.haq$a Companion;
    public final String F0;
    public final Object[] G0;
    
    static {
        Companion = new haq.haq$a();
    }
    
    public haq(final String s) {
        e0e.f((Object)s, "query");
        this(s, null);
    }
    
    public haq(final String f0, final Object[] g0) {
        e0e.f((Object)f0, "query");
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final String a() {
        return this.F0;
    }
    
    public final void b(final j0s j0s) {
        haq.Companion.a(j0s, this.G0);
    }
}
