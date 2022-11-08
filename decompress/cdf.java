import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdf extends hdf<z7a> implements y2d
{
    public List<Integer> A;
    public int B;
    public float C;
    public float D;
    public float E;
    public fk7 F;
    public boolean G;
    public boolean H;
    public int z;
    
    public cdf(final List<z7a> p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokespecial   hdf.<init>:(Ljava/util/List;)V
        //     5: aload_0        
        //     6: iconst_1       
        //     7: putfield        cdf.z:I
        //    10: aload_0        
        //    11: aconst_null    
        //    12: putfield        cdf.A:Ljava/util/ArrayList;
        //    15: aload_0        
        //    16: iconst_m1      
        //    17: putfield        cdf.B:I
        //    20: aload_0        
        //    21: ldc             8.0
        //    23: putfield        cdf.C:F
        //    26: aload_0        
        //    27: ldc             4.0
        //    29: putfield        cdf.D:F
        //    32: aload_0        
        //    33: ldc             0.2
        //    35: putfield        cdf.E:F
        //    38: aload_0        
        //    39: new             Lfk7;
        //    42: dup            
        //    43: invokespecial   fk7.<init>:()V
        //    46: putfield        cdf.F:Lfk7;
        //    49: aload_0        
        //    50: iconst_1       
        //    51: putfield        cdf.G:Z
        //    54: aload_0        
        //    55: iconst_1       
        //    56: putfield        cdf.H:Z
        //    59: new             Ljava/util/ArrayList;
        //    62: dup            
        //    63: invokespecial   java/util/ArrayList.<init>:()V
        //    66: astore_1       
        //    67: aload_0        
        //    68: aload_1        
        //    69: putfield        cdf.A:Ljava/util/ArrayList;
        //    72: aload_1        
        //    73: invokevirtual   java/util/ArrayList.clear:()V
        //    76: aload_0        
        //    77: getfield        cdf.A:Ljava/util/ArrayList;
        //    80: sipush          140
        //    83: sipush          234
        //    86: sipush          255
        //    89: invokestatic    android/graphics/Color.rgb:(III)I
        //    92: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    95: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    98: pop            
        //    99: return         
        //    Signature:
        //  (Ljava/util/List<Lz7a;>;Ljava/lang/String;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
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
    
    @Deprecated
    public final boolean B() {
        return this.z == 2;
    }
    
    public final int C() {
        return this.A.size();
    }
    
    public final fk7 G() {
        return this.F;
    }
    
    public final void K() {
    }
    
    public final float N() {
        return this.C;
    }
    
    public final int Y(final int n) {
        return this.A.get(n);
    }
    
    public final boolean a0() {
        return this.G;
    }
    
    public final float c0() {
        return this.D;
    }
    
    public final void f() {
    }
    
    public final boolean f0() {
        return this.H;
    }
    
    public final int g() {
        return this.B;
    }
    
    public final float j() {
        return this.E;
    }
    
    public final int m() {
        return this.z;
    }
}
