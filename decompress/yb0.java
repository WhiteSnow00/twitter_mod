// 
// Decompiled by Procyon v0.6.0
// 

public final class yb0<T, V extends kc0>
{
    public final zhv<T, V> a;
    public final T b;
    public final long c;
    public final nsb<fzv> d;
    public final hwj e;
    public V f;
    public long g;
    public long h;
    public final hwj i;
    
    public yb0(final T p0, final zhv<T, V> p1, final V p2, final long p3, final T p4, final long p5, final boolean p6, final nsb<fzv> p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "typeConverter"
        //     3: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_3        
        //     7: ldc             "initialVelocityVector"
        //     9: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0        
        //    13: invokespecial   java/lang/Object.<init>:()V
        //    16: aload_0        
        //    17: aload_2        
        //    18: putfield        yb0.a:Lzhv;
        //    21: aload_0        
        //    22: aload           6
        //    24: putfield        yb0.b:Ljava/lang/Object;
        //    27: aload_0        
        //    28: lload           7
        //    30: putfield        yb0.c:J
        //    33: aload_0        
        //    34: aload           9
        //    36: putfield        yb0.d:Lnsb;
        //    39: aload_0        
        //    40: aload_1        
        //    41: invokestatic    blz.Q:(Ljava/lang/Object;)Lpuh;
        //    44: checkcast       Lhwj;
        //    47: putfield        yb0.e:Lhwj;
        //    50: aload_0        
        //    51: aload_3        
        //    52: invokestatic    rp9.I:(Lkc0;)Lkc0;
        //    55: putfield        yb0.f:Lkc0;
        //    58: aload_0        
        //    59: lload           4
        //    61: putfield        yb0.g:J
        //    64: aload_0        
        //    65: ldc2_w          -9223372036854775808
        //    68: putfield        yb0.h:J
        //    71: aload_0        
        //    72: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //    75: invokestatic    blz.Q:(Ljava/lang/Object;)Lpuh;
        //    78: checkcast       Lhwj;
        //    81: putfield        yb0.i:Lhwj;
        //    84: return         
        //    Signature:
        //  (TT;Lzhv<TT;TV;>;TV;JTT;JZLnsb<Lfzv;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 10
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
    
    public final void a() {
        this.e();
        this.d.invoke();
    }
    
    public final T b() {
        return (T)this.e.getValue();
    }
    
    public final T c() {
        return (T)this.a.b().invoke((Object)this.f);
    }
    
    public final boolean d() {
        return (boolean)this.i.getValue();
    }
    
    public final void e() {
        this.i.setValue((Object)Boolean.FALSE);
    }
}
