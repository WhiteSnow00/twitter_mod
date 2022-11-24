// 
// Decompiled by Procyon v0.6.0
// 

public final class xby implements dsy
{
    public final int F0;
    public final dsy G0;
    
    public xby(final dsy g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        xby.F0:I
        //     4: tableswitch {
        //                0: 27
        //          default: 24
        //        }
        //    24: goto            190
        //    27: aload_0        
        //    28: getfield        xby.G0:Ldsy;
        //    31: invokeinterface dsy.a:()Ljava/lang/Object;
        //    36: checkcast       Ljava/io/File;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ifnonnull       49
        //    44: aconst_null    
        //    45: astore_1       
        //    46: goto            188
        //    49: getstatic       x100.c:Lh4a;
        //    52: astore_2       
        //    53: new             Ljava/io/File;
        //    56: dup            
        //    57: aload_1        
        //    58: ldc             "local_testing_config.xml"
        //    60: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    63: astore_1       
        //    64: aload_1        
        //    65: invokevirtual   java/io/File.exists:()Z
        //    68: ifne            78
        //    71: getstatic       mzz.a:Lnoy;
        //    74: astore_1       
        //    75: goto            188
        //    78: new             Ljava/io/FileReader;
        //    81: astore_2       
        //    82: aload_2        
        //    83: aload_1        
        //    84: invokespecial   java/io/FileReader.<init>:(Ljava/io/File;)V
        //    87: invokestatic    org/xmlpull/v1/XmlPullParserFactory.newInstance:()Lorg/xmlpull/v1/XmlPullParserFactory;
        //    90: invokevirtual   org/xmlpull/v1/XmlPullParserFactory.newPullParser:()Lorg/xmlpull/v1/XmlPullParser;
        //    93: astore_3       
        //    94: aload_3        
        //    95: aload_2        
        //    96: invokeinterface org/xmlpull/v1/XmlPullParser.setInput:(Ljava/io/Reader;)V
        //   101: new             Lx100;
        //   104: astore_1       
        //   105: aload_1        
        //   106: aload_3        
        //   107: invokespecial   x100.<init>:(Lorg/xmlpull/v1/XmlPullParser;)V
        //   110: new             Lbqe;
        //   113: astore_3       
        //   114: aload_3        
        //   115: aload_1        
        //   116: bipush          6
        //   118: invokespecial   bqe.<init>:(Ljava/lang/Object;I)V
        //   121: aload_1        
        //   122: ldc             "local-testing-config"
        //   124: aload_3        
        //   125: invokevirtual   x100.a:(Ljava/lang/String;Lg100;)V
        //   128: aload_1        
        //   129: getfield        x100.b:Lfay;
        //   132: invokevirtual   fay.a:()Lmzz;
        //   135: astore_1       
        //   136: aload_2        
        //   137: invokevirtual   java/io/Reader.close:()V
        //   140: goto            188
        //   143: astore_1       
        //   144: aload_2        
        //   145: invokevirtual   java/io/Reader.close:()V
        //   148: aload_1        
        //   149: athrow         
        //   150: astore_1       
        //   151: goto            159
        //   154: astore_1       
        //   155: goto            159
        //   158: astore_1       
        //   159: getstatic       x100.c:Lh4a;
        //   162: ldc             "%s can not be parsed, using default. Error: %s"
        //   164: iconst_2       
        //   165: anewarray       Ljava/lang/Object;
        //   168: dup            
        //   169: iconst_0       
        //   170: ldc             "local_testing_config.xml"
        //   172: aastore        
        //   173: dup            
        //   174: iconst_1       
        //   175: aload_1        
        //   176: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   179: aastore        
        //   180: invokevirtual   h4a.m:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   183: pop            
        //   184: getstatic       mzz.a:Lnoy;
        //   187: astore_1       
        //   188: aload_1        
        //   189: areturn        
        //   190: new             Lrky;
        //   193: dup            
        //   194: aload_0        
        //   195: getfield        xby.G0:Ldsy;
        //   198: checkcast       Lvby;
        //   201: invokevirtual   vby.b:()Landroid/content/Context;
        //   204: invokespecial   rky.<init>:(Landroid/content/Context;)V
        //   207: areturn        
        //   208: astore_2       
        //   209: goto            148
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  78     87     158    159    Ljava/io/IOException;
        //  78     87     154    158    Lorg/xmlpull/v1/XmlPullParserException;
        //  78     87     150    154    Ljava/lang/RuntimeException;
        //  87     136    143    150    Any
        //  136    140    158    159    Ljava/io/IOException;
        //  136    140    154    158    Lorg/xmlpull/v1/XmlPullParserException;
        //  136    140    150    154    Ljava/lang/RuntimeException;
        //  144    148    208    212    Any
        //  148    150    158    159    Ljava/io/IOException;
        //  148    150    154    158    Lorg/xmlpull/v1/XmlPullParserException;
        //  148    150    150    154    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
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
