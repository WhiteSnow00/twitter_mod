// 
// Decompiled by Procyon v0.6.0
// 

public final class hlq implements glq
{
    public final rmv a;
    public final qdw b;
    
    public hlq(final rmv a, final qdw b) {
        e0e.f((Object)a, "featureConfiguration");
        e0e.f((Object)b, "userInfo");
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        final okw o = this.b.o();
        final okw i0 = okw.I0;
        boolean b = false;
        if (o == i0 || this.a.b("signupless_force_signupless", false)) {
            b = true;
        }
        return b;
    }
}
