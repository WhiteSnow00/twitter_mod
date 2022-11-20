import java.util.TreeMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nu8
{
    public final String a;
    public final String b;
    public final long c;
    public long d;
    public int e;
    public final int f;
    public final int g;
    public int[] h;
    public final TreeMap<Integer, Integer> i;
    
    public nu8(final String p0, final String p1, final long p2, final long p3, final int p4, final int p5, final int p6, final int[] p7, final TreeMap<Integer, Integer> p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        nu8.a:Ljava/lang/String;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        nu8.b:Ljava/lang/String;
        //    14: aload_0        
        //    15: lload_3        
        //    16: putfield        nu8.c:J
        //    19: aload_0        
        //    20: lconst_0       
        //    21: putfield        nu8.d:J
        //    24: aload_0        
        //    25: iload           5
        //    27: putfield        nu8.e:I
        //    30: aload_0        
        //    31: iload           6
        //    33: putfield        nu8.f:I
        //    36: aload_0        
        //    37: iload           7
        //    39: putfield        nu8.g:I
        //    42: aload_0        
        //    43: aload           8
        //    45: putfield        nu8.h:[I
        //    48: aload_0        
        //    49: aload           9
        //    51: putfield        nu8.i:Ljava/util/TreeMap;
        //    54: return         
        //    Signature:
        //  (Ljava/lang/String;Ljava/lang/String;JJIII[ILjava/util/TreeMap<Ljava/lang/Integer;Ljava/lang/Integer;>;)V
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
}
