import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class by5
{
    public final vs5 a;
    public final ey5 b;
    public final hfv c;
    
    public by5(final vs5 a, final ey5 b, final hfv c) {
        zzd.f((Object)b, "actions");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static by5 a(final by5 by5, final vs5 vs5) {
        final ey5 b = by5.b;
        final hfv c = by5.c;
        Objects.requireNonNull(by5);
        zzd.f((Object)vs5, "role");
        zzd.f((Object)b, "actions");
        return new by5(vs5, b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof by5)) {
            return false;
        }
        final by5 by5 = (by5)o;
        return this.a == by5.a && zzd.a((Object)this.b, (Object)by5.b) && zzd.a((Object)this.c, (Object)by5.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final hfv c = this.c;
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
        final vs5 a = this.a;
        final ey5 b = this.b;
        final hfv c = this.c;
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
