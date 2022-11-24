import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tk8 extends ij6 implements ylp
{
    public tk8(final Executor executor) {
        super(executor, (BlockingQueue)new LinkedBlockingQueue());
    }
    
    public final void execute(final Runnable runnable) {
        synchronized (this) {
            super.execute(runnable);
        }
    }
}
