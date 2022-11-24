// 
// Decompiled by Procyon v0.6.0
// 

public final class to3
{
    public final g9g<ro3> a;
    
    public to3(final g9g<ro3> a) {
        e0e.f((Object)a, "logSequenceNumberManager");
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
            //     7: getstatic       i73$a.H0:Li73$a;
            //    10: astore_1       
            //    11: aload_0        
            //    12: iconst_0       
            //    13: iconst_1       
            //    14: iastore        
            //    15: getstatic       i73$a.I0:Li73$a;
            //    18: astore_1       
            //    19: aload_0        
            //    20: iconst_1       
            //    21: iconst_2       
            //    22: iastore        
            //    23: getstatic       i73$a.J0:Li73$a;
            //    26: astore_1       
            //    27: aload_0        
            //    28: iconst_2       
            //    29: iconst_3       
            //    30: iastore        
            //    31: getstatic       i73$a.K0:Li73$a;
            //    34: astore_1       
            //    35: aload_0        
            //    36: iconst_3       
            //    37: iconst_4       
            //    38: iastore        
            //    39: getstatic       i73$a.L0:Li73$a;
            //    42: astore_1       
            //    43: aload_0        
            //    44: iconst_4       
            //    45: iconst_5       
            //    46: iastore        
            //    47: aload_0        
            //    48: putstatic       to3$a.a:[I
            //    51: return         
            //    52: astore_1       
            //    53: goto            15
            //    56: astore_1       
            //    57: goto            23
            //    60: astore_1       
            //    61: goto            31
            //    64: astore_1       
            //    65: goto            39
            //    68: astore_1       
            //    69: goto            47
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  7      11     52     56     Ljava/lang/NoSuchFieldError;
            //  15     19     56     60     Ljava/lang/NoSuchFieldError;
            //  23     27     60     64     Ljava/lang/NoSuchFieldError;
            //  31     35     64     68     Ljava/lang/NoSuchFieldError;
            //  39     43     68     72     Ljava/lang/NoSuchFieldError;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 47, Size: 47
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
