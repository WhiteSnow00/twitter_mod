// 
// Decompiled by Procyon v0.6.0
// 

public final class n6u
{
    public final z5u a;
    public final hfv b;
    
    public n6u(final z5u a, final hfv b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n6u)) {
            return false;
        }
        final n6u n6u = (n6u)o;
        return zzd.a((Object)this.a, (Object)n6u.a) && zzd.a((Object)this.b, (Object)n6u.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final z5u a = this.a;
        final hfv b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TrustedFriendsListMembersResult(trustedFriendsList=");
        sb.append(a);
        sb.append(", memberModified=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
