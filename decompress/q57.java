// 
// Decompiled by Procyon v0.6.0
// 

public final class q57 implements ct6
{
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final long f;
    public final String g;
    public final String h;
    
    public q57(final long a, final String b, final long c, final long d, final boolean e, final long f, final String g, final String h) {
        e0e.f((Object)b, "conversationId");
        e0e.f((Object)g, "key");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final long a() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q57)) {
            return false;
        }
        final q57 q57 = (q57)o;
        return this.a == q57.a && e0e.a((Object)this.b, (Object)q57.b) && this.c == q57.c && this.d == q57.d && this.e == q57.e && this.f == q57.f && e0e.a((Object)this.g, (Object)q57.g) && e0e.a((Object)this.h, (Object)q57.h);
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
        final int n = (int)(c ^ c >>> 32);
        final long d2 = this.d;
        final int n2 = (int)(d2 ^ d2 >>> 32);
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final long f = this.f;
        final int d3 = brg.d(this.g, ((((d + n) * 31 + n2) * 31 + e) * 31 + (int)(f >>> 32 ^ f)) * 31, 31);
        final String h = this.h;
        int hashCode;
        if (h == null) {
            hashCode = 0;
        }
        else {
            hashCode = h.hashCode();
        }
        return d3 + hashCode;
    }
    
    public final long m() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final long c = this.c;
        final long d = this.d;
        final boolean e = this.e;
        final long f = this.f;
        final String g = this.g;
        final String h = this.h;
        final StringBuilder b2 = snp.b("CreateReactionEvent(id=", a, ", conversationId=", b);
        po.E(b2, ", date=", c, ", senderId=");
        to0.E(b2, d, ", affectsSort=", e);
        po.E(b2, ", messageId=", f, ", key=");
        return m58.v(b2, g, ", requestId=", h, ")");
    }
}
