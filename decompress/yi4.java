// 
// Decompiled by Procyon v0.6.0
// 

public final class yi4 extends hub implements qsb<Throwable, fzv>
{
    public static final yi4 D0;
    
    static {
        D0 = new yi4();
    }
    
    public yi4() {
        super(1, (Class)m8a.class, "log", "log(Ljava/lang/Throwable;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        czd.f((Object)t, "p0");
        m8a.d(t);
        return fzv.a;
    }
}
