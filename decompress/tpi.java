import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpi implements spi
{
    public final psc a;
    public final qfv b;
    
    public tpi(final psc a, final qfv b) {
        zzd.f((Object)a, "httpRequestController");
        zzd.f((Object)b, "userManager");
        this.a = a;
        this.b = b;
    }
    
    public final long a(final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        return this.b.g(userIdentifier).getUser().L1;
    }
    
    public final n9q<Long> b(final hfv hfv) {
        final long l1 = hfv.L1;
        n9q n9q;
        if (l1 == 0L) {
            n9q = this.a.a((ksc)new i74(hfv.f())).w((qtb)new ros((rtb)new tpi$a(hfv), 24));
        }
        else {
            n9q = n9q.v((Object)l1);
        }
        return (n9q<Long>)n9q;
    }
}
