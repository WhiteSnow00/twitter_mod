import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3i extends omm<e3i.e3i$a, y3i, f3i>
{
    public e3i(final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "userIdentifier");
        super((psc)null, 1, (hg8)null);
    }
    
    public final ksc c(final Object o) {
        zzd.f((Object)o, "args");
        new f3i();
        throw null;
    }
    
    public final Object d(final ksc ksc) {
        final f3i f3i = (f3i)ksc;
        zzd.f((Object)f3i, "request");
        final tsc t = ((ksc)f3i).T();
        zzd.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            zzd.c(g);
            return g;
        }
        pav pav;
        if ((pav = (pav)t.h) == null) {
            pav = new pav(new mav[] { new mav(t.c) });
        }
        throw new IllegalStateException(pav.toString());
    }
}
