import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.AbstractExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public class ci6 extends AbstractExecutorService
{
    public static final Class<?> K0;
    public final String D0;
    public final Executor E0;
    public volatile int F0;
    public final BlockingQueue<Runnable> G0;
    public final a H0;
    public final AtomicInteger I0;
    public final AtomicInteger J0;
    
    static {
        K0 = ci6.class;
    }
    
    public ci6(final String p0, final int p1, final Executor p2, final BlockingQueue<Runnable> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/util/concurrent/AbstractExecutorService.<init>:()V
        //     4: aload_0        
        //     5: ldc             "SerialExecutor"
        //     7: putfield        ci6.D0:Ljava/lang/String;
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        ci6.E0:Ljava/util/concurrent/Executor;
        //    15: aload_0        
        //    16: iconst_1       
        //    17: putfield        ci6.F0:I
        //    20: aload_0        
        //    21: aload_2        
        //    22: putfield        ci6.G0:Ljava/util/concurrent/BlockingQueue;
        //    25: aload_0        
        //    26: new             Lci6$a;
        //    29: dup            
        //    30: aload_0        
        //    31: invokespecial   ci6$a.<init>:(Lci6;)V
        //    34: putfield        ci6.H0:Lci6$a;
        //    37: aload_0        
        //    38: new             Ljava/util/concurrent/atomic/AtomicInteger;
        //    41: dup            
        //    42: iconst_0       
        //    43: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:(I)V
        //    46: putfield        ci6.I0:Ljava/util/concurrent/atomic/AtomicInteger;
        //    49: aload_0        
        //    50: new             Ljava/util/concurrent/atomic/AtomicInteger;
        //    53: dup            
        //    54: iconst_0       
        //    55: invokespecial   java/util/concurrent/atomic/AtomicInteger.<init>:(I)V
        //    58: putfield        ci6.J0:Ljava/util/concurrent/atomic/AtomicInteger;
        //    61: return         
        //    Signature:
        //  (Ljava/lang/String;ILjava/util/concurrent/Executor;Ljava/util/concurrent/BlockingQueue<Ljava/lang/Runnable;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 3
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void a() {
        for (int i = this.I0.get(); i < this.F0; i = this.I0.get()) {
            final int n = i + 1;
            if (this.I0.compareAndSet(i, n)) {
                xli.E0("%s: starting worker %d of %d", (Object)this.D0, (Object)n, (Object)this.F0);
                this.E0.execute(this.H0);
                break;
            }
        }
    }
    
    @Override
    public final boolean awaitTermination(final long n, final TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void execute(final Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (this.G0.offer(runnable)) {
            final int size = this.G0.size();
            final int value = this.J0.get();
            if (size > value && this.J0.compareAndSet(value, size)) {
                final int h0 = xli.H0;
            }
            this.a();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.D0);
        sb.append(" queue is full, size=");
        sb.append(this.G0.size());
        throw new RejectedExecutionException(sb.toString());
    }
    
    @Override
    public final boolean isShutdown() {
        return false;
    }
    
    @Override
    public final boolean isTerminated() {
        return false;
    }
    
    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
    
    public final class a implements Runnable
    {
        public final ci6 D0;
        
        public a(final ci6 d0) {
            this.D0 = d0;
        }
        
        @Override
        public final void run() {
            try {
                final Runnable runnable = this.D0.G0.poll();
                if (runnable != null) {
                    runnable.run();
                }
                else {
                    final Class<?> k0 = ci6.K0;
                    final Class<?> k2 = ci6.K0;
                    final String d0 = this.D0.D0;
                    final int h0 = xli.H0;
                }
            }
            finally {
                this.D0.I0.decrementAndGet();
                if (!this.D0.G0.isEmpty()) {
                    this.D0.a();
                }
                else {
                    final Class<?> k3 = ci6.K0;
                    final Class<?> k4 = ci6.K0;
                    final String d2 = this.D0.D0;
                    final int h2 = xli.H0;
                }
            }
        }
    }
}
