import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

@vb8(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = { 134, 138, 160 }, m = "invokeSuspend")
public final class ijq extends l1s implements hub<f8b<Object>, mp6<? super vzv>, Object>
{
    public Set F0;
    public stb G0;
    public xp3 H0;
    public qcj I0;
    public Object J0;
    public int K0;
    public Object L0;
    public final ptb<Object> M0;
    
    public ijq(final ptb<Object> m0, final mp6<? super ijq> mp6) {
        this.M0 = m0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object l0, final mp6<?> mp6) {
        final ijq ijq = new ijq(this.M0, (mp6<? super ijq>)mp6);
        ijq.L0 = l0;
        return (mp6<vzv>)ijq;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((ijq)this.create(o, (mp6<?>)o2)).invokeSuspend(vzv.a);
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          19
        //     5: aload_0        
        //     6: getfield        ijq.K0:I
        //     9: istore_2       
        //    10: iload_2        
        //    11: ifeq            162
        //    14: iload_2        
        //    15: iconst_1       
        //    16: if_icmpeq       105
        //    19: iload_2        
        //    20: iconst_2       
        //    21: if_icmpeq       42
        //    24: iload_2        
        //    25: iconst_3       
        //    26: if_icmpne       32
        //    29: goto            105
        //    32: new             Ljava/lang/IllegalStateException;
        //    35: dup            
        //    36: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    38: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    41: athrow         
        //    42: aload_0        
        //    43: getfield        ijq.J0:Ljava/lang/Object;
        //    46: astore          7
        //    48: aload_0        
        //    49: getfield        ijq.I0:Lqcj;
        //    52: astore          5
        //    54: aload_0        
        //    55: getfield        ijq.H0:Lxp3;
        //    58: astore          8
        //    60: aload_0        
        //    61: getfield        ijq.G0:Lstb;
        //    64: astore          9
        //    66: aload_0        
        //    67: getfield        ijq.F0:Ljava/util/Set;
        //    70: astore          10
        //    72: aload_0        
        //    73: getfield        ijq.L0:Ljava/lang/Object;
        //    76: checkcast       Lf8b;
        //    79: astore          11
        //    81: aload           5
        //    83: astore          4
        //    85: aload_1        
        //    86: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //    89: aload_1        
        //    90: astore          4
        //    92: aload_0        
        //    93: astore          12
        //    95: aload           5
        //    97: astore_1       
        //    98: aload           4
        //   100: astore          5
        //   102: goto            522
        //   105: aload_0        
        //   106: getfield        ijq.J0:Ljava/lang/Object;
        //   109: astore          10
        //   111: aload_0        
        //   112: getfield        ijq.I0:Lqcj;
        //   115: astore          5
        //   117: aload_0        
        //   118: getfield        ijq.H0:Lxp3;
        //   121: astore          9
        //   123: aload_0        
        //   124: getfield        ijq.G0:Lstb;
        //   127: astore          6
        //   129: aload_0        
        //   130: getfield        ijq.F0:Ljava/util/Set;
        //   133: astore          7
        //   135: aload_0        
        //   136: getfield        ijq.L0:Ljava/lang/Object;
        //   139: checkcast       Lf8b;
        //   142: astore          8
        //   144: aload           5
        //   146: astore          4
        //   148: aload_1        
        //   149: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //   152: aload           10
        //   154: astore_1       
        //   155: aload           9
        //   157: astore          4
        //   159: goto            368
        //   162: aload_1        
        //   163: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //   166: aload_0        
        //   167: getfield        ijq.L0:Ljava/lang/Object;
        //   170: checkcast       Lf8b;
        //   173: astore          8
        //   175: new             Ljava/util/LinkedHashSet;
        //   178: dup            
        //   179: invokespecial   java/util/LinkedHashSet.<init>:()V
        //   182: astore          7
        //   184: new             Lijq$a;
        //   187: dup            
        //   188: aload           7
        //   190: invokespecial   ijq$a.<init>:(Ljava/util/Set;)V
        //   193: astore          6
        //   195: ldc             2147483647
        //   197: aconst_null    
        //   198: bipush          6
        //   200: invokestatic    eg8.b:(ILmr2;I)Lxp3;
        //   203: astore          9
        //   205: getstatic       piq.Companion:Lpiq$a;
        //   208: new             Lijq$b;
        //   211: dup            
        //   212: aload           9
        //   214: invokespecial   ijq$b.<init>:(Lxp3;)V
        //   217: invokevirtual   piq$a.d:(Lhub;)Lqcj;
        //   220: astore          5
        //   222: aload           5
        //   224: astore          4
        //   226: invokestatic    uiq.j:()Lpiq;
        //   229: aload           6
        //   231: invokevirtual   piq.s:(Lstb;)Lpiq;
        //   234: astore          10
        //   236: aload           5
        //   238: astore          4
        //   240: aload_0        
        //   241: getfield        ijq.M0:Lptb;
        //   244: astore_1       
        //   245: aload           10
        //   247: invokevirtual   piq.i:()Lpiq;
        //   250: astore          4
        //   252: aload_1        
        //   253: invokeinterface ptb.invoke:()Ljava/lang/Object;
        //   258: astore_1       
        //   259: aload           10
        //   261: aload           4
        //   263: invokevirtual   piq.p:(Lpiq;)V
        //   266: aload           5
        //   268: astore          4
        //   270: aload           10
        //   272: invokevirtual   piq.c:()V
        //   275: aload           5
        //   277: astore          4
        //   279: aload_0        
        //   280: aload           8
        //   282: putfield        ijq.L0:Ljava/lang/Object;
        //   285: aload           5
        //   287: astore          4
        //   289: aload_0        
        //   290: aload           7
        //   292: putfield        ijq.F0:Ljava/util/Set;
        //   295: aload           5
        //   297: astore          4
        //   299: aload_0        
        //   300: aload           6
        //   302: putfield        ijq.G0:Lstb;
        //   305: aload           5
        //   307: astore          4
        //   309: aload_0        
        //   310: aload           9
        //   312: putfield        ijq.H0:Lxp3;
        //   315: aload           5
        //   317: astore          4
        //   319: aload_0        
        //   320: aload           5
        //   322: putfield        ijq.I0:Lqcj;
        //   325: aload           5
        //   327: astore          4
        //   329: aload_0        
        //   330: aload_1        
        //   331: putfield        ijq.J0:Ljava/lang/Object;
        //   334: aload           5
        //   336: astore          4
        //   338: aload_0        
        //   339: iconst_1       
        //   340: putfield        ijq.K0:I
        //   343: aload           5
        //   345: astore          4
        //   347: aload           8
        //   349: aload_1        
        //   350: aload_0        
        //   351: invokeinterface f8b.a:(Ljava/lang/Object;Lmp6;)Ljava/lang/Object;
        //   356: aload           19
        //   358: if_acmpne       364
        //   361: aload           19
        //   363: areturn        
        //   364: aload           9
        //   366: astore          4
        //   368: aload_0        
        //   369: astore          13
        //   371: aload           8
        //   373: astore          14
        //   375: aload           7
        //   377: astore          15
        //   379: aload           6
        //   381: astore          16
        //   383: aload           4
        //   385: astore          17
        //   387: aload_1        
        //   388: astore          6
        //   390: aload           5
        //   392: astore          4
        //   394: aload           13
        //   396: aload           14
        //   398: putfield        ijq.L0:Ljava/lang/Object;
        //   401: aload           5
        //   403: astore          4
        //   405: aload           13
        //   407: aload           15
        //   409: putfield        ijq.F0:Ljava/util/Set;
        //   412: aload           5
        //   414: astore          4
        //   416: aload           13
        //   418: aload           16
        //   420: putfield        ijq.G0:Lstb;
        //   423: aload           5
        //   425: astore          4
        //   427: aload           13
        //   429: aload           17
        //   431: putfield        ijq.H0:Lxp3;
        //   434: aload           5
        //   436: astore          4
        //   438: aload           13
        //   440: aload           5
        //   442: putfield        ijq.I0:Lqcj;
        //   445: aload           5
        //   447: astore          4
        //   449: aload           13
        //   451: aload           6
        //   453: putfield        ijq.J0:Ljava/lang/Object;
        //   456: aload           5
        //   458: astore          4
        //   460: aload           13
        //   462: iconst_2       
        //   463: putfield        ijq.K0:I
        //   466: aload           5
        //   468: astore          4
        //   470: aload           17
        //   472: aload           13
        //   474: invokeinterface r3m.n:(Lmp6;)Ljava/lang/Object;
        //   479: astore          18
        //   481: aload           6
        //   483: astore          7
        //   485: aload           5
        //   487: astore_1       
        //   488: aload           17
        //   490: astore          8
        //   492: aload           16
        //   494: astore          9
        //   496: aload           15
        //   498: astore          10
        //   500: aload           14
        //   502: astore          11
        //   504: aload           13
        //   506: astore          12
        //   508: aload           18
        //   510: astore          5
        //   512: aload           18
        //   514: aload           19
        //   516: if_acmpne       522
        //   519: aload           19
        //   521: areturn        
        //   522: aload_1        
        //   523: astore          4
        //   525: aload           5
        //   527: checkcast       Ljava/util/Set;
        //   530: astore          5
        //   532: iconst_0       
        //   533: istore_3       
        //   534: iload_3        
        //   535: ifne            702
        //   538: aload_1        
        //   539: astore          4
        //   541: aload           10
        //   543: invokeinterface java/util/Set.size:()I
        //   548: aload           5
        //   550: invokeinterface java/util/Set.size:()I
        //   555: if_icmpge       622
        //   558: aload_1        
        //   559: astore          4
        //   561: aload           10
        //   563: invokeinterface java/util/Collection.isEmpty:()Z
        //   568: ifeq            574
        //   571: goto            688
        //   574: aload_1        
        //   575: astore          4
        //   577: aload           10
        //   579: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   584: astore          6
        //   586: aload_1        
        //   587: astore          4
        //   589: aload           6
        //   591: invokeinterface java/util/Iterator.hasNext:()Z
        //   596: ifeq            688
        //   599: aload_1        
        //   600: astore          4
        //   602: aload           5
        //   604: aload           6
        //   606: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   611: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   616: ifeq            586
        //   619: goto            683
        //   622: aload_1        
        //   623: astore          4
        //   625: aload           5
        //   627: invokeinterface java/util/Collection.isEmpty:()Z
        //   632: ifeq            638
        //   635: goto            688
        //   638: aload_1        
        //   639: astore          4
        //   641: aload           5
        //   643: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   648: astore          5
        //   650: aload_1        
        //   651: astore          4
        //   653: aload           5
        //   655: invokeinterface java/util/Iterator.hasNext:()Z
        //   660: ifeq            688
        //   663: aload_1        
        //   664: astore          4
        //   666: aload           10
        //   668: aload           5
        //   670: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   675: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   680: ifeq            650
        //   683: iconst_1       
        //   684: istore_2       
        //   685: goto            690
        //   688: iconst_0       
        //   689: istore_2       
        //   690: iload_2        
        //   691: ifeq            697
        //   694: goto            702
        //   697: iconst_0       
        //   698: istore_2       
        //   699: goto            704
        //   702: iconst_1       
        //   703: istore_2       
        //   704: aload_1        
        //   705: astore          4
        //   707: aload           8
        //   709: invokeinterface r3m.s:()Ljava/lang/Object;
        //   714: invokestatic    xq3.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   717: checkcast       Ljava/util/Set;
        //   720: astore          6
        //   722: aload           6
        //   724: astore          5
        //   726: iload_2        
        //   727: istore_3       
        //   728: aload           6
        //   730: ifnonnull       534
        //   733: aload           7
        //   735: astore          6
        //   737: aload_1        
        //   738: astore          5
        //   740: aload           8
        //   742: astore          17
        //   744: aload           9
        //   746: astore          16
        //   748: aload           10
        //   750: astore          15
        //   752: aload           11
        //   754: astore          14
        //   756: aload           12
        //   758: astore          13
        //   760: iload_2        
        //   761: ifeq            390
        //   764: aload_1        
        //   765: astore          4
        //   767: aload           10
        //   769: invokeinterface java/util/Set.clear:()V
        //   774: aload_1        
        //   775: astore          4
        //   777: getstatic       piq.Companion:Lpiq$a;
        //   780: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   783: pop            
        //   784: aload_1        
        //   785: astore          4
        //   787: invokestatic    uiq.j:()Lpiq;
        //   790: aload           9
        //   792: invokevirtual   piq.s:(Lstb;)Lpiq;
        //   795: astore          5
        //   797: aload_1        
        //   798: astore          4
        //   800: aload           12
        //   802: getfield        ijq.M0:Lptb;
        //   805: astore          6
        //   807: aload           5
        //   809: invokevirtual   piq.i:()Lpiq;
        //   812: astore          4
        //   814: aload           6
        //   816: invokeinterface ptb.invoke:()Ljava/lang/Object;
        //   821: astore          18
        //   823: aload           5
        //   825: aload           4
        //   827: invokevirtual   piq.p:(Lpiq;)V
        //   830: aload_1        
        //   831: astore          4
        //   833: aload           5
        //   835: invokevirtual   piq.c:()V
        //   838: aload           7
        //   840: astore          6
        //   842: aload_1        
        //   843: astore          5
        //   845: aload           8
        //   847: astore          17
        //   849: aload           9
        //   851: astore          16
        //   853: aload           10
        //   855: astore          15
        //   857: aload           11
        //   859: astore          14
        //   861: aload           12
        //   863: astore          13
        //   865: aload_1        
        //   866: astore          4
        //   868: aload           18
        //   870: aload           7
        //   872: invokestatic    e0e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   875: ifne            390
        //   878: aload_1        
        //   879: astore          4
        //   881: aload           12
        //   883: aload           11
        //   885: putfield        ijq.L0:Ljava/lang/Object;
        //   888: aload_1        
        //   889: astore          4
        //   891: aload           12
        //   893: aload           10
        //   895: putfield        ijq.F0:Ljava/util/Set;
        //   898: aload_1        
        //   899: astore          4
        //   901: aload           12
        //   903: aload           9
        //   905: putfield        ijq.G0:Lstb;
        //   908: aload_1        
        //   909: astore          4
        //   911: aload           12
        //   913: aload           8
        //   915: putfield        ijq.H0:Lxp3;
        //   918: aload_1        
        //   919: astore          4
        //   921: aload           12
        //   923: aload_1        
        //   924: putfield        ijq.I0:Lqcj;
        //   927: aload_1        
        //   928: astore          4
        //   930: aload           12
        //   932: aload           18
        //   934: putfield        ijq.J0:Ljava/lang/Object;
        //   937: aload_1        
        //   938: astore          4
        //   940: aload           12
        //   942: iconst_3       
        //   943: putfield        ijq.K0:I
        //   946: aload_1        
        //   947: astore          4
        //   949: aload           11
        //   951: aload           18
        //   953: aload           12
        //   955: invokeinterface f8b.a:(Ljava/lang/Object;Lmp6;)Ljava/lang/Object;
        //   960: astore          5
        //   962: aload           5
        //   964: aload           19
        //   966: if_acmpne       972
        //   969: aload           19
        //   971: areturn        
        //   972: aload           18
        //   974: astore          6
        //   976: aload_1        
        //   977: astore          5
        //   979: aload           8
        //   981: astore          17
        //   983: aload           9
        //   985: astore          16
        //   987: aload           10
        //   989: astore          15
        //   991: aload           11
        //   993: astore          14
        //   995: aload           12
        //   997: astore          13
        //   999: goto            390
        //  1002: astore_1       
        //  1003: goto            1060
        //  1006: astore          6
        //  1008: aload           5
        //  1010: aload           4
        //  1012: invokevirtual   piq.p:(Lpiq;)V
        //  1015: aload           6
        //  1017: athrow         
        //  1018: astore          6
        //  1020: aload_1        
        //  1021: astore          4
        //  1023: aload           5
        //  1025: invokevirtual   piq.c:()V
        //  1028: aload_1        
        //  1029: astore          4
        //  1031: aload           6
        //  1033: athrow         
        //  1034: astore_1       
        //  1035: aload           10
        //  1037: aload           4
        //  1039: invokevirtual   piq.p:(Lpiq;)V
        //  1042: aload_1        
        //  1043: athrow         
        //  1044: astore_1       
        //  1045: aload           5
        //  1047: astore          4
        //  1049: aload           10
        //  1051: invokevirtual   piq.c:()V
        //  1054: aload           5
        //  1056: astore          4
        //  1058: aload_1        
        //  1059: athrow         
        //  1060: aload           4
        //  1062: invokeinterface qcj.dispose:()V
        //  1067: aload_1        
        //  1068: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  85     89     1002   1006   Any
        //  148    152    1002   1006   Any
        //  226    236    1002   1006   Any
        //  240    245    1002   1006   Any
        //  245    252    1044   1060   Any
        //  252    259    1034   1044   Any
        //  259    266    1044   1060   Any
        //  270    275    1002   1006   Any
        //  279    285    1002   1006   Any
        //  289    295    1002   1006   Any
        //  299    305    1002   1006   Any
        //  309    315    1002   1006   Any
        //  319    325    1002   1006   Any
        //  329    334    1002   1006   Any
        //  338    343    1002   1006   Any
        //  347    361    1002   1006   Any
        //  394    401    1002   1006   Any
        //  405    412    1002   1006   Any
        //  416    423    1002   1006   Any
        //  427    434    1002   1006   Any
        //  438    445    1002   1006   Any
        //  449    456    1002   1006   Any
        //  460    466    1002   1006   Any
        //  470    481    1002   1006   Any
        //  525    532    1002   1006   Any
        //  541    558    1002   1006   Any
        //  561    571    1002   1006   Any
        //  577    586    1002   1006   Any
        //  589    599    1002   1006   Any
        //  602    619    1002   1006   Any
        //  625    635    1002   1006   Any
        //  641    650    1002   1006   Any
        //  653    663    1002   1006   Any
        //  666    683    1002   1006   Any
        //  707    722    1002   1006   Any
        //  767    774    1002   1006   Any
        //  777    784    1002   1006   Any
        //  787    797    1002   1006   Any
        //  800    807    1002   1006   Any
        //  807    814    1018   1034   Any
        //  814    823    1006   1018   Any
        //  823    830    1018   1034   Any
        //  833    838    1002   1006   Any
        //  868    878    1002   1006   Any
        //  881    888    1002   1006   Any
        //  891    898    1002   1006   Any
        //  901    908    1002   1006   Any
        //  911    918    1002   1006   Any
        //  921    927    1002   1006   Any
        //  930    937    1002   1006   Any
        //  940    946    1002   1006   Any
        //  949    962    1002   1006   Any
        //  1008   1018   1018   1034   Any
        //  1023   1028   1002   1006   Any
        //  1031   1034   1002   1006   Any
        //  1035   1044   1044   1060   Any
        //  1049   1054   1002   1006   Any
        //  1058   1060   1002   1006   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0364:
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
