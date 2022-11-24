// 
// Decompiled by Procyon v0.6.0
// 

public final class n0z
{
    public static final Object g;
    public final String a;
    public final c0z b;
    public final Object c;
    public final Object d;
    public final Object e;
    public volatile Object f;
    
    static {
        g = new Object();
    }
    
    public n0z(final String a, final Object c, final Object d, final c0z b) {
        this.e = new Object();
        this.f = null;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public final Object a(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        n0z.e:Ljava/lang/Object;
        //     4: astore_3       
        //     5: aload_3        
        //     6: monitorenter   
        //     7: aload_3        
        //     8: monitorexit    
        //     9: aload_1        
        //    10: ifnull          15
        //    13: aload_1        
        //    14: areturn        
        //    15: getstatic       tpz.G0:Lduh;
        //    18: ifnonnull       26
        //    21: aload_0        
        //    22: getfield        n0z.c:Ljava/lang/Object;
        //    25: areturn        
        //    26: getstatic       n0z.g:Ljava/lang/Object;
        //    29: astore_3       
        //    30: aload_3        
        //    31: monitorenter   
        //    32: invokestatic    duh.a:()Z
        //    35: ifeq            62
        //    38: aload_0        
        //    39: getfield        n0z.f:Ljava/lang/Object;
        //    42: ifnonnull       53
        //    45: aload_0        
        //    46: getfield        n0z.c:Ljava/lang/Object;
        //    49: astore_1       
        //    50: goto            58
        //    53: aload_0        
        //    54: getfield        n0z.f:Ljava/lang/Object;
        //    57: astore_1       
        //    58: aload_3        
        //    59: monitorexit    
        //    60: aload_1        
        //    61: areturn        
        //    62: aload_3        
        //    63: monitorexit    
        //    64: getstatic       s0z.a:Ljava/util/List;
        //    67: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    72: astore          4
        //    74: aload           4
        //    76: invokeinterface java/util/Iterator.hasNext:()Z
        //    81: ifeq            163
        //    84: aload           4
        //    86: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    91: checkcast       Ln0z;
        //    94: astore          5
        //    96: invokestatic    duh.a:()Z
        //    99: istore_2       
        //   100: iload_2        
        //   101: ifne            150
        //   104: aconst_null    
        //   105: astore_3       
        //   106: aload           5
        //   108: getfield        n0z.b:Lc0z;
        //   111: astore          6
        //   113: aload_3        
        //   114: astore_1       
        //   115: aload           6
        //   117: ifnull          128
        //   120: aload           6
        //   122: invokeinterface c0z.a:()Ljava/lang/Object;
        //   127: astore_1       
        //   128: getstatic       n0z.g:Ljava/lang/Object;
        //   131: astore_3       
        //   132: aload_3        
        //   133: monitorenter   
        //   134: aload           5
        //   136: aload_1        
        //   137: putfield        n0z.f:Ljava/lang/Object;
        //   140: aload_3        
        //   141: monitorexit    
        //   142: goto            74
        //   145: astore_1       
        //   146: aload_3        
        //   147: monitorexit    
        //   148: aload_1        
        //   149: athrow         
        //   150: new             Ljava/lang/IllegalStateException;
        //   153: astore_1       
        //   154: aload_1        
        //   155: ldc             "Refreshing flag cache must be done on a worker thread."
        //   157: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   160: aload_1        
        //   161: athrow         
        //   162: astore_1       
        //   163: aload_0        
        //   164: getfield        n0z.b:Lc0z;
        //   167: astore_1       
        //   168: aload_1        
        //   169: ifnonnull       177
        //   172: aload_0        
        //   173: getfield        n0z.c:Ljava/lang/Object;
        //   176: areturn        
        //   177: aload_1        
        //   178: invokeinterface c0z.a:()Ljava/lang/Object;
        //   183: astore_1       
        //   184: aload_1        
        //   185: areturn        
        //   186: astore_1       
        //   187: aload_0        
        //   188: getfield        n0z.c:Ljava/lang/Object;
        //   191: areturn        
        //   192: astore_1       
        //   193: aload_0        
        //   194: getfield        n0z.c:Ljava/lang/Object;
        //   197: areturn        
        //   198: astore_1       
        //   199: aload_3        
        //   200: monitorexit    
        //   201: aload_1        
        //   202: athrow         
        //   203: astore_1       
        //   204: aload_3        
        //   205: monitorexit    
        //   206: aload_1        
        //   207: athrow         
        //   208: astore_1       
        //   209: aload_3        
        //   210: astore_1       
        //   211: goto            128
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  7      9      203    208    Any
        //  32     50     198    203    Any
        //  53     58     198    203    Any
        //  58     60     198    203    Any
        //  62     64     198    203    Any
        //  64     74     162    163    Ljava/lang/SecurityException;
        //  74     100    162    163    Ljava/lang/SecurityException;
        //  106    113    208    214    Ljava/lang/IllegalStateException;
        //  106    113    162    163    Ljava/lang/SecurityException;
        //  120    128    208    214    Ljava/lang/IllegalStateException;
        //  120    128    162    163    Ljava/lang/SecurityException;
        //  128    134    162    163    Ljava/lang/SecurityException;
        //  134    142    145    150    Any
        //  146    148    145    150    Any
        //  148    150    162    163    Ljava/lang/SecurityException;
        //  150    162    162    163    Ljava/lang/SecurityException;
        //  177    184    192    198    Ljava/lang/SecurityException;
        //  177    184    186    192    Ljava/lang/IllegalStateException;
        //  199    201    198    203    Any
        //  204    206    203    208    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0128:
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
