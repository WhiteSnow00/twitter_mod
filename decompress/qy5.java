import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qy5
{
    public final kt5 a;
    public final ty5 b;
    public final qgv c;
    
    public qy5(final kt5 a, final ty5 b, final qgv c) {
        e0e.f((Object)b, "actions");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static qy5 a(final qy5 qy5, final kt5 kt5) {
        final ty5 b = qy5.b;
        final qgv c = qy5.c;
        Objects.requireNonNull(qy5);
        e0e.f((Object)kt5, "role");
        e0e.f((Object)b, "actions");
        return new qy5(kt5, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qy5)) {
            return false;
        }
        final qy5 qy5 = (qy5)o;
        return this.a == qy5.a && e0e.a((Object)this.b, (Object)qy5.b) && e0e.a((Object)this.c, (Object)qy5.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final qgv c = this.c;
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
        final kt5 a = this.a;
        final ty5 b = this.b;
        final qgv c = this.c;
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
