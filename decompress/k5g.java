import java.io.IOException;
import com.facebook.imagepipeline.request.a;
import java.util.concurrent.Executor;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k5g extends w4g
{
    public final Resources c;
    
    public k5g(final Executor executor, final grk grk, final Resources c) {
        super(executor, grk);
        this.c = c;
    }
    
    public final l4a c(final a p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        k5g.c:Landroid/content/res/Resources;
        //     4: aload_1        
        //     5: getfield        com/facebook/imagepipeline/request/a.b:Landroid/net/Uri;
        //     8: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //    11: iconst_1       
        //    12: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    15: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    18: invokevirtual   android/content/res/Resources.openRawResource:(I)Ljava/io/InputStream;
        //    21: astore          8
        //    23: aconst_null    
        //    24: astore          6
        //    26: aconst_null    
        //    27: astore          7
        //    29: aload_0        
        //    30: getfield        k5g.c:Landroid/content/res/Resources;
        //    33: aload_1        
        //    34: getfield        com/facebook/imagepipeline/request/a.b:Landroid/net/Uri;
        //    37: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //    40: iconst_1       
        //    41: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    44: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    47: invokevirtual   android/content/res/Resources.openRawResourceFd:(I)Landroid/content/res/AssetFileDescriptor;
        //    50: astore_1       
        //    51: aload_1        
        //    52: astore          7
        //    54: aload_1        
        //    55: astore          6
        //    57: aload_1        
        //    58: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //    61: lstore          4
        //    63: lload           4
        //    65: l2i            
        //    66: istore_2       
        //    67: goto            98
        //    70: astore_1       
        //    71: aload           7
        //    73: ifnull          81
        //    76: aload           7
        //    78: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    81: aload_1        
        //    82: athrow         
        //    83: astore_1       
        //    84: iconst_m1      
        //    85: istore_3       
        //    86: iload_3        
        //    87: istore_2       
        //    88: aload           6
        //    90: ifnull          102
        //    93: iload_3        
        //    94: istore_2       
        //    95: aload           6
        //    97: astore_1       
        //    98: aload_1        
        //    99: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   102: aload_0        
        //   103: aload           8
        //   105: iload_2        
        //   106: invokevirtual   w4g.b:(Ljava/io/InputStream;I)Ll4a;
        //   109: areturn        
        //   110: astore          6
        //   112: goto            81
        //   115: astore_1       
        //   116: goto            102
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  29     51     83     98     Landroid/content/res/Resources$NotFoundException;
        //  29     51     70     83     Any
        //  57     63     83     98     Landroid/content/res/Resources$NotFoundException;
        //  57     63     70     83     Any
        //  76     81     110    115    Ljava/io/IOException;
        //  98     102    115    119    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0081:
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
    
    public final String d() {
        return "LocalResourceFetchProducer";
    }
}
