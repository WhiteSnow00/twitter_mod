import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p11
{
    public final List<o11> a;
    public final List<q11> b;
    public final String c;
    
    public p11(final List<o11> a, final List<q11> b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p11)) {
            return false;
        }
        final p11 p = (p11)o;
        return e0e.a((Object)this.a, (Object)p.a) && e0e.a((Object)this.b, (Object)p.b) && e0e.a((Object)this.c, (Object)p.c);
    }
    
    @Override
    public final int hashCode() {
        final List<o11> a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int o = go9.o((List)this.b, hashCode * 31, 31);
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return o + hashCode2;
    }
    
    @Override
    public final String toString() {
        final List<o11> a = this.a;
        final List<q11> b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioSpaceFeedResponse(filters=");
        sb.append(a);
        sb.append(", sections=");
        sb.append(b);
        sb.append(", uuid=");
        return m51.y(sb, c, ")");
    }
}
