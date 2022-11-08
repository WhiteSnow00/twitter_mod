import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v2j implements ThreadFactory
{
    public final String C0;
    public final AtomicInteger D0;
    public final ThreadFactory E0;
    
    public v2j(final String c0) {
        this.D0 = new AtomicInteger();
        this.E0 = Executors.defaultThreadFactory();
        this.C0 = c0;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = this.E0.newThread((Runnable)new udz(runnable));
        final String c0 = this.C0;
        final int andIncrement = this.D0.getAndIncrement();
        final StringBuilder sb = new StringBuilder(c0.length() + 13);
        sb.append(c0);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        thread.setName(sb.toString());
        return thread;
    }
}
