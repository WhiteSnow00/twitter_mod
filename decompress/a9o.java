// 
// Decompiled by Procyon v0.6.0
// 

public final class a9o extends pue implements stb<Long, idq<? extends Long>>
{
    public final u8o F0;
    public final String G0;
    
    public a9o(final u8o f0, final String g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Long n = (Long)o;
        e0e.f((Object)n, "sentTweetId");
        return this.F0.f.b(this.G0, (long)n).w((Object)n);
    }
}
