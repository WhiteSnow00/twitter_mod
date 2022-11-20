import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdz implements efz
{
    public final Context D0;
    
    public bdz(final Context d0) {
        this.D0 = d0;
    }
    
    public final Object a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        bdz.D0:Landroid/content/Context;
        //     4: astore_2       
        //     5: getstatic       bez.f:Ljava/lang/Object;
        //     8: astore_1       
        //     9: getstatic       android/os/Build.TYPE:Ljava/lang/String;
        //    12: astore_3       
        //    13: getstatic       android/os/Build.TAGS:Ljava/lang/String;
        //    16: astore_1       
        //    17: aload_3        
        //    18: ldc             "eng"
        //    20: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    23: ifne            38
        //    26: aload_3        
        //    27: ldc             "userdebug"
        //    29: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    32: ifne            38
        //    35: goto            59
        //    38: aload_1        
        //    39: ldc             "dev-keys"
        //    41: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    44: ifne            66
        //    47: aload_1        
        //    48: ldc             "test-keys"
        //    50: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    53: ifeq            59
        //    56: goto            66
        //    59: getstatic       uez.D0:Luez;
        //    62: astore_1       
        //    63: goto            559
        //    66: aload_2        
        //    67: astore_1       
        //    68: invokestatic    ebz.a:()Z
        //    71: ifeq            88
        //    74: aload_2        
        //    75: astore_1       
        //    76: aload_2        
        //    77: invokevirtual   android/content/Context.isDeviceProtectedStorage:()Z
        //    80: ifne            88
        //    83: aload_2        
        //    84: invokevirtual   android/content/Context.createDeviceProtectedStorageContext:()Landroid/content/Context;
        //    87: astore_1       
        //    88: invokestatic    android/os/StrictMode.allowThreadDiskReads:()Landroid/os/StrictMode$ThreadPolicy;
        //    91: astore_3       
        //    92: invokestatic    android/os/StrictMode.allowThreadDiskWrites:()Landroid/os/StrictMode$ThreadPolicy;
        //    95: pop            
        //    96: new             Ljava/io/File;
        //    99: astore_2       
        //   100: aload_2        
        //   101: aload_1        
        //   102: ldc             "phenotype_hermetic"
        //   104: iconst_0       
        //   105: invokevirtual   android/content/Context.getDir:(Ljava/lang/String;I)Ljava/io/File;
        //   108: ldc             "overrides.txt"
        //   110: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   113: aload_2        
        //   114: invokevirtual   java/io/File.exists:()Z
        //   117: ifeq            132
        //   120: new             Lbfz;
        //   123: astore_1       
        //   124: aload_1        
        //   125: aload_2        
        //   126: invokespecial   bfz.<init>:(Ljava/lang/Object;)V
        //   129: goto            153
        //   132: getstatic       uez.D0:Luez;
        //   135: astore_1       
        //   136: goto            153
        //   139: astore_1       
        //   140: ldc             "HermeticFileOverrides"
        //   142: ldc             "no data dir"
        //   144: aload_1        
        //   145: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   148: pop            
        //   149: getstatic       uez.D0:Luez;
        //   152: astore_1       
        //   153: aload_1        
        //   154: invokevirtual   zez.b:()Z
        //   157: ifeq            551
        //   160: aload_1        
        //   161: invokevirtual   zez.a:()Ljava/lang/Object;
        //   164: checkcast       Ljava/io/File;
        //   167: astore          5
        //   169: new             Ljava/io/BufferedReader;
        //   172: astore          4
        //   174: new             Ljava/io/InputStreamReader;
        //   177: astore_1       
        //   178: new             Ljava/io/FileInputStream;
        //   181: astore_2       
        //   182: aload_2        
        //   183: aload           5
        //   185: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   188: aload_1        
        //   189: aload_2        
        //   190: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   193: aload           4
        //   195: aload_1        
        //   196: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   199: new             Ljava/util/HashMap;
        //   202: astore          6
        //   204: aload           6
        //   206: invokespecial   java/util/HashMap.<init>:()V
        //   209: new             Ljava/util/HashMap;
        //   212: astore          7
        //   214: aload           7
        //   216: invokespecial   java/util/HashMap.<init>:()V
        //   219: aload           4
        //   221: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   224: astore_1       
        //   225: aload_1        
        //   226: ifnull          434
        //   229: aload_1        
        //   230: ldc             " "
        //   232: iconst_3       
        //   233: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   236: astore          9
        //   238: aload           9
        //   240: arraylength    
        //   241: iconst_3       
        //   242: if_icmpeq       279
        //   245: new             Ljava/lang/StringBuilder;
        //   248: astore_2       
        //   249: aload_2        
        //   250: invokespecial   java/lang/StringBuilder.<init>:()V
        //   253: aload_2        
        //   254: ldc             "Invalid: "
        //   256: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   259: pop            
        //   260: aload_2        
        //   261: aload_1        
        //   262: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   265: pop            
        //   266: ldc             "HermeticFileOverrides"
        //   268: aload_2        
        //   269: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   272: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   275: pop            
        //   276: goto            219
        //   279: aload           9
        //   281: iconst_0       
        //   282: aaload         
        //   283: astore_1       
        //   284: new             Ljava/lang/String;
        //   287: astore          8
        //   289: aload           8
        //   291: aload_1        
        //   292: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   295: aload           9
        //   297: iconst_1       
        //   298: aaload         
        //   299: astore_1       
        //   300: new             Ljava/lang/String;
        //   303: astore_2       
        //   304: aload_2        
        //   305: aload_1        
        //   306: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   309: aload_2        
        //   310: invokestatic    android/net/Uri.decode:(Ljava/lang/String;)Ljava/lang/String;
        //   313: astore          10
        //   315: aload           7
        //   317: aload           9
        //   319: iconst_2       
        //   320: aaload         
        //   321: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   324: checkcast       Ljava/lang/String;
        //   327: astore_2       
        //   328: aload_2        
        //   329: astore_1       
        //   330: aload_2        
        //   331: ifnonnull       385
        //   334: aload           9
        //   336: iconst_2       
        //   337: aaload         
        //   338: astore_1       
        //   339: new             Ljava/lang/String;
        //   342: astore          9
        //   344: aload           9
        //   346: aload_1        
        //   347: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   350: aload           9
        //   352: invokestatic    android/net/Uri.decode:(Ljava/lang/String;)Ljava/lang/String;
        //   355: astore_2       
        //   356: aload_2        
        //   357: invokevirtual   java/lang/String.length:()I
        //   360: sipush          1024
        //   363: if_icmplt       374
        //   366: aload_2        
        //   367: astore_1       
        //   368: aload_2        
        //   369: aload           9
        //   371: if_acmpne       385
        //   374: aload           7
        //   376: aload           9
        //   378: aload_2        
        //   379: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   382: pop            
        //   383: aload_2        
        //   384: astore_1       
        //   385: aload           6
        //   387: aload           8
        //   389: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   392: ifne            412
        //   395: new             Ljava/util/HashMap;
        //   398: astore_2       
        //   399: aload_2        
        //   400: invokespecial   java/util/HashMap.<init>:()V
        //   403: aload           6
        //   405: aload           8
        //   407: aload_2        
        //   408: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   411: pop            
        //   412: aload           6
        //   414: aload           8
        //   416: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   419: checkcast       Ljava/util/Map;
        //   422: aload           10
        //   424: aload_1        
        //   425: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   430: pop            
        //   431: goto            219
        //   434: aload           5
        //   436: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   439: astore_2       
        //   440: new             Ljava/lang/StringBuilder;
        //   443: astore_1       
        //   444: aload_1        
        //   445: invokespecial   java/lang/StringBuilder.<init>:()V
        //   448: aload_1        
        //   449: ldc             "Parsed "
        //   451: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   454: pop            
        //   455: aload_1        
        //   456: aload_2        
        //   457: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   460: pop            
        //   461: ldc             "HermeticFileOverrides"
        //   463: aload_1        
        //   464: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   467: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   470: pop            
        //   471: new             Lacz;
        //   474: dup            
        //   475: aload           6
        //   477: invokespecial   acz.<init>:(Ljava/util/Map;)V
        //   480: astore_1       
        //   481: aload           4
        //   483: invokevirtual   java/io/BufferedReader.close:()V
        //   486: new             Lbfz;
        //   489: dup            
        //   490: aload_1        
        //   491: invokespecial   bfz.<init>:(Ljava/lang/Object;)V
        //   494: astore_1       
        //   495: goto            555
        //   498: astore_1       
        //   499: aload           4
        //   501: invokevirtual   java/io/BufferedReader.close:()V
        //   504: goto            537
        //   507: astore_2       
        //   508: ldc             Ljava/lang/Throwable;.class
        //   510: ldc             "addSuppressed"
        //   512: iconst_1       
        //   513: anewarray       Ljava/lang/Class;
        //   516: dup            
        //   517: iconst_0       
        //   518: ldc             Ljava/lang/Throwable;.class
        //   520: aastore        
        //   521: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   524: aload_1        
        //   525: iconst_1       
        //   526: anewarray       Ljava/lang/Object;
        //   529: dup            
        //   530: iconst_0       
        //   531: aload_2        
        //   532: aastore        
        //   533: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   536: pop            
        //   537: aload_1        
        //   538: athrow         
        //   539: astore_1       
        //   540: new             Ljava/lang/RuntimeException;
        //   543: astore_2       
        //   544: aload_2        
        //   545: aload_1        
        //   546: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   549: aload_2        
        //   550: athrow         
        //   551: getstatic       uez.D0:Luez;
        //   554: astore_1       
        //   555: aload_3        
        //   556: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   559: aload_1        
        //   560: areturn        
        //   561: astore_1       
        //   562: aload_3        
        //   563: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   566: aload_1        
        //   567: athrow         
        //   568: astore_2       
        //   569: goto            537
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  92     96     561    568    Any
        //  96     113    139    153    Ljava/lang/RuntimeException;
        //  96     113    561    568    Any
        //  113    129    561    568    Any
        //  132    136    561    568    Any
        //  140    153    561    568    Any
        //  153    169    561    568    Any
        //  169    199    539    551    Ljava/io/IOException;
        //  169    199    561    568    Any
        //  199    219    498    539    Any
        //  219    225    498    539    Any
        //  229    276    498    539    Any
        //  284    295    498    539    Any
        //  300    328    498    539    Any
        //  339    366    498    539    Any
        //  374    383    498    539    Any
        //  385    412    498    539    Any
        //  412    431    498    539    Any
        //  434    481    498    539    Any
        //  481    486    539    551    Ljava/io/IOException;
        //  481    486    561    568    Any
        //  486    495    561    568    Any
        //  499    504    507    537    Any
        //  508    537    568    572    Ljava/lang/Exception;
        //  508    537    561    568    Any
        //  537    539    539    551    Ljava/io/IOException;
        //  537    539    561    568    Any
        //  540    551    561    568    Any
        //  551    555    561    568    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0537:
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
