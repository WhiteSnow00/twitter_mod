import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffa implements ThreadFactory
{
    public final String D0;
    public final AtomicLong E0;
    
    public ffa(final String d0, final AtomicLong e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = Executors.defaultThreadFactory().newThread((Runnable)new bg1(runnable) {
            public final Runnable D0;
            
            public final void a() {
                this.D0.run();
            }
        });
        final StringBuilder sb = new StringBuilder();
        sb.append(this.D0);
        sb.append(this.E0.getAndIncrement());
        thread.setName(sb.toString());
        return thread;
    }
}
