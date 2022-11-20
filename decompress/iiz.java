import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iiz implements Runnable
{
    public final AtomicReference D0;
    public final twz E0;
    public final glz F0;
    
    public iiz(final glz f0, final AtomicReference d0, final twz e0) {
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        iiz.D0:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        iiz.F0:Lglz;
        //    11: getfield        pbz.D0:Ln8z;
        //    14: invokevirtual   n8z.u:()Lu4z;
        //    17: invokevirtual   u4z.o:()Lpcy;
        //    20: getstatic       gcy.F0:Lgcy;
        //    23: invokevirtual   pcy.f:(Lgcy;)Z
        //    26: ifne            96
        //    29: aload_0        
        //    30: getfield        iiz.F0:Lglz;
        //    33: getfield        pbz.D0:Ln8z;
        //    36: invokevirtual   n8z.b:()Lq2z;
        //    39: getfield        q2z.N0:Ln1z;
        //    42: ldc             "Analytics storage consent denied; will not get app instance id"
        //    44: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //    47: aload_0        
        //    48: getfield        iiz.F0:Lglz;
        //    51: getfield        pbz.D0:Ln8z;
        //    54: invokevirtual   n8z.w:()Lbgz;
        //    57: aconst_null    
        //    58: invokevirtual   bgz.u:(Ljava/lang/String;)V
        //    61: aload_0        
        //    62: getfield        iiz.F0:Lglz;
        //    65: getfield        pbz.D0:Ln8z;
        //    68: invokevirtual   n8z.u:()Lu4z;
        //    71: getfield        u4z.I0:Lq4z;
        //    74: aconst_null    
        //    75: invokevirtual   q4z.b:(Ljava/lang/String;)V
        //    78: aload_0        
        //    79: getfield        iiz.D0:Ljava/util/concurrent/atomic/AtomicReference;
        //    82: aconst_null    
        //    83: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //    86: aload_0        
        //    87: getfield        iiz.D0:Ljava/util/concurrent/atomic/AtomicReference;
        //    90: invokevirtual   java/lang/Object.notify:()V
        //    93: aload_2        
        //    94: monitorexit    
        //    95: return         
        //    96: aload_0        
        //    97: getfield        iiz.F0:Lglz;
        //   100: astore_3       
        //   101: aload_3        
        //   102: getfield        glz.G0:Li0z;
        //   105: astore_1       
        //   106: aload_1        
        //   107: ifnonnull       135
        //   110: aload_3        
        //   111: getfield        pbz.D0:Ln8z;
        //   114: invokevirtual   n8z.b:()Lq2z;
        //   117: getfield        q2z.I0:Ln1z;
        //   120: ldc             "Failed to get app instance id"
        //   122: invokevirtual   n1z.a:(Ljava/lang/String;)V
        //   125: aload_0        
        //   126: getfield        iiz.D0:Ljava/util/concurrent/atomic/AtomicReference;
        //   129: invokevirtual   java/lang/Object.notify:()V
        //   132: aload_2        
        //   133: monitorexit    
        //   134: return         
        //   135: aload_0        
        //   136: getfield        iiz.E0:Ltwz;
        //   139: invokestatic    eli.q:(Ljava/lang/Object;)Ljava/lang/Object;
        //   142: pop            
        //   143: aload_0        
        //   144: getfield        iiz.D0:Ljava/util/concurrent/atomic/AtomicReference;
        //   147: aload_1        
        //   148: aload_0        
        //   149: getfield        iiz.E0:Ltwz;
        //   152: invokeinterface i0z.t0:(Ltwz;)Ljava/lang/String;
        //   157: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   160: aload_0        
        //   161: getfield        iiz.D0:Ljava/util/concurrent/atomic/AtomicReference;
        //   164: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //   167: checkcast       Ljava/lang/String;
        //   170: astore_1       
        //   171: aload_1        
        //   172: ifnull          206
        //   175: aload_0        
        //   176: getfield        iiz.F0:Lglz;
        //   179: getfield        pbz.D0:Ln8z;
        //   182: invokevirtual   n8z.w:()Lbgz;
        //   185: aload_1        
        //   186: invokevirtual   bgz.u:(Ljava/lang/String;)V
        //   189: aload_0        
        //   190: getfield        iiz.F0:Lglz;
        //   193: getfield        pbz.D0:Ln8z;
        //   196: invokevirtual   n8z.u:()Lu4z;
        //   199: getfield        u4z.I0:Lq4z;
        //   202: aload_1        
        //   203: invokevirtual   q4z.b:(Ljava/lang/String;)V
        //   206: aload_0        
        //   207: getfield        iiz.F0:Lglz;
        //   210: invokevirtual   glz.s:()V
        //   213: aload_0        
        //   214: getfield        iiz.D0:Ljava/util/concurrent/atomic/AtomicReference;
        //   217: astore_1       
        //   218: goto            250
        //   221: astore_1       
        //   222: goto            257
        //   225: astore_1       
        //   226: aload_0        
        //   227: getfield        iiz.F0:Lglz;
        //   230: getfield        pbz.D0:Ln8z;
        //   233: invokevirtual   n8z.b:()Lq2z;
        //   236: getfield        q2z.I0:Ln1z;
        //   239: ldc             "Failed to get app instance id"
        //   241: aload_1        
        //   242: invokevirtual   n1z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   245: aload_0        
        //   246: getfield        iiz.D0:Ljava/util/concurrent/atomic/AtomicReference;
        //   249: astore_1       
        //   250: aload_1        
        //   251: invokevirtual   java/lang/Object.notify:()V
        //   254: aload_2        
        //   255: monitorexit    
        //   256: return         
        //   257: aload_0        
        //   258: getfield        iiz.D0:Ljava/util/concurrent/atomic/AtomicReference;
        //   261: invokevirtual   java/lang/Object.notify:()V
        //   264: aload_1        
        //   265: athrow         
        //   266: astore_1       
        //   267: aload_2        
        //   268: monitorexit    
        //   269: aload_1        
        //   270: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      86     225    250    Landroid/os/RemoteException;
        //  7      86     221    225    Any
        //  86     95     266    271    Any
        //  96     106    225    250    Landroid/os/RemoteException;
        //  96     106    221    225    Any
        //  110    125    225    250    Landroid/os/RemoteException;
        //  110    125    221    225    Any
        //  125    134    266    271    Any
        //  135    171    225    250    Landroid/os/RemoteException;
        //  135    171    221    225    Any
        //  175    206    225    250    Landroid/os/RemoteException;
        //  175    206    221    225    Any
        //  206    213    225    250    Landroid/os/RemoteException;
        //  206    213    221    225    Any
        //  213    218    266    271    Any
        //  226    245    221    225    Any
        //  245    250    266    271    Any
        //  250    256    266    271    Any
        //  257    266    266    271    Any
        //  267    269    266    271    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
