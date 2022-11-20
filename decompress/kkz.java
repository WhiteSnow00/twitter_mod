import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kkz implements Executor
{
    @Override
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
}
