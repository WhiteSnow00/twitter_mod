// 
// Decompiled by Procyon v0.6.0
// 

public final class jz1 extends jvb implements stb<Throwable, vzv>
{
    public jz1(final Object o) {
        super(1, o, (Class)r9a.class, "logError", "logError(Ljava/lang/Throwable;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        e0e.f((Object)t, "p0");
        ((r9a)((ea3)this).receiver).f(t);
        return vzv.a;
    }
}
