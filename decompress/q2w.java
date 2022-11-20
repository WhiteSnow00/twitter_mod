// 
// Decompiled by Procyon v0.6.0
// 

public final class q2w implements qr6<String>
{
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;
    public final rlp<String> i;
    
    public q2w(final long c, final String d, final long e, final long f, final String g) {
        czd.f((Object)d, "conversationId");
        czd.f((Object)g, "data");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = 8;
        this.i = lw6.f;
    }
    
    @Override
    public final boolean B(final long n) {
        return sk0.d((qr6)this, n);
    }
    
    @Override
    public final boolean F() {
        return sk0.c((qr6)this);
    }
    
    @Override
    public final long a() {
        return this.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q2w)) {
            return false;
        }
        final q2w q2w = (q2w)o;
        return this.c == q2w.c && czd.a((Object)this.d, (Object)q2w.d) && this.e == q2w.e && this.f == q2w.f && czd.a((Object)this.g, (Object)q2w.g);
    }
    
    @Override
    public final String getConversationId() {
        return this.d;
    }
    
    @Override
    public final Object getData() {
        return this.g;
    }
    
    @Override
    public final long getId() {
        return this.c;
    }
    
    @Override
    public final int getType() {
        return this.h;
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        final int f = hmg.f(this.d, (int)(c ^ c >>> 32) * 31, 31);
        final long e = this.e;
        final int n = (int)(e ^ e >>> 32);
        final long f2 = this.f;
        return this.g.hashCode() + ((f + n) * 31 + (int)(f2 >>> 32 ^ f2)) * 31;
    }
    
    @Override
    public final boolean isInline() {
        return sk0.b((qr6)this);
    }
    
    @Override
    public final long m() {
        return this.f;
    }
    
    @Override
    public final byte[] o() {
        return sk0.a((qr6)this);
    }
    
    @Override
    public final long t() {
        return qr6.b;
    }
    
    @Override
    public final String toString() {
        final long c = this.c;
        final String d = this.d;
        final long e = this.e;
        final long f = this.f;
        final String g = this.g;
        final StringBuilder p = gw8.p("UpdateConversationNameEntry(id=", c, ", conversationId=", d);
        e1.C(p, ", date=", e, ", senderId=");
        e1.B(p, f, ", data=", g);
        p.append(")");
        return p.toString();
    }
    
    @Override
    public final rlp<String> v() {
        return (rlp<String>)this.i;
    }
}
