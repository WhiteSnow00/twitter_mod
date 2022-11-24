import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pkz implements Runnable
{
    public final AtomicReference F0;
    public final String G0;
    public final String H0;
    public final sxz I0;
    public final fmz J0;
    
    public pkz(final fmz j0, final AtomicReference f0, final String g0, final String h0, final sxz i0) {
        this.J0 = j0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pkz.F0:Ljava/util/concurrent/atomic/AtomicReference;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        pkz.J0:Lfmz;
        //    11: astore_3       
        //    12: aload_3        
        //    13: getfield        fmz.I0:Lg1z;
        //    16: astore_1       
        //    17: aload_1        
        //    18: ifnonnull       65
        //    21: aload_3        
        //    22: getfield        ocz.F0:Lm9z;
        //    25: invokevirtual   m9z.b:()Lo3z;
        //    28: getfield        o3z.K0:Ll2z;
        //    31: ldc             "(legacy) Failed to get conditional properties; not connected to service"
        //    33: aconst_null    
        //    34: aload_0        
        //    35: getfield        pkz.G0:Ljava/lang/String;
        //    38: aload_0        
        //    39: getfield        pkz.H0:Ljava/lang/String;
        //    42: invokevirtual   l2z.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //    45: aload_0        
        //    46: getfield        pkz.F0:Ljava/util/concurrent/atomic/AtomicReference;
        //    49: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //    52: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //    55: aload_0        
        //    56: getfield        pkz.F0:Ljava/util/concurrent/atomic/AtomicReference;
        //    59: invokevirtual   java/lang/Object.notify:()V
        //    62: aload_2        
        //    63: monitorexit    
        //    64: return         
        //    65: aconst_null    
        //    66: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    69: ifeq            108
        //    72: aload_0        
        //    73: getfield        pkz.I0:Lsxz;
        //    76: invokestatic    iuk.C:(Ljava/lang/Object;)Ljava/lang/Object;
        //    79: pop            
        //    80: aload_0        
        //    81: getfield        pkz.F0:Ljava/util/concurrent/atomic/AtomicReference;
        //    84: aload_1        
        //    85: aload_0        
        //    86: getfield        pkz.G0:Ljava/lang/String;
        //    89: aload_0        
        //    90: getfield        pkz.H0:Ljava/lang/String;
        //    93: aload_0        
        //    94: getfield        pkz.I0:Lsxz;
        //    97: invokeinterface g1z.e1:(Ljava/lang/String;Ljava/lang/String;Lsxz;)Ljava/util/List;
        //   102: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   105: goto            130
        //   108: aload_0        
        //   109: getfield        pkz.F0:Ljava/util/concurrent/atomic/AtomicReference;
        //   112: aload_1        
        //   113: aconst_null    
        //   114: aload_0        
        //   115: getfield        pkz.G0:Ljava/lang/String;
        //   118: aload_0        
        //   119: getfield        pkz.H0:Ljava/lang/String;
        //   122: invokeinterface g1z.o1:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
        //   127: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   130: aload_0        
        //   131: getfield        pkz.J0:Lfmz;
        //   134: invokevirtual   fmz.s:()V
        //   137: aload_0        
        //   138: getfield        pkz.F0:Ljava/util/concurrent/atomic/AtomicReference;
        //   141: astore_1       
        //   142: goto            189
        //   145: astore_1       
        //   146: goto            196
        //   149: astore_1       
        //   150: aload_0        
        //   151: getfield        pkz.J0:Lfmz;
        //   154: getfield        ocz.F0:Lm9z;
        //   157: invokevirtual   m9z.b:()Lo3z;
        //   160: getfield        o3z.K0:Ll2z;
        //   163: ldc             "(legacy) Failed to get conditional properties; remote exception"
        //   165: aconst_null    
        //   166: aload_0        
        //   167: getfield        pkz.G0:Ljava/lang/String;
        //   170: aload_1        
        //   171: invokevirtual   l2z.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   174: aload_0        
        //   175: getfield        pkz.F0:Ljava/util/concurrent/atomic/AtomicReference;
        //   178: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   181: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   184: aload_0        
        //   185: getfield        pkz.F0:Ljava/util/concurrent/atomic/AtomicReference;
        //   188: astore_1       
        //   189: aload_1        
        //   190: invokevirtual   java/lang/Object.notify:()V
        //   193: aload_2        
        //   194: monitorexit    
        //   195: return         
        //   196: aload_0        
        //   197: getfield        pkz.F0:Ljava/util/concurrent/atomic/AtomicReference;
        //   200: invokevirtual   java/lang/Object.notify:()V
        //   203: aload_1        
        //   204: athrow         
        //   205: astore_1       
        //   206: aload_2        
        //   207: monitorexit    
        //   208: aload_1        
        //   209: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  7      17     149    189    Landroid/os/RemoteException;
        //  7      17     145    149    Any
        //  21     55     149    189    Landroid/os/RemoteException;
        //  21     55     145    149    Any
        //  55     64     205    210    Any
        //  65     105    149    189    Landroid/os/RemoteException;
        //  65     105    145    149    Any
        //  108    130    149    189    Landroid/os/RemoteException;
        //  108    130    145    149    Any
        //  130    137    149    189    Landroid/os/RemoteException;
        //  130    137    145    149    Any
        //  137    142    205    210    Any
        //  150    184    145    149    Any
        //  184    189    205    210    Any
        //  189    195    205    210    Any
        //  196    205    205    210    Any
        //  206    208    205    210    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
