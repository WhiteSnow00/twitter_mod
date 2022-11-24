import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v80
{
    public static final n5r<Float> a;
    public static final n5r<s99> b;
    
    static {
        a = eg8.G0(0.0f, null, 7);
        final s99.a companion = s99.Companion;
        final p6m a2 = mfx.a;
        e0e.f((Object)companion, "<this>");
        b = eg8.G0(0.0f, new s99(0.1f), 3);
        e0e.f((Object)aeq.Companion, "<this>");
        jty.g(0.5f, 0.5f);
        new(aeq.class)();
        e0e.f((Object)kgj.Companion, "<this>");
        kqe.e(0.5f, 0.5f);
        new(kgj.class)();
        e0e.f((Object)p6m.Companion, "<this>");
        final p6m a3 = mfx.a;
        mfx.a(hud.Companion);
        new(hud.class)();
        mfx.b(nud.Companion);
    }
    
    public static final l9r a(final float n, final ac0 ac0, final d86 d86, final int n2) {
        d86.x(704104481);
        final sa6$b a = sa6.a;
        final l9r<s99> c = c(new s99(n), (liv<s99, lc0>)cqw.b(s99.Companion), (ac0<s99>)ac0, null, null, null, d86, (n2 & 0xE) | (n2 << 3 & 0x380) | (n2 << 9 & 0x70000), 24);
        d86.O();
        return c;
    }
    
    public static final l9r<Float> b(final float p0, final ac0<Float> p1, final float p2, final String p3, final stb<? super Float, vzv> p4, final d86 p5, final int p6, final int p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             668842840
        //     3: invokeinterface d86.x:(I)V
        //     8: getstatic       sa6.a:Lsa6$b;
        //    11: astore_3       
        //    12: aload_1        
        //    13: ldc             841393615
        //    15: invokeinterface d86.x:(I)V
        //    20: aload_1        
        //    21: ldc             1157296644
        //    23: invokeinterface d86.x:(I)V
        //    28: aload_1        
        //    29: ldc             0.01
        //    31: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    34: invokeinterface d86.P:(Ljava/lang/Object;)Z
        //    39: istore_2       
        //    40: aload_1        
        //    41: invokeinterface d86.y:()Ljava/lang/Object;
        //    46: astore          4
        //    48: iload_2        
        //    49: ifne            70
        //    52: getstatic       d86.Companion:Ld86$a;
        //    55: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    58: pop            
        //    59: aload           4
        //    61: astore_3       
        //    62: aload           4
        //    64: getstatic       d86$a.b:Ld86$a$a;
        //    67: if_acmpne       88
        //    70: fconst_0       
        //    71: ldc             0.01
        //    73: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //    76: iconst_3       
        //    77: invokestatic    eg8.G0:(FLjava/lang/Object;I)Ln5r;
        //    80: astore_3       
        //    81: aload_1        
        //    82: aload_3        
        //    83: invokeinterface d86.p:(Ljava/lang/Object;)V
        //    88: aload_1        
        //    89: invokeinterface d86.O:()V
        //    94: aload_3        
        //    95: checkcast       Lac0;
        //    98: astore_3       
        //    99: aload_1        
        //   100: invokeinterface d86.O:()V
        //   105: fload_0        
        //   106: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   109: getstatic       cqw.a:Lmiv;
        //   112: aload_3        
        //   113: ldc             0.01
        //   115: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   118: ldc             "FloatAnimation"
        //   120: aconst_null    
        //   121: aload_1        
        //   122: iconst_0       
        //   123: iconst_0       
        //   124: invokestatic    v80.c:(Ljava/lang/Object;Lliv;Lac0;Ljava/lang/Object;Ljava/lang/String;Lstb;Ld86;II)Ll9r;
        //   127: astore_3       
        //   128: aload_1        
        //   129: invokeinterface d86.O:()V
        //   134: aload_3        
        //   135: areturn        
        //    Signature:
        //  (FLac0<Ljava/lang/Float;>;FLjava/lang/String;Lstb<-Ljava/lang/Float;Lvzv;>;Ld86;II)Ll9r<Ljava/lang/Float;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 5
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
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
    
    public static final <T, V extends lc0> l9r<T> c(final T t, final liv<T, V> liv, ac0<T> ac0, T t2, String s, stb<? super T, vzv> stb, final d86 d86, final int n, final int n2) {
        e0e.f((Object)liv, "typeConverter");
        d86.x(-1994373980);
        if ((n2 & 0x4) != 0x0) {
            d86.x(-492369756);
            final Object y = d86.y();
            Objects.requireNonNull(d86.Companion);
            Object g0;
            if ((g0 = y) == d86$a.b) {
                g0 = eg8.G0(0.0f, null, 7);
                d86.p(g0);
            }
            d86.O();
            ac0 = (ac0)g0;
        }
        if ((n2 & 0x8) != 0x0) {
            t2 = null;
        }
        if ((n2 & 0x10) != 0x0) {
            s = "ValueAnimation";
        }
        if ((n2 & 0x20) != 0x0) {
            stb = null;
        }
        final sa6$b a = sa6.a;
        d86.x(-492369756);
        final Object y2 = d86.y();
        Objects.requireNonNull(d86.Companion);
        final d86$a$a b = d86$a.b;
        b80 b2;
        if ((b2 = (b80)y2) == b) {
            b2 = new b80((Object)t, (liv)liv, (Object)t2, s);
            d86.p((Object)b2);
        }
        d86.O();
        final b80 b3 = b2;
        final l9r h0 = zzz.h0((Object)stb, d86);
        Object o = ac0;
        if (t2 != null) {
            o = ac0;
            if (ac0 instanceof n5r) {
                final n5r n5r = (n5r)ac0;
                o = ac0;
                if (!e0e.a((Object)n5r.c, (Object)t2)) {
                    o = new n5r(n5r.a, n5r.b, t2);
                }
            }
        }
        final l9r h2 = zzz.h0(o, d86);
        d86.x(-492369756);
        Object o2;
        if ((o2 = d86.y()) == b) {
            o2 = eg8.b(-1, null, 6);
            d86.p(o2);
        }
        d86.O();
        final xp3 xp3 = (xp3)o2;
        shw.n((ptb)new v80$a(xp3, (Object)t), d86);
        shw.h((Object)xp3, (hub)new v80$b(xp3, b3, h2, h0, (mp6)null), d86);
        final bc0 c = b3.c;
        d86.O();
        return (l9r<T>)c;
    }
}
