// 
// Decompiled by Procyon v0.6.0
// 

public final class dgh
{
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
            //     8: getstatic       com/twitter/business/moduleconfiguration/mobileappmodule/util/inputtext/MobileAppPlatformType.GOOGLE:Lcom/twitter/business/moduleconfiguration/mobileappmodule/util/inputtext/MobileAppPlatformType;
            //    11: invokevirtual   java/lang/Enum.ordinal:()I
            //    14: iconst_1       
            //    15: iastore        
            //    16: aload_0        
            //    17: getstatic       com/twitter/business/moduleconfiguration/mobileappmodule/util/inputtext/MobileAppPlatformType.APPLE:Lcom/twitter/business/moduleconfiguration/mobileappmodule/util/inputtext/MobileAppPlatformType;
            //    20: invokevirtual   java/lang/Enum.ordinal:()I
            //    23: iconst_2       
            //    24: iastore        
            //    25: aload_0        
            //    26: putstatic       dgh$a.a:[I
            //    29: return         
            //    30: astore_1       
            //    31: goto            16
            //    34: astore_1       
            //    35: goto            25
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  7      16     30     34     Ljava/lang/NoSuchFieldError;
            //  16     25     34     38     Ljava/lang/NoSuchFieldError;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
