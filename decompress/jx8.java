import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public enum jx8 implements Executor
{
    C0;
    
    @Override
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
    
    @Override
    public final String toString() {
        return "DirectExecutor";
    }
}
