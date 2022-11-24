// 
// Decompiled by Procyon v0.6.0
// 

public final class dye implements k0f
{
    public final stb<Integer, Object> a;
    public final hub<sye, Integer, w8c> b;
    public final stb<Integer, Object> c;
    public final mub<qye, Integer, d86, Integer, vzv> d;
    
    public dye(final stb<? super Integer, ?> p0, final hub<? super sye, ? super Integer, w8c> p1, final stb<? super Integer, ?> p2, final mub<? super qye, ? super Integer, ? super d86, ? super Integer, vzv> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "span"
        //     3: invokestatic    e0e.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0        
        //    11: aconst_null    
        //    12: putfield        dye.a:Lstb;
        //    15: aload_0        
        //    16: aload_1        
        //    17: putfield        dye.b:Lhub;
        //    20: aload_0        
        //    21: aload_2        
        //    22: putfield        dye.c:Lstb;
        //    25: aload_0        
        //    26: aload_3        
        //    27: putfield        dye.d:Lmub;
        //    30: return         
        //    Signature:
        //  (Lstb<-Ljava/lang/Integer;*>;Lhub<-Lsye;-Ljava/lang/Integer;Lw8c;>;Lstb<-Ljava/lang/Integer;*>;Lmub<-Lqye;-Ljava/lang/Integer;-Ld86;-Ljava/lang/Integer;Lvzv;>;)V [from metadata: (Lstb<-Ljava/lang/Integer;+Ljava/lang/Object;>;Lhub<-Lsye;-Ljava/lang/Integer;Lw8c;>;Lstb<-Ljava/lang/Integer;+Ljava/lang/Object;>;Lmub<-Lqye;-Ljava/lang/Integer;-Ld86;-Ljava/lang/Integer;Lvzv;>;)V]
        //  
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
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
    
    public final stb<Integer, Object> getKey() {
        return this.a;
    }
    
    public final stb<Integer, Object> getType() {
        return this.c;
    }
}
