import java.util.Set;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kos extends omm<a, pmi, los>
{
    public final UserIdentifier D0;
    
    public kos(final UserIdentifier d0) {
        zzd.f((Object)d0, "userIdentifier");
        super((psc)null, 1, (hg8)null);
        this.D0 = d0;
    }
    
    public final ksc c(final Object o) {
        final a a = (a)o;
        zzd.f((Object)a, "args");
        return (ksc)new los(this.D0, a.a, (Set)a.b);
    }
    
    public final Object d(final ksc ksc) {
        final los los = (los)ksc;
        zzd.f((Object)los, "request");
        final tsc t = ((ksc)los).T();
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
    
    public static final class a
    {
        public final String a;
        public final Set<Long> b;
        
        public a(final String a, final Set<Long> b) {
            zzd.f((Object)a, "roomId");
            zzd.f((Object)b, "recipients");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final Set<Long> b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Args(roomId=");
            sb.append(a);
            sb.append(", recipients=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
