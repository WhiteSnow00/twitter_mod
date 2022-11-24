// 
// Decompiled by Procyon v0.6.0
// 

public final class d3w implements ct6
{
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final kah e;
    
    public d3w(final long a, final String b, final long c, final boolean d, final kah e) {
        e0e.f((Object)b, "conversationId");
        e0e.f((Object)e, "updates");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final long a() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d3w)) {
            return false;
        }
        final d3w d3w = (d3w)o;
        return this.a == d3w.a && e0e.a((Object)this.b, (Object)d3w.b) && this.c == d3w.c && this.d == d3w.d && e0e.a((Object)this.e, (Object)d3w.e);
    }
    
    public final String getConversationId() {
        return this.b;
    }
    
    public final long getId() {
        return this.a;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int d = brg.d(this.b, (int)(a ^ a >>> 32) * 31, 31);
        final long c = this.c;
        final int n = (int)(c >>> 32 ^ c);
        int d2;
        if ((d2 = (this.d ? 1 : 0)) != 0) {
            d2 = 1;
        }
        return this.e.hashCode() + ((d + n) * 31 + d2) * 31;
    }
    
    public final long m() {
        return -1L;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final long c = this.c;
        final boolean d = this.d;
        final kah e = this.e;
        final StringBuilder b2 = snp.b("UpdateConversationMetadataEvent(id=", a, ", conversationId=", b);
        po.E(b2, ", date=", c, ", affectsSort=");
        b2.append(d);
        b2.append(", updates=");
        b2.append(e);
        b2.append(")");
        return b2.toString();
    }
}
