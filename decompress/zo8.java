import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zo8<T> implements f9r, ap8<T>
{
    public final nsb<T> D0;
    public final hiq<T> E0;
    public zo8.zo8$a<T> F0;
    
    public zo8(final nsb<? extends T> p0, final hiq<T> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "calculation"
        //     3: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        zo8.D0:Lnsb;
        //    15: aload_0        
        //    16: aconst_null    
        //    17: putfield        zo8.E0:Lhiq;
        //    20: aload_0        
        //    21: new             Lzo8$a;
        //    24: dup            
        //    25: invokespecial   zo8$a.<init>:()V
        //    28: putfield        zo8.F0:Lzo8$a;
        //    31: return         
        //    Signature:
        //  (Lnsb<+TT;>;Lhiq<TT;>;)V
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
    
    public final hiq<T> a() {
        return this.E0;
    }
    
    public final T c() {
        final zo8.zo8$a zo8$a = yhq.h(this.F0);
        Objects.requireNonNull(thq.Companion);
        return (T)this.e((zo8.zo8$a<T>)zo8$a, yhq.j(), false, (nsb<? extends T>)this.D0).d;
    }
    
    public final zo8.zo8$a<T> e(zo8.zo8$a<T> zo8$a, thq d0, final boolean b, nsb<? extends T> suh) {
        final boolean c = zo8$a.c((ap8)this, d0);
        int f0 = 0;
        final boolean b2 = false;
        final int n = 0;
        final int n2 = 0;
        if (c) {
            if (b) {
                if ((suh = (suh)jiq.b.g()) == null) {
                    suh = new suh((Object[])new lvj[0]);
                }
                final int f2 = suh.F0;
                if (f2 > 0) {
                    final Object[] d2 = suh.D0;
                    czd.d((Object)d2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int n3 = 0;
                    do {
                        ((qsb)((lvj)d2[n3]).D0).invoke((Object)this);
                    } while (++n3 < f2);
                }
                try {
                    final v4d c2 = zo8$a.c;
                    final Integer n4 = (Integer)jiq.a.g();
                    int intValue;
                    if (n4 != null) {
                        intValue = n4;
                    }
                    else {
                        intValue = 0;
                    }
                    if (c2 != null) {
                        for (int c3 = c2.c, i = 0; i < c3; ++i) {
                            final Object o = c2.a[i];
                            czd.d(o, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            final int intValue2 = ((Number)c2.b[i]).intValue();
                            final f9r f9r = (f9r)o;
                            jiq.a.l((Object)(intValue2 + intValue));
                            final qsb f3 = d0.f();
                            if (f3 != null) {
                                f3.invoke((Object)f9r);
                            }
                        }
                    }
                    jiq.a.l((Object)intValue);
                    f0 = suh.F0;
                    if (f0 > 0) {
                        final Object[] d3 = suh.D0;
                        czd.d((Object)d3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        int n5 = n2;
                        do {
                            ((qsb)((lvj)d3[n5]).E0).invoke((Object)this);
                        } while (++n5 < f0);
                    }
                }
                finally {
                    final int f4 = suh.F0;
                    if (f4 > 0) {
                        final Object[] d4 = suh.D0;
                        czd.d((Object)d4, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        int n6 = f0;
                        do {
                            ((qsb)((lvj)d4[n6]).E0).invoke((Object)this);
                        } while (++n6 < f4);
                    }
                }
            }
            return (zo8.zo8$a<T>)zo8$a;
        }
        final Integer n7 = (Integer)jiq.a.g();
        int intValue3;
        if (n7 != null) {
            intValue3 = n7;
        }
        else {
            intValue3 = 0;
        }
        final v4d v4d = new v4d();
        if ((d0 = (thq)jiq.b.g()) == null) {
            d0 = (thq)new suh((Object[])new lvj[0]);
        }
        final int f5 = ((suh)d0).F0;
        if (f5 > 0) {
            final Object[] d5 = ((suh)d0).D0;
            czd.d((Object)d5, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int n8 = 0;
            do {
                ((qsb)((lvj)d5[n8]).D0).invoke((Object)this);
            } while (++n8 < f5);
        }
        try {
            final i99 a = jiq.a;
            a.l((Object)(intValue3 + 1));
            final Object c4 = thq.Companion.c((qsb)new zo8$b(this, v4d, intValue3), (nsb)suh);
            a.l((Object)intValue3);
            final int f6 = ((suh)d0).F0;
            if (f6 > 0) {
                d0 = (thq)((suh)d0).D0;
                czd.d((Object)d0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n9 = 0;
                do {
                    ((qsb)((lvj)d0[n9]).E0).invoke((Object)this);
                } while (++n9 < f6);
            }
            synchronized (yhq.c) {
                final thq$a companion = thq.Companion;
                Objects.requireNonNull(companion);
                final thq j = yhq.j();
                final Object d6 = zo8$a.d;
                Objects.requireNonNull(zo8.zo8$a.Companion);
                final zo8$a$a companion2 = zo8.zo8$a.Companion;
                Label_0812: {
                    if (d6 != zo8.zo8$a.f) {
                        final hiq<T> e0 = this.E0;
                        int n10 = b2 ? 1 : 0;
                        if (e0 != null) {
                            n10 = (b2 ? 1 : 0);
                            if (e0.b(c4, zo8$a.d)) {
                                n10 = 1;
                            }
                        }
                        if (n10 != 0) {
                            zo8$a.c = v4d;
                            zo8$a.e = zo8$a.d((ap8)this, j);
                            break Label_0812;
                        }
                    }
                    zo8$a = yhq.m(this.F0, this, j);
                    zo8$a.c = v4d;
                    zo8$a.e = zo8$a.d((ap8)this, j);
                    zo8$a.d = c4;
                }
                monitorexit(yhq.c);
                if (intValue3 == 0) {
                    companion.b();
                }
                return (zo8.zo8$a<T>)zo8$a;
            }
        }
        finally {
            final int f7 = ((suh)d0).F0;
            if (f7 > 0) {
                final Object[] d7 = ((suh)d0).D0;
                czd.d((Object)d7, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n11 = n;
                do {
                    ((qsb)((lvj)d7[n11]).E0).invoke((Object)this);
                } while (++n11 < f7);
            }
        }
    }
    
    public final Object[] f() {
        final zo8.zo8$a zo8$a = yhq.h(this.F0);
        Objects.requireNonNull(thq.Companion);
        final v4d c = this.e((zo8.zo8$a<T>)zo8$a, yhq.j(), false, (nsb<? extends T>)this.D0).c;
        Object[] a;
        if (c == null || (a = c.a) == null) {
            a = new Object[0];
        }
        return a;
    }
    
    @Override
    public final void g(final h9r h9r) {
        this.F0 = (zo8.zo8$a<T>)h9r;
    }
    
    public final T getValue() {
        final thq$a companion = thq.Companion;
        Objects.requireNonNull(companion);
        final qsb f = yhq.j().f();
        if (f != null) {
            f.invoke((Object)this);
        }
        final zo8.zo8$a zo8$a = yhq.h(this.F0);
        Objects.requireNonNull(companion);
        return (T)this.e((zo8.zo8$a<T>)zo8$a, yhq.j(), true, (nsb<? extends T>)this.D0).d;
    }
    
    @Override
    public final h9r l() {
        return (h9r)this.F0;
    }
    
    @Override
    public final h9r o(final h9r h9r, final h9r h9r2, final h9r h9r3) {
        return null;
    }
    
    @Override
    public final String toString() {
        final zo8.zo8$a zo8$a = yhq.h(this.F0);
        final StringBuilder j = fu8.j("DerivedState(value=");
        final zo8.zo8$a zo8$a2 = yhq.h(this.F0);
        Objects.requireNonNull(thq.Companion);
        String value;
        if (zo8$a2.c((ap8)this, yhq.j())) {
            value = String.valueOf(zo8$a2.d);
        }
        else {
            value = "<Not calculated>";
        }
        j.append(value);
        j.append(")@");
        j.append(this.hashCode());
        return j.toString();
    }
}
