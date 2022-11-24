import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2f implements b2f, arg
{
    public final t2f a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List<l1f> e;
    public final int f;
    public final int g;
    public final int h;
    public final arg i;
    
    public e2f(final t2f p0, final int p1, final boolean p2, final float p3, final arg p4, final List<? extends l1f> p5, final int p6, final int p7, final int p8, final boolean p9, final dpj p10, final int p11) {
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
        //    13: putfield        e2f.a:Lt2f;
        //    16: aload_0        
        //    17: iload_2        
        //    18: putfield        e2f.b:I
        //    21: aload_0        
        //    22: iload_3        
        //    23: putfield        e2f.c:Z
        //    26: aload_0        
        //    27: fload           4
        //    29: putfield        e2f.d:F
        //    32: aload_0        
        //    33: aload           6
        //    35: putfield        e2f.e:Ljava/util/List;
        //    38: aload_0        
        //    39: iload           7
        //    41: putfield        e2f.f:I
        //    44: aload_0        
        //    45: iload           8
        //    47: putfield        e2f.g:I
        //    50: aload_0        
        //    51: iload           9
        //    53: putfield        e2f.h:I
        //    56: aload_0        
        //    57: aload           5
        //    59: putfield        e2f.i:Larg;
        //    62: return         
        //    Signature:
        //  (Lt2f;IZFLarg;Ljava/util/List<+Ll1f;>;IIIZLdpj;I)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 11
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
    
    public final int a() {
        return this.h;
    }
    
    public final List<l1f> b() {
        return this.e;
    }
    
    public final void c() {
        this.i.c();
    }
    
    public final Map<fx, Integer> d() {
        return this.i.d();
    }
    
    public final int e() {
        return this.g;
    }
    
    public final int f() {
        return this.f;
    }
    
    public final int getHeight() {
        return this.i.getHeight();
    }
    
    public final int getWidth() {
        return this.i.getWidth();
    }
}
