// 
// Decompiled by Procyon v0.6.0
// 

public final class gze implements fze
{
    public final kuh<dye> a;
    public boolean b;
    public final hub<sye, Integer, w8c> c;
    
    public gze() {
        this.a = new kuh<dye>();
        this.c = gze$a.F0;
    }
    
    public final void a(final int p0, final stb<? super Integer, ?> p1, final hub<? super sye, ? super Integer, w8c> p2, final stb<? super Integer, ?> p3, final mub<? super qye, ? super Integer, ? super d86, ? super Integer, vzv> p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gze.a:Lkuh;
        //     4: iload_1        
        //     5: new             Ldye;
        //     8: dup            
        //     9: aload_0        
        //    10: getfield        gze.c:Lgze$a;
        //    13: aload_2        
        //    14: aload_3        
        //    15: invokespecial   dye.<init>:(Lhub;Lstb;Lmub;)V
        //    18: invokevirtual   kuh.b:(ILjava/lang/Object;)V
        //    21: return         
        //    Signature:
        //  (ILstb<-Ljava/lang/Integer;*>;Lhub<-Lsye;-Ljava/lang/Integer;Lw8c;>;Lstb<-Ljava/lang/Integer;*>;Lmub<-Lqye;-Ljava/lang/Integer;-Ld86;-Ljava/lang/Integer;Lvzv;>;)V [from metadata: (ILstb<-Ljava/lang/Integer;+Ljava/lang/Object;>;Lhub<-Lsye;-Ljava/lang/Integer;Lw8c;>;Lstb<-Ljava/lang/Integer;+Ljava/lang/Object;>;Lmub<-Lqye;-Ljava/lang/Integer;-Ld86;-Ljava/lang/Integer;Lvzv;>;)V]
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
}
