// 
// Decompiled by Procyon v0.6.0
// 

public final class fx5
{
    public final es5 a;
    public final tg5 b;
    
    public fx5(final es5 a, final tg5 b) {
        czd.f((Object)b, "community");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fx5)) {
            return false;
        }
        final fx5 fx5 = (fx5)o;
        return this.a == fx5.a && czd.a((Object)this.b, (Object)fx5.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final es5 a = this.a;
        final tg5 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityUpdateRoleResponse(updatedRole=");
        sb.append(a);
        sb.append(", community=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
