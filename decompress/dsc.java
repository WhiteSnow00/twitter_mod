// 
// Decompiled by Procyon v0.6.0
// 

public final class dsc implements Runnable
{
    public final fsc$a D0;
    public final rci.a E0;
    public final fsc F0;
    
    public dsc(final fsc f0, final fsc$a d0, final rci.a e0) {
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
        //     1: getfield        dsc.F0:Lfsc;
        //     4: astore          9
        //     6: aload_0        
        //     7: getfield        dsc.D0:Lfsc$a;
        //    10: astore          10
        //    12: aload_0        
        //    13: getfield        dsc.E0:Lrci$a;
        //    16: astore          8
        //    18: aload           9
        //    20: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    23: pop            
        //    24: aconst_null    
        //    25: astore          6
        //    27: aconst_null    
        //    28: astore_1       
        //    29: aconst_null    
        //    30: astore          7
        //    32: aconst_null    
        //    33: astore          4
        //    35: aconst_null    
        //    36: astore          5
        //    38: aload           9
        //    40: aload           10
        //    42: getfield        qva.b:Lz0l;
        //    45: invokeinterface z0l.l:()Lcom/facebook/imagepipeline/request/a;
        //    50: getfield        com/facebook/imagepipeline/request/a.b:Landroid/net/Uri;
        //    53: iconst_5       
        //    54: invokevirtual   fsc.L:(Landroid/net/Uri;I)Ljava/net/HttpURLConnection;
        //    57: astore_2       
        //    58: aload           6
        //    60: astore          4
        //    62: aload           7
        //    64: astore_1       
        //    65: aload_2        
        //    66: astore_3       
        //    67: aload           10
        //    69: aload           9
        //    71: getfield        fsc.G0:Lfqh;
        //    74: invokeinterface fqh.now:()J
        //    79: putfield        fsc$a.e:J
        //    82: aload_2        
        //    83: ifnull          121
        //    86: aload           6
        //    88: astore          4
        //    90: aload           7
        //    92: astore_1       
        //    93: aload_2        
        //    94: astore_3       
        //    95: aload_2        
        //    96: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //    99: astore          5
        //   101: aload           5
        //   103: astore          4
        //   105: aload           5
        //   107: astore_1       
        //   108: aload_2        
        //   109: astore_3       
        //   110: aload           8
        //   112: checkcast       Lqci$a;
        //   115: aload           5
        //   117: iconst_m1      
        //   118: invokevirtual   qci$a.b:(Ljava/io/InputStream;I)V
        //   121: aload           5
        //   123: ifnull          135
        //   126: aload           5
        //   128: invokevirtual   java/io/InputStream.close:()V
        //   131: goto            135
        //   134: astore_1       
        //   135: aload_2        
        //   136: ifnull          197
        //   139: goto            193
        //   142: astore          5
        //   144: goto            160
        //   147: astore_1       
        //   148: aconst_null    
        //   149: astore_3       
        //   150: goto            204
        //   153: astore          5
        //   155: aconst_null    
        //   156: astore_2       
        //   157: aload_1        
        //   158: astore          4
        //   160: aload           4
        //   162: astore_1       
        //   163: aload_2        
        //   164: astore_3       
        //   165: aload           8
        //   167: checkcast       Lqci$a;
        //   170: aload           5
        //   172: invokevirtual   qci$a.a:(Ljava/lang/Throwable;)V
        //   175: aload           4
        //   177: ifnull          189
        //   180: aload           4
        //   182: invokevirtual   java/io/InputStream.close:()V
        //   185: goto            189
        //   188: astore_1       
        //   189: aload_2        
        //   190: ifnull          197
        //   193: aload_2        
        //   194: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   197: return         
        //   198: astore_2       
        //   199: aload_1        
        //   200: astore          4
        //   202: aload_2        
        //   203: astore_1       
        //   204: aload           4
        //   206: ifnull          218
        //   209: aload           4
        //   211: invokevirtual   java/io/InputStream.close:()V
        //   214: goto            218
        //   217: astore_2       
        //   218: aload_3        
        //   219: ifnull          226
        //   222: aload_3        
        //   223: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   226: aload_1        
        //   227: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  38     58     153    160    Ljava/io/IOException;
        //  38     58     147    153    Any
        //  67     82     142    147    Ljava/io/IOException;
        //  67     82     198    204    Any
        //  95     101    142    147    Ljava/io/IOException;
        //  95     101    198    204    Any
        //  110    121    142    147    Ljava/io/IOException;
        //  110    121    198    204    Any
        //  126    131    134    135    Ljava/io/IOException;
        //  165    175    198    204    Any
        //  180    185    188    189    Ljava/io/IOException;
        //  209    214    217    218    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
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
