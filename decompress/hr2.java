import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hr2 implements Callable<z3a>
{
    public final /* synthetic */ AtomicBoolean C0;
    public final /* synthetic */ q73 D0;
    public final /* synthetic */ ir2 E0;
    
    public hr2(final ir2 e0, final AtomicBoolean c0, final q73 d0) {
        this.E0 = e0;
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final Object call() throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        hr2.C0:Ljava/util/concurrent/atomic/AtomicBoolean;
        //     4: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //     7: ifne            149
        //    10: aload_0        
        //    11: getfield        hr2.E0:Lir2;
        //    14: getfield        ir2.f:Ld5r;
        //    17: aload_0        
        //    18: getfield        hr2.D0:Lq73;
        //    21: invokevirtual   d5r.b:(Lq73;)Lz3a;
        //    24: astore_1       
        //    25: aload_1        
        //    26: ifnull          54
        //    29: aload_0        
        //    30: getfield        hr2.D0:Lq73;
        //    33: invokeinterface q73.a:()Ljava/lang/String;
        //    38: pop            
        //    39: aload_0        
        //    40: getfield        hr2.E0:Lir2;
        //    43: getfield        ir2.g:Lk6d;
        //    46: invokeinterface k6d.l:()V
        //    51: goto            117
        //    54: aload_0        
        //    55: getfield        hr2.D0:Lq73;
        //    58: invokeinterface q73.a:()Ljava/lang/String;
        //    63: pop            
        //    64: aload_0        
        //    65: getfield        hr2.E0:Lir2;
        //    68: getfield        ir2.g:Lk6d;
        //    71: invokeinterface k6d.i:()V
        //    76: aconst_null    
        //    77: astore_1       
        //    78: aload_0        
        //    79: getfield        hr2.E0:Lir2;
        //    82: aload_0        
        //    83: getfield        hr2.D0:Lq73;
        //    86: invokestatic    ir2.a:(Lir2;Lq73;)Lcom/facebook/common/memory/PooledByteBuffer;
        //    89: astore_2       
        //    90: aload_2        
        //    91: ifnonnull       97
        //    94: goto            147
        //    97: aload_2        
        //    98: invokestatic    wi4.k:(Ljava/io/Closeable;)Lwi4;
        //   101: astore_3       
        //   102: new             Lz3a;
        //   105: astore_2       
        //   106: aload_2        
        //   107: aload_3        
        //   108: invokespecial   z3a.<init>:(Lwi4;)V
        //   111: aload_3        
        //   112: invokestatic    wi4.e:(Lwi4;)V
        //   115: aload_2        
        //   116: astore_1       
        //   117: invokestatic    java/lang/Thread.interrupted:()Z
        //   120: ifne            126
        //   123: goto            147
        //   126: aload_1        
        //   127: invokevirtual   z3a.close:()V
        //   130: new             Ljava/lang/InterruptedException;
        //   133: astore_1       
        //   134: aload_1        
        //   135: invokespecial   java/lang/InterruptedException.<init>:()V
        //   138: aload_1        
        //   139: athrow         
        //   140: astore_2       
        //   141: aload_3        
        //   142: invokestatic    wi4.e:(Lwi4;)V
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
