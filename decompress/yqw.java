import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yqw<V extends lc0> implements uqw<V>
{
    public final Map<Integer, awj<V, nq9>> a;
    public final int b;
    public final int c;
    public V d;
    public V e;
    
    public yqw(final Map<Integer, ? extends awj<? extends V, ? extends nq9>> p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        yqw.a:Ljava/util/Map;
        //     9: aload_0        
        //    10: iload_2        
        //    11: putfield        yqw.b:I
        //    14: aload_0        
        //    15: iconst_0       
        //    16: putfield        yqw.c:I
        //    19: return         
        //    Signature:
        //  (Ljava/util/Map<Ljava/lang/Integer;+Lawj<+TV;+Lnq9;>;>;II)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 3
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
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
    
    public final boolean a() {
        return false;
    }
    
    @Override
    public final int b() {
        return this.c;
    }
    
    @Override
    public final int c() {
        return this.b;
    }
    
    public final lc0 d(final lc0 lc0, final lc0 lc2, final lc0 lc3) {
        return mqb.b((qqw)this, lc0, lc2, lc3);
    }
    
    public final V e(long h, final V v, final V v2, final V v3) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "targetValue");
        e0e.f((Object)v3, "initialVelocity");
        h = jb2.H(h / 1000000L - this.b(), 0L, (long)this.c());
        if (h <= 0L) {
            return v3;
        }
        final lc0 w = ac8.w((qqw)this, h - 1L, (lc0)v, (lc0)v2, (lc0)v3);
        final lc0 w2 = ac8.w((qqw)this, h, (lc0)v, (lc0)v2, (lc0)v3);
        if (this.d == null) {
            this.d = (V)kqe.a0(v);
            this.e = (V)kqe.a0(v);
        }
        for (int i = 0; i < w.b(); ++i) {
            final lc0 e = this.e;
            if (e == null) {
                e0e.m("velocityVector");
                throw null;
            }
            e.e(i, (w.a(i) - w2.a(i)) * 1000.0f);
        }
        final lc0 e2 = this.e;
        if (e2 != null) {
            return (V)e2;
        }
        e0e.m("velocityVector");
        throw null;
    }
    
    public final V f(final long n, final V v, V v2, V lc0) {
        e0e.f((Object)v, "initialValue");
        e0e.f((Object)v2, "targetValue");
        e0e.f((Object)lc0, "initialVelocity");
        final int n2 = (int)jb2.H(n / 1000000L - this.c, 0L, (long)this.b);
        if (this.a.containsKey(n2)) {
            return (V)((awj)mlg.Q((Map)this.a, (Object)n2)).F0;
        }
        int b = this.b;
        if (n2 >= b) {
            return v2;
        }
        if (n2 <= 0) {
            return v;
        }
        Object d = pq9.d;
        final Iterator<Map.Entry<Integer, awj<V, nq9>>> iterator = this.a.entrySet().iterator();
        final int n3 = 0;
        lc0 = v;
        int n4 = 0;
        while (iterator.hasNext()) {
            final Map.Entry<Number, V> entry = (Map.Entry<Number, V>)iterator.next();
            final int intValue = entry.getKey().intValue();
            final awj awj = (awj)entry.getValue();
            if (n2 > intValue && intValue >= n4) {
                lc0 = (lc0)awj.F0;
                d = awj.G0;
                n4 = intValue;
            }
            else {
                if (n2 >= intValue || intValue > b) {
                    continue;
                }
                v2 = (V)awj.F0;
                b = intValue;
            }
        }
        final float a = ((nq9)d).a((n2 - n4) / (float)(b - n4));
        if (this.d == null) {
            this.d = (V)kqe.a0(v);
            this.e = (V)kqe.a0(v);
        }
        for (int b2 = lc0.b(), i = n3; i < b2; ++i) {
            final lc0 d2 = this.d;
            if (d2 == null) {
                e0e.m("valueVector");
                throw null;
            }
            final float a2 = lc0.a(i);
            final float a3 = v2.a(i);
            final miv a4 = cqw.a;
            d2.e(i, a3 * a + (1 - a) * a2);
        }
        final lc0 d3 = this.d;
        if (d3 != null) {
            return (V)d3;
        }
        e0e.m("valueVector");
        throw null;
    }
    
    public final long g(final lc0 lc0, final lc0 lc2, final lc0 lc3) {
        return tf8.c((uqw)this, lc0, lc2, lc3);
    }
}
