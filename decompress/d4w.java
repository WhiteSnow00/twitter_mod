// 
// Decompiled by Procyon v0.6.0
// 

public final class d4w implements ct6
{
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    
    public d4w(final long a, final String b, final long c, final boolean d) {
        e0e.f((Object)b, "conversationId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (qds.w((ct6)this)) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final long a() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d4w)) {
            return false;
        }
        final d4w d4w = (d4w)o;
        return this.a == d4w.a && e0e.a((Object)this.b, (Object)d4w.b) && this.c == d4w.c && this.d == d4w.d;
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
        final StringBuilder b2 = snp.b("UpdateNotificationMuteStateEvent(id=", a, ", conversationId=", b);
        po.E(b2, ", date=", c, ", isMuted=");
        return xj0.B(b2, d, ")");
    }
}
