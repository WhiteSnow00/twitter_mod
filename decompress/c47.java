// 
// Decompiled by Procyon v0.6.0
// 

public final class c47 implements ct6
{
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    
    public c47(final long a, final String b, final long c, final boolean d) {
        e0e.f((Object)b, "conversationId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final long a() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c47)) {
            return false;
        }
        final c47 c47 = (c47)o;
        return this.a == c47.a && e0e.a((Object)this.b, (Object)c47.b) && this.c == c47.c && this.d == c47.d;
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
        return (d + n) * 31 + d2;
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
        final StringBuilder b2 = snp.b("CreateConversationEvent(id=", a, ", conversationId=", b);
        po.E(b2, ", date=", c, ", affectsSort=");
        return xj0.B(b2, d, ")");
    }
}
