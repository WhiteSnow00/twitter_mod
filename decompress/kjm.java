import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjm extends omm<String, ajm, ljm>
{
    public final UserIdentifier D0;
    
    public kjm(final UserIdentifier d0) {
        zzd.f((Object)d0, "userIdentifier");
        super((psc)null, 1, (hg8)null);
        this.D0 = d0;
    }
    
    public final ksc c(final Object o) {
        final String s = (String)o;
        zzd.f((Object)s, "id");
        return (ksc)new ljm(s, this.D0);
    }
    
    public final Object d(final ksc ksc) {
        final ljm ljm = (ljm)ksc;
        zzd.f((Object)ljm, "request");
        final tsc t = ((ksc)ljm).T();
        final ajm ajm = (ajm)t.g;
        if (ajm == null) {
            pav pav;
            if ((pav = (pav)t.h) == null) {
                pav = new pav(new mav[] { new mav(t.c) });
            }
            throw new IllegalStateException(pav.toString());
        }
        return ajm;
    }
}
