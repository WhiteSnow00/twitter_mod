import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p3u implements ls6<String>
{
    public static final p3u.p3u$a Companion;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final boolean h;
    public final alp<String> i;
    
    static {
        Companion = new p3u.p3u$a();
    }
    
    public p3u(final long c, final String d, final long e, final String f) {
        zzd.f((Object)d, "conversationId");
        zzd.f((Object)f, "data");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = 23;
        this.h = zzd.a((Object)f, (Object)"follow");
        Objects.requireNonNull(r3u.b);
        this.i = r3u.c;
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
        if (!(o instanceof p3u)) {
            return false;
        }
        final p3u p3u = (p3u)o;
        return this.c == p3u.c && zzd.a((Object)this.d, (Object)p3u.d) && this.e == p3u.e && zzd.a((Object)this.f, (Object)p3u.f);
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
        final String f = this.f;
        final StringBuilder h = w48.h("TrustConversationEntry(id=", c, ", conversationId=", d);
        c0.G(h, ", date=", e, ", data=");
        return hi.I(h, f, ")");
    }
    
    @Override
    public final alp<String> v() {
        return (alp<String>)this.i;
    }
}
