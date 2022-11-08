import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h07 implements Callable<Void>
{
    public final /* synthetic */ Runnable C0;
    
    public h07(final Runnable c0) {
        this.C0 = c0;
    }
    
    @Override
    public final Object call() throws Exception {
        this.C0.run();
        return null;
    }
}
