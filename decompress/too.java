import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class too implements Executor
{
    public final Executor C0;
    
    public too(final Executor c0) {
        this.C0 = c0;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.C0.execute(new a(runnable));
    }
    
    public static final class a implements Runnable
    {
        public final Runnable C0;
        
        public a(final Runnable c0) {
            this.C0 = c0;
        }
        
        @Override
        public final void run() {
            try {
                this.C0.run();
            }
            catch (final Exception ex) {
                jag.c("Executor", "Background execution failure.", ex);
            }
        }
    }
}
