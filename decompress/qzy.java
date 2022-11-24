// 
// Decompiled by Procyon v0.6.0
// 

public final class qzy
{
    public static final h4a c;
    public final dly a;
    public final nry<w100> b;
    
    static {
        c = new h4a("PatchSliceTaskHandler");
    }
    
    public qzy(final dly a, final nry<w100> b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final mzy p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        qzy.a:Ldly;
        //     4: aload_1        
        //     5: getfield        cvy.b:Ljava/lang/Object;
        //     8: checkcast       Ljava/lang/String;
        //    11: aload_1        
        //    12: getfield        mzy.c:I
        //    15: aload_1        
        //    16: getfield        mzy.d:J
        //    19: invokevirtual   dly.n:(Ljava/lang/String;IJ)Ljava/io/File;
        //    22: astore          6
        //    24: aload_0        
        //    25: getfield        qzy.a:Ldly;
        //    28: astore          8
        //    30: aload_1        
        //    31: getfield        cvy.b:Ljava/lang/Object;
        //    34: checkcast       Ljava/lang/String;
        //    37: astore          7
        //    39: aload_1        
        //    40: getfield        mzy.c:I
        //    43: istore_2       
        //    44: aload_1        
        //    45: getfield        mzy.d:J
        //    48: lstore_3       
        //    49: aload_1        
        //    50: getfield        mzy.h:Ljava/lang/String;
        //    53: astore          5
        //    55: new             Ljava/io/File;
        //    58: dup            
        //    59: aload           8
        //    61: aload           7
        //    63: iload_2        
        //    64: lload_3        
        //    65: invokevirtual   dly.o:(Ljava/lang/String;IJ)Ljava/io/File;
        //    68: aload           5
        //    70: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    73: astore          7
        //    75: aload_1        
        //    76: getfield        mzy.j:Ljava/io/InputStream;
        //    79: astore          5
        //    81: aload_1        
        //    82: getfield        mzy.g:I
        //    85: iconst_2       
        //    86: if_icmpeq       92
        //    89: goto            106
        //    92: new             Ljava/util/zip/GZIPInputStream;
        //    95: dup            
        //    96: aload           5
        //    98: sipush          8192
        //   101: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;I)V
        //   104: astore          5
        //   106: new             Loly;
        //   109: astore          8
        //   111: aload           8
        //   113: aload           6
        //   115: aload           7
        //   117: invokespecial   oly.<init>:(Ljava/io/File;Ljava/io/File;)V
        //   120: aload_0        
        //   121: getfield        qzy.a:Ldly;
        //   124: aload_1        
        //   125: getfield        cvy.b:Ljava/lang/Object;
        //   128: checkcast       Ljava/lang/String;
        //   131: aload_1        
        //   132: getfield        mzy.e:I
        //   135: aload_1        
        //   136: getfield        mzy.f:J
        //   139: aload_1        
        //   140: getfield        mzy.h:Ljava/lang/String;
        //   143: invokevirtual   dly.s:(Ljava/lang/String;IJLjava/lang/String;)Ljava/io/File;
        //   146: astore          9
        //   148: aload           9
        //   150: invokevirtual   java/io/File.exists:()Z
        //   153: ifne            162
        //   156: aload           9
        //   158: invokevirtual   java/io/File.mkdirs:()Z
        //   161: pop            
        //   162: new             Lt0z;
        //   165: astore          6
        //   167: aload           6
        //   169: aload_0        
        //   170: getfield        qzy.a:Ldly;
        //   173: aload_1        
        //   174: getfield        cvy.b:Ljava/lang/Object;
        //   177: checkcast       Ljava/lang/String;
        //   180: aload_1        
        //   181: getfield        mzy.e:I
        //   184: aload_1        
        //   185: getfield        mzy.f:J
        //   188: aload_1        
        //   189: getfield        mzy.h:Ljava/lang/String;
        //   192: invokespecial   t0z.<init>:(Ldly;Ljava/lang/String;IJLjava/lang/String;)V
        //   195: new             Lgry;
        //   198: astore          7
        //   200: aload           7
        //   202: aload           9
        //   204: aload           6
        //   206: invokespecial   gry.<init>:(Ljava/io/File;Lt0z;)V
        //   209: aload           8
        //   211: aload           5
        //   213: aload           7
        //   215: aload_1        
        //   216: getfield        mzy.i:J
        //   219: invokestatic    pk7.x:(Ll7s;Ljava/io/InputStream;Ljava/io/OutputStream;J)J
        //   222: pop2           
        //   223: aload           6
        //   225: iconst_0       
        //   226: invokevirtual   t0z.h:(I)V
        //   229: aload           5
        //   231: invokevirtual   java/io/InputStream.close:()V
        //   234: getstatic       qzy.c:Lh4a;
        //   237: ldc             "Patching and extraction finished for slice %s of pack %s."
        //   239: iconst_2       
        //   240: anewarray       Ljava/lang/Object;
        //   243: dup            
        //   244: iconst_0       
        //   245: aload_1        
        //   246: getfield        mzy.h:Ljava/lang/String;
        //   249: aastore        
        //   250: dup            
        //   251: iconst_1       
        //   252: aload_1        
        //   253: getfield        cvy.b:Ljava/lang/Object;
        //   256: checkcast       Ljava/lang/String;
        //   259: aastore        
        //   260: invokevirtual   h4a.l:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   263: pop            
        //   264: aload_0        
        //   265: getfield        qzy.b:Lnry;
        //   268: invokeinterface nry.a:()Ljava/lang/Object;
        //   273: checkcast       Lw100;
        //   276: aload_1        
        //   277: getfield        cvy.a:I
        //   280: aload_1        
        //   281: getfield        cvy.b:Ljava/lang/Object;
        //   284: checkcast       Ljava/lang/String;
        //   287: aload_1        
        //   288: getfield        mzy.h:Ljava/lang/String;
        //   291: iconst_0       
        //   292: invokeinterface w100.e:(ILjava/lang/String;Ljava/lang/String;I)V
        //   297: aload_1        
        //   298: getfield        mzy.j:Ljava/io/InputStream;
        //   301: invokevirtual   java/io/InputStream.close:()V
        //   304: return         
        //   305: astore          5
        //   307: getstatic       qzy.c:Lh4a;
        //   310: ldc             "Could not close file for slice %s of pack %s."
        //   312: iconst_2       
        //   313: anewarray       Ljava/lang/Object;
        //   316: dup            
        //   317: iconst_0       
        //   318: aload_1        
        //   319: getfield        mzy.h:Ljava/lang/String;
        //   322: aastore        
        //   323: dup            
        //   324: iconst_1       
        //   325: aload_1        
        //   326: getfield        cvy.b:Ljava/lang/Object;
        //   329: checkcast       Ljava/lang/String;
        //   332: aastore        
        //   333: invokevirtual   h4a.m:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   336: pop            
        //   337: return         
        //   338: astore          6
        //   340: aload           5
        //   342: invokevirtual   java/io/InputStream.close:()V
        //   345: aload           6
        //   347: athrow         
        //   348: astore          5
        //   350: getstatic       qzy.c:Lh4a;
        //   353: ldc             "IOException during patching %s."
        //   355: iconst_1       
        //   356: anewarray       Ljava/lang/Object;
        //   359: dup            
        //   360: iconst_0       
        //   361: aload           5
        //   363: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   366: aastore        
        //   367: invokevirtual   h4a.j:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   370: pop            
        //   371: new             Lvqy;
        //   374: dup            
        //   375: ldc             "Error patching slice %s of pack %s."
        //   377: iconst_2       
        //   378: anewarray       Ljava/lang/Object;
        //   381: dup            
        //   382: iconst_0       
        //   383: aload_1        
        //   384: getfield        mzy.h:Ljava/lang/String;
        //   387: aastore        
        //   388: dup            
        //   389: iconst_1       
        //   390: aload_1        
        //   391: getfield        cvy.b:Ljava/lang/Object;
        //   394: checkcast       Ljava/lang/String;
        //   397: aastore        
        //   398: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   401: aload           5
        //   403: aload_1        
        //   404: getfield        cvy.a:I
        //   407: invokespecial   vqy.<init>:(Ljava/lang/String;Ljava/lang/Exception;I)V
        //   410: athrow         
        //   411: astore          5
        //   413: goto            345
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  75     89     348    411    Ljava/io/IOException;
        //  92     106    348    411    Ljava/io/IOException;
        //  106    162    338    348    Any
        //  162    229    338    348    Any
        //  229    234    348    411    Ljava/io/IOException;
        //  297    304    305    338    Ljava/io/IOException;
        //  340    345    411    416    Any
        //  345    348    348    411    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0345:
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
