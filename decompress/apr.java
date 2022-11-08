import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apr implements zor
{
    public final snr a;
    public final rr b;
    public final fem c;
    public final ulf d;
    
    public apr(final snr a, final rr b, final fem c, final ulf d) {
        zzd.f((Object)a, "subscriptionsDataSource");
        zzd.f((Object)b, "addSubscriptionDataSource");
        zzd.f((Object)c, "removeSubscriptionDataSource");
        zzd.f((Object)d, "listProductSubscriptionsDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final iz5 a(final String s) {
        return (iz5)new yz5((ubq)((omm)this.c).S((Object)s));
    }
    
    public final n9q<List<hb4>> b() {
        return (n9q<List<hb4>>)((omm)this.a).S((Object)pmi.a).w((qtb)new r0n((rtb)apr$a.C0, 28));
    }
    
    public final n9q<List<q3l>> c() {
        return (n9q<List<q3l>>)((omm)this.d).S((Object)pmi.a).w((qtb)new t2o((rtb)apr$b.C0, 19));
    }
}
