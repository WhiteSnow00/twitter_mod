import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z1w extends dcu
{
    public final Method F0;
    public final int G0;
    
    public z1w(final Method f0, final int g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final <T> T n(final Class<T> clazz) throws Exception {
        dcu.a((Class)clazz);
        return (T)this.F0.invoke(null, clazz, this.G0);
    }
}
