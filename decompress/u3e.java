// 
// Decompiled by Procyon v0.6.0
// 

public final class u3e implements t3e
{
    public final s3e a;
    public final bxo b;
    
    public u3e(final s3e a, final bxo b) {
        e0e.f((Object)a, "isSubscribedDataSource");
        e0e.f((Object)b, "ioScheduler");
        this.a = a;
        this.b = b;
    }
    
    public final bbq<Boolean> a(final String s) {
        return (bbq<Boolean>)((tnm<String, Object, osc>)this.a).S(s).I(this.b).w((rtb)new d6i((stb)u3e$a.F0, 19));
    }
}
