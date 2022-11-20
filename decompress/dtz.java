import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtz implements ThreadFactory
{
    public static final dtz D0;
    
    static {
        D0 = new dtz();
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
