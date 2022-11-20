// 
// Decompiled by Procyon v0.6.0
// 

public final class ds5
{
    public static final b Companion;
    public static final ds5.ds5$a c;
    public final String a;
    public final bs5 b;
    
    static {
        Companion = new b();
        c = new ds5.ds5$a();
    }
    
    public ds5(final String a, final bs5 b) {
        czd.f((Object)a, "restId");
        czd.f((Object)b, "result");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ds5)) {
            return false;
        }
        final ds5 ds5 = (ds5)o;
        return czd.a((Object)this.a, (Object)ds5.a) && czd.a((Object)this.b, (Object)ds5.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final bs5 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityResults(restId=");
        sb.append(a);
        sb.append(", result=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
        public final ds5 a(final tg5 tg5) {
            czd.f((Object)tg5, "community");
            return new ds5(tg5.g, (bs5)new bs5$a(tg5));
        }
    }
}
