import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o6i implements ThreadFactory
{
    public final String D0;
    public final ThreadFactory E0;
    
    public o6i(final String d0) {
        this.E0 = Executors.defaultThreadFactory();
        this.D0 = d0;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.E0.newThread((Runnable)new pez(runnable));
        thread.setName(this.D0);
        return thread;
    }
}
