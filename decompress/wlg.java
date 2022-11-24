import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wlg implements ct6
{
    public final long a;
    public final String b;
    public final long c;
    public final List<Long> d;
    
    public wlg(final long a, final String b, final long c, final List<Long> d) {
        e0e.f((Object)b, "conversationId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (qds.w((ct6)this)) {
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
        if (!(o instanceof wlg)) {
            return false;
        }
        final wlg wlg = (wlg)o;
        return this.a == wlg.a && e0e.a((Object)this.b, (Object)wlg.b) && this.c == wlg.c && e0e.a((Object)this.d, (Object)wlg.d);
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
        final int d = brg.d(this.b, (int)(a ^ a >>> 32) * 31, 31);
        final long c = this.c;
        return this.d.hashCode() + (d + (int)(c >>> 32 ^ c)) * 31;
    }
    
    public final long m() {
        return -1L;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final long c = this.c;
        final List<Long> d = this.d;
        final StringBuilder b2 = snp.b("MarkMessagesAsAbuseEvent(id=", a, ", conversationId=", b);
        po.E(b2, ", date=", c, ", messageCreateEventIds=");
        return ad.A(b2, d, ")");
    }
}
