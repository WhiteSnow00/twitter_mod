import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uh8 implements mga
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public uh8(final int n) {
        this.a = Executors.newFixedThreadPool(2, (ThreadFactory)new g0l("FrescoIoBoundExecutor"));
        this.b = Executors.newFixedThreadPool(n, (ThreadFactory)new g0l("FrescoDecodeExecutor"));
        this.c = Executors.newFixedThreadPool(n, (ThreadFactory)new g0l("FrescoBackgroundExecutor"));
        this.e = Executors.newScheduledThreadPool(n, (ThreadFactory)new g0l("FrescoBackgroundExecutor"));
        this.d = Executors.newFixedThreadPool(1, (ThreadFactory)new g0l("FrescoLightWeightBackgroundExecutor"));
    }
    
    public final Executor a() {
        return (Executor)this.d;
    }
    
    public final Executor b() {
        return (Executor)this.a;
    }
    
    public final ScheduledExecutorService c() {
        return (ScheduledExecutorService)this.e;
    }
    
    public final Executor d() {
        return (Executor)this.b;
    }
    
    public final Executor e() {
        return (Executor)this.c;
    }
    
    public final Executor f() {
        return (Executor)this.a;
    }
    
    public final Executor g() {
        return (Executor)this.a;
    }
}
