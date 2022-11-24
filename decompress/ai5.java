// 
// Decompiled by Procyon v0.6.0
// 

public final class ai5
{
    public static final b Companion;
    public static final ai5.ai5$a d;
    public final mo5 a;
    public final pp5 b;
    public final rw5 c;
    
    static {
        Companion = new b();
        d = new ai5.ai5$a();
    }
    
    public ai5(final mo5 a, final pp5 b, final rw5 c) {
        e0e.f((Object)a, "joinActionResult");
        e0e.f((Object)b, "leaveActionResult");
        e0e.f((Object)c, "spotlightSetUpActionResult");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ai5)) {
            return false;
        }
        final ai5 ai5 = (ai5)o;
        return e0e.a((Object)this.a, (Object)ai5.a) && e0e.a((Object)this.b, (Object)ai5.b) && e0e.a((Object)this.c, (Object)ai5.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final mo5 a = this.a;
        final pp5 b = this.b;
        final rw5 c = this.c;
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
