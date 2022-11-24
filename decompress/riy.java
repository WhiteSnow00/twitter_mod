import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class riy implements Callable
{
    public final int F0;
    public final Object G0;
    
    public riy(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() {
        switch (this.F0) {
            default: {
                return ((qyp)this.G0).a();
            }
            case 0: {
                return new rlz(((doy)this.G0).c);
            }
        }
    }
}
