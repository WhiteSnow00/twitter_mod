import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class thp
{
    public final qhp a;
    public final boolean b;
    public final swe c;
    public boolean d;
    public thp e;
    public final mhp f;
    public final int g;
    
    public thp(final qhp qhp, final boolean b) {
        this(qhp, b, kqe.m0((en8)qhp));
    }
    
    public thp(final qhp a, final boolean b, final swe c) {
        e0e.f((Object)a, "outerSemanticsNode");
        e0e.f((Object)c, "layoutNode");
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = jty.s(a);
        this.g = c.G0;
    }
    
    public static List c(final thp thp, List list, boolean b, int i) {
        if ((i & 0x1) != 0x0) {
            list = new ArrayList();
        }
        if ((i & 0x2) != 0x0) {
            b = false;
        }
        final List<thp> k = thp.k(b, false);
        int size;
        thp thp2;
        for (size = k.size(), i = 0; i < size; ++i) {
            thp2 = k.get(i);
            if (thp2.i()) {
                list.add(thp2);
            }
            else if (!thp2.f.H0) {
                c(thp2, list, false, 2);
            }
        }
        return list;
    }
    
    public final thp a(final t0n t0n, final stb<? super cip, vzv> stb) {
        final thp$a thp$a = new thp$a((stb)stb);
        int n;
        int n2;
        if (t0n != null) {
            n = this.g;
            n2 = 1000000000;
        }
        else {
            n = this.g;
            n2 = 2000000000;
        }
        final thp thp = new thp((qhp)thp$a, false, new swe(true, n + n2));
        thp.d = true;
        thp.e = this;
        return thp;
    }
    
    public final qni b() {
        qni qni;
        if (this.f.G0) {
            qhp qhp;
            if ((qhp = kqe.N(this.c)) == null) {
                qhp = this.a;
            }
            qni = kqe.l0((en8)qhp, 8);
        }
        else {
            qni = kqe.l0((en8)this.a, 8);
        }
        return qni;
    }
    
    public final p6m d() {
        if (!this.c.H()) {
            Objects.requireNonNull(p6m.Companion);
            return p6m.e;
        }
        return w9y.d((bwe)this.b());
    }
    
    public final List<thp> e(final boolean p0, final boolean p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        thp.f:Lmhp;
        //     4: getfield        mhp.H0:Z
        //     7: ifeq            14
        //    10: getstatic       h3a.F0:Lh3a;
        //    13: areturn        
        //    14: aload_0        
        //    15: invokevirtual   thp.i:()Z
        //    18: ifeq            29
        //    21: aload_0        
        //    22: aconst_null    
        //    23: iload_1        
        //    24: iconst_1       
        //    25: invokestatic    thp.c:(Lthp;Ljava/util/List;ZI)Ljava/util/List;
        //    28: areturn        
        //    29: aload_0        
        //    30: iload_1        
        //    31: iconst_1       
        //    32: invokevirtual   thp.k:(ZZ)Ljava/util/List;
        //    35: areturn        
        //    Signature:
        //  (ZZZ)Ljava/util/List<Lthp;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
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
    
    public final mhp f() {
        if (this.i()) {
            final mhp i = this.f.i();
            this.j(i);
            return i;
        }
        return this.f;
    }
    
    public final thp g() {
        final thp e = this.e;
        if (e != null) {
            return e;
        }
        swe l;
        if (this.b) {
            l = kqe.l(this.c, (stb)thp$b.F0);
        }
        else {
            l = null;
        }
        swe i = l;
        if (l == null) {
            i = kqe.l(this.c, (stb)thp$c.F0);
        }
        Object o;
        if (i != null) {
            o = kqe.O(i);
        }
        else {
            o = null;
        }
        if (o == null) {
            return null;
        }
        return new thp((qhp)o, this.b, kqe.m0((en8)o));
    }
    
    public final long h() {
        if (!this.c.H()) {
            Objects.requireNonNull(kgj.Companion);
            return kgj.b;
        }
        return w9y.s((bwe)this.b());
    }
    
    public final boolean i() {
        return this.b && this.f.G0;
    }
    
    public final void j(final mhp mhp) {
        if (!this.f.H0) {
            int i = 0;
            for (List<thp> k = this.k(false, false); i < k.size(); ++i) {
                final thp thp = k.get(i);
                if (!thp.i()) {
                    final mhp f = thp.f;
                    e0e.f((Object)f, "child");
                    for (final Map.Entry<bip, V> entry : f.F0.entrySet()) {
                        final bip bip = entry.getKey();
                        final V value = entry.getValue();
                        final Object value2 = mhp.F0.get(bip);
                        e0e.d((Object)bip, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        final Object invoke = bip.b.invoke(value2, (Object)value);
                        if (invoke != null) {
                            mhp.F0.put(bip, invoke);
                        }
                    }
                    thp.j(mhp);
                }
            }
        }
    }
    
    public final List<thp> k(final boolean b, final boolean b2) {
        if (this.d) {
            return (List<thp>)h3a.F0;
        }
        final ArrayList list = new ArrayList();
        ArrayList list2;
        if (b) {
            final swe c = this.c;
            list2 = new ArrayList();
            zzz.J(c, (List)list2);
        }
        else {
            final swe c2 = this.c;
            list2 = new ArrayList();
            kqe.H(c2, list2);
        }
        for (int size = list2.size(), i = 0; i < size; ++i) {
            list.add(new thp((qhp)list2.get(i), this.b));
        }
        if (b2) {
            final mhp f = this.f;
            final whp a = whp.a;
            final t0n t0n = (t0n)nhp.a(f, (bip)whp.r);
            if (t0n != null && this.f.G0 && (list.isEmpty() ^ true)) {
                list.add(this.a(t0n, (stb<? super cip, vzv>)new rhp(t0n)));
            }
            final mhp f2 = this.f;
            final bip<List<String>> b3 = whp.b;
            if (f2.g((bip)b3) && (list.isEmpty() ^ true)) {
                final mhp f3 = this.f;
                if (f3.G0) {
                    final List list3 = (List)nhp.a(f3, (bip)b3);
                    String s;
                    if (list3 != null) {
                        s = (String)rr4.E1(list3);
                    }
                    else {
                        s = null;
                    }
                    if (s != null) {
                        list.add(0, this.a(null, (stb<? super cip, vzv>)new shp(s)));
                    }
                }
            }
        }
        return list;
    }
}
