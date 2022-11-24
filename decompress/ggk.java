import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public class ggk extends atc<kni, zbv>
{
    public final znl<bgk> I0;
    public final icu J0;
    
    public ggk(final ocj<bgk> ocj) {
        this.J0 = icu.d();
        ((t5j)(this.I0 = (znl<bgk>)new znl())).subscribe((ocj)ocj);
    }
    
    @Override
    public final boolean h() {
        return true;
    }
    
    public final void m(final int p0, final InputStream p1, final int p2, final String p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: sipush          200
        //     4: if_icmpne       270
        //     7: new             Ljava/lang/StringBuilder;
        //    10: astore          5
        //    12: aload           5
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: aload           5
        //    19: ldc             "** Connection to LivePipeline opened at "
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    24: pop            
        //    25: new             Ljava/util/Date;
        //    28: astore          4
        //    30: aload           4
        //    32: aload_0        
        //    33: getfield        ggk.J0:Licu;
        //    36: invokevirtual   icu.a:()J
        //    39: invokespecial   java/util/Date.<init>:(J)V
        //    42: aload           5
        //    44: aload           4
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    49: pop            
        //    50: ldc             "LivePipeline"
        //    52: aload           5
        //    54: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    57: invokestatic    nag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    60: aload_0        
        //    61: checkcast       Lwfk$a;
        //    64: getfield        wfk$a.K0:Lwfk;
        //    67: invokevirtual   wfk.s0:()V
        //    70: new             Ljava/io/BufferedReader;
        //    73: astore          5
        //    75: new             Ljava/io/InputStreamReader;
        //    78: astore          4
        //    80: aload           4
        //    82: aload_2        
        //    83: ldc             "UTF-8"
        //    85: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/lang/String;)V
        //    88: aload           5
        //    90: aload           4
        //    92: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    95: aload           5
        //    97: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   100: astore          6
        //   102: aload           6
        //   104: ifnull          243
        //   107: aload           6
        //   109: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   112: astore          7
        //   114: aload           7
        //   116: ldc             ":"
        //   118: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   121: istore_1       
        //   122: aconst_null    
        //   123: astore          4
        //   125: aload           4
        //   127: astore_2       
        //   128: iload_1        
        //   129: ifle            179
        //   132: iload_1        
        //   133: aload           7
        //   135: invokevirtual   java/lang/String.length:()I
        //   138: iconst_1       
        //   139: isub           
        //   140: if_icmplt       149
        //   143: aload           4
        //   145: astore_2       
        //   146: goto            179
        //   149: ldc             "data"
        //   151: aload           7
        //   153: iconst_0       
        //   154: iload_1        
        //   155: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   158: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   161: ifne            170
        //   164: aload           4
        //   166: astore_2       
        //   167: goto            179
        //   170: aload           7
        //   172: iload_1        
        //   173: iconst_1       
        //   174: iadd           
        //   175: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   178: astore_2       
        //   179: aload_2        
        //   180: ifnull          222
        //   183: aload_2        
        //   184: ldc             Lbgk;.class
        //   186: iconst_0       
        //   187: invokestatic    uih.e:(Ljava/lang/String;Ljava/lang/Class;Z)Ljava/lang/Object;
        //   190: checkcast       Lbgk;
        //   193: astore_2       
        //   194: aload_2        
        //   195: ifnull          209
        //   198: aload_0        
        //   199: getfield        ggk.I0:Lznl;
        //   202: aload_2        
        //   203: invokevirtual   znl.onNext:(Ljava/lang/Object;)V
        //   206: goto            95
        //   209: aload_0        
        //   210: getfield        ggk.I0:Lznl;
        //   213: getstatic       bgk.d:Lzzv;
        //   216: invokevirtual   znl.onNext:(Ljava/lang/Object;)V
        //   219: goto            95
        //   222: aload           6
        //   224: invokestatic    flr.g:(Ljava/lang/CharSequence;)Z
        //   227: ifeq            95
        //   230: aload_0        
        //   231: getfield        ggk.I0:Lznl;
        //   234: getstatic       bgk.d:Lzzv;
        //   237: invokevirtual   znl.onNext:(Ljava/lang/Object;)V
        //   240: goto            95
        //   243: aload           5
        //   245: invokevirtual   java/io/BufferedReader.close:()V
        //   248: goto            354
        //   251: astore_2       
        //   252: aload           5
        //   254: invokevirtual   java/io/BufferedReader.close:()V
        //   257: goto            268
        //   260: astore          4
        //   262: aload_2        
        //   263: aload           4
        //   265: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   268: aload_2        
        //   269: athrow         
        //   270: new             Ljava/io/IOException;
        //   273: astore          4
        //   275: new             Ljava/lang/StringBuilder;
        //   278: astore_2       
        //   279: aload_2        
        //   280: invokespecial   java/lang/StringBuilder.<init>:()V
        //   283: aload_2        
        //   284: ldc             "Initial connection to live pipeline failed. HTTP Status code: "
        //   286: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   289: pop            
        //   290: aload_2        
        //   291: iload_1        
        //   292: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   295: pop            
        //   296: aload           4
        //   298: aload_2        
        //   299: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   302: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   305: aload           4
        //   307: athrow         
        //   308: astore_2       
        //   309: aload_2        
        //   310: invokestatic    r9a.d:(Ljava/lang/Throwable;)V
        //   313: ldc             "LivePipeline"
        //   315: ldc             "** Connection to LivePipeline failed"
        //   317: invokestatic    nag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   320: new             Ljava/lang/StringBuilder;
        //   323: dup            
        //   324: invokespecial   java/lang/StringBuilder.<init>:()V
        //   327: astore          4
        //   329: aload           4
        //   331: ldc             "** Message: "
        //   333: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   336: pop            
        //   337: aload           4
        //   339: aload_2        
        //   340: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   343: pop            
        //   344: ldc             "LivePipeline"
        //   346: aload           4
        //   348: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   351: invokestatic    nag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   354: return         
        //   355: astore_2       
        //   356: goto            354
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      70     308    354    Ljava/lang/Exception;
        //  70     95     355    359    Ljava/io/IOException;
        //  70     95     308    354    Ljava/lang/Exception;
        //  95     102    251    270    Any
        //  107    122    251    270    Any
        //  132    143    251    270    Any
        //  149    164    251    270    Any
        //  170    179    251    270    Any
        //  183    194    251    270    Any
        //  198    206    251    270    Any
        //  209    219    251    270    Any
        //  222    240    251    270    Any
        //  243    248    355    359    Ljava/io/IOException;
        //  243    248    308    354    Ljava/lang/Exception;
        //  252    257    260    268    Any
        //  262    268    355    359    Ljava/io/IOException;
        //  262    268    308    354    Ljava/lang/Exception;
        //  268    270    355    359    Ljava/io/IOException;
        //  268    270    308    354    Ljava/lang/Exception;
        //  270    308    308    354    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0095:
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
