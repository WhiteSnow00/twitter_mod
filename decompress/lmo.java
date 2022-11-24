import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmo implements zqg
{
    public final int a;
    public final float b;
    public final int c;
    public final oub<Integer, int[], cwe, rp8, int[], vzv> d;
    public final t77 e;
    
    public lmo(final Object p0, final float p1, final Object p2, final oub<? super Integer, ? super int[], ? super cwe, ? super rp8, ? super int[], vzv> p3, final t77 p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_1        
        //     2: putfield        lmo.a:I
        //     5: aload_0        
        //     6: fload_2        
        //     7: putfield        lmo.b:F
        //    10: aload_0        
        //    11: iconst_1       
        //    12: putfield        lmo.c:I
        //    15: aload_0        
        //    16: aload_3        
        //    17: putfield        lmo.d:Loub;
        //    20: aload_0        
        //    21: aload           4
        //    23: putfield        lmo.e:Lt77;
        //    26: aload_0        
        //    27: invokespecial   java/lang/Object.<init>:()V
        //    30: return         
        //    Signature:
        //  (Ljava/lang/Object;FLjava/lang/Object;Loub<-Ljava/lang/Integer;-[I-Lcwe;-Lrp8;-[ILvzv;>;Lt77;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 5
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    @Override
    public final int a(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        Object o;
        if (this.a == 1) {
            final mzd a = mzd.a;
            o = mzd.f;
        }
        else {
            final mzd a2 = mzd.a;
            o = mzd.g;
        }
        return ((Number)((kub)o).h0((Object)list, (Object)n, (Object)xj0.a((rp8)b0e, this.b))).intValue();
    }
    
    @Override
    public final arg b(final crg crg, final List<? extends wqg> list, long n) {
        e0e.f((Object)crg, "$this$measure");
        e0e.f((Object)list, "measurables");
        final int a = this.a;
        int n2;
        if (a == 1) {
            n2 = vj6.j(n);
        }
        else {
            n2 = vj6.i(n);
        }
        int n3;
        if (a == 1) {
            n3 = vj6.h(n);
        }
        else {
            n3 = vj6.g(n);
        }
        int n4;
        if (a == 1) {
            n4 = vj6.i(n);
        }
        else {
            n4 = vj6.j(n);
        }
        int n5;
        if (a == 1) {
            n5 = vj6.g(n);
        }
        else {
            n5 = vj6.h(n);
        }
        final int s = ((rp8)crg).S(this.b);
        final int size = list.size();
        final khk[] array = new khk[size];
        final int size2 = list.size();
        final mmo[] array2 = new mmo[size2];
        for (int i = 0; i < size2; ++i) {
            array2[i] = tpz.B((jzd)list.get(i));
        }
        final int size3 = list.size();
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        float n11 = 0.0f;
        int n12 = 0;
        String s2;
        while (true) {
            s2 = "orientation";
            if (n6 >= size3) {
                break;
            }
            final wqg wqg = list.get(n6);
            final mmo mmo = array2[n6];
            final float j = tpz.I(mmo);
            if (j > 0.0f) {
                n11 += j;
                ++n8;
            }
            else {
                int n13;
                if (n3 == Integer.MAX_VALUE) {
                    n13 = Integer.MAX_VALUE;
                }
                else {
                    n13 = n3 - n12;
                }
                final int a2 = this.a;
                mqb.n(a2, "orientation");
                if (a2 == 1) {
                    n = xd.h(0, n13, 0, n5);
                }
                else {
                    n = xd.h(0, n5, 0, n13);
                }
                final khk w = wqg.W(n);
                final int min = Math.min(s, n3 - n12 - tpz.r(w, this.a));
                final int a3 = this.a;
                int n14;
                if (a3 == 1) {
                    n14 = w.F0;
                }
                else {
                    n14 = w.G0;
                }
                n9 = min;
                int n15;
                if (a3 == 1) {
                    n15 = w.G0;
                }
                else {
                    n15 = w.F0;
                }
                n7 = Math.max(n7, n15);
                Label_0484: {
                    if (n10 == 0) {
                        t77 c;
                        if (mmo != null) {
                            c = mmo.c;
                        }
                        else {
                            c = null;
                        }
                        if (c == null || !(c instanceof t77.a)) {
                            n10 = 0;
                            break Label_0484;
                        }
                    }
                    n10 = 1;
                }
                array[n6] = w;
                n12 += n14 + min;
            }
            ++n6;
        }
        int n16;
        int n17;
        int n18;
        int n19;
        if (n8 == 0) {
            n16 = n12 - n9;
            n17 = 0;
            n18 = n7;
            n19 = n10;
        }
        else {
            final float n20 = fcmpl(n11, 0.0f);
            int n21;
            if (n20 > 0 && n3 != Integer.MAX_VALUE) {
                n21 = n3;
            }
            else {
                n21 = n2;
            }
            final int n22 = (n8 - 1) * s;
            final int n23 = n21 - n12 - n22;
            float n24;
            if (n20 > 0) {
                n24 = n23 / n11;
            }
            else {
                n24 = 0.0f;
            }
            int k = 0;
            int n25 = 0;
            while (k < size2) {
                n25 += jb2.B0(tpz.I(array2[k]) * n24);
                ++k;
            }
            final int size4 = list.size();
            int n26 = n23 - n25;
            final int n27 = 0;
            int n28 = 0;
            for (int n29 = size4, l = n27; l < n29; ++l) {
                if (array[l] == null) {
                    final wqg wqg2 = list.get(l);
                    final mmo mmo2 = array2[l];
                    final float m = tpz.I(mmo2);
                    if (m <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    final int m2 = jb2.m0(n26);
                    final int n30 = n26 - m2;
                    final int max = Math.max(0, jb2.B0(m * n24) + m2);
                    int n31;
                    if ((mmo2 == null || mmo2.b) && max != Integer.MAX_VALUE) {
                        n31 = max;
                    }
                    else {
                        n31 = 0;
                    }
                    final int a4 = this.a;
                    mqb.n(a4, s2);
                    if (a4 == 1) {
                        n = xd.h(n31, max, 0, n5);
                    }
                    else {
                        n = xd.h(0, n5, n31, max);
                    }
                    final khk w2 = wqg2.W(n);
                    final int r = tpz.r(w2, this.a);
                    int n32;
                    if (this.a == 1) {
                        n32 = w2.G0;
                    }
                    else {
                        n32 = w2.F0;
                    }
                    n7 = Math.max(n7, n32);
                    Label_0958: {
                        if (n10 == 0) {
                            t77 c2;
                            if (mmo2 != null) {
                                c2 = mmo2.c;
                            }
                            else {
                                c2 = null;
                            }
                            if (c2 == null || !(c2 instanceof t77.a)) {
                                n10 = 0;
                                break Label_0958;
                            }
                        }
                        n10 = 1;
                    }
                    array[l] = w2;
                    n28 += r;
                    n26 = n30;
                }
            }
            final int n33 = n28 + n22;
            final int n34 = n3 - n12;
            n17 = n33;
            n18 = n7;
            n19 = n10;
            n16 = n12;
            if (n33 > n34) {
                n17 = n34;
                n16 = n12;
                n19 = n10;
                n18 = n7;
            }
        }
        final c8m c8m = new c8m();
        int n37;
        if (n19 != 0) {
            int n35 = 0;
            int n36 = 0;
            while (true) {
                n37 = n36;
                if (n35 >= size) {
                    break;
                }
                final khk khk = array[n35];
                e0e.c((Object)khk);
                final mmo mmo3 = array2[n35];
                t77 c3;
                if (mmo3 != null) {
                    c3 = mmo3.c;
                }
                else {
                    c3 = null;
                }
                Integer b;
                if (c3 != null) {
                    b = c3.b(khk);
                }
                else {
                    b = null;
                }
                int max2 = n36;
                if (b != null) {
                    final int f0 = c8m.F0;
                    int intValue = b.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    c8m.F0 = Math.max(f0, intValue);
                    final int a5 = this.a;
                    int n38;
                    if (a5 == 1) {
                        n38 = khk.G0;
                    }
                    else {
                        n38 = khk.F0;
                    }
                    int n39 = b.intValue();
                    if (n39 == Integer.MIN_VALUE) {
                        if (a5 == 1) {
                            n39 = khk.G0;
                        }
                        else {
                            n39 = khk.F0;
                        }
                    }
                    max2 = Math.max(n36, n38 - n39);
                }
                ++n35;
                n36 = max2;
            }
        }
        else {
            n37 = 0;
        }
        final int max3 = Math.max(n16 + n17, n2);
        int max4;
        if (n5 != Integer.MAX_VALUE && this.c == 2) {
            max4 = n5;
        }
        else {
            max4 = Math.max(n18, Math.max(n4, c8m.F0 + n37));
        }
        final int a6 = this.a;
        int n40;
        if (a6 == 1) {
            n40 = max3;
        }
        else {
            n40 = max4;
        }
        int n41;
        if (a6 == 1) {
            n41 = max4;
        }
        else {
            n41 = max3;
        }
        final int size5 = list.size();
        final int[] array3 = new int[size5];
        for (int n42 = 0; n42 < size5; ++n42) {
            array3[n42] = 0;
        }
        return crg.J(n40, n41, (Map)m3a.F0, (stb)new stb<khk$a, vzv>(list, array, this.d, max3, crg, array3, this.a, array2, this.e, max4, c8m) {
            public final List<wqg> F0;
            public final khk[] G0;
            public final oub<Integer, int[], cwe, rp8, int[], vzv> H0;
            public final int I0;
            public final crg J0;
            public final int[] K0;
            public final int L0;
            public final mmo[] M0;
            public final t77 N0;
            public final int O0;
            public final c8m P0;
            
            public final Object invoke(final Object o) {
                final khk$a khk$a = (khk$a)o;
                e0e.f((Object)khk$a, "$this$layout");
                final int size = this.F0.size();
                final int[] array = new int[size];
                final int n = 0;
                for (int i = 0; i < size; ++i) {
                    final khk khk = this.G0[i];
                    e0e.c((Object)khk);
                    int n2;
                    if (this.L0 == 1) {
                        n2 = khk.F0;
                    }
                    else {
                        n2 = khk.G0;
                    }
                    array[i] = n2;
                }
                this.H0.y0((Object)this.I0, (Object)array, (Object)((b0e)this.J0).getLayoutDirection(), (Object)this.J0, (Object)this.K0);
                final khk[] g0 = this.G0;
                final mmo[] m0 = this.M0;
                final t77 n3 = this.N0;
                final int o2 = this.O0;
                final int l0 = this.L0;
                final crg j0 = this.J0;
                final c8m p = this.P0;
                final int[] k0 = this.K0;
                for (int length = g0.length, n4 = 0, n5 = n; n5 < length; ++n5, ++n4) {
                    final khk khk2 = g0[n5];
                    e0e.c((Object)khk2);
                    final mmo mmo = m0[n4];
                    t77 c;
                    if (mmo != null) {
                        c = mmo.c;
                    }
                    else {
                        c = null;
                    }
                    t77 t77 = c;
                    if (c == null) {
                        t77 = n3;
                    }
                    int n6;
                    if (l0 == 1) {
                        n6 = khk2.G0;
                    }
                    else {
                        n6 = khk2.F0;
                    }
                    cwe cwe;
                    if (l0 == 1) {
                        cwe = cwe.F0;
                    }
                    else {
                        cwe = ((b0e)j0).getLayoutDirection();
                    }
                    final int a = t77.a(o2 - n6, cwe, khk2, p.F0);
                    if (l0 == 1) {
                        khk$a.c(khk2, k0[n4], a, 0.0f);
                    }
                    else {
                        khk$a.c(khk2, a, k0[n4], 0.0f);
                    }
                }
                return vzv.a;
            }
        });
    }
    
    @Override
    public final int c(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        Object o;
        if (this.a == 1) {
            final mzd a = mzd.a;
            o = mzd.b;
        }
        else {
            final mzd a2 = mzd.a;
            o = mzd.c;
        }
        return ((Number)((kub)o).h0((Object)list, (Object)n, (Object)xj0.a((rp8)b0e, this.b))).intValue();
    }
    
    @Override
    public final int d(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        Object o;
        if (this.a == 1) {
            final mzd a = mzd.a;
            o = mzd.h;
        }
        else {
            final mzd a2 = mzd.a;
            o = mzd.i;
        }
        return ((Number)((kub)o).h0((Object)list, (Object)n, (Object)xj0.a((rp8)b0e, this.b))).intValue();
    }
    
    @Override
    public final int e(final b0e b0e, final List<? extends jzd> list, final int n) {
        e0e.f((Object)b0e, "<this>");
        Object o;
        if (this.a == 1) {
            final mzd a = mzd.a;
            o = mzd.d;
        }
        else {
            final mzd a2 = mzd.a;
            o = mzd.e;
        }
        return ((Number)((kub)o).h0((Object)list, (Object)n, (Object)xj0.a((rp8)b0e, this.b))).intValue();
    }
}
