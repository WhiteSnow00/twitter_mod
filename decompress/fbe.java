import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbe implements ls6<List<Long>>
{
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final List<Long> g;
    public final alp<List<Long>> h;
    public final List<Long> i;
    public final int j;
    
    public fbe(final long c, final String d, final long e, final long f, final List<Long> list) {
        zzd.f((Object)d, "conversationId");
        zzd.f((Object)list, "data");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = list;
        this.h = new xq4$a((alp)hx6.c);
        this.i = list;
        this.j = 17;
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
        if (!(o instanceof fbe)) {
            return false;
        }
        final fbe fbe = (fbe)o;
        return this.c == fbe.c && zzd.a((Object)this.d, (Object)fbe.d) && this.e == fbe.e && this.f == fbe.f && zzd.a((Object)this.g, (Object)fbe.g);
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
        return this.j;
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        final int a = l7k.a(this.d, (int)(c ^ c >>> 32) * 31, 31);
        final long e = this.e;
        final int n = (int)(e ^ e >>> 32);
        final long f = this.f;
        return this.g.hashCode() + ((a + n) * 31 + (int)(f >>> 32 ^ f)) * 31;
    }
    
    @Override
    public final long m() {
        return this.f;
    }
    
    @Override
    public final long t() {
        return ls6.b;
    }
    
    @Override
    public final String toString() {
        final long c = this.c;
        final String d = this.d;
        final long e = this.e;
        final long f = this.f;
        final List<Long> g = this.g;
        final StringBuilder h = w48.h("JoinConversationEntry(id=", c, ", conversationId=", d);
        c0.G(h, ", date=", e, ", senderId=");
        h.append(f);
        h.append(", data=");
        h.append(g);
        h.append(")");
        return h.toString();
    }
    
    @Override
    public final alp<List<Long>> v() {
        return (alp<List<Long>>)this.h;
    }
}
