// 
// Decompiled by Procyon v0.6.0
// 

public final class sx5
{
    public final lx5 a;
    
    public sx5(final lx5 a) {
        czd.f((Object)a, "communityUser");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof sx5 && czd.a((Object)this.a, (Object)((sx5)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final lx5 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityUserResult(communityUser=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
