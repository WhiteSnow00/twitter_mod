import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g11 extends enm<a, tmi, h11>
{
    public final UserIdentifier E0;
    
    public g11(final UserIdentifier e0) {
        czd.f((Object)e0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final a a = (a)o;
        czd.f((Object)a, "args");
        return (orc)new h11(a.a, a.b, this.E0);
    }
    
    public final Object d(final orc orc) {
        final h11 h11 = (h11)orc;
        czd.f((Object)h11, "request");
        final xrc t = ((orc)h11).T();
        czd.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            czd.c(g);
            return g;
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
        public final String b;
        
        public a(final String a, final String b) {
            czd.f((Object)b, "tweetId");
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
            return czd.a((Object)this.a, (Object)a.a) && czd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return zh8.o("Args(roomId=", this.a, ", tweetId=", this.b, ")");
        }
    }
}
