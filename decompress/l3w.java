import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l3w extends omm<l3w$a$a, pmi, k3w>
{
    public static final l3w.l3w$a Companion;
    public final UserIdentifier D0;
    
    static {
        Companion = new l3w.l3w$a();
    }
    
    public l3w(final UserIdentifier d0) {
        zzd.f((Object)d0, "owner");
        super((psc)null, 1, (hg8)null);
        this.D0 = d0;
    }
    
    public final ksc c(final Object o) {
        final l3w$a$a l3w$a$a = (l3w$a$a)o;
        zzd.f((Object)l3w$a$a, "args");
        return (ksc)new k3w(this.D0, l3w$a$a.a, l3w$a$a.b);
    }
    
    public final Object d(final ksc ksc) {
        zzd.f((Object)ksc, "request");
        return pmi.a;
    }
}
