// 
// Decompiled by Procyon v0.6.0
// 

public final class hx5
{
    public static final b Companion;
    public static final hx5.hx5$a d;
    public final ix5 a;
    public final xwm<xes> b;
    public final xwm<xes> c;
    
    static {
        Companion = new b();
        d = new hx5.hx5$a();
    }
    
    public hx5(final ix5 a, final xwm<xes> b, final xwm<xes> c) {
        zzd.f((Object)a, "reason");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hx5)) {
            return false;
        }
        final hx5 hx5 = (hx5)o;
        return this.a == hx5.a && zzd.a((Object)this.b, (Object)hx5.b) && zzd.a((Object)this.c, (Object)hx5.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final xwm<xes> b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final xwm<xes> c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final ix5 a = this.a;
        final xwm<xes> b = this.b;
        final xwm<xes> c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityUnavailable(reason=");
        sb.append(a);
        sb.append(", title=");
        sb.append(b);
        sb.append(", subTitle=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
    }
}
