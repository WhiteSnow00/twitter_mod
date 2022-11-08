import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyj implements ls6<List<? extends String>>
{
    public final long c;
    public final String d;
    public final long e;
    public final List<String> f;
    public final int g;
    public final alp<List<String>> h;
    
    public fyj(final long c, final String d, final long e, final List<String> f) {
        zzd.f((Object)d, "conversationId");
        zzd.f((Object)f, "data");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = 18;
        this.h = hyj.c;
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
        if (!(o instanceof fyj)) {
            return false;
        }
        final fyj fyj = (fyj)o;
        return this.c == fyj.c && zzd.a((Object)this.d, (Object)fyj.d) && this.e == fyj.e && zzd.a((Object)this.f, (Object)fyj.f);
    }
    
    @Override
    public final String getConversationId() {
        return this.d;
    }
    
    @Override
    public final Object getData() {
        return this.f;
    }
    
    @Override
    public final long getId() {
        return this.c;
    }
    
    @Override
    public final int getType() {
        return this.g;
    }
    
    @Override
    public final int hashCode() {
        final long c = this.c;
        final int a = l7k.a(this.d, (int)(c ^ c >>> 32) * 31, 31);
        final long e = this.e;
        return this.f.hashCode() + (a + (int)(e >>> 32 ^ e)) * 31;
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
        final List<String> f = this.f;
        final StringBuilder h = w48.h("ParticipantsNotAddedEntry(id=", c, ", conversationId=", d);
        c0.G(h, ", date=", e, ", data=");
        return gp.A(h, (List)f, ")");
    }
    
    @Override
    public final alp<List<String>> v() {
        return (alp<List<String>>)this.h;
    }
}
