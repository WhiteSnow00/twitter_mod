// 
// Decompiled by Procyon v0.6.0
// 

public final class a3w implements rs6
{
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    
    public a3w(final long a, final String b, final long c, final boolean d) {
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
        if (!(o instanceof a3w)) {
            return false;
        }
        final a3w a3w = (a3w)o;
        return this.a == a3w.a && zzd.a((Object)this.b, (Object)a3w.b) && this.c == a3w.c && this.d == a3w.d;
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
        return (a2 + n) * 31 + d;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final long c = this.c;
        final boolean d = this.d;
        final StringBuilder h = w48.h("UpdateNotificationMuteStateEvent(id=", a, ", conversationId=", b);
        c0.G(h, ", date=", c, ", isMuted=");
        return bd.y(h, d, ")");
    }
}
