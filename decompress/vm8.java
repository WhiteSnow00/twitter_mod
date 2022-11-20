// 
// Decompiled by Procyon v0.6.0
// 

public final class vm8 implements wr6
{
    public final long a;
    public final String b;
    public final long c;
    
    public vm8(final long a, final String b, final long c) {
        czd.f((Object)b, "conversationId");
        this.a = a;
        this.b = b;
        this.c = c;
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
        if (!(o instanceof vm8)) {
            return false;
        }
        final vm8 vm8 = (vm8)o;
        return this.a == vm8.a && czd.a((Object)this.b, (Object)vm8.b) && this.c == vm8.c;
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
        return f + (int)(c >>> 32 ^ c);
    }
    
    public final long m() {
        return -1L;
    }
    
    @Override
    public final String toString() {
        return u5h.c(gw8.p("DeleteConversationEvent(id=", this.a, ", conversationId=", this.b), ", date=", this.c, ")");
    }
}
