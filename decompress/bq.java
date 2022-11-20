import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bq extends enm<a, xrc<a7$b, kbv>, orc<a7$b, kbv>>
{
    public final ti0 E0;
    public final UserIdentifier F0;
    
    public bq(final ti0 e0, final UserIdentifier f0) {
        czd.f((Object)e0, "factory");
        czd.f((Object)f0, "userIdentifier");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final orc c(final Object o) {
        final a a = (a)o;
        czd.f((Object)a, "args");
        return (orc)g2v.a((uqc)this.E0.a((mnj)new a7(a.a, a.b)), this.F0);
    }
    
    public final Object d(final orc orc) {
        czd.f((Object)orc, "request");
        final xrc t = orc.T();
        czd.e((Object)t, "request.result");
        return t;
    }
    
    public static final class a
    {
        public final String a;
        public final boolean b;
        
        public a(final String a, final boolean b) {
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
            return czd.a((Object)this.a, (Object)a.a) && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            int b;
            if ((b = (this.b ? 1 : 0)) != 0) {
                b = 1;
            }
            return hashCode * 31 + b;
        }
        
        @Override
        public final String toString() {
            return neg.h("Args(adId=", this.a, ", consent=", this.b, ")");
        }
    }
}
