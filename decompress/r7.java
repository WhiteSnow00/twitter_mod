// 
// Decompiled by Procyon v0.6.0
// 

public final class r7 extends hub implements qsb<Throwable, fzv>
{
    public r7(final Object o) {
        super(1, o, (Class)u7.class, "reportSmsLaunchFailure", "reportSmsLaunchFailure(Ljava/lang/Throwable;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        czd.f((Object)t, "p0");
        ((u7)((m93)this).receiver).l(t);
        return fzv.a;
    }
}
