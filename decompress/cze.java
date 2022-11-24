import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cze implements zye, arg
{
    public final w2f a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List<eye> e;
    public final int f;
    public final arg g;
    
    public cze(final w2f p0, final int p1, final boolean p2, final float p3, final arg p4, final List<? extends eye> p5, final int p6, final int p7, final int p8, final boolean p9, final dpj p10, final int p11) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: ldc             "measureResult"
        //     4: invokestatic    e0e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0        
        //     8: invokespecial   java/lang/Object.<init>:()V
        //    11: aload_0        
        //    12: aload_1        
        //    13: putfield        cze.a:Lw2f;
        //    16: aload_0        
        //    17: iload_2        
        //    18: putfield        cze.b:I
        //    21: aload_0        
        //    22: iload_3        
        //    23: putfield        cze.c:Z
        //    26: aload_0        
        //    27: fload           4
        //    29: putfield        cze.d:F
        //    32: aload_0        
        //    33: aload           6
        //    35: putfield        cze.e:Ljava/util/List;
        //    38: aload_0        
        //    39: iload           7
        //    41: putfield        cze.f:I
        //    44: aload_0        
        //    45: aload           5
        //    47: putfield        cze.g:Larg;
        //    50: return         
        //    Signature:
        //  (Lw2f;IZFLarg;Ljava/util/List<+Leye;>;IIIZLdpj;I)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 9
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
    
    @Override
    public final int a() {
        return this.f;
    }
    
    @Override
    public final List<eye> b() {
        return this.e;
    }
    
    public final void c() {
        this.g.c();
    }
    
    public final Map<fx, Integer> d() {
        return this.g.d();
    }
    
    public final int getHeight() {
        return this.g.getHeight();
    }
    
    public final int getWidth() {
        return this.g.getWidth();
    }
}
