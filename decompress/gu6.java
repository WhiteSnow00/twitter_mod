import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gu6 implements fu6
{
    public final String b;
    public final int c;
    public final List<Long> d;
    public final List<hfv> e;
    
    public gu6(final String b, final int c, final List<Long> d, final List<? extends hfv> e) {
        zzd.f((Object)b, "type");
        zzd.f((Object)d, "userIds");
        zzd.f((Object)e, "users");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (List<hfv>)e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gu6)) {
            return false;
        }
        final gu6 gu6 = (gu6)o;
        return zzd.a((Object)this.b, (Object)gu6.b) && this.c == gu6.c && zzd.a((Object)this.d, (Object)gu6.d) && zzd.a((Object)this.e, (Object)gu6.e);
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + hy8.m((List)this.d, (this.b.hashCode() * 31 + this.c) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final int c = this.c;
        final List<Long> d = this.d;
        final List<hfv> e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("ConversationSocialProofMutualFriends(type=");
        sb.append(b);
        sb.append(", total=");
        sb.append(c);
        sb.append(", userIds=");
        sb.append(d);
        sb.append(", users=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
}
