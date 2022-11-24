import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pi8 implements lsc
{
    public final byte[] F0;
    public final OutputStream G0;
    
    public pi8(final OutputStream g0) {
        this.F0 = new byte[2048];
        this.G0 = g0;
    }
    
    public final boolean h() {
        return false;
    }
    
    public final void m(final int p0, final InputStream p1, final int p2, final String p3, final String p4) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pi8.G0:Ljava/io/OutputStream;
        //     4: astore          4
        //     6: aload_0        
        //     7: getfield        pi8.F0:[B
        //    10: astore          5
        //    12: iload_3        
        //    13: istore_1       
        //    14: iload_3        
        //    15: ifge            56
        //    18: aload_2        
        //    19: aload           5
        //    21: iconst_0       
        //    22: aload           5
        //    24: arraylength    
        //    25: invokevirtual   java/io/InputStream.read:([BII)I
        //    28: istore_1       
        //    29: iload_1        
        //    30: iconst_m1      
        //    31: if_icmpeq       180
        //    34: aload           4
        //    36: ifnull          18
        //    39: aload           4
        //    41: aload           5
        //    43: iconst_0       
        //    44: iload_1        
        //    45: invokevirtual   java/io/OutputStream.write:([BII)V
        //    48: goto            18
        //    51: astore          5
        //    53: goto            157
        //    56: iload_1        
        //    57: ifle            180
        //    60: aload_2        
        //    61: aload           5
        //    63: iconst_0       
        //    64: iload_1        
        //    65: aload           5
        //    67: arraylength    
        //    68: invokestatic    java/lang/Math.min:(II)I
        //    71: invokevirtual   java/io/InputStream.read:([BII)I
        //    74: istore          6
        //    76: iload           6
        //    78: iconst_m1      
        //    79: if_icmpeq       114
        //    82: iload           6
        //    84: ifle            56
        //    87: iload_1        
        //    88: iload           6
        //    90: isub           
        //    91: istore_3       
        //    92: iload_3        
        //    93: istore_1       
        //    94: aload           4
        //    96: ifnull          56
        //    99: aload           4
        //   101: aload           5
        //   103: iconst_0       
        //   104: iload           6
        //   106: invokevirtual   java/io/OutputStream.write:([BII)V
        //   109: iload_3        
        //   110: istore_1       
        //   111: goto            56
        //   114: new             Ljava/io/IOException;
        //   117: astore          5
        //   119: new             Ljava/lang/StringBuilder;
        //   122: astore          7
        //   124: aload           7
        //   126: invokespecial   java/lang/StringBuilder.<init>:()V
        //   129: aload           7
        //   131: ldc             "Invalid content length: "
        //   133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   136: pop            
        //   137: aload           7
        //   139: iload_1        
        //   140: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   143: pop            
        //   144: aload           5
        //   146: aload           7
        //   148: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   151: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   154: aload           5
        //   156: athrow         
        //   157: aload_2        
        //   158: invokestatic    j2e.e:(Ljava/io/InputStream;)I
        //   161: pop            
        //   162: aload           4
        //   164: ifnull          177
        //   167: aload           4
        //   169: invokevirtual   java/io/OutputStream.flush:()V
        //   172: aload           4
        //   174: invokevirtual   java/io/OutputStream.close:()V
        //   177: aload           5
        //   179: athrow         
        //   180: aload_2        
        //   181: invokestatic    j2e.e:(Ljava/io/InputStream;)I
        //   184: pop            
        //   185: aload           4
        //   187: ifnull          200
        //   190: aload           4
        //   192: invokevirtual   java/io/OutputStream.flush:()V
        //   195: aload           4
        //   197: invokevirtual   java/io/OutputStream.close:()V
        //   200: return         
        //   201: astore_2       
        //   202: goto            177
        //   205: astore_2       
        //   206: goto            200
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  18     29     51     180    Any
        //  39     48     51     180    Any
        //  60     76     51     180    Any
        //  99     109    51     180    Any
        //  114    157    51     180    Any
        //  167    177    201    205    Ljava/io/IOException;
        //  190    200    205    209    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0177:
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
    
    public final void p(final btc btc) {
    }
    
    public final qsm x() {
        return null;
    }
}
