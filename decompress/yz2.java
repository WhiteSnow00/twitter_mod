import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yz2
{
    public final Context a;
    
    public yz2(final Context a) {
        czd.f((Object)a, "context");
        this.a = a;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: arraylength    
            //     4: newarray        I
            //     6: astore_0       
            //     7: aload_0        
            //     8: getstatic       com/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType.EMAIL:Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType;
            //    11: invokevirtual   java/lang/Enum.ordinal:()I
            //    14: iconst_1       
            //    15: iastore        
            //    16: aload_0        
            //    17: getstatic       com/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType.WEBSITE:Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType;
            //    20: invokevirtual   java/lang/Enum.ordinal:()I
            //    23: iconst_2       
            //    24: iastore        
            //    25: aload_0        
            //    26: getstatic       com/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType.PHONE:Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType;
            //    29: invokevirtual   java/lang/Enum.ordinal:()I
            //    32: iconst_3       
            //    33: iastore        
            //    34: aload_0        
            //    35: getstatic       com/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType.ADDRESS:Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType;
            //    38: invokevirtual   java/lang/Enum.ordinal:()I
            //    41: iconst_4       
            //    42: iastore        
            //    43: aload_0        
            //    44: getstatic       com/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType.POSTAL_CODE:Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType;
            //    47: invokevirtual   java/lang/Enum.ordinal:()I
            //    50: iconst_5       
            //    51: iastore        
            //    52: aload_0        
            //    53: getstatic       com/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType.CITY:Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType;
            //    56: invokevirtual   java/lang/Enum.ordinal:()I
            //    59: bipush          6
            //    61: iastore        
            //    62: aload_0        
            //    63: getstatic       com/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType.ADMIN_AREA:Lcom/twitter/business/moduleconfiguration/businessinfo/util/inputtext/BusinessInputTextType;
            //    66: invokevirtual   java/lang/Enum.ordinal:()I
            //    69: bipush          7
            //    71: iastore        
            //    72: aload_0        
            //    73: putstatic       yz2$a.a:[I
            //    76: return         
            //    77: astore_1       
            //    78: goto            16
            //    81: astore_1       
            //    82: goto            25
            //    85: astore_1       
            //    86: goto            34
            //    89: astore_1       
            //    90: goto            43
            //    93: astore_1       
            //    94: goto            52
            //    97: astore_1       
            //    98: goto            62
            //   101: astore_1       
            //   102: goto            72
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  7      16     77     81     Ljava/lang/NoSuchFieldError;
            //  16     25     81     85     Ljava/lang/NoSuchFieldError;
            //  25     34     85     89     Ljava/lang/NoSuchFieldError;
            //  34     43     89     93     Ljava/lang/NoSuchFieldError;
            //  43     52     93     97     Ljava/lang/NoSuchFieldError;
            //  52     62     97     101    Ljava/lang/NoSuchFieldError;
            //  62     72     101    105    Ljava/lang/NoSuchFieldError;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 56, Size: 56
            //     at java.util.ArrayList.rangeCheck(Unknown Source)
            //     at java.util.ArrayList.get(Unknown Source)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
}
