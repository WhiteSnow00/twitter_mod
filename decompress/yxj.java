import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yxj implements ls6<List<zwj>>
{
    public final long c;
    public final String d;
    public final long e;
    public final long f;
    public final List<zwj> g;
    public final List<zwj> h;
    public final alp<List<zwj>> i;
    public final int j;
    
    public yxj(final long c, final String d, final long e, final long f, final List<? extends zwj> list) {
        zzd.f((Object)d, "conversationId");
        zzd.f((Object)list, "data");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = (List<zwj>)list;
        this.h = (List<zwj>)list;
        Objects.requireNonNull(ayj.b);
        this.i = ayj.c;
        this.j = 11;
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
        if (!(o instanceof yxj)) {
            return false;
        }
        final yxj yxj = (yxj)o;
        return this.c == yxj.c && zzd.a((Object)this.d, (Object)yxj.d) && this.e == yxj.e && this.f == yxj.f && zzd.a((Object)this.g, (Object)yxj.g);
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
        final List<zwj> g = this.g;
        final StringBuilder h = w48.h("ParticipantsLeaveEntry(id=", c, ", conversationId=", d);
        c0.G(h, ", date=", e, ", senderId=");
        h.append(f);
        h.append(", data=");
        h.append(g);
        h.append(")");
        return h.toString();
    }
    
    @Override
    public final alp<List<zwj>> v() {
        return (alp<List<zwj>>)this.i;
    }
}
