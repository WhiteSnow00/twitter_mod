import java.util.concurrent.CancellationException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wv0 implements l9r<Object>
{
    public final List<jkb> F0;
    public final fnv G0;
    public final uw0 H0;
    public final stb<inv$b, vzv> I0;
    public final aik J0;
    public final wwj K0;
    public boolean L0;
    
    public wv0(final List<? extends jkb> f0, final Object o, final fnv g0, final uw0 h0, final stb<? super inv$b, vzv> i0, final aik j0) {
        e0e.f(o, "initialType");
        e0e.f((Object)h0, "asyncTypefaceCache");
        e0e.f((Object)i0, "onCompletion");
        this.F0 = (List<jkb>)f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (stb<inv$b, vzv>)i0;
        this.J0 = j0;
        this.K0 = (wwj)zzz.W(o);
        this.L0 = true;
    }
    
    public final Object e(final mp6<? super vzv> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lwv0$a;
        //     4: ifeq            41
        //     7: aload_1        
        //     8: checkcast       Lwv0$a;
        //    11: astore          8
        //    13: aload           8
        //    15: getfield        wv0$a.M0:I
        //    18: istore_2       
        //    19: iload_2        
        //    20: ldc             -2147483648
        //    22: iand           
        //    23: ifeq            41
        //    26: aload           8
        //    28: iload_2        
        //    29: ldc             -2147483648
        //    31: iadd           
        //    32: putfield        wv0$a.M0:I
        //    35: aload           8
        //    37: astore_1       
        //    38: goto            51
        //    41: new             Lwv0$a;
        //    44: dup            
        //    45: aload_0        
        //    46: aload_1        
        //    47: invokespecial   wv0$a.<init>:(Lwv0;Lmp6;)V
        //    50: astore_1       
        //    51: aload_1        
        //    52: getfield        wv0$a.K0:Ljava/lang/Object;
        //    55: astore          13
        //    57: getstatic       jz6.F0:Ljz6;
        //    60: astore          15
        //    62: aload_1        
        //    63: getfield        wv0$a.M0:I
        //    66: istore_2       
        //    67: iload_2        
        //    68: ifeq            183
        //    71: iload_2        
        //    72: iconst_1       
        //    73: if_icmpeq       126
        //    76: iload_2        
        //    77: iconst_2       
        //    78: if_icmpne       116
        //    81: aload_1        
        //    82: getfield        wv0$a.J0:I
        //    85: istore_3       
        //    86: aload_1        
        //    87: getfield        wv0$a.I0:I
        //    90: istore_2       
        //    91: aload_1        
        //    92: getfield        wv0$a.G0:Ljava/util/List;
        //    95: astore          11
        //    97: aload_1        
        //    98: getfield        wv0$a.F0:Lwv0;
        //   101: astore          8
        //   103: aload           13
        //   105: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //   108: goto            598
        //   111: astore          9
        //   113: goto            693
        //   116: new             Ljava/lang/IllegalStateException;
        //   119: dup            
        //   120: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   122: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   125: athrow         
        //   126: aload_1        
        //   127: getfield        wv0$a.J0:I
        //   130: istore_3       
        //   131: aload_1        
        //   132: getfield        wv0$a.I0:I
        //   135: istore_2       
        //   136: aload_1        
        //   137: getfield        wv0$a.H0:Ljkb;
        //   140: astore          12
        //   142: aload_1        
        //   143: getfield        wv0$a.G0:Ljava/util/List;
        //   146: astore          11
        //   148: aload_1        
        //   149: getfield        wv0$a.F0:Lwv0;
        //   152: astore          8
        //   154: aload_1        
        //   155: astore          9
        //   157: aload           8
        //   159: astore          10
        //   161: aload           13
        //   163: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //   166: goto            372
        //   169: aload           10
        //   171: astore          8
        //   173: aload           9
        //   175: astore_1       
        //   176: aload           11
        //   178: astore          9
        //   180: goto            693
        //   183: aload           13
        //   185: invokestatic    jb2.M0:(Ljava/lang/Object;)V
        //   188: aload_0        
        //   189: getfield        wv0.F0:Ljava/util/List;
        //   192: astore          9
        //   194: aload           9
        //   196: invokeinterface java/util/List.size:()I
        //   201: istore_3       
        //   202: aload_0        
        //   203: astore          8
        //   205: iconst_0       
        //   206: istore_2       
        //   207: iload_2        
        //   208: iload_3        
        //   209: if_icmpge       642
        //   212: aload           9
        //   214: iload_2        
        //   215: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   220: checkcast       Ljkb;
        //   223: astore          14
        //   225: aload           14
        //   227: invokeinterface jkb.a:()I
        //   232: istore          4
        //   234: getstatic       ykb.Companion:Lykb$a;
        //   237: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   240: pop            
        //   241: iload           4
        //   243: iconst_2       
        //   244: if_icmpne       253
        //   247: iconst_1       
        //   248: istore          6
        //   250: goto            256
        //   253: iconst_0       
        //   254: istore          6
        //   256: aload_1        
        //   257: astore          12
        //   259: iload_3        
        //   260: istore          5
        //   262: iload_2        
        //   263: istore          4
        //   265: aload           8
        //   267: astore          11
        //   269: aload           9
        //   271: astore          10
        //   273: iload           6
        //   275: ifeq            615
        //   278: aload           8
        //   280: getfield        wv0.H0:Luw0;
        //   283: astore          11
        //   285: aload           8
        //   287: getfield        wv0.J0:Laik;
        //   290: astore          10
        //   292: new             Lwv0$b;
        //   295: astore          12
        //   297: aload           12
        //   299: aload           8
        //   301: aload           14
        //   303: aconst_null    
        //   304: invokespecial   wv0$b.<init>:(Lwv0;Ljkb;Lmp6;)V
        //   307: aload_1        
        //   308: aload           8
        //   310: putfield        wv0$a.F0:Lwv0;
        //   313: aload_1        
        //   314: aload           9
        //   316: putfield        wv0$a.G0:Ljava/util/List;
        //   319: aload_1        
        //   320: aload           14
        //   322: putfield        wv0$a.H0:Ljkb;
        //   325: aload_1        
        //   326: iload_2        
        //   327: putfield        wv0$a.I0:I
        //   330: aload_1        
        //   331: iload_3        
        //   332: putfield        wv0$a.J0:I
        //   335: aload_1        
        //   336: iconst_1       
        //   337: putfield        wv0$a.M0:I
        //   340: aload           11
        //   342: aload           14
        //   344: aload           10
        //   346: aload           12
        //   348: aload_1        
        //   349: invokevirtual   uw0.b:(Ljkb;Laik;Lstb;Lmp6;)Ljava/lang/Object;
        //   352: astore          13
        //   354: aload           13
        //   356: aload           15
        //   358: if_acmpne       364
        //   361: aload           15
        //   363: areturn        
        //   364: aload           14
        //   366: astore          12
        //   368: aload           9
        //   370: astore          11
        //   372: aload           13
        //   374: ifnull          501
        //   377: aload_1        
        //   378: astore          9
        //   380: aload           8
        //   382: astore          10
        //   384: aload           8
        //   386: getfield        wv0.G0:Lfnv;
        //   389: astore          11
        //   391: aload_1        
        //   392: astore          9
        //   394: aload           8
        //   396: astore          10
        //   398: aload           11
        //   400: getfield        fnv.d:I
        //   403: aload           13
        //   405: aload           12
        //   407: aload           11
        //   409: getfield        fnv.b:Lqlb;
        //   412: aload           11
        //   414: getfield        fnv.c:I
        //   417: invokestatic    d4j.A0:(ILjava/lang/Object;Ljkb;Lqlb;I)Ljava/lang/Object;
        //   420: astore          11
        //   422: aload_1        
        //   423: astore          9
        //   425: aload           8
        //   427: astore          10
        //   429: aload           8
        //   431: getfield        wv0.K0:Lwwj;
        //   434: aload           11
        //   436: invokevirtual   cjq.setValue:(Ljava/lang/Object;)V
        //   439: aload_1        
        //   440: astore          9
        //   442: aload           8
        //   444: astore          10
        //   446: getstatic       vzv.a:Lvzv;
        //   449: astore          11
        //   451: aload_1        
        //   452: invokeinterface mp6.getContext:()Lyy6;
        //   457: invokestatic    jb2.s0:(Lyy6;)Z
        //   460: istore          7
        //   462: aload           8
        //   464: iconst_0       
        //   465: putfield        wv0.L0:Z
        //   468: aload           8
        //   470: getfield        wv0.I0:Lstb;
        //   473: new             Linv$b;
        //   476: dup            
        //   477: aload           8
        //   479: invokevirtual   wv0.getValue:()Ljava/lang/Object;
        //   482: iload           7
        //   484: invokespecial   inv$b.<init>:(Ljava/lang/Object;Z)V
        //   487: invokeinterface stb.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   492: pop            
        //   493: aload           11
        //   495: areturn        
        //   496: astore          11
        //   498: goto            169
        //   501: aload_1        
        //   502: astore          9
        //   504: aload           8
        //   506: astore          10
        //   508: aload_1        
        //   509: aload           8
        //   511: putfield        wv0$a.F0:Lwv0;
        //   514: aload_1        
        //   515: astore          9
        //   517: aload           8
        //   519: astore          10
        //   521: aload_1        
        //   522: aload           11
        //   524: putfield        wv0$a.G0:Ljava/util/List;
        //   527: aload_1        
        //   528: astore          9
        //   530: aload           8
        //   532: astore          10
        //   534: aload_1        
        //   535: aconst_null    
        //   536: putfield        wv0$a.H0:Ljkb;
        //   539: aload_1        
        //   540: astore          9
        //   542: aload           8
        //   544: astore          10
        //   546: aload_1        
        //   547: iload_2        
        //   548: putfield        wv0$a.I0:I
        //   551: aload_1        
        //   552: astore          9
        //   554: aload           8
        //   556: astore          10
        //   558: aload_1        
        //   559: iload_3        
        //   560: putfield        wv0$a.J0:I
        //   563: aload_1        
        //   564: astore          9
        //   566: aload           8
        //   568: astore          10
        //   570: aload_1        
        //   571: iconst_2       
        //   572: putfield        wv0$a.M0:I
        //   575: aload_1        
        //   576: astore          9
        //   578: aload           8
        //   580: astore          10
        //   582: aload_1        
        //   583: invokestatic    ma7.U:(Lmp6;)Ljava/lang/Object;
        //   586: astore          12
        //   588: aload           12
        //   590: aload           15
        //   592: if_acmpne       598
        //   595: aload           15
        //   597: areturn        
        //   598: aload           11
        //   600: astore          10
        //   602: aload           8
        //   604: astore          11
        //   606: iload_2        
        //   607: istore          4
        //   609: iload_3        
        //   610: istore          5
        //   612: aload_1        
        //   613: astore          12
        //   615: iload           4
        //   617: iconst_1       
        //   618: iadd           
        //   619: istore_2       
        //   620: aload           12
        //   622: astore_1       
        //   623: iload           5
        //   625: istore_3       
        //   626: aload           11
        //   628: astore          8
        //   630: aload           10
        //   632: astore          9
        //   634: goto            207
        //   637: astore          9
        //   639: goto            693
        //   642: aload_1        
        //   643: invokeinterface mp6.getContext:()Lyy6;
        //   648: invokestatic    jb2.s0:(Lyy6;)Z
        //   651: istore          7
        //   653: aload           8
        //   655: iconst_0       
        //   656: putfield        wv0.L0:Z
        //   659: aload           8
        //   661: getfield        wv0.I0:Lstb;
        //   664: new             Linv$b;
        //   667: dup            
        //   668: aload           8
        //   670: invokevirtual   wv0.getValue:()Ljava/lang/Object;
        //   673: iload           7
        //   675: invokespecial   inv$b.<init>:(Ljava/lang/Object;Z)V
        //   678: invokeinterface stb.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   683: pop            
        //   684: getstatic       vzv.a:Lvzv;
        //   687: areturn        
        //   688: astore          9
        //   690: aload_0        
        //   691: astore          8
        //   693: aload_1        
        //   694: invokeinterface mp6.getContext:()Lyy6;
        //   699: invokestatic    jb2.s0:(Lyy6;)Z
        //   702: istore          7
        //   704: aload           8
        //   706: iconst_0       
        //   707: putfield        wv0.L0:Z
        //   710: aload           8
        //   712: getfield        wv0.I0:Lstb;
        //   715: new             Linv$b;
        //   718: dup            
        //   719: aload           8
        //   721: invokevirtual   wv0.getValue:()Ljava/lang/Object;
        //   724: iload           7
        //   726: invokespecial   inv$b.<init>:(Ljava/lang/Object;Z)V
        //   729: invokeinterface stb.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   734: pop            
        //   735: aload           9
        //   737: athrow         
        //    Signature:
        //  (Lmp6<-Lvzv;>;)Ljava/lang/Object;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  103    108    111    116    Any
        //  161    166    496    183    Any
        //  188    202    688    693    Any
        //  212    241    637    642    Any
        //  278    354    637    642    Any
        //  384    391    496    183    Any
        //  398    422    496    183    Any
        //  429    439    496    183    Any
        //  446    451    496    183    Any
        //  508    514    496    183    Any
        //  521    527    496    183    Any
        //  534    539    496    183    Any
        //  546    551    496    183    Any
        //  558    563    496    183    Any
        //  570    575    496    183    Any
        //  582    588    496    183    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0207:
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
    
    public final Object g(final jkb f0, mp6<Object> o) {
        Label_0051: {
            if (o instanceof wv0$c) {
                final Object f2 = o;
                final int i0 = ((wv0$c)f2).I0;
                if ((i0 & Integer.MIN_VALUE) != 0x0) {
                    ((wv0$c)f2).I0 = i0 + Integer.MIN_VALUE;
                    o = f2;
                    break Label_0051;
                }
            }
            o = new wv0$c(this, (mp6)o);
        }
        final Object g0 = ((wv0$c)o).G0;
        final jz6 f3 = jz6.F0;
        final int i2 = ((wv0$c)o).I0;
        final Object o2 = null;
        Object b = null;
        Label_0106: {
            if (i2 == 0) {
                break Label_0106;
            }
            Label_0096: {
                if (i2 != 1) {
                    break Label_0096;
                }
                Object f2 = ((wv0$c)o).F0;
                try {
                    jb2.M0(g0);
                    b = g0;
                    Label_0173: {
                        return b;
                    }
                    jb2.M0(g0);
                    f2 = f0;
                    f2 = f0;
                    final wv0$d wv0$d = new wv0$d(this, f0, (mp6)null);
                    f2 = f0;
                    ((wv0$c)o).F0 = f0;
                    f2 = f0;
                    ((wv0$c)o).I0 = 1;
                    f2 = f0;
                    iftrue(Label_0173:)((b = qat.b(15000L, (hub)wv0$d, (mp6)o)) != f3);
                    return f3;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final Exception ex) {
                    final dz6 dz6 = (dz6)((mp6)o).getContext().b((yy6$b)dz6$a.F0);
                    b = o2;
                    if (dz6 != null) {
                        ((mp6)o).getContext();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unable to load font ");
                        sb.append(f2);
                        dz6.z((Throwable)new IllegalStateException(sb.toString(), ex));
                        b = o2;
                    }
                }
                catch (final CancellationException ex2) {
                    if (!jb2.s0(((mp6)o).getContext())) {
                        throw ex2;
                    }
                    b = o2;
                }
            }
        }
        return b;
    }
    
    public final Object getValue() {
        return ((cjq<Object>)this.K0).getValue();
    }
}
