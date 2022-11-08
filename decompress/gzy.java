import java.util.Dictionary;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.File;
import java.io.InputStream;
import java.util.Properties;
import java.io.FileInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzy
{
    public static final v3a h;
    public final byte[] a;
    public final tjy b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public int g;
    
    static {
        h = new v3a("SliceMetadataManager");
    }
    
    public gzy(final tjy b, final String c, final int d, final long e, final String f) {
        this.a = new byte[8192];
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = -1;
    }
    
    public final int a() throws IOException {
        final File q = this.b.q(this.c, this.d, this.e, this.f);
        if (!q.exists()) {
            return 0;
        }
        final FileInputStream fileInputStream = new FileInputStream(q);
        try {
            final Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new kpy("Slice checkpoint file corrupt.");
        }
        finally {
            try {
                fileInputStream.close();
            }
            finally {}
        }
    }
    
    public final bzy b() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gzy.b:Ltjy;
        //     4: aload_0        
        //     5: getfield        gzy.c:Ljava/lang/String;
        //     8: aload_0        
        //     9: getfield        gzy.d:I
        //    12: aload_0        
        //    13: getfield        gzy.e:J
        //    16: aload_0        
        //    17: getfield        gzy.f:Ljava/lang/String;
        //    20: invokevirtual   tjy.q:(Ljava/lang/String;IJLjava/lang/String;)Ljava/io/File;
        //    23: astore_1       
        //    24: aload_1        
        //    25: invokevirtual   java/io/File.exists:()Z
        //    28: ifeq            189
        //    31: new             Ljava/util/Properties;
        //    34: dup            
        //    35: invokespecial   java/util/Properties.<init>:()V
        //    38: astore_2       
        //    39: new             Ljava/io/FileInputStream;
        //    42: dup            
        //    43: aload_1        
        //    44: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    47: astore_1       
        //    48: aload_2        
        //    49: aload_1        
        //    50: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //    53: aload_1        
        //    54: invokevirtual   java/io/InputStream.close:()V
        //    57: aload_2        
        //    58: ldc             "fileStatus"
        //    60: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    63: ifnull          172
        //    66: aload_2        
        //    67: ldc             "previousChunk"
        //    69: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    72: ifnull          172
        //    75: aload_2        
        //    76: ldc             "fileStatus"
        //    78: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    81: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    84: istore_3       
        //    85: aload_2        
        //    86: ldc             "fileName"
        //    88: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    91: astore_1       
        //    92: aload_2        
        //    93: ldc             "fileOffset"
        //    95: ldc             "-1"
        //    97: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   100: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   103: lstore          4
        //   105: aload_2        
        //   106: ldc             "remainingBytes"
        //   108: ldc             "-1"
        //   110: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   113: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   116: lstore          6
        //   118: aload_2        
        //   119: ldc             "previousChunk"
        //   121: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   124: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   127: istore          8
        //   129: aload_0        
        //   130: aload_2        
        //   131: ldc             "metadataFileCounter"
        //   133: ldc             "0"
        //   135: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   138: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   141: putfield        gzy.g:I
        //   144: new             Lyky;
        //   147: dup            
        //   148: iload_3        
        //   149: aload_1        
        //   150: lload           4
        //   152: lload           6
        //   154: iload           8
        //   156: invokespecial   yky.<init>:(ILjava/lang/String;JJI)V
        //   159: areturn        
        //   160: astore_2       
        //   161: new             Lkpy;
        //   164: dup            
        //   165: ldc             "Slice checkpoint file corrupt."
        //   167: aload_2        
        //   168: invokespecial   kpy.<init>:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   171: athrow         
        //   172: new             Lkpy;
        //   175: dup            
        //   176: ldc             "Slice checkpoint file corrupt."
        //   178: invokespecial   kpy.<init>:(Ljava/lang/String;)V
        //   181: athrow         
        //   182: astore_2       
        //   183: aload_1        
        //   184: invokevirtual   java/io/InputStream.close:()V
        //   187: aload_2        
        //   188: athrow         
        //   189: new             Lkpy;
        //   192: dup            
        //   193: ldc             "Slice checkpoint file does not exist."
        //   195: invokespecial   kpy.<init>:(Ljava/lang/String;)V
        //   198: athrow         
        //   199: astore_1       
        //   200: goto            187
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  48     53     182    189    Any
        //  75     144    160    172    Ljava/lang/NumberFormatException;
        //  183    187    199    203    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0187:
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
    
    public final File c() {
        return new File(this.l(), String.format("%s-NAM.dat", this.g));
    }
    
    public final void d(final long n, final byte[] array, final int n2, final int n3) throws IOException {
        final RandomAccessFile randomAccessFile = new RandomAccessFile(this.c(), "rw");
        try {
            randomAccessFile.seek(n);
            randomAccessFile.write(array, n2, n3);
            randomAccessFile.close();
        }
        finally {
            try {
                randomAccessFile.close();
            }
            finally {}
        }
    }
    
    public final void e(final int n) throws IOException {
        final Properties properties = new Properties();
        ((Dictionary<String, String>)properties).put("fileStatus", "3");
        ((Dictionary<String, String>)properties).put("fileOffset", String.valueOf(this.c().length()));
        ((Dictionary<String, String>)properties).put("previousChunk", String.valueOf(n));
        ((Dictionary<String, String>)properties).put("metadataFileCounter", String.valueOf(this.g));
        final FileOutputStream fileOutputStream = new FileOutputStream(this.m());
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
    
    public final void f(final String s, final long n, final long n2, final int n3) throws IOException {
        final Properties properties = new Properties();
        ((Dictionary<String, String>)properties).put("fileStatus", "1");
        ((Dictionary<String, String>)properties).put("fileName", s);
        ((Dictionary<String, String>)properties).put("fileOffset", String.valueOf(n));
        ((Dictionary<String, String>)properties).put("remainingBytes", String.valueOf(n2));
        ((Dictionary<String, String>)properties).put("previousChunk", String.valueOf(n3));
        ((Dictionary<String, String>)properties).put("metadataFileCounter", String.valueOf(this.g));
        final FileOutputStream fileOutputStream = new FileOutputStream(this.m());
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
    
    public final void g(final byte[] p0, final int p1) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/Properties.<init>:()V
        //     7: astore_3       
        //     8: aload_3        
        //     9: ldc             "fileStatus"
        //    11: ldc             "2"
        //    13: invokevirtual   java/util/Dictionary.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    16: pop            
        //    17: aload_3        
        //    18: ldc             "previousChunk"
        //    20: iload_2        
        //    21: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    24: invokevirtual   java/util/Dictionary.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    27: pop            
        //    28: aload_3        
        //    29: ldc             "metadataFileCounter"
        //    31: aload_0        
        //    32: getfield        gzy.g:I
        //    35: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    38: invokevirtual   java/util/Dictionary.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    41: pop            
        //    42: new             Ljava/io/FileOutputStream;
        //    45: dup            
        //    46: aload_0        
        //    47: invokevirtual   gzy.m:()Ljava/io/File;
        //    50: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    53: astore          4
        //    55: aload_3        
        //    56: aload           4
        //    58: aconst_null    
        //    59: invokevirtual   java/util/Properties.store:(Ljava/io/OutputStream;Ljava/lang/String;)V
        //    62: aload           4
        //    64: invokevirtual   java/io/OutputStream.close:()V
        //    67: aload_0        
        //    68: getfield        gzy.b:Ltjy;
        //    71: astore_3       
        //    72: aload_0        
        //    73: getfield        gzy.c:Ljava/lang/String;
        //    76: astore          4
        //    78: aload_0        
        //    79: getfield        gzy.d:I
        //    82: istore_2       
        //    83: aload_0        
        //    84: getfield        gzy.e:J
        //    87: lstore          5
        //    89: aload_0        
        //    90: getfield        gzy.f:Ljava/lang/String;
        //    93: astore          7
        //    95: aload_3        
        //    96: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    99: pop            
        //   100: new             Ljava/io/File;
        //   103: dup            
        //   104: aload_3        
        //   105: aload           4
        //   107: iload_2        
        //   108: lload           5
        //   110: aload           7
        //   112: invokevirtual   tjy.r:(Ljava/lang/String;IJLjava/lang/String;)Ljava/io/File;
        //   115: ldc             "checkpoint_ext.dat"
        //   117: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   120: astore          4
        //   122: aload           4
        //   124: invokevirtual   java/io/File.exists:()Z
        //   127: ifeq            136
        //   130: aload           4
        //   132: invokevirtual   java/io/File.delete:()Z
        //   135: pop            
        //   136: new             Ljava/io/FileOutputStream;
        //   139: dup            
        //   140: aload           4
        //   142: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   145: astore          4
        //   147: aload           4
        //   149: aload_1        
        //   150: invokevirtual   java/io/OutputStream.write:([B)V
        //   153: aload           4
        //   155: invokevirtual   java/io/OutputStream.close:()V
        //   158: return         
        //   159: astore_1       
        //   160: aload           4
        //   162: invokevirtual   java/io/OutputStream.close:()V
        //   165: aload_1        
        //   166: athrow         
        //   167: astore_1       
        //   168: aload           4
        //   170: invokevirtual   java/io/OutputStream.close:()V
        //   173: aload_1        
        //   174: athrow         
        //   175: astore          4
        //   177: goto            165
        //   180: astore          4
        //   182: goto            173
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  55     62     167    175    Any
        //  147    153    159    167    Any
        //  160    165    175    180    Any
        //  168    173    180    185    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 94, Size: 94
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
    
    public final void h(final int n) throws IOException {
        final Properties properties = new Properties();
        ((Dictionary<String, String>)properties).put("fileStatus", "4");
        ((Dictionary<String, String>)properties).put("previousChunk", String.valueOf(n));
        ((Dictionary<String, String>)properties).put("metadataFileCounter", String.valueOf(this.g));
        final FileOutputStream fileOutputStream = new FileOutputStream(this.m());
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
    
    public final void i(final byte[] p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        gzy.g:I
        //     5: iconst_1       
        //     6: iadd           
        //     7: putfield        gzy.g:I
        //    10: new             Ljava/io/File;
        //    13: dup            
        //    14: aload_0        
        //    15: invokevirtual   gzy.l:()Ljava/io/File;
        //    18: ldc             "%s-LFH.dat"
        //    20: iconst_1       
        //    21: anewarray       Ljava/lang/Object;
        //    24: dup            
        //    25: iconst_0       
        //    26: aload_0        
        //    27: getfield        gzy.g:I
        //    30: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    33: aastore        
        //    34: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    37: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    40: astore_2       
        //    41: new             Ljava/io/FileOutputStream;
        //    44: astore_3       
        //    45: aload_3        
        //    46: aload_2        
        //    47: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    50: aload_3        
        //    51: aload_1        
        //    52: invokevirtual   java/io/FileOutputStream.write:([B)V
        //    55: aload_3        
        //    56: invokevirtual   java/io/FileOutputStream.close:()V
        //    59: return         
        //    60: astore_1       
        //    61: aload_3        
        //    62: invokevirtual   java/io/FileOutputStream.close:()V
        //    65: aload_1        
        //    66: athrow         
        //    67: astore_1       
        //    68: new             Lkpy;
        //    71: dup            
        //    72: ldc             "Could not write metadata file."
        //    74: aload_1        
        //    75: invokespecial   kpy.<init>:(Ljava/lang/String;Ljava/lang/Exception;)V
        //    78: athrow         
        //    79: astore_3       
        //    80: goto            65
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  41     50     67     79     Ljava/io/IOException;
        //  50     55     60     67     Any
        //  55     59     67     79     Ljava/io/IOException;
        //  61     65     79     83     Any
        //  65     67     67     79     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public final void j(final byte[] array, final InputStream inputStream) throws IOException {
        ++this.g;
        final FileOutputStream fileOutputStream = new FileOutputStream(this.c());
        try {
            fileOutputStream.write(array);
            for (int i = inputStream.read(this.a); i > 0; i = inputStream.read(this.a)) {
                fileOutputStream.write(this.a, 0, i);
            }
            fileOutputStream.close();
        }
        finally {
            try {
                fileOutputStream.close();
            }
            finally {}
        }
    }
    
    public final void k(final byte[] array, final int n) throws IOException {
        ++this.g;
        final FileOutputStream fileOutputStream = new FileOutputStream(this.c());
        try {
            fileOutputStream.write(array, 0, n);
            fileOutputStream.close();
        }
        finally {
            try {
                fileOutputStream.close();
            }
            finally {}
        }
    }
    
    public final File l() {
        final File r = this.b.r(this.c, this.d, this.e, this.f);
        if (!r.exists()) {
            r.mkdirs();
        }
        return r;
    }
    
    public final File m() throws IOException {
        final File q = this.b.q(this.c, this.d, this.e, this.f);
        q.getParentFile().mkdirs();
        q.createNewFile();
        return q;
    }
}
