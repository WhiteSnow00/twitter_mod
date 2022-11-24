// 
// Decompiled by Procyon v0.6.0
// 

public final class hku
{
    public static final b Companion;
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    
    static {
        Companion = new b();
    }
    
    public hku(final hp6 hp6) {
        e0e.f((Object)hp6, "tweet");
        final int k0 = hp6.F0.K0;
        final int i0 = hp6.F0.I0;
        final int g0 = hp6.F0.G0;
        final int j0 = hp6.F0.J0;
        this.a = k0;
        this.b = i0;
        this.c = g0;
        this.d = j0;
    }
    
    public hku(final Integer a, final Integer b, final Integer c, final Integer d, final wg8 wg8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hku)) {
            return false;
        }
        final hku hku = (hku)o;
        return e0e.a((Object)this.a, (Object)hku.a) && e0e.a((Object)this.b, (Object)hku.b) && e0e.a((Object)this.c, (Object)hku.c) && e0e.a((Object)this.d, (Object)hku.d);
    }
    
    @Override
    public final int hashCode() {
        final Integer a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Integer b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Integer d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Integer a = this.a;
        final Integer b = this.b;
        final Integer c = this.c;
        final Integer d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetEngagementMetrics(replyCount=");
        sb.append(a);
        sb.append(", retweetCount=");
        sb.append(b);
        sb.append(", favoriteCount=");
        sb.append(c);
        sb.append(", quoteCount=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
        public final Integer a(int n) {
            Integer value = n;
            if (value.intValue() != -1) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                value = null;
            }
            return value;
        }
    }
}
