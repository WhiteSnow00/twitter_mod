import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flg implements rs6
{
    public final long a;
    public final String b;
    public final long c;
    public final List<Long> d;
    
    public flg(final long a, final String b, final long c, final List<Long> d) {
        zzd.f((Object)b, "conversationId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (zi8.I((rs6)this)) {
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
        if (!(o instanceof flg)) {
            return false;
        }
        final flg flg = (flg)o;
        return this.a == flg.a && zzd.a((Object)this.b, (Object)flg.b) && this.c == flg.c && zzd.a((Object)this.d, (Object)flg.d);
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
        return this.d.hashCode() + (a2 + (int)(c >>> 32 ^ c)) * 31;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final long c = this.c;
        final List<Long> d = this.d;
        final StringBuilder h = w48.h("MarkMessagesAsAbuseEvent(id=", a, ", conversationId=", b);
        c0.G(h, ", date=", c, ", messageCreateEventIds=");
        return gp.A(h, (List)d, ")");
    }
}
