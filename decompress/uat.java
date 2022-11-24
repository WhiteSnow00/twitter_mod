// 
// Decompiled by Procyon v0.6.0
// 

public final class uat implements ws6<String>
{
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final nmp<String> h;
    
    public uat(final long c, final String d, final long e, final String f) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = 29;
        this.h = rx6.f;
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
        if (!(o instanceof uat)) {
            return false;
        }
        final uat uat = (uat)o;
        return this.c == uat.c && e0e.a((Object)this.d, (Object)uat.d) && this.e == uat.e && e0e.a((Object)this.f, (Object)uat.f);
    }
    
    public final String getConversationId() {
        return this.d;
    }
    
    public final Object getData() {
        return this.f;
    }
    
    public final long getId() {
        return this.c;
    }
    
    public final int getType() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        final int d = brg.d(this.d, (int)(c ^ c >>> 32) * 31, 31);
        final long e = this.e;
        return this.f.hashCode() + (d + (int)(e >>> 32 ^ e)) * 31;
    }
    
    public final boolean isInline() {
        return go0.b((ws6)this);
    }
    
    public final long m() {
        return -1L;
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
        final String f = this.f;
        final StringBuilder b = snp.b("TimestampEntry(id=", c, ", conversationId=", d);
        po.E(b, ", date=", e, ", data=");
        return m51.y(b, f, ")");
    }
    
    public final nmp<String> v() {
        return (nmp<String>)this.h;
    }
}
