import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wjz implements Callable
{
    public final String F0;
    
    public wjz(final String f0) {
        this.F0 = f0;
    }
    
    @Override
    public final Object call() {
        return raf.c.a(this.F0);
    }
}
