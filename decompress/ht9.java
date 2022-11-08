import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ht9 extends omm<a, pmi, ot9>
{
    public final UserIdentifier D0;
    
    public ht9(final UserIdentifier d0) {
        zzd.f((Object)d0, "userIdentifier");
        super((psc)null, 1, (hg8)null);
        this.D0 = d0;
    }
    
    public final ksc c(final Object o) {
        final a a = (a)o;
        zzd.f((Object)a, "args");
        return (ksc)new ot9(this.D0, a.a);
    }
    
    public final Object d(final ksc ksc) {
        final ot9 ot9 = (ot9)ksc;
        zzd.f((Object)ot9, "request");
        final tsc t = ((ksc)ot9).T();
        zzd.e((Object)t, "request.result");
        if (zi8.H(t)) {
            return pmi.a;
        }
        pav pav;
        if ((pav = (pav)t.h) == null) {
            pav = new pav(new mav[] { new mav(t.c) });
        }
        throw new IllegalStateException(pav.toString());
    }
    
    public static final class a
    {
        public final String a;
        
        public a(final String a) {
            zzd.f((Object)a, "pronouns");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("Args(pronouns=", this.a, ")");
        }
    }
}
