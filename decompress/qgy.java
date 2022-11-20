import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qgy implements Runnable
{
    public final List D0;
    public final b2z E0;
    public final ygy F0;
    
    public qgy(final ygy f0, final List d0, final b2z e0) {
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
        //     1: getfield        qgy.F0:Lygy;
        //     4: getfield        ygy.c:Lihy;
        //     7: astore_3       
        //     8: aload_0        
        //     9: getfield        qgy.D0:Ljava/util/List;
        //    12: astore          4
        //    14: aload_3        
        //    15: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    18: pop            
        //    19: aload           4
        //    21: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    26: astore          5
        //    28: aload           5
        //    30: invokeinterface java/util/Iterator.hasNext:()Z
        //    35: istore_2       
        //    36: iload_2        
        //    37: ifeq            79
        //    40: aload           5
        //    42: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    47: checkcast       Landroid/content/Intent;
        //    50: ldc             "split_id"
        //    52: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    55: astore          4
        //    57: aload_3        
        //    58: getfield        ihy.a:Ldxy;
        //    61: aload           4
        //    63: invokevirtual   dxy.b:(Ljava/lang/String;)Ljava/io/File;
        //    66: invokevirtual   java/io/File.exists:()Z
        //    69: istore_2       
        //    70: iload_2        
        //    71: ifne            28
        //    74: iconst_0       
        //    75: istore_1       
        //    76: goto            81
        //    79: iconst_1       
        //    80: istore_1       
        //    81: iload_1        
        //    82: ifeq            170
        //    85: aload_0        
        //    86: getfield        qgy.F0:Lygy;
        //    89: astore          4
        //    91: aload_0        
        //    92: getfield        qgy.E0:Lb2z;
        //    95: astore_3       
        //    96: aload           4
        //    98: getfield        ygy.a:Landroid/content/Context;
        //   101: invokestatic    chw.R0:(Landroid/content/Context;)Landroid/content/Context;
        //   104: iconst_1       
        //   105: invokestatic    j2r.e:(Landroid/content/Context;Z)Z
        //   108: istore_2       
        //   109: iload_2        
        //   110: ifne            132
        //   113: ldc             "SplitCompat"
        //   115: ldc             "Emulating splits failed."
        //   117: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   120: pop            
        //   121: aload_3        
        //   122: bipush          -12
        //   124: invokeinterface b2z.g:(I)V
        //   129: goto            169
        //   132: ldc             "SplitCompat"
        //   134: ldc             "Splits installed."
        //   136: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   139: pop            
        //   140: aload_3        
        //   141: invokeinterface b2z.a:()V
        //   146: goto            169
        //   149: astore          4
        //   151: ldc             "SplitCompat"
        //   153: ldc             "Error emulating splits."
        //   155: aload           4
        //   157: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   160: pop            
        //   161: aload_3        
        //   162: bipush          -12
        //   164: invokeinterface b2z.g:(I)V
        //   169: return         
        //   170: aload_0        
        //   171: getfield        qgy.F0:Lygy;
        //   174: astore          7
        //   176: aload_0        
        //   177: getfield        qgy.D0:Ljava/util/List;
        //   180: astore          8
        //   182: aload_0        
        //   183: getfield        qgy.E0:Lb2z;
        //   186: astore          5
        //   188: aload           7
        //   190: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   193: pop            
        //   194: new             Ljava/io/RandomAccessFile;
        //   197: astore          6
        //   199: aload           7
        //   201: getfield        ygy.b:Ldxy;
        //   204: astore_3       
        //   205: aload_3        
        //   206: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   209: pop            
        //   210: new             Ljava/io/File;
        //   213: astore          4
        //   215: aload           4
        //   217: aload_3        
        //   218: invokevirtual   dxy.l:()Ljava/io/File;
        //   221: ldc             "lock.tmp"
        //   223: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   226: aload           6
        //   228: aload           4
        //   230: ldc             "rw"
        //   232: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   235: aload           6
        //   237: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //   240: astore          6
        //   242: aconst_null    
        //   243: astore_3       
        //   244: aload           6
        //   246: invokevirtual   java/nio/channels/FileChannel.tryLock:()Ljava/nio/channels/FileLock;
        //   249: astore          4
        //   251: goto            263
        //   254: astore_3       
        //   255: goto            712
        //   258: astore          4
        //   260: aconst_null    
        //   261: astore          4
        //   263: aload           4
        //   265: ifnull          724
        //   268: ldc             "SplitCompat"
        //   270: ldc             "Copying splits."
        //   272: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   275: pop            
        //   276: aload           8
        //   278: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   283: astore          8
        //   285: aload           8
        //   287: invokeinterface java/util/Iterator.hasNext:()Z
        //   292: ifeq            491
        //   295: aload           8
        //   297: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   302: checkcast       Landroid/content/Intent;
        //   305: astore          9
        //   307: aload           9
        //   309: ldc             "split_id"
        //   311: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   314: astore_3       
        //   315: aload           7
        //   317: getfield        ygy.a:Landroid/content/Context;
        //   320: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   323: aload           9
        //   325: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   328: ldc             "r"
        //   330: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //   333: astore          10
        //   335: aload           7
        //   337: getfield        ygy.b:Ldxy;
        //   340: invokevirtual   dxy.a:()Ljava/io/File;
        //   343: aload_3        
        //   344: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   347: ldc             ".apk"
        //   349: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   352: invokestatic    dxy.f:(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
        //   355: astore          9
        //   357: aload           9
        //   359: invokevirtual   java/io/File.exists:()Z
        //   362: ifeq            382
        //   365: aload           9
        //   367: invokevirtual   java/io/File.length:()J
        //   370: aload           10
        //   372: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //   375: lcmp           
        //   376: ifeq            382
        //   379: goto            390
        //   382: aload           9
        //   384: invokevirtual   java/io/File.exists:()Z
        //   387: ifne            285
        //   390: aload           7
        //   392: getfield        ygy.b:Ldxy;
        //   395: aload_3        
        //   396: invokevirtual   dxy.b:(Ljava/lang/String;)Ljava/io/File;
        //   399: invokevirtual   java/io/File.exists:()Z
        //   402: ifne            285
        //   405: new             Ljava/io/BufferedInputStream;
        //   408: astore_3       
        //   409: aload_3        
        //   410: aload           10
        //   412: invokevirtual   android/content/res/AssetFileDescriptor.createInputStream:()Ljava/io/FileInputStream;
        //   415: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //   418: new             Ljava/io/FileOutputStream;
        //   421: astore          10
        //   423: aload           10
        //   425: aload           9
        //   427: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   430: sipush          4096
        //   433: newarray        B
        //   435: astore          9
        //   437: aload_3        
        //   438: aload           9
        //   440: invokevirtual   java/io/InputStream.read:([B)I
        //   443: istore_1       
        //   444: iload_1        
        //   445: ifle            460
        //   448: aload           10
        //   450: aload           9
        //   452: iconst_0       
        //   453: iload_1        
        //   454: invokevirtual   java/io/OutputStream.write:([BII)V
        //   457: goto            437
        //   460: aload           10
        //   462: invokevirtual   java/io/OutputStream.close:()V
        //   465: aload_3        
        //   466: invokevirtual   java/io/InputStream.close:()V
        //   469: goto            285
        //   472: astore          7
        //   474: aload           10
        //   476: invokevirtual   java/io/OutputStream.close:()V
        //   479: aload           7
        //   481: athrow         
        //   482: astore          7
        //   484: aload_3        
        //   485: invokevirtual   java/io/InputStream.close:()V
        //   488: aload           7
        //   490: athrow         
        //   491: ldc             "SplitCompat"
        //   493: ldc             "Splits copied."
        //   495: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   498: pop            
        //   499: aload           7
        //   501: getfield        ygy.b:Ldxy;
        //   504: invokevirtual   dxy.a:()Ljava/io/File;
        //   507: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //   510: astore_3       
        //   511: aload           7
        //   513: getfield        ygy.c:Lihy;
        //   516: aload_3        
        //   517: invokevirtual   ihy.b:([Ljava/io/File;)Z
        //   520: ifeq            642
        //   523: aload           7
        //   525: getfield        ygy.c:Lihy;
        //   528: aload_3        
        //   529: invokevirtual   ihy.a:([Ljava/io/File;)Z
        //   532: istore_2       
        //   533: iload_2        
        //   534: ifeq            642
        //   537: aload           7
        //   539: getfield        ygy.b:Ldxy;
        //   542: invokevirtual   dxy.a:()Ljava/io/File;
        //   545: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //   548: astore_3       
        //   549: aload_3        
        //   550: invokestatic    java/util/Arrays.sort:([Ljava/lang/Object;)V
        //   553: aload_3        
        //   554: arraylength    
        //   555: istore_1       
        //   556: iinc            1, -1
        //   559: iload_1        
        //   560: iflt            614
        //   563: aload_3        
        //   564: iload_1        
        //   565: aaload         
        //   566: astore          8
        //   568: aload           8
        //   570: iconst_0       
        //   571: iconst_1       
        //   572: invokevirtual   java/io/File.setWritable:(ZZ)Z
        //   575: pop            
        //   576: aload           8
        //   578: iconst_0       
        //   579: iconst_0       
        //   580: invokevirtual   java/io/File.setWritable:(ZZ)Z
        //   583: pop            
        //   584: aload_3        
        //   585: iload_1        
        //   586: aaload         
        //   587: astore          8
        //   589: aload           8
        //   591: aload           7
        //   593: getfield        ygy.b:Ldxy;
        //   596: invokevirtual   dxy.i:()Ljava/io/File;
        //   599: aload           8
        //   601: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   604: invokestatic    dxy.f:(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
        //   607: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //   610: pop            
        //   611: goto            556
        //   614: ldc             "SplitCompat"
        //   616: ldc_w           "Splits verified."
        //   619: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   622: pop            
        //   623: iconst_0       
        //   624: istore_1       
        //   625: goto            699
        //   628: astore_3       
        //   629: ldc             "SplitCompat"
        //   631: ldc_w           "Cannot write verified split."
        //   634: aload_3        
        //   635: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   638: pop            
        //   639: goto            696
        //   642: ldc             "SplitCompat"
        //   644: ldc_w           "Split verification failed."
        //   647: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   650: pop            
        //   651: goto            665
        //   654: astore_3       
        //   655: ldc             "SplitCompat"
        //   657: ldc_w           "Error verifying splits."
        //   660: aload_3        
        //   661: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   664: pop            
        //   665: bipush          -11
        //   667: istore_1       
        //   668: goto            699
        //   671: astore_3       
        //   672: ldc             "SplitCompat"
        //   674: ldc_w           "Cannot access directory for unverified splits."
        //   677: aload_3        
        //   678: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   681: pop            
        //   682: goto            696
        //   685: astore_3       
        //   686: ldc             "SplitCompat"
        //   688: ldc_w           "Error copying splits."
        //   691: aload_3        
        //   692: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   695: pop            
        //   696: bipush          -13
        //   698: istore_1       
        //   699: iload_1        
        //   700: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   703: astore_3       
        //   704: aload           4
        //   706: invokevirtual   java/nio/channels/FileLock.release:()V
        //   709: goto            724
        //   712: aload           6
        //   714: ifnull          722
        //   717: aload           6
        //   719: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   722: aload_3        
        //   723: athrow         
        //   724: aload_3        
        //   725: astore          4
        //   727: aload           6
        //   729: ifnull          761
        //   732: aload           6
        //   734: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //   737: aload_3        
        //   738: astore          4
        //   740: goto            761
        //   743: astore_3       
        //   744: ldc             "SplitCompat"
        //   746: ldc_w           "Error locking files."
        //   749: aload_3        
        //   750: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   753: pop            
        //   754: bipush          -13
        //   756: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   759: astore          4
        //   761: aload           4
        //   763: ifnonnull       769
        //   766: goto            799
        //   769: aload           4
        //   771: invokevirtual   java/lang/Integer.intValue:()I
        //   774: ifne            787
        //   777: aload           5
        //   779: invokeinterface b2z.d:()V
        //   784: goto            799
        //   787: aload           5
        //   789: aload           4
        //   791: invokevirtual   java/lang/Integer.intValue:()I
        //   794: invokeinterface b2z.g:(I)V
        //   799: return         
        //   800: astore_3       
        //   801: ldc             "SplitCompat"
        //   803: ldc_w           "Error checking verified files."
        //   806: aload_3        
        //   807: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   810: pop            
        //   811: aload_0        
        //   812: getfield        qgy.E0:Lb2z;
        //   815: bipush          -11
        //   817: invokeinterface b2z.g:(I)V
        //   822: return         
        //   823: astore          8
        //   825: goto            479
        //   828: astore_3       
        //   829: goto            488
        //   832: astore          4
        //   834: goto            722
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                            
        //  -----  -----  -----  -----  ------------------------------------------------
        //  0      28     800    823    Ljava/lang/Exception;
        //  28     36     800    823    Ljava/lang/Exception;
        //  40     70     800    823    Ljava/lang/Exception;
        //  96     109    149    169    Ljava/lang/Exception;
        //  194    242    743    761    Ljava/lang/Exception;
        //  244    251    258    263    Ljava/nio/channels/OverlappingFileLockException;
        //  244    251    254    724    Any
        //  268    285    685    696    Ljava/lang/Exception;
        //  268    285    254    724    Any
        //  285    379    685    696    Ljava/lang/Exception;
        //  285    379    254    724    Any
        //  382    390    685    696    Ljava/lang/Exception;
        //  382    390    254    724    Any
        //  390    418    685    696    Ljava/lang/Exception;
        //  390    418    254    724    Any
        //  418    430    482    491    Any
        //  430    437    472    482    Any
        //  437    444    472    482    Any
        //  448    457    472    482    Any
        //  460    465    482    491    Any
        //  465    469    685    696    Ljava/lang/Exception;
        //  465    469    254    724    Any
        //  474    479    823    828    Any
        //  479    482    482    491    Any
        //  484    488    828    832    Any
        //  488    491    685    696    Ljava/lang/Exception;
        //  488    491    254    724    Any
        //  491    499    685    696    Ljava/lang/Exception;
        //  491    499    254    724    Any
        //  499    511    671    685    Ljava/io/IOException;
        //  499    511    254    724    Any
        //  511    533    654    665    Ljava/lang/Exception;
        //  511    533    254    724    Any
        //  537    556    628    642    Ljava/io/IOException;
        //  537    556    254    724    Any
        //  568    584    628    642    Ljava/io/IOException;
        //  568    584    254    724    Any
        //  589    611    628    642    Ljava/io/IOException;
        //  589    611    254    724    Any
        //  614    623    254    724    Any
        //  629    639    254    724    Any
        //  642    651    254    724    Any
        //  655    665    254    724    Any
        //  672    682    254    724    Any
        //  686    696    254    724    Any
        //  699    709    254    724    Any
        //  717    722    832    837    Any
        //  722    724    743    761    Ljava/lang/Exception;
        //  732    737    743    761    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 386, Size: 386
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
