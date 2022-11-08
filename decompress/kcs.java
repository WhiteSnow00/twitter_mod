import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcs
{
    public final UserIdentifier a;
    public final boolean b;
    
    public kcs(final UserIdentifier a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kcs && ((kcs)o).a.equals((Object)this.a);
    }
    
    @Override
    public final int hashCode() {
        return w4j.f((Object)this.a);
    }
}
