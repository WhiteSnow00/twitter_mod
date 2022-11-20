import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z3s
{
    public final UserIdentifier a;
    
    public z3s(final UserIdentifier a) {
        czd.f((Object)a, "ownerId");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof z3s && czd.a((Object)this.a, (Object)((z3s)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final UserIdentifier a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("SwitchToPersonalAccountParams(ownerId=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
