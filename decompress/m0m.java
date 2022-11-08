import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class m0m<MODEL> implements kyr<l0m<MODEL>>
{
    public final Context C0;
    public final Class<? extends alq> D0;
    public final Class<MODEL> E0;
    public final dwo F0;
    
    public m0m(final Context p0, final dwo p1, final Class<? extends alq> p2, final Class<MODEL> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        m0m.C0:Landroid/content/Context;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        m0m.F0:Ldwo;
        //    14: aload_0        
        //    15: ldc             Lobw;.class
        //    17: putfield        m0m.D0:Ljava/lang/Class;
        //    20: aload_0        
        //    21: ldc             Lhbw;.class
        //    23: putfield        m0m.E0:Ljava/lang/Class;
        //    26: return         
        //    Signature:
        //  (Landroid/content/Context;Ldwo;Ljava/lang/Class<+Lalq;>;Ljava/lang/Class<TMODEL;>;)V
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
    
    public final Object get() {
        final l0m$a l0m$a = new l0m$a(this.C0, this.F0);
        l0m$a.c = this.D0;
        l0m$a.d = this.E0;
        l0m$a.e = gfv$p.a;
        l0m$a.f = ((kbw)this).G0;
        return ((h4j)l0m$a).e();
    }
}
