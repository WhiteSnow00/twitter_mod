import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fq8<T> implements ear, gq8<T>
{
    public final ptb<T> F0;
    public final djq<T> G0;
    public fq8.fq8$a<T> H0;
    
    public fq8(final ptb<? extends T> p0, final djq<T> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "calculation"
        //     3: invokestatic    e0e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        fq8.F0:Lptb;
        //    15: aload_0        
        //    16: aconst_null    
        //    17: putfield        fq8.G0:Ldjq;
        //    20: aload_0        
        //    21: new             Lfq8$a;
        //    24: dup            
        //    25: invokespecial   fq8$a.<init>:()V
        //    28: putfield        fq8.H0:Lfq8$a;
        //    31: return         
        //    Signature:
        //  (Lptb<+TT;>;Ldjq<TT;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
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
    
    public final djq<T> a() {
        return this.G0;
    }
    
    public final T c() {
        final fq8.fq8$a fq8$a = (fq8.fq8$a)uiq.h((gar)this.H0);
        Objects.requireNonNull(piq.Companion);
        return (T)this.e((fq8.fq8$a<T>)fq8$a, uiq.j(), false, (ptb<? extends T>)this.F0).d;
    }
    
    public final fq8.fq8$a<T> e(fq8.fq8$a<T> fq8$a, piq f0, final boolean b, ptb<? extends T> ivh) {
        final boolean c = fq8$a.c((gq8)this, f0);
        int h0 = 0;
        final boolean b2 = false;
        final int n = 0;
        final int n2 = 0;
        if (c) {
            if (b) {
                if ((ivh = (ivh)fjq.b.f()) == null) {
                    ivh = new ivh((Object[])new awj[0]);
                }
                final int h2 = ivh.H0;
                if (h2 > 0) {
                    final Object[] f2 = ivh.F0;
                    e0e.d((Object)f2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int n3 = 0;
                    do {
                        ((stb)((awj)f2[n3]).F0).invoke((Object)this);
                    } while (++n3 < h2);
                }
                try {
                    final v5d c2 = fq8$a.c;
                    final Integer n4 = (Integer)fjq.a.f();
                    int intValue;
                    if (n4 != null) {
                        intValue = n4;
                    }
                    else {
                        intValue = 0;
                    }
                    if (c2 != null) {
                        for (int a = c2.a, i = 0; i < a; ++i) {
                            final Object o = ((Object[])c2.b)[i];
                            e0e.d(o, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            final int intValue2 = ((Number)((Object[])c2.c)[i]).intValue();
                            final ear ear = (ear)o;
                            fjq.a.h(intValue2 + intValue);
                            final stb<Object, vzv> f3 = f0.f();
                            if (f3 != null) {
                                f3.invoke((Object)ear);
                            }
                        }
                    }
                    fjq.a.h(intValue);
                    h0 = ivh.H0;
                    if (h0 > 0) {
                        final Object[] f4 = ivh.F0;
                        e0e.d((Object)f4, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        int n5 = n2;
                        do {
                            ((stb)((awj)f4[n5]).G0).invoke((Object)this);
                        } while (++n5 < h0);
                    }
                }
                finally {
                    final int h3 = ivh.H0;
                    if (h3 > 0) {
                        final Object[] f5 = ivh.F0;
                        e0e.d((Object)f5, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        int n6 = h0;
                        do {
                            ((stb)((awj)f5[n6]).G0).invoke((Object)this);
                        } while (++n6 < h3);
                    }
                }
            }
            return (fq8.fq8$a<T>)fq8$a;
        }
        final Integer n7 = (Integer)fjq.a.f();
        int intValue3;
        if (n7 != null) {
            intValue3 = n7;
        }
        else {
            intValue3 = 0;
        }
        final v5d v5d = new v5d(0, 1, null);
        if ((f0 = (piq)fjq.b.f()) == null) {
            f0 = (piq)new ivh((Object[])new awj[0]);
        }
        final int h4 = ((ivh)f0).H0;
        if (h4 > 0) {
            final Object[] f6 = ((ivh)f0).F0;
            e0e.d((Object)f6, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n8 = 0;
            do {
                ((stb)((awj)f6[n8]).F0).invoke((Object)this);
            } while (++n8 < h4);
        }
        try {
            final gz a2 = fjq.a;
            a2.h(intValue3 + 1);
            final Object c3 = piq.Companion.c((stb)new fq8$b(this, v5d, intValue3), (ptb)ivh);
            a2.h(intValue3);
            final int h5 = ((ivh)f0).H0;
            if (h5 > 0) {
                f0 = (piq)((ivh)f0).F0;
                e0e.d((Object)f0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n9 = 0;
                do {
                    ((stb)((awj)f0[n9]).G0).invoke((Object)this);
                } while (++n9 < h5);
            }
            synchronized (uiq.c) {
                final piq.a companion = piq.Companion;
                Objects.requireNonNull(companion);
                final piq j = uiq.j();
                final Object d = fq8$a.d;
                Objects.requireNonNull(fq8.fq8$a.Companion);
                final fq8$a$a companion2 = fq8.fq8$a.Companion;
                Label_0821: {
                    if (d != fq8.fq8$a.f) {
                        final djq<T> g0 = this.G0;
                        int n10 = b2 ? 1 : 0;
                        if (g0 != null) {
                            n10 = (b2 ? 1 : 0);
                            if (g0.b(c3, fq8$a.d)) {
                                n10 = 1;
                            }
                        }
                        if (n10 != 0) {
                            fq8$a.c = v5d;
                            fq8$a.e = fq8$a.d((gq8)this, j);
                            break Label_0821;
                        }
                    }
                    fq8$a = (fq8.fq8$a)uiq.m((gar)this.H0, (ear)this, j);
                    fq8$a.c = v5d;
                    fq8$a.e = fq8$a.d((gq8)this, j);
                    fq8$a.d = c3;
                }
                monitorexit(uiq.c);
                if (intValue3 == 0) {
                    companion.b();
                }
                return (fq8.fq8$a<T>)fq8$a;
            }
        }
        finally {
            final int h6 = ((ivh)f0).H0;
            if (h6 > 0) {
                final Object[] f7 = ((ivh)f0).F0;
                e0e.d((Object)f7, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n11 = n;
                do {
                    ((stb)((awj)f7[n11]).G0).invoke((Object)this);
                } while (++n11 < h6);
            }
        }
    }
    
    public final Object[] f() {
        final fq8.fq8$a fq8$a = (fq8.fq8$a)uiq.h((gar)this.H0);
        Objects.requireNonNull(piq.Companion);
        final v5d c = this.e((fq8.fq8$a<T>)fq8$a, uiq.j(), false, (ptb<? extends T>)this.F0).c;
        Object[] array;
        if (c == null || (array = (Object[])c.b) == null) {
            array = new Object[0];
        }
        return array;
    }
    
    public final void g(final gar gar) {
        this.H0 = (fq8.fq8$a<T>)gar;
    }
    
    public final T getValue() {
        final piq.a companion = piq.Companion;
        Objects.requireNonNull(companion);
        final stb<Object, vzv> f = uiq.j().f();
        if (f != null) {
            f.invoke((Object)this);
        }
        final fq8.fq8$a fq8$a = (fq8.fq8$a)uiq.h((gar)this.H0);
        Objects.requireNonNull(companion);
        return (T)this.e((fq8.fq8$a<T>)fq8$a, uiq.j(), true, (ptb<? extends T>)this.F0).d;
    }
    
    public final gar k() {
        return (gar)this.H0;
    }
    
    public final gar n(final gar gar, final gar gar2, final gar gar3) {
        return null;
    }
    
    @Override
    public final String toString() {
        final fq8.fq8$a fq8$a = (fq8.fq8$a)uiq.h((gar)this.H0);
        final StringBuilder f = ehk.f("DerivedState(value=");
        final fq8.fq8$a fq8$a2 = (fq8.fq8$a)uiq.h((gar)this.H0);
        Objects.requireNonNull(piq.Companion);
        String value;
        if (fq8$a2.c((gq8)this, uiq.j())) {
            value = String.valueOf(fq8$a2.d);
        }
        else {
            value = "<Not calculated>";
        }
        f.append(value);
        f.append(")@");
        f.append(this.hashCode());
        return f.toString();
    }
}
