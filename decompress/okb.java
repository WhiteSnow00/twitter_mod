import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class okb
{
    public final List<isp> a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;
    
    public okb(final List<isp> p0, final char p1, final double p2, final double p3, final String p4, final String p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        okb.a:Ljava/util/List;
        //     9: aload_0        
        //    10: iload_2        
        //    11: putfield        okb.b:C
        //    14: aload_0        
        //    15: dload_3        
        //    16: putfield        okb.c:D
        //    19: aload_0        
        //    20: aload           5
        //    22: putfield        okb.d:Ljava/lang/String;
        //    25: aload_0        
        //    26: aload           6
        //    28: putfield        okb.e:Ljava/lang/String;
        //    31: return         
        //    Signature:
        //  (Ljava/util/List<Lisp;>;CDDLjava/lang/String;Ljava/lang/String;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 7
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
    
    public static int a(final char c, final String s, final String s2) {
        return s2.hashCode() + brg.d(s, (c + '\0') * 31, 31);
    }
    
    @Override
    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
