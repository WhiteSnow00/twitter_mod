import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h100 implements Executor
{
    public static final h100 D0;
    
    static {
        D0 = new h100();
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
}
