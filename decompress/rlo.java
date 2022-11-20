import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rlo implements fqg
{
    public final int a;
    public final float b;
    public final int c;
    public final mtb<Integer, int[], fve, lo8, int[], fzv> d;
    public final o67 e;
    
    public rlo(final Object p0, final float p1, final Object p2, final mtb<? super Integer, ? super int[], ? super fve, ? super lo8, ? super int[], fzv> p3, final o67 p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_1        
        //     2: putfield        rlo.a:I
        //     5: aload_0        
        //     6: fload_2        
        //     7: putfield        rlo.b:F
        //    10: aload_0        
        //    11: iconst_1       
        //    12: putfield        rlo.c:I
        //    15: aload_0        
        //    16: aload_3        
        //    17: putfield        rlo.d:Lmtb;
        //    20: aload_0        
        //    21: aload           4
        //    23: putfield        rlo.e:Lo67;
        //    26: aload_0        
        //    27: invokespecial   java/lang/Object.<init>:()V
        //    30: return         
        //    Signature:
        //  (Ljava/lang/Object;FLjava/lang/Object;Lmtb<-Ljava/lang/Integer;-[I-Lfve;-Llo8;-[ILfzv;>;Lo67;)V
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
    
    public final int a(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        Object o;
        if (this.a == 1) {
            final kyd a = kyd.a;
            o = kyd.f;
        }
        else {
            final kyd a2 = kyd.a;
            o = kyd.g;
        }
        return ((Number)((itb)o).h0((Object)list, (Object)n, (Object)x68.c((lo8)zyd, this.b))).intValue();
    }
    
    public final gqg b(final iqg iqg, final List<? extends cqg> list, long n) {
        czd.f((Object)iqg, "$this$measure");
        czd.f((Object)list, "measurables");
        final int a = this.a;
        int n2;
        if (a == 1) {
            n2 = pi6.j(n);
        }
        else {
            n2 = pi6.i(n);
        }
        int n3;
        if (a == 1) {
            n3 = pi6.h(n);
        }
        else {
            n3 = pi6.g(n);
        }
        int n4;
        if (a == 1) {
            n4 = pi6.i(n);
        }
        else {
            n4 = pi6.j(n);
        }
        int n5;
        if (a == 1) {
            n5 = pi6.g(n);
        }
        else {
            n5 = pi6.h(n);
        }
        final int s = ((lo8)iqg).S(this.b);
        final int size = list.size();
        final wgk[] array = new wgk[size];
        final int size2 = list.size();
        final slo[] array2 = new slo[size2];
        for (int i = 0; i < size2; ++i) {
            array2[i] = jee.P((hyd)list.get(i));
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
            final cqg cqg = list.get(n6);
            final slo slo = array2[n6];
            final float y = jee.Y(slo);
            if (y > 0.0f) {
                n11 += y;
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
                da8.m(a2, "orientation");
                if (a2 == 1) {
                    n = uoz.b(0, n13, 0, n5);
                }
                else {
                    n = uoz.b(0, n5, 0, n13);
                }
                final wgk w = cqg.W(n);
                final int min = Math.min(s, n3 - n12 - jee.f(w, this.a));
                final int a3 = this.a;
                int n14;
                if (a3 == 1) {
                    n14 = w.D0;
                }
                else {
                    n14 = w.E0;
                }
                n9 = min;
                int n15;
                if (a3 == 1) {
                    n15 = w.E0;
                }
                else {
                    n15 = w.D0;
                }
                n7 = Math.max(n7, n15);
                Label_0484: {
                    if (n10 == 0) {
                        o67 c;
                        if (slo != null) {
                            c = slo.c;
                        }
                        else {
                            c = null;
                        }
                        if (c == null || !(c instanceof o67$a)) {
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
            int j = 0;
            int n25 = 0;
            while (j < size2) {
                n25 += zyz.n(jee.Y(array2[j]) * n24);
                ++j;
            }
            final int size4 = list.size();
            int n26 = n23 - n25;
            final int n27 = 0;
            int n28 = 0;
            for (int n29 = size4, k = n27; k < n29; ++k) {
                if (array[k] == null) {
                    final cqg cqg2 = list.get(k);
                    final slo slo2 = array2[k];
                    final float y2 = jee.Y(slo2);
                    if (y2 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    final int l = zyz.j(n26);
                    final int n30 = n26 - l;
                    final int max = Math.max(0, zyz.n(y2 * n24) + l);
                    int n31;
                    if ((slo2 == null || slo2.b) && max != Integer.MAX_VALUE) {
                        n31 = max;
                    }
                    else {
                        n31 = 0;
                    }
                    final int a4 = this.a;
                    da8.m(a4, s2);
                    if (a4 == 1) {
                        n = uoz.b(n31, max, 0, n5);
                    }
                    else {
                        n = uoz.b(0, n5, n31, max);
                    }
                    final wgk w2 = cqg2.W(n);
                    final int f = jee.f(w2, this.a);
                    int n32;
                    if (this.a == 1) {
                        n32 = w2.E0;
                    }
                    else {
                        n32 = w2.D0;
                    }
                    n7 = Math.max(n7, n32);
                    Label_0958: {
                        if (n10 == 0) {
                            o67 c2;
                            if (slo2 != null) {
                                c2 = slo2.c;
                            }
                            else {
                                c2 = null;
                            }
                            if (c2 == null || !(c2 instanceof o67$a)) {
                                n10 = 0;
                                break Label_0958;
                            }
                        }
                        n10 = 1;
                    }
                    array[k] = w2;
                    n28 += f;
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
        final p7m p7m = new p7m();
        int n37;
        if (n19 != 0) {
            int n35 = 0;
            int n36 = 0;
            while (true) {
                n37 = n36;
                if (n35 >= size) {
                    break;
                }
                final wgk wgk = array[n35];
                czd.c((Object)wgk);
                final slo slo3 = array2[n35];
                o67 c3;
                if (slo3 != null) {
                    c3 = slo3.c;
                }
                else {
                    c3 = null;
                }
                Integer b;
                if (c3 != null) {
                    b = c3.b(wgk);
                }
                else {
                    b = null;
                }
                int max2 = n36;
                if (b != null) {
                    final int d0 = p7m.D0;
                    int intValue = b.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    p7m.D0 = Math.max(d0, intValue);
                    final int a5 = this.a;
                    int n38;
                    if (a5 == 1) {
                        n38 = wgk.E0;
                    }
                    else {
                        n38 = wgk.D0;
                    }
                    int n39 = b.intValue();
                    if (n39 == Integer.MIN_VALUE) {
                        if (a5 == 1) {
                            n39 = wgk.E0;
                        }
                        else {
                            n39 = wgk.D0;
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
            max4 = Math.max(n18, Math.max(n4, p7m.D0 + n37));
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
        return iqg.J(n40, n41, (Map)k2a.D0, (qsb)new rlo$a((List)list, array, (mtb)this.d, max3, iqg, array3, this.a, array2, this.e, max4, p7m));
    }
    
    public final int c(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        Object o;
        if (this.a == 1) {
            final kyd a = kyd.a;
            o = kyd.b;
        }
        else {
            final kyd a2 = kyd.a;
            o = kyd.c;
        }
        return ((Number)((itb)o).h0((Object)list, (Object)n, (Object)x68.c((lo8)zyd, this.b))).intValue();
    }
    
    public final int d(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        Object o;
        if (this.a == 1) {
            final kyd a = kyd.a;
            o = kyd.h;
        }
        else {
            final kyd a2 = kyd.a;
            o = kyd.i;
        }
        return ((Number)((itb)o).h0((Object)list, (Object)n, (Object)x68.c((lo8)zyd, this.b))).intValue();
    }
    
    public final int e(final zyd zyd, final List<? extends hyd> list, final int n) {
        czd.f((Object)zyd, "<this>");
        Object o;
        if (this.a == 1) {
            final kyd a = kyd.a;
            o = kyd.d;
        }
        else {
            final kyd a2 = kyd.a;
            o = kyd.e;
        }
        return ((Number)((itb)o).h0((Object)list, (Object)n, (Object)x68.c((lo8)zyd, this.b))).intValue();
    }
}
