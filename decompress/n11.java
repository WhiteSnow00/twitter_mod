import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n11
{
    public final List<m11> a;
    public final List<o11> b;
    public final String c;
    
    public n11(final List<m11> a, final List<o11> b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n11)) {
            return false;
        }
        final n11 n11 = (n11)o;
        return zzd.a((Object)this.a, (Object)n11.a) && zzd.a((Object)this.b, (Object)n11.b) && zzd.a((Object)this.c, (Object)n11.c);
    }
    
    @Override
    public final int hashCode() {
        final List<m11> a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int m = hy8.m((List)this.b, hashCode * 31, 31);
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return m + hashCode2;
    }
    
    @Override
    public final String toString() {
        final List<m11> a = this.a;
        final List<o11> b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioSpaceFeedResponse(filters=");
        sb.append(a);
        sb.append(", sections=");
        sb.append(b);
        sb.append(", uuid=");
        return hi.I(sb, c, ")");
    }
}
