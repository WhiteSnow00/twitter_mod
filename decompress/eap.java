import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eap extends enm<a, tmi, fap>
{
    public final UserIdentifier E0;
    
    public eap(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final a a = (a)o;
        czd.f((Object)a, "args");
        return (orc)new fap(this.E0, a.a);
    }
    
    public final Object d(final orc orc) {
        final fap fap = (fap)orc;
        czd.f((Object)fap, "request");
        final xrc t = ((orc)fap).T();
        czd.e((Object)t, "request.result");
        if (t.b) {
            return tmi.a;
        }
        kbv kbv;
        if ((kbv = (kbv)t.h) == null) {
            kbv = new kbv(new hbv[] { new hbv(t.c) });
        }
        throw new IllegalStateException(kbv.toString());
    }
    
    public static final class a
    {
        public final String a;
        
        public a(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return da8.j("Args(query=", this.a, ")");
        }
    }
}
