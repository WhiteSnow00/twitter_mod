import java.io.IOException;
import com.facebook.imagepipeline.request.a;
import java.util.concurrent.Executor;
import android.content.res.AssetManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3g extends b4g
{
    public final AssetManager c;
    
    public e3g(final Executor executor, final uqk uqk, final AssetManager c) {
        super(executor, uqk);
        this.c = c;
    }
    
    @Override
    public final j3a c(final a p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        e3g.c:Landroid/content/res/AssetManager;
        //     4: aload_1        
        //     5: getfield        com/facebook/imagepipeline/request/a.b:Landroid/net/Uri;
        //     8: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //    11: iconst_1       
        //    12: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    15: iconst_2       
        //    16: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;I)Ljava/io/InputStream;
        //    19: astore          8
        //    21: aconst_null    
        //    22: astore          6
        //    24: aconst_null    
        //    25: astore          7
        //    27: aload_0        
        //    28: getfield        e3g.c:Landroid/content/res/AssetManager;
        //    31: aload_1        
        //    32: getfield        com/facebook/imagepipeline/request/a.b:Landroid/net/Uri;
        //    35: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //    38: iconst_1       
        //    39: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    42: invokevirtual   android/content/res/AssetManager.openFd:(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //    45: astore_1       
        //    46: aload_1        
        //    47: astore          7
        //    49: aload_1        
        //    50: astore          6
        //    52: aload_1        
        //    53: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //    56: lstore          4
        //    58: lload           4
        //    60: l2i            
        //    61: istore_2       
        //    62: goto            91
        //    65: astore_1       
        //    66: aload           7
        //    68: ifnull          76
        //    71: aload           7
        //    73: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    76: aload_1        
        //    77: athrow         
        //    78: astore_1       
        //    79: iconst_m1      
        //    80: istore_2       
        //    81: iload_2        
        //    82: istore_3       
        //    83: aload           6
        //    85: ifnull          97
        //    88: aload           6
        //    90: astore_1       
        //    91: aload_1        
        //    92: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //    95: iload_2        
        //    96: istore_3       
        //    97: aload_0        
        //    98: aload           8
        //   100: iload_3        
        //   101: invokevirtual   b4g.b:(Ljava/io/InputStream;I)Lj3a;
        //   104: areturn        
        //   105: astore          6
        //   107: goto            76
        //   110: astore_1       
        //   111: iload_2        
        //   112: istore_3       
        //   113: goto            97
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  27     46     78     91     Ljava/io/IOException;
        //  27     46     65     78     Any
        //  52     58     78     91     Ljava/io/IOException;
        //  52     58     65     78     Any
        //  71     76     105    110    Ljava/io/IOException;
        //  91     95     110    116    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
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
    
    @Override
    public final String d() {
        return "LocalAssetFetchProducer";
    }
}
