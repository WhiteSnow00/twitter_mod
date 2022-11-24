import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kt8
{
    public final UserIdentifier a;
    
    public kt8(final UserIdentifier a) {
        e0e.f((Object)a, "currentUser");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kt8 && e0e.a((Object)this.a, (Object)((kt8)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final UserIdentifier a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("DestroyBookmarksParams(currentUser=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
