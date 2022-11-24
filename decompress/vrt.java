// 
// Decompiled by Procyon v0.6.0
// 

public final class vrt implements laq
{
    public final dda a;
    public final qda b;
    public final b1p c;
    
    public vrt(final dda a, final qda b, final b1p c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final fg4 a(final long n) {
        return amt.Companion.a(n, this.a, this.b, this.c, "share_via_dm");
    }
    
    public final fg4 b(final long n) {
        return amt.Companion.a(n, this.a, this.b, this.c, "share_via");
    }
    
    public final fg4 c(final long n) {
        return amt.Companion.a(n, this.a, this.b, this.c, "share_via_tweet");
    }
}
