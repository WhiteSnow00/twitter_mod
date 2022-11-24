import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e4p implements prj
{
    public final int F0;
    public final List<e4p> G0;
    public Float H0;
    public Float I0;
    public m3p J0;
    public m3p K0;
    
    public e4p(final int p0, final List<e4p> p1, final Float p2, final Float p3, final m3p p4, final m3p p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "allScopes"
        //     3: invokestatic    e0e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0        
        //    11: iload_1        
        //    12: putfield        e4p.F0:I
        //    15: aload_0        
        //    16: aload_2        
        //    17: putfield        e4p.G0:Ljava/util/List;
        //    20: aload_0        
        //    21: aconst_null    
        //    22: putfield        e4p.H0:Ljava/lang/Float;
        //    25: aload_0        
        //    26: aconst_null    
        //    27: putfield        e4p.I0:Ljava/lang/Float;
        //    30: aload_0        
        //    31: aconst_null    
        //    32: putfield        e4p.J0:Lm3p;
        //    35: aload_0        
        //    36: aconst_null    
        //    37: putfield        e4p.K0:Lm3p;
        //    40: return         
        //    Signature:
        //  (ILjava/util/List<Le4p;>;Ljava/lang/Float;Ljava/lang/Float;Lm3p;Lm3p;)V
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
    public final boolean isValid() {
        return this.G0.contains(this);
    }
}
