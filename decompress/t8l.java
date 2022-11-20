import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t8l implements Callable
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    
    public t8l(final Object e0, final Object f0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    @Override
    public final Object call() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        t8l.D0:I
        //     4: istore_1       
        //     5: iconst_0       
        //     6: istore_2       
        //     7: aconst_null    
        //     8: astore          9
        //    10: aconst_null    
        //    11: astore          10
        //    13: iload_1        
        //    14: tableswitch {
        //                0: 577
        //                1: 559
        //                2: 520
        //                3: 126
        //                4: 51
        //          default: 48
        //        }
        //    48: goto            768
        //    51: aload_0        
        //    52: getfield        t8l.E0:Ljava/lang/Object;
        //    55: checkcast       Lt21;
        //    58: astore          8
        //    60: aload_0        
        //    61: getfield        t8l.F0:Ljava/lang/Object;
        //    64: checkcast       Lulw;
        //    67: astore          10
        //    69: getstatic       ulw.Companion:Lulw$b;
        //    72: astore          9
        //    74: aload           8
        //    76: ldc             "$participants"
        //    78: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    81: aload           10
        //    83: ldc             "this$0"
        //    85: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    88: aload           8
        //    90: aload           10
        //    92: aload           8
        //    94: getfield        t21.a:Ljava/util/List;
        //    97: invokevirtual   ulw.a:(Ljava/util/List;)Ljava/util/List;
        //   100: aload           10
        //   102: aload           8
        //   104: getfield        t21.b:Ljava/util/List;
        //   107: invokevirtual   ulw.a:(Ljava/util/List;)Ljava/util/List;
        //   110: aload           10
        //   112: aload           8
        //   114: getfield        t21.c:Ljava/util/List;
        //   117: invokevirtual   ulw.a:(Ljava/util/List;)Ljava/util/List;
        //   120: bipush          8
        //   122: invokestatic    t21.a:(Lt21;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)Lt21;
        //   125: areturn        
        //   126: aload_0        
        //   127: getfield        t8l.E0:Ljava/lang/Object;
        //   130: checkcast       Lc5f;
        //   133: astore          8
        //   135: aload_0        
        //   136: getfield        t8l.F0:Ljava/lang/Object;
        //   139: checkcast       Lawg;
        //   142: astore          14
        //   144: aload           8
        //   146: ldc             "this$0"
        //   148: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //   151: aload           14
        //   153: ldc             "$mediaInfo"
        //   155: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //   158: aload           8
        //   160: getfield        c5f.c:Ls0h;
        //   163: astore          15
        //   165: aload           15
        //   167: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   170: pop            
        //   171: invokestatic    cj1.e:()V
        //   174: aload           15
        //   176: getfield        s0h.b:Lizg;
        //   179: astore          8
        //   181: aload           8
        //   183: monitorenter   
        //   184: invokestatic    cj1.e:()V
        //   187: iconst_0       
        //   188: istore_1       
        //   189: aload           8
        //   191: invokevirtual   izg.a:()Z
        //   194: istore          6
        //   196: iload           6
        //   198: ifeq            247
        //   201: sipush          250
        //   204: i2l            
        //   205: lstore          4
        //   207: lload           4
        //   209: iconst_0       
        //   210: invokestatic    java/lang/Thread.sleep:(JI)V
        //   213: iload_1        
        //   214: iconst_1       
        //   215: iadd           
        //   216: istore_3       
        //   217: iload_3        
        //   218: istore_1       
        //   219: iload_3        
        //   220: iconst_3       
        //   221: if_icmpne       189
        //   224: aload           8
        //   226: monitorexit    
        //   227: iload_2        
        //   228: istore_1       
        //   229: goto            252
        //   232: astore          11
        //   234: aload           11
        //   236: invokestatic    m8a.d:(Ljava/lang/Throwable;)V
        //   239: aload           8
        //   241: monitorexit    
        //   242: iload_2        
        //   243: istore_1       
        //   244: goto            252
        //   247: aload           8
        //   249: monitorexit    
        //   250: iconst_1       
        //   251: istore_1       
        //   252: iload_1        
        //   253: ifne            259
        //   256: goto            509
        //   259: new             Landroid/content/ContentValues;
        //   262: dup            
        //   263: invokespecial   android/content/ContentValues.<init>:()V
        //   266: astore          13
        //   268: aload           14
        //   270: getfield        awg.b:Ljava/lang/String;
        //   273: astore          12
        //   275: aload           14
        //   277: getfield        awg.a:Lm1h;
        //   280: getstatic       m1h.J0:Lm1h;
        //   283: if_acmpne       335
        //   286: getstatic       android/provider/MediaStore$Video$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   289: astore          11
        //   291: aload           13
        //   293: ldc             "description"
        //   295: aload           14
        //   297: getfield        awg.c:Ljava/lang/String;
        //   300: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   303: aload           12
        //   305: astore          8
        //   307: aload           11
        //   309: astore          9
        //   311: aload           12
        //   313: ifnonnull       381
        //   316: aload           15
        //   318: getfield        s0h.a:Landroid/content/Context;
        //   321: ldc             2131954061
        //   323: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   326: astore          8
        //   328: aload           11
        //   330: astore          9
        //   332: goto            381
        //   335: getstatic       android/provider/MediaStore$Images$Media.EXTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   338: astore          11
        //   340: aload           13
        //   342: ldc             "description"
        //   344: aload           14
        //   346: getfield        awg.c:Ljava/lang/String;
        //   349: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   352: aload           12
        //   354: astore          8
        //   356: aload           11
        //   358: astore          9
        //   360: aload           12
        //   362: ifnonnull       381
        //   365: aload           15
        //   367: getfield        s0h.a:Landroid/content/Context;
        //   370: ldc             2131954060
        //   372: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   375: astore          8
        //   377: aload           11
        //   379: astore          9
        //   381: aload           14
        //   383: invokevirtual   awg.a:()Ljava/lang/String;
        //   386: astore          11
        //   388: new             Ljava/io/File;
        //   391: dup            
        //   392: aload           11
        //   394: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   397: astore          12
        //   399: getstatic       h1e.Companion:Lh1e$a;
        //   402: aload           12
        //   404: invokevirtual   h1e$a.d:(Ljava/io/File;)Z
        //   407: ifeq            419
        //   410: aload           13
        //   412: ldc             "_data"
        //   414: aload           11
        //   416: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   419: aload           13
        //   421: ldc             "title"
        //   423: aload           8
        //   425: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   428: aload           13
        //   430: ldc             "mime_type"
        //   432: aload           14
        //   434: getfield        awg.a:Lm1h;
        //   437: getfield        m1h.E0:Ljava/lang/String;
        //   440: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   443: aload           15
        //   445: getfield        s0h.a:Landroid/content/Context;
        //   448: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   451: astore          11
        //   453: aload           10
        //   455: astore          8
        //   457: invokestatic    android/os/Environment.getExternalStorageState:()Ljava/lang/String;
        //   460: ldc             "mounted"
        //   462: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   465: ifeq            488
        //   468: aload           11
        //   470: aload           9
        //   472: aload           13
        //   474: invokevirtual   android/content/ContentResolver.insert:(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
        //   477: astore          8
        //   479: goto            488
        //   482: astore          8
        //   484: aload           10
        //   486: astore          8
        //   488: aload           8
        //   490: astore          9
        //   492: aload           8
        //   494: ifnonnull       509
        //   497: aload           11
        //   499: getstatic       android/provider/MediaStore$Images$Media.INTERNAL_CONTENT_URI:Landroid/net/Uri;
        //   502: aload           13
        //   504: invokevirtual   android/content/ContentResolver.insert:(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
        //   507: astore          9
        //   509: aload           9
        //   511: areturn        
        //   512: astore          9
        //   514: aload           8
        //   516: monitorexit    
        //   517: aload           9
        //   519: athrow         
        //   520: aload_0        
        //   521: getfield        t8l.E0:Ljava/lang/Object;
        //   524: checkcast       Landroid/content/Context;
        //   527: astore          9
        //   529: aload_0        
        //   530: getfield        t8l.F0:Ljava/lang/Object;
        //   533: checkcast       Ljw9;
        //   536: astore          8
        //   538: getstatic       myg.a:Ledq;
        //   541: astore          10
        //   543: aload           9
        //   545: aload           8
        //   547: getstatic       kyg.d:Lmoi;
        //   550: aconst_null    
        //   551: aconst_null    
        //   552: invokestatic    myg.b:(Landroid/content/Context;Ljw9;Lkyg;Lcgv;Lmyg$a;)Ljvg;
        //   555: invokestatic    ynj.b:(Ljava/lang/Object;)Lynj;
        //   558: areturn        
        //   559: aload_0        
        //   560: getfield        t8l.E0:Ljava/lang/Object;
        //   563: checkcast       Lkn1;
        //   566: aload_0        
        //   567: getfield        t8l.F0:Ljava/lang/Object;
        //   570: checkcast       Landroid/content/Context;
        //   573: invokevirtual   kn1.c:(Landroid/content/Context;)Lg3;
        //   576: areturn        
        //   577: aload_0        
        //   578: getfield        t8l.E0:Ljava/lang/Object;
        //   581: checkcast       Ld9l;
        //   584: astore          8
        //   586: aload_0        
        //   587: getfield        t8l.F0:Ljava/lang/Object;
        //   590: checkcast       Landroid/net/Uri;
        //   593: astore          9
        //   595: aload           8
        //   597: invokevirtual   u9.E4:()Landroid/content/ContentResolver;
        //   600: astore          10
        //   602: ldc             "com.android.contacts"
        //   604: aload           9
        //   606: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //   609: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   612: istore          6
        //   614: ldc             "vnd.android.cursor.item/vnd.twitter.profile"
        //   616: aload           8
        //   618: getfield        u9.L0:Landroid/content/Intent;
        //   621: aload           10
        //   623: invokevirtual   android/content/Intent.resolveType:(Landroid/content/ContentResolver;)Ljava/lang/String;
        //   626: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   629: istore          7
        //   631: iload           6
        //   633: ifeq            760
        //   636: iload           7
        //   638: ifeq            760
        //   641: aload           10
        //   643: aload           9
        //   645: iconst_1       
        //   646: anewarray       Ljava/lang/String;
        //   649: dup            
        //   650: iconst_0       
        //   651: ldc_w           "data1"
        //   654: aastore        
        //   655: aconst_null    
        //   656: aconst_null    
        //   657: aconst_null    
        //   658: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   661: astore          9
        //   663: aload           9
        //   665: ifnull          725
        //   668: aload           9
        //   670: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   675: ifeq            725
        //   678: aload           9
        //   680: iconst_0       
        //   681: invokeinterface android/database/Cursor.getLong:(I)J
        //   686: invokestatic    com/twitter/util/user/UserIdentifier.fromId:(J)Lcom/twitter/util/user/UserIdentifier;
        //   689: astore          8
        //   691: aload           9
        //   693: invokeinterface android/database/Cursor.close:()V
        //   698: goto            765
        //   701: astore          8
        //   703: aload           9
        //   705: invokeinterface android/database/Cursor.close:()V
        //   710: goto            722
        //   713: astore          9
        //   715: aload           8
        //   717: aload           9
        //   719: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   722: aload           8
        //   724: athrow         
        //   725: aload           9
        //   727: ifnull          760
        //   730: aload           9
        //   732: invokeinterface android/database/Cursor.close:()V
        //   737: goto            760
        //   740: astore          8
        //   742: goto            747
        //   745: astore          8
        //   747: aload           8
        //   749: invokestatic    m8a.d:(Ljava/lang/Throwable;)V
        //   752: getstatic       com/twitter/util/user/UserIdentifier.LOGGED_OUT:Lcom/twitter/util/user/UserIdentifier;
        //   755: astore          8
        //   757: goto            765
        //   760: getstatic       com/twitter/util/user/UserIdentifier.LOGGED_OUT:Lcom/twitter/util/user/UserIdentifier;
        //   763: astore          8
        //   765: aload           8
        //   767: areturn        
        //   768: aload_0        
        //   769: getfield        t8l.E0:Ljava/lang/Object;
        //   772: checkcast       Lw60;
        //   775: aload_0        
        //   776: getfield        t8l.F0:Ljava/lang/Object;
        //   779: checkcast       Ljava/io/File;
        //   782: invokevirtual   fa.a:(Ljava/io/File;)Z
        //   785: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   788: areturn        
        //   789: astore          9
        //   791: aload           8
        //   793: astore          9
        //   795: goto            509
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  184    187    512    520    Any
        //  189    196    512    520    Any
        //  207    213    232    247    Ljava/lang/Exception;
        //  207    213    512    520    Any
        //  234    239    512    520    Any
        //  468    479    482    488    Ljava/lang/UnsupportedOperationException;
        //  468    479    482    488    Landroid/database/sqlite/SQLiteException;
        //  468    479    482    488    Ljava/lang/IllegalStateException;
        //  468    479    482    488    Ljava/lang/IllegalArgumentException;
        //  497    509    789    798    Ljava/lang/UnsupportedOperationException;
        //  497    509    789    798    Landroid/database/sqlite/SQLiteException;
        //  497    509    789    798    Ljava/lang/IllegalStateException;
        //  641    663    745    747    Ljava/lang/SecurityException;
        //  641    663    740    745    Ljava/lang/IllegalArgumentException;
        //  668    691    701    725    Any
        //  691    698    745    747    Ljava/lang/SecurityException;
        //  691    698    740    745    Ljava/lang/IllegalArgumentException;
        //  703    710    713    722    Any
        //  715    722    745    747    Ljava/lang/SecurityException;
        //  715    722    740    745    Ljava/lang/IllegalArgumentException;
        //  722    725    745    747    Ljava/lang/SecurityException;
        //  722    725    740    745    Ljava/lang/IllegalArgumentException;
        //  730    737    745    747    Ljava/lang/SecurityException;
        //  730    737    740    745    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0509:
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
