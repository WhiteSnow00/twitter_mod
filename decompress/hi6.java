import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hi6 implements fi6
{
    public static final hi6.hi6$a Companion;
    public final kq6 a;
    public final hsc b;
    public final zb7 c;
    public final List<String> d;
    public final String e;
    
    static {
        Companion = new hi6.hi6$a();
    }
    
    public hi6(final kq6 a, final hsc b, final zb7 c) {
        e0e.f((Object)a, "controlTowerClient");
        e0e.f((Object)b, "httpOperationFactoryProvider");
        e0e.f((Object)c, "customTabsManager");
        this.a = a;
        this.b = b;
        this.c = c;
        final List g = ita.b().g("http_config_prewarm_connection_hosts");
        e0e.e((Object)g, "getCurrent().getList(Fea\u2026PREWARM_CONNECTION_HOSTS)");
        this.d = g;
        this.e = hi6.Companion.a("t.co");
    }
    
    public final void a() {
        xw0.c((sj)new kgc(this, 17));
    }
    
    public final void b() {
        xw0.c((sj)new n0p((Object)this, 19));
    }
}
