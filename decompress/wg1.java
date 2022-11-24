import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wg1
{
    public static final nmp<wg1> d;
    public final UserIdentifier a;
    public final String b;
    public final int c;
    
    static {
        wg1.d = new wg1.wg1$a();
    }
    
    public wg1(final b b) {
        this.a = b.a;
        final String b2 = b.b;
        vmw.g((Object)b2);
        this.b = b2;
        this.c = b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && wg1.class == o.getClass()) {
            final wg1 wg1 = (wg1)o;
            if (this.c != wg1.c || !this.a.equals((Object)wg1.a) || !this.b.equals(wg1.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("BadgeCount{userIdentifier=");
        f.append(this.a);
        f.append(", badgeCountType='");
        go9.r(f, this.b, '\'', ", count=");
        return gwl.x(f, this.c, '}');
    }
    
    public static final class b extends z4j<wg1>
    {
        public UserIdentifier a;
        public String b;
        public int c;
        
        public b() {
            this.a = UserIdentifier.UNDEFINED;
        }
        
        public final Object i() {
            return new wg1(this);
        }
        
        public final boolean k() {
            return this.b != null && this.c >= 0;
        }
    }
}
