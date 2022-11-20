// 
// Decompiled by Procyon v0.6.0
// 

public final class p7 extends hub implements qsb<Throwable, fzv>
{
    public p7(final Object o) {
        super(1, o, (Class)u7.class, "reportEmailLaunchFailure", "reportEmailLaunchFailure(Ljava/lang/Throwable;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        czd.f((Object)t, "p0");
        ((u7)((m93)this).receiver).c(t);
        return fzv.a;
    }
}
