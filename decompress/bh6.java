import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bh6 implements zg6
{
    public static final bh6.bh6$a Companion;
    public final ep6 a;
    public final hrc b;
    public final ua7 c;
    public final List<String> d;
    public final String e;
    
    static {
        Companion = new bh6.bh6$a();
    }
    
    public bh6(final ep6 a, final hrc b, final ua7 c) {
        czd.f((Object)a, "controlTowerClient");
        czd.f((Object)b, "httpOperationFactoryProvider");
        czd.f((Object)c, "customTabsManager");
        this.a = a;
        this.b = b;
        this.c = c;
        final List g = asa.b().g("http_config_prewarm_connection_hosts");
        czd.e((Object)g, "getCurrent().getList(Fea\u2026PREWARM_CONNECTION_HOSTS)");
        this.d = g;
        this.e = bh6.Companion.a("t.co");
    }
    
    @Override
    public final void a() {
        rw0.c((oj)new ii4((Object)this, 19));
    }
    
    @Override
    public final void b() {
        rw0.c((oj)new cbk((Object)this, 24));
    }
}
