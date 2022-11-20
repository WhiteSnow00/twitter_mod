// 
// Decompiled by Procyon v0.6.0
// 

public final class vkg implements wr6
{
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    
    public vkg(final long a, final String b, final long c, final long d) {
        czd.f((Object)b, "conversationId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (nza.r1((wr6)this)) {
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
        if (!(o instanceof vkg)) {
            return false;
        }
        final vkg vkg = (vkg)o;
        return this.a == vkg.a && czd.a((Object)this.b, (Object)vkg.b) && this.c == vkg.c && this.d == vkg.d;
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
        final int f = hmg.f(this.b, (int)(a ^ a >>> 32) * 31, 31);
        final long c = this.c;
        final int n = (int)(c ^ c >>> 32);
        final long d = this.d;
        return (f + n) * 31 + (int)(d >>> 32 ^ d);
    }
    
    public final long m() {
        return -1L;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final long c = this.c;
        final long d = this.d;
        final StringBuilder p = gw8.p("MarkConversationReadEvent(id=", a, ", conversationId=", b);
        e1.C(p, ", date=", c, ", lastReadEventId=");
        return hmg.i(p, d, ")");
    }
}
