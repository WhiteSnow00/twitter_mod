import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Delayed;
import java.util.concurrent.Callable;
import android.os.Handler;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.RunnableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivo<V> implements RunnableFuture<V>, ScheduledFuture<V>
{
    public final FutureTask<V> D0;
    
    public ivo(final Handler p0, final Runnable p1, final V p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/concurrent/FutureTask;
        //     8: dup            
        //     9: aload_1        
        //    10: aload_2        
        //    11: invokespecial   java/util/concurrent/FutureTask.<init>:(Ljava/lang/Runnable;Ljava/lang/Object;)V
        //    14: putfield        ivo.D0:Ljava/util/concurrent/FutureTask;
        //    17: return         
        //    Signature:
        //  (Landroid/os/Handler;Ljava/lang/Runnable;TV;)V
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
    
    public ivo(final Handler p0, final Callable<V> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/concurrent/FutureTask;
        //     8: dup            
        //     9: aload_1        
        //    10: invokespecial   java/util/concurrent/FutureTask.<init>:(Ljava/util/concurrent/Callable;)V
        //    13: putfield        ivo.D0:Ljava/util/concurrent/FutureTask;
        //    16: return         
        //    Signature:
        //  (Landroid/os/Handler;Ljava/util/concurrent/Callable<TV;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
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
    
    @Override
    public final boolean cancel(final boolean b) {
        return this.D0.cancel(b);
    }
    
    @Override
    public final int compareTo(final Object o) {
        final Delayed delayed = (Delayed)o;
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final V get() throws InterruptedException, ExecutionException {
        return this.D0.get();
    }
    
    @Override
    public final V get(final long n, final TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.D0.get(n, timeUnit);
    }
    
    @Override
    public final long getDelay(final TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean isCancelled() {
        return this.D0.isCancelled();
    }
    
    @Override
    public final boolean isDone() {
        return this.D0.isDone();
    }
    
    @Override
    public final void run() {
        this.D0.run();
    }
}
