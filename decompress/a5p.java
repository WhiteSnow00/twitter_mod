import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5p extends ste implements nsb<Object>
{
    public final Method D0;
    
    public a5p(final Method d0) {
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        return this.D0.invoke(null, new Object[0]);
    }
}
