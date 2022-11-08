import java.util.Dictionary;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Objects;
import java.util.Properties;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxy
{
    public static final v3a d;
    public final tjy a;
    public final rxy b;
    public final o8y c;
    
    static {
        d = new v3a("PackMetadataManager");
    }
    
    public jxy(final tjy a, final rxy b, final o8y c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final String a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        jxy.c:Lo8y;
        //     4: invokevirtual   o8y.a:()Z
        //     7: ifeq            180
        //    10: aload_0        
        //    11: getfield        jxy.a:Ltjy;
        //    14: astore_2       
        //    15: aload_2        
        //    16: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    19: pop            
        //    20: aload_2        
        //    21: aload_1        
        //    22: invokevirtual   tjy.u:(Ljava/lang/String;)Ljava/lang/String;
        //    25: astore_2       
        //    26: aload_2        
        //    27: ifnull          35
        //    30: iconst_1       
        //    31: istore_3       
        //    32: goto            37
        //    35: iconst_0       
        //    36: istore_3       
        //    37: iload_3        
        //    38: ifne            44
        //    41: goto            180
        //    44: aload_0        
        //    45: getfield        jxy.b:Lrxy;
        //    48: invokevirtual   rxy.a:()I
        //    51: istore_3       
        //    52: aload_0        
        //    53: getfield        jxy.a:Ltjy;
        //    56: astore_2       
        //    57: new             Ljava/io/File;
        //    60: dup            
        //    61: aload_2        
        //    62: aload_1        
        //    63: iload_3        
        //    64: aload_2        
        //    65: aload_1        
        //    66: invokevirtual   tjy.l:(Ljava/lang/String;)J
        //    69: invokevirtual   tjy.o:(Ljava/lang/String;IJ)Ljava/io/File;
        //    72: ldc             "properties.dat"
        //    74: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    77: astore          4
        //    79: aload           4
        //    81: invokevirtual   java/io/File.exists:()Z
        //    84: ifne            97
        //    87: iload_3        
        //    88: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    91: astore_2       
        //    92: aload_2        
        //    93: astore_1       
        //    94: goto            151
        //    97: new             Ljava/io/FileInputStream;
        //   100: astore_2       
        //   101: aload_2        
        //   102: aload           4
        //   104: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   107: new             Ljava/util/Properties;
        //   110: astore          4
        //   112: aload           4
        //   114: invokespecial   java/util/Properties.<init>:()V
        //   117: aload           4
        //   119: aload_2        
        //   120: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //   123: aload_2        
        //   124: invokevirtual   java/io/InputStream.close:()V
        //   127: aload           4
        //   129: ldc             "moduleVersionTag"
        //   131: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   134: astore_2       
        //   135: aload_2        
        //   136: ifnonnull       149
        //   139: iload_3        
        //   140: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   143: astore_2       
        //   144: aload_2        
        //   145: astore_1       
        //   146: goto            151
        //   149: aload_2        
        //   150: astore_1       
        //   151: aload_1        
        //   152: areturn        
        //   153: astore          4
        //   155: aload_2        
        //   156: invokevirtual   java/io/InputStream.close:()V
        //   159: aload           4
        //   161: athrow         
        //   162: astore_2       
        //   163: getstatic       jxy.d:Lv3a;
        //   166: ldc             "Failed to read pack version tag for pack %s"
        //   168: iconst_1       
        //   169: anewarray       Ljava/lang/Object;
        //   172: dup            
        //   173: iconst_0       
        //   174: aload_1        
        //   175: aastore        
        //   176: invokevirtual   v3a.k:(Ljava/lang/String;[Ljava/lang/Object;)I
        //   179: pop            
        //   180: ldc             ""
        //   182: areturn        
        //   183: astore_2       
        //   184: goto            35
        //   187: astore_2       
        //   188: goto            159
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  20     26     183    187    Ljava/io/IOException;
        //  79     92     162    180    Ljava/io/IOException;
        //  97     107    162    180    Ljava/io/IOException;
        //  107    123    153    162    Any
        //  123    135    162    180    Ljava/io/IOException;
        //  139    144    162    180    Ljava/io/IOException;
        //  155    159    187    191    Any
        //  159    162    162    180    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0159:
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
    
    public final void b(final String s, final int n, final long n2, final String s2) throws IOException {
        String value = null;
        Label_0023: {
            if (s2 != null) {
                value = s2;
                if (!s2.isEmpty()) {
                    break Label_0023;
                }
            }
            value = String.valueOf(n);
        }
        final Properties properties = new Properties();
        ((Dictionary<String, String>)properties).put("moduleVersionTag", value);
        final tjy a = this.a;
        Objects.requireNonNull(a);
        final File file = new File(a.o(s, n, n2), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, null);
            fileOutputStream.close();
        }
        finally {
            try {
                fileOutputStream.close();
            }
            finally {}
        }
    }
}
