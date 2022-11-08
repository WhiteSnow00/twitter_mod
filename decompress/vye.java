import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vye implements sye, hqg
{
    public final p2f a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List<xxe> e;
    public final int f;
    public final /* synthetic */ hqg g;
    
    public vye(final p2f p0, final int p1, final boolean p2, final float p3, final hqg p4, final List<? extends xxe> p5, final int p6, final int p7, final int p8, final boolean p9, final ioj p10, final int p11) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: ldc             "measureResult"
        //     4: invokestatic    zzd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_0        
        //     8: invokespecial   java/lang/Object.<init>:()V
        //    11: aload_0        
        //    12: aload_1        
        //    13: putfield        vye.a:Lp2f;
        //    16: aload_0        
        //    17: iload_2        
        //    18: putfield        vye.b:I
        //    21: aload_0        
        //    22: iload_3        
        //    23: putfield        vye.c:Z
        //    26: aload_0        
        //    27: fload           4
        //    29: putfield        vye.d:F
        //    32: aload_0        
        //    33: aload           6
        //    35: putfield        vye.e:Ljava/util/List;
        //    38: aload_0        
        //    39: iload           7
        //    41: putfield        vye.f:I
        //    44: aload_0        
        //    45: aload           5
        //    47: putfield        vye.g:Lhqg;
        //    50: return         
        //    Signature:
        //  (Lp2f;IZFLhqg;Ljava/util/List<+Lxxe;>;IIIZLioj;I)V
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
    
    public final int a() {
        return this.f;
    }
    
    public final List<xxe> b() {
        return this.e;
    }
    
    public final void c() {
        this.g.c();
    }
    
    public final Map<ex, Integer> d() {
        return this.g.d();
    }
    
    public final int getHeight() {
        return this.g.getHeight();
    }
    
    public final int getWidth() {
        return this.g.getWidth();
    }
}
