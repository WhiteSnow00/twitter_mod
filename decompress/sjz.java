import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sjz implements Callable
{
    public final int F0;
    public final Object G0;
    
    public sjz(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() {
        switch (this.F0) {
            default: {
                return new tzz(((f8z)this.G0).P0);
            }
            case 1: {
                return raf.c.a((String)this.G0);
            }
            case 0: {
                return ((qyp)this.G0).a();
            }
        }
    }
}
