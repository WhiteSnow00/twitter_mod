import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbe implements ct6
{
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final List<Long> f;
    
    public nbe(final long a, final String b, final long c, final long d, final boolean e, final List<Long> f) {
        e0e.f((Object)b, "conversationId");
        e0e.f((Object)f, "participantIds");
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
        if (!(o instanceof nbe)) {
            return false;
        }
        final nbe nbe = (nbe)o;
        return this.a == nbe.a && e0e.a((Object)this.b, (Object)nbe.b) && this.c == nbe.c && this.d == nbe.d && this.e == nbe.e && e0e.a((Object)this.f, (Object)nbe.f);
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
        final int n2 = (int)(d2 >>> 32 ^ d2);
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        return this.f.hashCode() + (((d + n) * 31 + n2) * 31 + e) * 31;
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
        final List<Long> f = this.f;
        final StringBuilder b2 = snp.b("JoinConversationEvent(id=", a, ", conversationId=", b);
        po.E(b2, ", date=", c, ", senderId=");
        to0.E(b2, d, ", affectsSort=", e);
        b2.append(", participantIds=");
        b2.append(f);
        b2.append(")");
        return b2.toString();
    }
}
