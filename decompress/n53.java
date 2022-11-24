import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n53
{
    public static final void a(final ptb<vzv> ptb, dlh companion, boolean b, iuh iuh, x43 x43, asp a, f82 f82, k43 k43, osj b2, final kub<? super qmo, ? super d86, ? super Integer, vzv> kub, final d86 d86, final int n, final int n2) {
        e0e.f((Object)ptb, "onClick");
        e0e.f((Object)kub, "content");
        final d86 h = d86.h(-2116133464);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)ptb)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0152: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (h.P((Object)companion)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0152;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0225: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x380) == 0x0) {
                    int n11;
                    if (h.a(b)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0225;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0299: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0x1C00) == 0x0) {
                    int n15;
                    if (h.P((Object)iuh)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0299;
                }
            }
            n16 = n14;
        }
        if ((0xE000 & n) == 0x0) {
            int n17;
            if ((n2 & 0x10) == 0x0 && h.P((Object)x43)) {
                n17 = 16384;
            }
            else {
                n17 = 8192;
            }
            n16 |= n17;
        }
        if ((0x70000 & n) == 0x0) {
            int n18;
            if ((n2 & 0x20) == 0x0 && h.P((Object)a)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n16 |= n18;
        }
        final int n19 = n2 & 0x40;
        int n22 = 0;
        Label_0470: {
            int n20;
            if (n19 != 0) {
                n20 = (n16 | 0x180000);
            }
            else {
                n20 = n16;
                if ((0x380000 & n) == 0x0) {
                    int n21;
                    if (h.P((Object)f82)) {
                        n21 = 1048576;
                    }
                    else {
                        n21 = 524288;
                    }
                    n22 = (n16 | n21);
                    break Label_0470;
                }
            }
            n22 = n20;
        }
        if ((n & 0x1C00000) == 0x0) {
            int n23;
            if ((n2 & 0x80) == 0x0 && h.P((Object)k43)) {
                n23 = 8388608;
            }
            else {
                n23 = 4194304;
            }
            n22 |= n23;
        }
        final int n24 = n2 & 0x100;
        int n25;
        if (n24 != 0) {
            n25 = (n22 | 0x6000000);
        }
        else {
            n25 = n22;
            if ((n & 0xE000000) == 0x0) {
                int n26;
                if (h.P((Object)b2)) {
                    n26 = 67108864;
                }
                else {
                    n26 = 33554432;
                }
                n25 = (n22 | n26);
            }
        }
        int n27;
        if ((n2 & 0x200) != 0x0) {
            n27 = (n25 | 0x30000000);
        }
        else {
            n27 = n25;
            if ((0x70000000 & n) == 0x0) {
                int n28;
                if (h.P((Object)kub)) {
                    n28 = 536870912;
                }
                else {
                    n28 = 268435456;
                }
                n27 = (n25 | n28);
            }
        }
        k43 k44;
        x43 x44;
        asp asp2;
        f82 f83;
        osj osj;
        if ((0x5B6DB6DB & n27) == 0x12492492 && h.i()) {
            h.H();
            final asp asp = a;
            k44 = k43;
            x44 = x43;
            asp2 = asp;
            f83 = f82;
            osj = b2;
        }
        else {
            h.C();
            final l9r l9r = null;
            iuh iuh2;
            osj osj2;
            x43 x46;
            dlh dlh2;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n29 = n27;
                if ((n2 & 0x10) != 0x0) {
                    n29 = (n27 & 0xFFFF1FFF);
                }
                int n30 = n29;
                if ((n2 & 0x20) != 0x0) {
                    n30 = (n29 & 0xFFF8FFFF);
                }
                int n31 = n30;
                if ((n2 & 0x80) != 0x0) {
                    n31 = (n30 & 0xFE3FFFFF);
                }
                final dlh dlh = companion;
                iuh2 = iuh;
                final k43 k45 = k43;
                asp2 = a;
                final x43 x45 = x43;
                osj2 = b2;
                n27 = n31;
                k44 = k45;
                x46 = x45;
                dlh2 = dlh;
            }
            else {
                if (n5 != 0) {
                    companion = (dlh)dlh.Companion;
                }
                if (n9 != 0) {
                    b = true;
                }
                if (n13 != 0) {
                    h.x(-492369756);
                    final Object y = h.y();
                    Objects.requireNonNull(d86.Companion);
                    Object d87;
                    if ((d87 = y) == d86$a.b) {
                        d87 = zk.d(h);
                    }
                    h.O();
                    iuh = (iuh)d87;
                }
                if ((n2 & 0x10) != 0x0) {
                    final s43 a2 = s43.a;
                    h.x(-737170518);
                    final float n32 = 2;
                    final float n33 = 8;
                    final float n34 = 0;
                    final float n35 = 4;
                    final sa6$b a3 = sa6.a;
                    final s99 s99 = new s99(n32);
                    final s99 s100 = new s99(n33);
                    final s99 s101 = new s99(n34);
                    final s99 s102 = new s99(n35);
                    final s99 s103 = new s99(n35);
                    h.x(-568225417);
                    int i = 0;
                    boolean b3 = false;
                    while (i < 5) {
                        b3 |= h.P((new Object[] { s99, s100, s101, s102, s103 })[i]);
                        ++i;
                    }
                    final Object y2 = h.y();
                    dg8 dg8 = null;
                    Label_1150: {
                        if (!b3) {
                            Objects.requireNonNull(d86.Companion);
                            if ((dg8 = (dg8)y2) != d86$a.b) {
                                break Label_1150;
                            }
                        }
                        dg8 = new dg8(n32, n33, n34, n35, n35);
                        h.p((Object)dg8);
                    }
                    h.O();
                    x43 = (x43)dg8;
                    final sa6$b a4 = sa6.a;
                    h.O();
                    n27 &= 0xFFFF1FFF;
                }
                if ((n2 & 0x20) != 0x0) {
                    final sa6$b a5 = sa6.a;
                    a = (asp)((wsp)h.m((df6)xsp.a)).a;
                    n27 &= 0xFFF8FFFF;
                }
                if (n19 != 0) {
                    f82 = null;
                }
                if ((n2 & 0x80) != 0x0) {
                    final s43 a6 = s43.a;
                    h.x(1870371134);
                    final sa6$b a7 = sa6.a;
                    final gbr a8 = ps4.a;
                    final long h2 = ((os4)h.m((df6)a8)).h();
                    k43 = (k43)new cg8(h2, ps4.b(h2, h), yru.k(sr4.b(((os4)h.m((df6)a8)).g(), 0.12f), ((os4)h.m((df6)a8)).l()), sr4.b(((os4)h.m((df6)a8)).g(), d4j.E(h, 6)));
                    h.O();
                    n27 &= 0xFE3FFFFF;
                }
                if (n24 != 0) {
                    final s43 a9 = s43.a;
                    b2 = (osj)s43.b;
                }
                final dlh dlh3 = companion;
                iuh2 = iuh;
                x46 = x43;
                final asp asp3 = a;
                osj2 = b2;
                k44 = k43;
                asp2 = asp3;
                dlh2 = dlh3;
            }
            h.s();
            final sa6$b a10 = sa6.a;
            final int n36 = n27 >> 6;
            final l9r a11 = k44.a(b, h);
            final long a12 = ((sr4)k44.b(b, h).getValue()).a;
            final long b4 = sr4.b(((sr4)a11.getValue()).a, 1.0f);
            l9r a13;
            if (x46 == null) {
                a13 = l9r;
            }
            else {
                a13 = x46.a(b, (hvd)iuh2, h, (n36 & 0xE) | (n36 & 0x70) | (n36 & 0x380));
            }
            float f84;
            if (a13 != null) {
                f84 = ((s99)a13.getValue()).F0;
            }
            else {
                f84 = 0;
            }
            y0s.b((ptb)ptb, dlh2, b, asp2, a12, b4, f82, f84, iuh2, (hub)w9y.i(h, 7524271, new n53$a(a11, osj2, (kub)kub, n27)), h, (n36 & 0x1C00) | ((n27 & 0xE) | 0x30000000 | (n27 & 0x70) | (n27 & 0x380)) | (0x380000 & n27) | (n27 << 15 & 0xE000000), 0);
            final f82 f85 = f82;
            osj = osj2;
            f83 = f85;
            x44 = x46;
            iuh = iuh2;
            companion = dlh2;
        }
        final gyo j = h.k();
        if (j != null) {
            j.a((hub)new n53$b((ptb)ptb, companion, b, iuh, x44, asp2, f83, k44, osj, (kub)kub, n, n2));
        }
    }
    
    public static final void b(final ptb<vzv> p0, final dlh p1, final boolean p2, final iuh p3, final x43 p4, final asp p5, final f82 p6, final k43 p7, final osj p8, final kub<? super qmo, ? super d86, ? super Integer, vzv> p9, final d86 p10, final int p11, final int p12) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "onClick"
        //     3: invokestatic    e0e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_3        
        //     7: ldc             "content"
        //     9: invokestatic    e0e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload           4
        //    14: ldc             288797557
        //    16: invokeinterface d86.x:(I)V
        //    21: iload           6
        //    23: iconst_2       
        //    24: iand           
        //    25: ifeq            36
        //    28: getstatic       dlh.Companion:Ldlh$a;
        //    31: astore          7
        //    33: goto            39
        //    36: aconst_null    
        //    37: astore          7
        //    39: iload           6
        //    41: iconst_4       
        //    42: iand           
        //    43: ifeq            51
        //    46: iconst_1       
        //    47: istore_1       
        //    48: goto            51
        //    51: iload           6
        //    53: bipush          8
        //    55: iand           
        //    56: ifeq            120
        //    59: aload           4
        //    61: ldc             -492369756
        //    63: invokeinterface d86.x:(I)V
        //    68: aload           4
        //    70: invokeinterface d86.y:()Ljava/lang/Object;
        //    75: astore          9
        //    77: getstatic       d86.Companion:Ld86$a;
        //    80: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    83: pop            
        //    84: aload           9
        //    86: astore          8
        //    88: aload           9
        //    90: getstatic       d86$a.b:Ld86$a$a;
        //    93: if_acmpne       103
        //    96: aload           4
        //    98: invokestatic    zk.d:(Ld86;)Ljuh;
        //   101: astore          8
        //   103: aload           4
        //   105: invokeinterface d86.O:()V
        //   110: aload           8
        //   112: checkcast       Liuh;
        //   115: astore          8
        //   117: goto            123
        //   120: aconst_null    
        //   121: astore          8
        //   123: iload           6
        //   125: bipush          32
        //   127: iand           
        //   128: ifeq            157
        //   131: getstatic       sa6.a:Lsa6$b;
        //   134: astore          9
        //   136: aload           4
        //   138: getstatic       xsp.a:Lgbr;
        //   141: invokeinterface d86.m:(Ldf6;)Ljava/lang/Object;
        //   146: checkcast       Lwsp;
        //   149: getfield        wsp.a:Lsy6;
        //   152: astore          9
        //   154: goto            160
        //   157: aconst_null    
        //   158: astore          9
        //   160: iload           6
        //   162: sipush          128
        //   165: iand           
        //   166: ifeq            184
        //   169: getstatic       s43.a:Ls43;
        //   172: lconst_0       
        //   173: aload           4
        //   175: bipush          7
        //   177: invokevirtual   s43.a:(JLd86;I)Lk43;
        //   180: astore_2       
        //   181: goto            184
        //   184: iload           6
        //   186: sipush          256
        //   189: iand           
        //   190: ifeq            206
        //   193: getstatic       s43.a:Ls43;
        //   196: astore          10
        //   198: getstatic       s43.e:Lpsj;
        //   201: astore          10
        //   203: goto            209
        //   206: aconst_null    
        //   207: astore          10
        //   209: getstatic       sa6.a:Lsa6$b;
        //   212: astore          11
        //   214: aload_0        
        //   215: aload           7
        //   217: iload_1        
        //   218: aload           8
        //   220: aconst_null    
        //   221: aload           9
        //   223: aconst_null    
        //   224: aload_2        
        //   225: aload           10
        //   227: aload_3        
        //   228: aload           4
        //   230: iload           5
        //   232: bipush          14
        //   234: iand           
        //   235: iload           5
        //   237: bipush          112
        //   239: iand           
        //   240: ior            
        //   241: iload           5
        //   243: sipush          896
        //   246: iand           
        //   247: ior            
        //   248: iload           5
        //   250: sipush          7168
        //   253: iand           
        //   254: ior            
        //   255: ldc             57344
        //   257: iload           5
        //   259: iand           
        //   260: ior            
        //   261: ldc             458752
        //   263: iload           5
        //   265: iand           
        //   266: ior            
        //   267: ldc             3670016
        //   269: iload           5
        //   271: iand           
        //   272: ior            
        //   273: ldc             29360128
        //   275: iload           5
        //   277: iand           
        //   278: ior            
        //   279: ldc             234881024
        //   281: iload           5
        //   283: iand           
        //   284: ior            
        //   285: iload           5
        //   287: ldc             1879048192
        //   289: iand           
        //   290: ior            
        //   291: iconst_0       
        //   292: invokestatic    n53.a:(Lptb;Ldlh;ZLiuh;Lx43;Lasp;Lf82;Lk43;Losj;Lkub;Ld86;II)V
        //   295: aload           4
        //   297: invokeinterface d86.O:()V
        //   302: return         
        //    Signature:
        //  (Lptb<Lvzv;>;Ldlh;ZLiuh;Lx43;Lasp;Lf82;Lk43;Losj;Lkub<-Lqmo;-Ld86;-Ljava/lang/Integer;Lvzv;>;Ld86;II)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 12
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
