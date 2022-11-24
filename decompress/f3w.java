// 
// Decompiled by Procyon v0.6.0
// 

public final class f3w implements ws6<String>
{
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;
    public final nmp<String> i;
    
    public f3w(final long c, final String d, final long e, final long f, final String g) {
        e0e.f((Object)d, "conversationId");
        e0e.f((Object)g, "data");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = 8;
        this.i = rx6.f;
    }
    
    public final boolean B(final long n) {
        return go0.d((ws6)this, n);
    }
    
    public final boolean F() {
        return go0.c((ws6)this);
    }
    
    public final long a() {
        return this.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f3w)) {
            return false;
        }
        final f3w f3w = (f3w)o;
        return this.c == f3w.c && e0e.a((Object)this.d, (Object)f3w.d) && this.e == f3w.e && this.f == f3w.f && e0e.a((Object)this.g, (Object)f3w.g);
    }
    
    public final String getConversationId() {
        return this.d;
    }
    
    public final Object getData() {
        return this.g;
    }
    
    public final long getId() {
        return this.c;
    }
    
    public final int getType() {
        return this.h;
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        final int d = brg.d(this.d, (int)(c ^ c >>> 32) * 31, 31);
        final long e = this.e;
        final int n = (int)(e ^ e >>> 32);
        final long f = this.f;
        return this.g.hashCode() + ((d + n) * 31 + (int)(f >>> 32 ^ f)) * 31;
    }
    
    public final boolean isInline() {
        return go0.b((ws6)this);
    }
    
    public final long m() {
        return this.f;
    }
    
    public final byte[] n() {
        return go0.a((ws6)this);
    }
    
    public final long t() {
        return ws6.b;
    }
    
    @Override
    public final String toString() {
        final long c = this.c;
        final String d = this.d;
        final long e = this.e;
        final long f = this.f;
        final String g = this.g;
        final StringBuilder b = snp.b("UpdateConversationNameEntry(id=", c, ", conversationId=", d);
        po.E(b, ", date=", e, ", senderId=");
        po.D(b, f, ", data=", g);
        b.append(")");
        return b.toString();
    }
    
    public final nmp<String> v() {
        return (nmp<String>)this.i;
    }
}
