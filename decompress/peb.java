// 
// Decompiled by Procyon v0.6.0
// 

public final class peb<T extends seb> implements lkh, okh<peb<T>>
{
    public final rtb<seb, Boolean> C0;
    public final rtb<seb, Boolean> D0;
    public final nll<peb<T>> E0;
    public peb<T> F0;
    
    public peb(final rtb<? super seb, Boolean> p0, final rtb<? super seb, Boolean> p1, final nll<peb<T>> p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "key"
        //     3: invokestatic    zzd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0        
        //    11: aload_1        
        //    12: putfield        peb.C0:Lrtb;
        //    15: aload_0        
        //    16: aconst_null    
        //    17: putfield        peb.D0:Lrtb;
        //    20: aload_0        
        //    21: aload_2        
        //    22: putfield        peb.E0:Lnll;
        //    25: return         
        //    Signature:
        //  (Lrtb<-Lseb;Ljava/lang/Boolean;>;Lrtb<-Lseb;Ljava/lang/Boolean;>;Lnll<Lpeb<TT;>;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 3
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
    public final void A(final pkh pkh) {
        zzd.f((Object)pkh, "scope");
        this.F0 = pkh.g((kkh<peb<T>>)this.E0);
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final boolean a(final T t) {
        final rtb<seb, Boolean> c0 = this.C0;
        boolean a = false;
        if (c0 != null && (boolean)c0.invoke((Object)t)) {
            return true;
        }
        final peb<T> f0 = this.F0;
        if (f0 != null) {
            a = f0.a((seb)t);
        }
        return a;
    }
    
    public final boolean b(final T t) {
        final peb<T> f0 = this.F0;
        boolean booleanValue = false;
        if (f0 != null && f0.b((seb)t)) {
            return true;
        }
        final rtb<seb, Boolean> d0 = this.D0;
        if (d0 != null) {
            booleanValue = (boolean)d0.invoke((Object)t);
        }
        return booleanValue;
    }
    
    public final nll<peb<T>> getKey() {
        return this.E0;
    }
    
    public final Object getValue() {
        return this;
    }
}
