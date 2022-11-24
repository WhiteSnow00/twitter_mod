import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pr2 implements Callable<l4a>
{
    public final AtomicBoolean F0;
    public final z73 G0;
    public final qr2 H0;
    
    public pr2(final qr2 h0, final AtomicBoolean f0, final z73 g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object call() throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pr2.F0:Ljava/util/concurrent/atomic/AtomicBoolean;
        //     4: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //     7: ifne            149
        //    10: aload_0        
        //    11: getfield        pr2.H0:Lqr2;
        //    14: getfield        qr2.f:Lw6r;
        //    17: aload_0        
        //    18: getfield        pr2.G0:Lz73;
        //    21: invokevirtual   w6r.b:(Lz73;)Ll4a;
        //    24: astore_1       
        //    25: aload_1        
        //    26: ifnull          54
        //    29: aload_0        
        //    30: getfield        pr2.G0:Lz73;
        //    33: invokeinterface z73.a:()Ljava/lang/String;
        //    38: pop            
        //    39: aload_0        
        //    40: getfield        pr2.H0:Lqr2;
        //    43: getfield        qr2.g:Lp6d;
        //    46: invokeinterface p6d.l:()V
        //    51: goto            117
        //    54: aload_0        
        //    55: getfield        pr2.G0:Lz73;
        //    58: invokeinterface z73.a:()Ljava/lang/String;
        //    63: pop            
        //    64: aload_0        
        //    65: getfield        pr2.H0:Lqr2;
        //    68: getfield        qr2.g:Lp6d;
        //    71: invokeinterface p6d.i:()V
        //    76: aconst_null    
        //    77: astore_1       
        //    78: aload_0        
        //    79: getfield        pr2.H0:Lqr2;
        //    82: aload_0        
        //    83: getfield        pr2.G0:Lz73;
        //    86: invokestatic    qr2.a:(Lqr2;Lz73;)Lcom/facebook/common/memory/PooledByteBuffer;
        //    89: astore_2       
        //    90: aload_2        
        //    91: ifnonnull       97
        //    94: goto            147
        //    97: aload_2        
        //    98: invokestatic    cj4.l:(Ljava/io/Closeable;)Lcj4;
        //   101: astore_3       
        //   102: new             Ll4a;
        //   105: astore_2       
        //   106: aload_2        
        //   107: aload_3        
        //   108: invokespecial   l4a.<init>:(Lcj4;)V
        //   111: aload_3        
        //   112: invokestatic    cj4.e:(Lcj4;)V
        //   115: aload_2        
        //   116: astore_1       
        //   117: invokestatic    java/lang/Thread.interrupted:()Z
        //   120: ifne            126
        //   123: goto            147
        //   126: aload_1        
        //   127: invokevirtual   l4a.close:()V
        //   130: new             Ljava/lang/InterruptedException;
        //   133: astore_1       
        //   134: aload_1        
        //   135: invokespecial   java/lang/InterruptedException.<init>:()V
        //   138: aload_1        
        //   139: athrow         
        //   140: astore_2       
        //   141: aload_3        
        //   142: invokestatic    cj4.e:(Lcj4;)V
        //   145: aload_2        
        //   146: athrow         
        //   147: aload_1        
        //   148: areturn        
        //   149: new             Ljava/util/concurrent/CancellationException;
        //   152: astore_1       
        //   153: aload_1        
        //   154: invokespecial   java/util/concurrent/CancellationException.<init>:()V
        //   157: aload_1        
        //   158: athrow         
        //   159: astore_1       
        //   160: aload_1        
        //   161: athrow         
        //   162: astore_1       
        //   163: aload_1        
        //   164: athrow         
        //   165: astore_2       
        //   166: goto            147
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      25     159    165    Any
        //  29     51     159    165    Any
        //  54     76     159    165    Any
        //  78     90     165    169    Ljava/lang/Exception;
        //  78     90     159    165    Any
        //  97     102    165    169    Ljava/lang/Exception;
        //  97     102    159    165    Any
        //  102    111    140    147    Any
        //  111    115    165    169    Ljava/lang/Exception;
        //  111    115    159    165    Any
        //  117    123    159    165    Any
        //  126    140    159    165    Any
        //  141    147    165    169    Ljava/lang/Exception;
        //  141    147    159    165    Any
        //  149    159    159    165    Any
        //  160    162    162    165    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0097:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
}
