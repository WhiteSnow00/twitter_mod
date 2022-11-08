// 
// Decompiled by Procyon v0.6.0
// 

public final class vx5
{
    public final vs5 a;
    public final lh5 b;
    
    public vx5(final vs5 a, final lh5 b) {
        zzd.f((Object)b, "community");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vx5)) {
            return false;
        }
        final vx5 vx5 = (vx5)o;
        return this.a == vx5.a && zzd.a((Object)this.b, (Object)vx5.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final vs5 a = this.a;
        final lh5 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityUpdateRoleResponse(updatedRole=");
        sb.append(a);
        sb.append(", community=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
