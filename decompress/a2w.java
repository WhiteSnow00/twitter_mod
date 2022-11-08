// 
// Decompiled by Procyon v0.6.0
// 

public final class a2w implements rs6
{
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final r9h e;
    
    public a2w(final long a, final String b, final long c, final boolean d, final r9h e) {
        zzd.f((Object)b, "conversationId");
        zzd.f((Object)e, "updates");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final long a() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a2w)) {
            return false;
        }
        final a2w a2w = (a2w)o;
        return this.a == a2w.a && zzd.a((Object)this.b, (Object)a2w.b) && this.c == a2w.c && this.d == a2w.d && zzd.a((Object)this.e, (Object)a2w.e);
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
        final int a2 = l7k.a(this.b, (int)(a ^ a >>> 32) * 31, 31);
        final long c = this.c;
        final int n = (int)(c >>> 32 ^ c);
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        return this.e.hashCode() + ((a2 + n) * 31 + d) * 31;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final long c = this.c;
        final boolean d = this.d;
        final r9h e = this.e;
        final StringBuilder h = w48.h("UpdateConversationMetadataEvent(id=", a, ", conversationId=", b);
        c0.G(h, ", date=", c, ", affectsSort=");
        h.append(d);
        h.append(", updates=");
        h.append(e);
        h.append(")");
        return h.toString();
    }
}
