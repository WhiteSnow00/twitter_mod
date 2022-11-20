import android.content.Context;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddg implements Callable<udg<adg>>
{
    public final Context D0;
    public final String E0;
    public final String F0;
    
    public ddg(final Context d0, final String e0, final String f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final Object call() throws Exception {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ddg.D0:Landroid/content/Context;
        //     4: astore          6
        //     6: getstatic       uli.G0:Lsci;
        //     9: astore_3       
        //    10: aload_3        
        //    11: astore          5
        //    13: aload_3        
        //    14: ifnonnull       146
        //    17: ldc             Lsci;.class
        //    19: monitorenter   
        //    20: getstatic       uli.G0:Lsci;
        //    23: astore          4
        //    25: aload           4
        //    27: astore_3       
        //    28: aload           4
        //    30: ifnonnull       131
        //    33: new             Lsci;
        //    36: astore          4
        //    38: getstatic       uli.H0:Ljci;
        //    41: astore          5
        //    43: aload           5
        //    45: astore_3       
        //    46: aload           5
        //    48: ifnonnull       105
        //    51: ldc             Ljci;.class
        //    53: monitorenter   
        //    54: getstatic       uli.H0:Ljci;
        //    57: astore          5
        //    59: aload           5
        //    61: astore_3       
        //    62: aload           5
        //    64: ifnonnull       93
        //    67: new             Ljci;
        //    70: astore_3       
        //    71: new             Lmse;
        //    74: astore          5
        //    76: aload           5
        //    78: aload           6
        //    80: invokespecial   mse.<init>:(Landroid/content/Context;)V
        //    83: aload_3        
        //    84: aload           5
        //    86: invokespecial   jci.<init>:(Lndg;)V
        //    89: aload_3        
        //    90: putstatic       uli.H0:Ljci;
        //    93: ldc             Ljci;.class
        //    95: monitorexit    
        //    96: goto            105
        //    99: astore_3       
        //   100: ldc             Ljci;.class
        //   102: monitorexit    
        //   103: aload_3        
        //   104: athrow         
        //   105: new             Lii8;
        //   108: astore          5
        //   110: aload           5
        //   112: invokespecial   ii8.<init>:()V
        //   115: aload           4
        //   117: aload_3        
        //   118: aload           5
        //   120: invokespecial   sci.<init>:(Ljci;Lii8;)V
        //   123: aload           4
        //   125: putstatic       uli.G0:Lsci;
        //   128: aload           4
        //   130: astore_3       
        //   131: ldc             Lsci;.class
        //   133: monitorexit    
        //   134: aload_3        
        //   135: astore          5
        //   137: goto            146
        //   140: astore_3       
        //   141: ldc             Lsci;.class
        //   143: monitorexit    
        //   144: aload_3        
        //   145: athrow         
        //   146: aload_0        
        //   147: getfield        ddg.E0:Ljava/lang/String;
        //   150: astore          9
        //   152: aload_0        
        //   153: getfield        ddg.F0:Ljava/lang/String;
        //   156: astore          10
        //   158: getstatic       cxa.F0:Lcxa;
        //   161: astore          8
        //   163: aconst_null    
        //   164: astore          6
        //   166: aconst_null    
        //   167: astore          7
        //   169: iconst_0       
        //   170: istore_1       
        //   171: aload           10
        //   173: ifnonnull       179
        //   176: goto            395
        //   179: aload           5
        //   181: getfield        sci.a:Ljci;
        //   184: astore          11
        //   186: aload           11
        //   188: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   191: pop            
        //   192: new             Ljava/io/File;
        //   195: astore_3       
        //   196: aload           11
        //   198: invokevirtual   jci.b:()Ljava/io/File;
        //   201: astore          12
        //   203: getstatic       cxa.E0:Lcxa;
        //   206: astore          4
        //   208: aload_3        
        //   209: aload           12
        //   211: aload           9
        //   213: aload           4
        //   215: iconst_0       
        //   216: invokestatic    jci.a:(Ljava/lang/String;Lcxa;Z)Ljava/lang/String;
        //   219: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   222: aload_3        
        //   223: invokevirtual   java/io/File.exists:()Z
        //   226: ifeq            232
        //   229: goto            265
        //   232: new             Ljava/io/File;
        //   235: astore_3       
        //   236: aload_3        
        //   237: aload           11
        //   239: invokevirtual   jci.b:()Ljava/io/File;
        //   242: aload           9
        //   244: aload           8
        //   246: iconst_0       
        //   247: invokestatic    jci.a:(Ljava/lang/String;Lcxa;Z)Ljava/lang/String;
        //   250: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   253: aload_3        
        //   254: invokevirtual   java/io/File.exists:()Z
        //   257: ifeq            263
        //   260: goto            265
        //   263: aconst_null    
        //   264: astore_3       
        //   265: aload_3        
        //   266: ifnonnull       272
        //   269: goto            321
        //   272: new             Ljava/io/FileInputStream;
        //   275: dup            
        //   276: aload_3        
        //   277: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   280: astore          11
        //   282: aload_3        
        //   283: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   286: ldc             ".zip"
        //   288: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   291: ifeq            298
        //   294: aload           8
        //   296: astore          4
        //   298: aload_3        
        //   299: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   302: pop            
        //   303: invokestatic    p9g.a:()V
        //   306: new             Landroid/util/Pair;
        //   309: dup            
        //   310: aload           4
        //   312: aload           11
        //   314: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   317: astore_3       
        //   318: goto            323
        //   321: aconst_null    
        //   322: astore_3       
        //   323: aload_3        
        //   324: ifnonnull       330
        //   327: goto            395
        //   330: aload_3        
        //   331: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   334: checkcast       Lcxa;
        //   337: astore          4
        //   339: aload_3        
        //   340: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   343: checkcast       Ljava/io/InputStream;
        //   346: astore_3       
        //   347: aload           4
        //   349: aload           8
        //   351: if_acmpne       371
        //   354: new             Ljava/util/zip/ZipInputStream;
        //   357: dup            
        //   358: aload_3        
        //   359: invokespecial   java/util/zip/ZipInputStream.<init>:(Ljava/io/InputStream;)V
        //   362: aload           9
        //   364: invokestatic    cdg.f:(Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Ludg;
        //   367: astore_3       
        //   368: goto            378
        //   371: aload_3        
        //   372: aload           9
        //   374: invokestatic    cdg.c:(Ljava/io/InputStream;Ljava/lang/String;)Ludg;
        //   377: astore_3       
        //   378: aload_3        
        //   379: getfield        udg.a:Ljava/lang/Object;
        //   382: astore_3       
        //   383: aload_3        
        //   384: ifnull          395
        //   387: aload_3        
        //   388: checkcast       Ladg;
        //   391: astore_3       
        //   392: goto            397
        //   395: aconst_null    
        //   396: astore_3       
        //   397: aload_3        
        //   398: ifnull          413
        //   401: new             Ludg;
        //   404: dup            
        //   405: aload_3        
        //   406: invokespecial   udg.<init>:(Ljava/lang/Object;)V
        //   409: astore_3       
        //   410: goto            636
        //   413: invokestatic    p9g.a:()V
        //   416: invokestatic    p9g.a:()V
        //   419: aload           7
        //   421: astore_3       
        //   422: aload           6
        //   424: astore          4
        //   426: aload           5
        //   428: getfield        sci.b:Lii8;
        //   431: aload           9
        //   433: invokevirtual   ii8.n:(Ljava/lang/String;)Lhi8;
        //   436: astore          6
        //   438: aload           6
        //   440: astore_3       
        //   441: aload           6
        //   443: astore          4
        //   445: aload           6
        //   447: getfield        hi8.D0:Ljava/net/HttpURLConnection;
        //   450: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   453: bipush          100
        //   455: idiv           
        //   456: istore_2       
        //   457: iload_2        
        //   458: iconst_2       
        //   459: if_icmpne       468
        //   462: iconst_1       
        //   463: istore_1       
        //   464: goto            468
        //   467: astore_3       
        //   468: iload_1        
        //   469: ifeq            522
        //   472: aload           6
        //   474: astore_3       
        //   475: aload           6
        //   477: astore          4
        //   479: aload           5
        //   481: aload           9
        //   483: aload           6
        //   485: getfield        hi8.D0:Ljava/net/HttpURLConnection;
        //   488: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //   491: aload           6
        //   493: getfield        hi8.D0:Ljava/net/HttpURLConnection;
        //   496: invokevirtual   java/net/URLConnection.getContentType:()Ljava/lang/String;
        //   499: aload           10
        //   501: invokevirtual   sci.a:(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Ludg;
        //   504: astore          5
        //   506: aload           6
        //   508: astore_3       
        //   509: aload           6
        //   511: astore          4
        //   513: invokestatic    p9g.a:()V
        //   516: aload           5
        //   518: astore_3       
        //   519: goto            572
        //   522: aload           6
        //   524: astore_3       
        //   525: aload           6
        //   527: astore          4
        //   529: new             Ljava/lang/IllegalArgumentException;
        //   532: astore          5
        //   534: aload           6
        //   536: astore_3       
        //   537: aload           6
        //   539: astore          4
        //   541: aload           5
        //   543: aload           6
        //   545: invokevirtual   hi8.a:()Ljava/lang/String;
        //   548: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   551: aload           6
        //   553: astore_3       
        //   554: aload           6
        //   556: astore          4
        //   558: new             Ludg;
        //   561: dup            
        //   562: aload           5
        //   564: invokespecial   udg.<init>:(Ljava/lang/Throwable;)V
        //   567: astore          5
        //   569: aload           5
        //   571: astore_3       
        //   572: aload           6
        //   574: invokevirtual   hi8.close:()V
        //   577: goto            636
        //   580: astore          4
        //   582: ldc             "LottieFetchResult close failed "
        //   584: aload           4
        //   586: invokestatic    p9g.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   589: goto            636
        //   592: astore          4
        //   594: goto            673
        //   597: astore          5
        //   599: aload           4
        //   601: astore_3       
        //   602: new             Ludg;
        //   605: dup            
        //   606: aload           5
        //   608: invokespecial   udg.<init>:(Ljava/lang/Throwable;)V
        //   611: astore          5
        //   613: aload           4
        //   615: ifnull          633
        //   618: aload           4
        //   620: invokevirtual   hi8.close:()V
        //   623: goto            633
        //   626: astore_3       
        //   627: ldc             "LottieFetchResult close failed "
        //   629: aload_3        
        //   630: invokestatic    p9g.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   633: aload           5
        //   635: astore_3       
        //   636: aload_0        
        //   637: getfield        ddg.F0:Ljava/lang/String;
        //   640: astore          5
        //   642: aload           5
        //   644: ifnull          671
        //   647: aload_3        
        //   648: getfield        udg.a:Ljava/lang/Object;
        //   651: astore          4
        //   653: aload           4
        //   655: ifnull          671
        //   658: getstatic       bdg.b:Lbdg;
        //   661: aload           5
        //   663: aload           4
        //   665: checkcast       Ladg;
        //   668: invokevirtual   bdg.a:(Ljava/lang/String;Ladg;)V
        //   671: aload_3        
        //   672: areturn        
        //   673: aload_3        
        //   674: ifnull          691
        //   677: aload_3        
        //   678: invokevirtual   hi8.close:()V
        //   681: goto            691
        //   684: astore_3       
        //   685: ldc             "LottieFetchResult close failed "
        //   687: aload_3        
        //   688: invokestatic    p9g.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   691: aload           4
        //   693: athrow         
        //   694: astore_3       
        //   695: goto            321
        //    Exceptions:
        //  throws java.lang.Exception
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  20     25     140    146    Any
        //  33     43     140    146    Any
        //  51     54     140    146    Any
        //  54     59     99     105    Any
        //  67     93     99     105    Any
        //  93     96     99     105    Any
        //  100    103    99     105    Any
        //  103    105    140    146    Any
        //  105    128    140    146    Any
        //  131    134    140    146    Any
        //  141    144    140    146    Any
        //  192    229    694    698    Ljava/io/FileNotFoundException;
        //  232    260    694    698    Ljava/io/FileNotFoundException;
        //  272    282    694    698    Ljava/io/FileNotFoundException;
        //  426    438    597    636    Ljava/lang/Exception;
        //  426    438    592    694    Any
        //  445    457    467    468    Ljava/io/IOException;
        //  445    457    597    636    Ljava/lang/Exception;
        //  445    457    592    694    Any
        //  479    506    597    636    Ljava/lang/Exception;
        //  479    506    592    694    Any
        //  513    516    597    636    Ljava/lang/Exception;
        //  513    516    592    694    Any
        //  529    534    597    636    Ljava/lang/Exception;
        //  529    534    592    694    Any
        //  541    551    597    636    Ljava/lang/Exception;
        //  541    551    592    694    Any
        //  558    569    597    636    Ljava/lang/Exception;
        //  558    569    592    694    Any
        //  572    577    580    592    Ljava/io/IOException;
        //  602    613    592    694    Any
        //  618    623    626    633    Ljava/io/IOException;
        //  677    681    684    691    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 342, Size: 342
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
