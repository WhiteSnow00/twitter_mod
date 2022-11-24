import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b2u implements a2u
{
    public final Set<v4a> a;
    public final z1u b;
    public final d2u c;
    
    public b2u(final Set<v4a> a, final z1u b, final d2u c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final <T> x1u<T> a(final String p0, final Class<T> p1, final v4a p2, final wzt<T, byte[]> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        b2u.a:Ljava/util/Set;
        //     4: aload_2        
        //     5: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    10: ifeq            32
        //    13: new             Lc2u;
        //    16: dup            
        //    17: aload_0        
        //    18: getfield        b2u.b:Lz1u;
        //    21: aload_1        
        //    22: aload_2        
        //    23: aload_3        
        //    24: aload_0        
        //    25: getfield        b2u.c:Ld2u;
        //    28: invokespecial   c2u.<init>:(Lz1u;Ljava/lang/String;Lv4a;Lwzt;Ld2u;)V
        //    31: areturn        
        //    32: new             Ljava/lang/IllegalArgumentException;
        //    35: dup            
        //    36: ldc             "%s is not supported byt this factory. Supported encodings are: %s."
        //    38: iconst_2       
        //    39: anewarray       Ljava/lang/Object;
        //    42: dup            
        //    43: iconst_0       
        //    44: aload_2        
        //    45: aastore        
        //    46: dup            
        //    47: iconst_1       
        //    48: aload_0        
        //    49: getfield        b2u.a:Ljava/util/Set;
        //    52: aastore        
        //    53: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    56: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    59: athrow         
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;Lv4a;Lwzt<TT;[B>;)Lx1u<TT;>;
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
