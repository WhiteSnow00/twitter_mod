// 
// Decompiled by Procyon v0.6.0
// 

public final class ziu
{
    public static final b Companion;
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    
    static {
        Companion = new b();
    }
    
    public ziu(final Integer a, final Integer b, final Integer c, final Integer d, final hg8 hg8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public ziu(final vo6 vo6) {
        zzd.f((Object)vo6, "tweet");
        final int h0 = vo6.C0.H0;
        final int f0 = vo6.C0.F0;
        final int d0 = vo6.C0.D0;
        final int g0 = vo6.C0.G0;
        this.a = h0;
        this.b = f0;
        this.c = d0;
        this.d = g0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ziu)) {
            return false;
        }
        final ziu ziu = (ziu)o;
        return zzd.a((Object)this.a, (Object)ziu.a) && zzd.a((Object)this.b, (Object)ziu.b) && zzd.a((Object)this.c, (Object)ziu.c) && zzd.a((Object)this.d, (Object)ziu.d);
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
