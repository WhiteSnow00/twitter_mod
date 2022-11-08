// 
// Decompiled by Procyon v0.6.0
// 

public final class nh5
{
    public static final b Companion;
    public static final nh5.nh5$a d;
    public final yn5 a;
    public final bp5 b;
    public final cw5 c;
    
    static {
        Companion = new b();
        d = new nh5.nh5$a();
    }
    
    public nh5(final yn5 a, final bp5 b, final cw5 c) {
        zzd.f((Object)a, "joinActionResult");
        zzd.f((Object)b, "leaveActionResult");
        zzd.f((Object)c, "spotlightSetUpActionResult");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nh5)) {
            return false;
        }
        final nh5 nh5 = (nh5)o;
        return zzd.a((Object)this.a, (Object)nh5.a) && zzd.a((Object)this.b, (Object)nh5.b) && zzd.a((Object)this.c, (Object)nh5.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final yn5 a = this.a;
        final bp5 b = this.b;
        final cw5 c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityActions(joinActionResult=");
        sb.append(a);
        sb.append(", leaveActionResult=");
        sb.append(b);
        sb.append(", spotlightSetUpActionResult=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
    }
}
