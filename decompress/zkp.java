import okhttp3.Dns;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zkp extends w39
{
    public final b49 f;
    
    public zkp(final Dns dns, final long n, final gwo gwo, final b49 f, final xbm xbm) {
        czd.f((Object)dns, "systemDns");
        czd.f((Object)gwo, "ioScheduler");
        czd.f((Object)f, "dnsRepository");
        czd.f((Object)xbm, "releaseCompletable");
        super(dns, n, gwo);
        this.f = f;
        xbm.i((oj)new bl0(this.c().subscribe((lj6)new fta((qsb)new zkp$a(this), 22)), 10));
    }
}
