import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p5a extends ste implements itb<okh, x66, Integer, okh>
{
    public final mzt<w4a> D0;
    public final m8r<bfq> E0;
    public final m8r<bfq> F0;
    public final String G0;
    
    public p5a(final mzt<w4a> p0, final m8r<bfq> p1, final m8r<bfq> p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: putfield        p5a.D0:Lmzt;
        //     5: aload_0        
        //     6: aload_2        
        //     7: putfield        p5a.E0:Lm8r;
        //    10: aload_0        
        //    11: aload_3        
        //    12: putfield        p5a.F0:Lm8r;
        //    15: aload_0        
        //    16: ldc             "Built-in"
        //    18: putfield        p5a.G0:Ljava/lang/String;
        //    21: aload_0        
        //    22: iconst_3       
        //    23: invokespecial   ste.<init>:(I)V
        //    26: return         
        //    Signature:
        //  (Lmzt<Lw4a;>;Lm8r<Lbfq;>;Lm8r<Lbfq;>;Ljava/lang/String;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
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
    
    public final Object h0(Object o, Object o2, final Object o3) {
        final okh okh = (okh)o;
        final x66 x66 = (x66)o2;
        ua.y((Number)o3, okh, "$this$composed", x66, 158379472);
        final n96$b a = n96.a;
        final mzt<w4a> d0 = this.D0;
        x66.x(1157296644);
        final boolean p3 = x66.P((Object)d0);
        o2 = x66.y();
        Label_0099: {
            if (!p3) {
                Objects.requireNonNull(x66.Companion);
                if ((o = o2) != x66$a.b) {
                    break Label_0099;
                }
            }
            o = blz.Q(Boolean.FALSE);
            x66.p(o);
        }
        x66.O();
        final puh puh = (puh)o;
        if (this.D0.b() == this.D0.f() && !this.D0.g()) {
            puh.setValue((Object)Boolean.FALSE);
        }
        else if (this.E0.getValue() != null || this.F0.getValue() != null) {
            puh.setValue((Object)Boolean.TRUE);
        }
        okh e = okh;
        if (((m8r)puh).getValue()) {
            final mzt<w4a> d2 = this.D0;
            final zhv c = npw.c(ftd.Companion);
            final String g0 = this.G0;
            x66.x(-492369756);
            o2 = x66.y();
            Objects.requireNonNull(x66.Companion);
            final x66$a$a b = x66$a.b;
            if ((o = o2) == b) {
                final StringBuilder sb = new StringBuilder();
                sb.append(g0);
                sb.append(" slide");
                o = sb.toString();
                x66.p(o);
            }
            x66.O();
            final mzt$a a2 = e0u.a((mzt)d2, c, (String)o, x66, 0);
            final mzt<w4a> d3 = this.D0;
            final m8r<bfq> e2 = this.E0;
            final m8r<bfq> f0 = this.F0;
            x66.x(1157296644);
            final boolean p4 = x66.P((Object)d3);
            o2 = x66.y();
            if (p4 || (o = o2) == b) {
                o = new ffq((mzt$a<ftd, ic0>)a2, e2, f0);
                x66.p(o);
            }
            x66.O();
            e = okh.E((okh)o);
        }
        x66.O();
        return e;
    }
}
