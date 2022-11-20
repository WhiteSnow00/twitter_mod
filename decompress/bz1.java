// 
// Decompiled by Procyon v0.6.0
// 

public final class bz1 extends hub implements qsb<Throwable, fzv>
{
    public bz1(final Object o) {
        super(1, o, (Class)m8a.class, "logError", "logError(Ljava/lang/Throwable;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        czd.f((Object)t, "p0");
        ((m8a)((m93)this).receiver).f(t);
        return fzv.a;
    }
}
