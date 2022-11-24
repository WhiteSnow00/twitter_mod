// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = { 236, 238, 240, 248, 250, 254 }, m = "invokeSuspend")
public final class gd9 extends l1s implements hub<iz6, mp6<? super vzv>, Object>
{
    public e8m F0;
    public e8m G0;
    public int H0;
    public Object I0;
    public final xp3<jc9> J0;
    public final jd9 K0;
    public final l9r<pc9> L0;
    public final dpj M0;
    
    public gd9(final xp3<jc9> j0, final jd9 k0, final l9r<pc9> l0, final dpj m0, final mp6<? super gd9> mp6) {
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object i0, final mp6<?> mp6) {
        final gd9 gd9 = new gd9(this.J0, this.K0, this.L0, this.M0, (mp6<? super gd9>)mp6);
        gd9.I0 = i0;
        return (mp6<vzv>)gd9;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((gd9)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        gd9.H0:I
        //     8: tableswitch {
        //                0: 210
        //                1: 175
        //                2: 146
        //                3: 96
        //                4: 79
        //                5: 79
        //                6: 62
        //          default: 52
        //        }
        //    52: new             Ljava/lang/IllegalStateException;
        //    55: dup            
        //    56: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    58: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    61: athrow         
        //    62: aload_0        
        //    63: getfield        gd9.I0:Ljava/lang/Object;
        //    66: checkcast       Liz6;
        //    69: astore_3       
        //    70: aload_1        
        //    71: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //    74: aload_3        
        //    75: astore_1       
        //    76: goto            222
        //    79: aload_0        
        //    80: getfield        gd9.I0:Ljava/lang/Object;
        //    83: checkcast       Liz6;
        //    86: astore_3       
        //    87: aload_1        
        //    88: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //    91: aload_3        
        //    92: astore_1       
        //    93: goto            222
        //    96: aload_0        
        //    97: getfield        gd9.F0:Le8m;
        //   100: astore          5
        //   102: aload_0        
        //   103: getfield        gd9.I0:Ljava/lang/Object;
        //   106: checkcast       Liz6;
        //   109: astore_3       
        //   110: aload_1        
        //   111: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //   114: aload_0        
        //   115: astore          4
        //   117: aload_3        
        //   118: astore_1       
        //   119: aload           5
        //   121: astore_3       
        //   122: aload_2        
        //   123: astore          5
        //   125: aload_1        
        //   126: astore          6
        //   128: goto            478
        //   131: astore_1       
        //   132: aload_3        
        //   133: astore_1       
        //   134: aload_0        
        //   135: astore          4
        //   137: aload_2        
        //   138: astore          5
        //   140: aload_1        
        //   141: astore          6
        //   143: goto            640
        //   146: aload_0        
        //   147: getfield        gd9.F0:Le8m;
        //   150: astore          5
        //   152: aload_0        
        //   153: getfield        gd9.I0:Ljava/lang/Object;
        //   156: checkcast       Liz6;
        //   159: astore          4
        //   161: aload_1        
        //   162: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //   165: aload_2        
        //   166: astore_3       
        //   167: aload_0        
        //   168: astore_2       
        //   169: aload           4
        //   171: astore_1       
        //   172: goto            392
        //   175: aload_0        
        //   176: getfield        gd9.G0:Le8m;
        //   179: astore          6
        //   181: aload_0        
        //   182: getfield        gd9.F0:Le8m;
        //   185: astore          5
        //   187: aload_0        
        //   188: getfield        gd9.I0:Ljava/lang/Object;
        //   191: checkcast       Liz6;
        //   194: astore          4
        //   196: aload_1        
        //   197: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //   200: aload_2        
        //   201: astore_3       
        //   202: aload_0        
        //   203: astore_2       
        //   204: aload_1        
        //   205: astore          7
        //   207: goto            305
        //   210: aload_1        
        //   211: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //   214: aload_0        
        //   215: getfield        gd9.I0:Ljava/lang/Object;
        //   218: checkcast       Liz6;
        //   221: astore_1       
        //   222: aload_0        
        //   223: astore_3       
        //   224: aload_1        
        //   225: astore          4
        //   227: aload_3        
        //   228: astore_1       
        //   229: aload           4
        //   231: astore_3       
        //   232: aload_3        
        //   233: invokestatic    r1n.R:(Liz6;)Z
        //   236: ifeq            706
        //   239: new             Le8m;
        //   242: dup            
        //   243: invokespecial   e8m.<init>:()V
        //   246: astore          5
        //   248: aload_1        
        //   249: getfield        gd9.J0:Lxp3;
        //   252: astore          4
        //   254: aload_1        
        //   255: aload_3        
        //   256: putfield        gd9.I0:Ljava/lang/Object;
        //   259: aload_1        
        //   260: aload           5
        //   262: putfield        gd9.F0:Le8m;
        //   265: aload_1        
        //   266: aload           5
        //   268: putfield        gd9.G0:Le8m;
        //   271: aload_1        
        //   272: iconst_1       
        //   273: putfield        gd9.H0:I
        //   276: aload           4
        //   278: aload_1        
        //   279: invokeinterface r3m.n:(Lmp6;)Ljava/lang/Object;
        //   284: astore          7
        //   286: aload           7
        //   288: aload_2        
        //   289: if_acmpne       294
        //   292: aload_2        
        //   293: areturn        
        //   294: aload           5
        //   296: astore          6
        //   298: aload_3        
        //   299: astore          4
        //   301: aload_2        
        //   302: astore_3       
        //   303: aload_1        
        //   304: astore_2       
        //   305: aload           6
        //   307: aload           7
        //   309: putfield        e8m.F0:Ljava/lang/Object;
        //   312: aload           5
        //   314: getfield        e8m.F0:Ljava/lang/Object;
        //   317: instanceof      Ljc9$c;
        //   320: ifeq            696
        //   323: aload_2        
        //   324: getfield        gd9.L0:Ll9r;
        //   327: invokestatic    id9$a.a:(Ll9r;)Lpc9;
        //   330: astore_1       
        //   331: aload           5
        //   333: getfield        e8m.F0:Ljava/lang/Object;
        //   336: astore          6
        //   338: aload           6
        //   340: ldc             "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStarted"
        //   342: invokestatic    e0e.d:(Ljava/lang/Object;Ljava/lang/String;)V
        //   345: aload           6
        //   347: checkcast       Ljc9$c;
        //   350: astore          6
        //   352: aload_2        
        //   353: aload           4
        //   355: putfield        gd9.I0:Ljava/lang/Object;
        //   358: aload_2        
        //   359: aload           5
        //   361: putfield        gd9.F0:Le8m;
        //   364: aload_2        
        //   365: aconst_null    
        //   366: putfield        gd9.G0:Le8m;
        //   369: aload_2        
        //   370: iconst_2       
        //   371: putfield        gd9.H0:I
        //   374: aload_1        
        //   375: aload           4
        //   377: aload           6
        //   379: aload_2        
        //   380: invokevirtual   pc9.b:(Liz6;Ljc9$c;Lmp6;)Ljava/lang/Object;
        //   383: aload_3        
        //   384: if_acmpne       389
        //   387: aload_3        
        //   388: areturn        
        //   389: aload           4
        //   391: astore_1       
        //   392: aload_2        
        //   393: getfield        gd9.K0:Ljd9;
        //   396: astore          6
        //   398: getstatic       jvh.G0:Ljvh;
        //   401: astore          4
        //   403: new             Lgd9$a;
        //   406: astore          7
        //   408: aload           7
        //   410: aload           5
        //   412: aload_2        
        //   413: getfield        gd9.J0:Lxp3;
        //   416: aload_2        
        //   417: getfield        gd9.M0:Ldpj;
        //   420: aconst_null    
        //   421: invokespecial   gd9$a.<init>:(Le8m;Lxp3;Ldpj;Lmp6;)V
        //   424: aload_2        
        //   425: aload_1        
        //   426: putfield        gd9.I0:Ljava/lang/Object;
        //   429: aload_2        
        //   430: aload           5
        //   432: putfield        gd9.F0:Le8m;
        //   435: aload_2        
        //   436: iconst_3       
        //   437: putfield        gd9.H0:I
        //   440: aload           6
        //   442: aload           4
        //   444: aload           7
        //   446: aload_2        
        //   447: invokeinterface jd9.a:(Ljvh;Lhub;Lmp6;)Ljava/lang/Object;
        //   452: astore          4
        //   454: aload           4
        //   456: aload_3        
        //   457: if_acmpne       462
        //   460: aload_3        
        //   461: areturn        
        //   462: aload           5
        //   464: astore          4
        //   466: aload_3        
        //   467: astore          5
        //   469: aload           4
        //   471: astore_3       
        //   472: aload_2        
        //   473: astore          4
        //   475: goto            125
        //   478: aload           4
        //   480: getfield        gd9.L0:Ll9r;
        //   483: invokestatic    id9$a.a:(Ll9r;)Lpc9;
        //   486: astore          7
        //   488: aload_3        
        //   489: getfield        e8m.F0:Ljava/lang/Object;
        //   492: astore          8
        //   494: aload           8
        //   496: instanceof      Ljc9$d;
        //   499: ifeq            563
        //   502: aload           8
        //   504: ldc             "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"
        //   506: invokestatic    e0e.d:(Ljava/lang/Object;Ljava/lang/String;)V
        //   509: aload           8
        //   511: checkcast       Ljc9$d;
        //   514: astore          8
        //   516: aload           4
        //   518: aload           6
        //   520: putfield        gd9.I0:Ljava/lang/Object;
        //   523: aload           4
        //   525: aconst_null    
        //   526: putfield        gd9.F0:Le8m;
        //   529: aload           4
        //   531: iconst_4       
        //   532: putfield        gd9.H0:I
        //   535: aload           5
        //   537: astore_2       
        //   538: aload           6
        //   540: astore_3       
        //   541: aload           4
        //   543: astore_1       
        //   544: aload           7
        //   546: aload           6
        //   548: aload           8
        //   550: aload           4
        //   552: invokevirtual   pc9.c:(Liz6;Ljc9$d;Lmp6;)Ljava/lang/Object;
        //   555: aload           5
        //   557: if_acmpne       232
        //   560: aload           5
        //   562: areturn        
        //   563: aload           5
        //   565: astore_2       
        //   566: aload           6
        //   568: astore_3       
        //   569: aload           4
        //   571: astore_1       
        //   572: aload           8
        //   574: instanceof      Ljc9$a;
        //   577: ifeq            232
        //   580: aload           4
        //   582: aload           6
        //   584: putfield        gd9.I0:Ljava/lang/Object;
        //   587: aload           4
        //   589: aconst_null    
        //   590: putfield        gd9.F0:Le8m;
        //   593: aload           4
        //   595: iconst_5       
        //   596: putfield        gd9.H0:I
        //   599: aload           7
        //   601: aload           6
        //   603: aload           4
        //   605: invokevirtual   pc9.a:(Liz6;Lmp6;)Ljava/lang/Object;
        //   608: astore          7
        //   610: aload           5
        //   612: astore_2       
        //   613: aload           6
        //   615: astore_3       
        //   616: aload           4
        //   618: astore_1       
        //   619: aload           7
        //   621: aload           5
        //   623: if_acmpne       232
        //   626: aload           5
        //   628: areturn        
        //   629: astore          4
        //   631: aload_2        
        //   632: astore          4
        //   634: aload_1        
        //   635: astore          6
        //   637: aload_3        
        //   638: astore          5
        //   640: aload           4
        //   642: getfield        gd9.L0:Ll9r;
        //   645: invokestatic    id9$a.a:(Ll9r;)Lpc9;
        //   648: astore          7
        //   650: aload           4
        //   652: aload           6
        //   654: putfield        gd9.I0:Ljava/lang/Object;
        //   657: aload           4
        //   659: aconst_null    
        //   660: putfield        gd9.F0:Le8m;
        //   663: aload           4
        //   665: bipush          6
        //   667: putfield        gd9.H0:I
        //   670: aload           5
        //   672: astore_2       
        //   673: aload           6
        //   675: astore_3       
        //   676: aload           4
        //   678: astore_1       
        //   679: aload           7
        //   681: aload           6
        //   683: aload           4
        //   685: invokevirtual   pc9.a:(Liz6;Lmp6;)Ljava/lang/Object;
        //   688: aload           5
        //   690: if_acmpne       232
        //   693: aload           5
        //   695: areturn        
        //   696: aload_2        
        //   697: astore_1       
        //   698: aload_3        
        //   699: astore_2       
        //   700: aload           4
        //   702: astore_3       
        //   703: goto            232
        //   706: getstatic       vzv.a:Lvzv;
        //   709: areturn        
        //   710: astore_1       
        //   711: aload_3        
        //   712: astore_1       
        //   713: goto            134
        //   716: astore_1       
        //   717: goto            640
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  87     91     710    716    Ljava/util/concurrent/CancellationException;
        //  110    114    131    134    Ljava/util/concurrent/CancellationException;
        //  392    454    629    640    Ljava/util/concurrent/CancellationException;
        //  478    535    716    720    Ljava/util/concurrent/CancellationException;
        //  544    560    716    720    Ljava/util/concurrent/CancellationException;
        //  572    610    716    720    Ljava/util/concurrent/CancellationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0478:
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
