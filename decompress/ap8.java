// 
// Decompiled by Procyon v0.6.0
// 

public final class ap8 implements ct6
{
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    
    public ap8(final long a, final String b, final long c, final String d, final long e, final long f) {
        e0e.f((Object)b, "conversationId");
        e0e.f((Object)d, "key");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final long a() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ap8)) {
            return false;
        }
        final ap8 ap8 = (ap8)o;
        return this.a == ap8.a && e0e.a((Object)this.b, (Object)ap8.b) && this.c == ap8.c && e0e.a((Object)this.d, (Object)ap8.d) && this.e == ap8.e && this.f == ap8.f;
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
        final int d2 = brg.d(this.d, (d + (int)(c ^ c >>> 32)) * 31, 31);
        final long e = this.e;
        final int n = (int)(e ^ e >>> 32);
        final long f = this.f;
        return (d2 + n) * 31 + (int)(f >>> 32 ^ f);
    }
    
    public final long m() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final long c = this.c;
        final String d = this.d;
        final long e = this.e;
        final long f = this.f;
        final StringBuilder b2 = snp.b("DeleteReactionEvent(id=", a, ", conversationId=", b);
        po.E(b2, ", date=", c, ", key=");
        b2.append(d);
        b2.append(", targetMessageId=");
        b2.append(e);
        return go9.q(b2, ", senderId=", f, ")");
    }
}
