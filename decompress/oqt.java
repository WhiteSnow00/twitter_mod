// 
// Decompiled by Procyon v0.6.0
// 

public final class oqt implements x8q
{
    public final nca a;
    public final ada b;
    public final qzo c;
    
    public oqt(final nca a, final ada b, final qzo c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final zf4 a(final long n) {
        return rkt.Companion.a(n, this.a, this.b, this.c, "share_via_dm");
    }
    
    public final zf4 b(final long n) {
        return rkt.Companion.a(n, this.a, this.b, this.c, "share_via");
    }
    
    public final zf4 c(final long n) {
        return rkt.Companion.a(n, this.a, this.b, this.c, "share_via_tweet");
    }
}
