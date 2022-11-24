// 
// Decompiled by Procyon v0.6.0
// 

public final class dk4 extends jvb implements stb<Throwable, vzv>
{
    public static final dk4 F0;
    
    static {
        F0 = new dk4();
    }
    
    public dk4() {
        super(1, (Class)r9a.class, "log", "log(Ljava/lang/Throwable;)V", 0);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        e0e.f((Object)t, "p0");
        r9a.d(t);
        return vzv.a;
    }
}
