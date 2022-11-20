import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lx5
{
    public final es5 a;
    public final ox5 b;
    public final cgv c;
    
    public lx5(final es5 a, final ox5 b, final cgv c) {
        czd.f((Object)b, "actions");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static lx5 a(final lx5 lx5, final es5 es5) {
        final ox5 b = lx5.b;
        final cgv c = lx5.c;
        Objects.requireNonNull(lx5);
        czd.f((Object)es5, "role");
        czd.f((Object)b, "actions");
        return new lx5(es5, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lx5)) {
            return false;
        }
        final lx5 lx5 = (lx5)o;
        return this.a == lx5.a && czd.a((Object)this.b, (Object)lx5.b) && czd.a((Object)this.c, (Object)lx5.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final cgv c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final es5 a = this.a;
        final ox5 b = this.b;
        final cgv c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityUser(role=");
        sb.append(a);
        sb.append(", actions=");
        sb.append(b);
        sb.append(", user=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
