// 
// Decompiled by Procyon v0.6.0
// 

public final class d73 implements ls6<t1j>
{
    public final long c;
    public final String d;
    public final long e;
    public final t1j f;
    public final int g;
    public final alp<t1j> h;
    
    public d73(final long c, final String d, final long e) {
        zzd.f((Object)d, "conversationId");
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = t1j.a;
        this.g = 22;
        this.h = t1j.b;
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
        if (!(o instanceof d73)) {
            return false;
        }
        final d73 d73 = (d73)o;
        return this.c == d73.c && zzd.a((Object)this.d, (Object)d73.d) && this.e == d73.e;
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
        return a + (int)(e >>> 32 ^ e);
    }
    
    @Override
    public final long t() {
        return ls6.b;
    }
    
    @Override
    public final String toString() {
        return hvl.c(w48.h("CSFeedbackDismissedEntry(id=", this.c, ", conversationId=", this.d), ", date=", this.e, ")");
    }
    
    @Override
    public final alp<t1j> v() {
        return (alp<t1j>)this.h;
    }
}
