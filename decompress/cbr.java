import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbr
{
    public final List<eap> a;
    public final List<y9r> b;
    public final String c;
    
    public cbr(final List<eap> a, final List<y9r> b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cbr)) {
            return false;
        }
        final cbr cbr = (cbr)o;
        return zzd.a((Object)this.a, (Object)cbr.a) && zzd.a((Object)this.b, (Object)cbr.b) && zzd.a((Object)this.c, (Object)cbr.c);
    }
    
    @Override
    public final int hashCode() {
        final int m = hy8.m((List)this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return m + hashCode;
    }
    
    @Override
    public final String toString() {
        final List<eap> a = this.a;
        final List<y9r> b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("StationsFeedResponse(sections=");
        sb.append(a);
        sb.append(", stations=");
        sb.append(b);
        sb.append(", uuid=");
        return hi.I(sb, c, ")");
    }
}
