// 
// Decompiled by Procyon v0.6.0
// 

public final class g8o extends ste implements qsb<Long, lcq<? extends Long>>
{
    public final a8o D0;
    public final String E0;
    
    public g8o(final a8o d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Long n = (Long)o;
        czd.f((Object)n, "sentTweetId");
        return this.D0.f.b(this.E0, (long)n).w((Object)n);
    }
}
