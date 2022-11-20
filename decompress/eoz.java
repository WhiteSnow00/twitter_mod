// 
// Decompiled by Procyon v0.6.0
// 

public final class eoz
{
    public final tgz a;
    public ylz b;
    public final int c;
    
    public eoz(final tgz a, final int c) {
        this.b = new ylz();
        this.a = a;
        xoz.a();
        this.c = c;
    }
    
    public final byte[] a(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        eoz.b:Lylz;
        //     4: astore_3       
        //     5: iload_1        
        //     6: ifne            14
        //     9: iconst_1       
        //    10: istore_2       
        //    11: goto            16
        //    14: iconst_0       
        //    15: istore_2       
        //    16: aload_3        
        //    17: iload_2        
        //    18: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    21: putfield        ylz.i:Ljava/lang/Boolean;
        //    24: aload_0        
        //    25: getfield        eoz.b:Lylz;
        //    28: astore_3       
        //    29: aload_3        
        //    30: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    33: putfield        ylz.g:Ljava/lang/Boolean;
        //    36: aload_0        
        //    37: getfield        eoz.a:Ltgz;
        //    40: new             Lamz;
        //    43: dup            
        //    44: aload_3        
        //    45: invokespecial   amz.<init>:(Lylz;)V
        //    48: putfield        tgz.a:Ljava/lang/Object;
        //    51: invokestatic    xoz.a:()Lxoz;
        //    54: pop            
        //    55: iload_1        
        //    56: ifne            169
        //    59: aload_0        
        //    60: getfield        eoz.a:Ltgz;
        //    63: astore_3       
        //    64: new             Lvgz;
        //    67: astore          4
        //    69: aload           4
        //    71: aload_3        
        //    72: invokespecial   vgz.<init>:(Ltgz;)V
        //    75: new             Lyde;
        //    78: astore          6
        //    80: aload           6
        //    82: invokespecial   yde.<init>:()V
        //    85: getstatic       msy.I0:Lmsy;
        //    88: aload           6
        //    90: invokevirtual   msy.g:(Ls3a;)V
        //    93: aload           6
        //    95: iconst_1       
        //    96: putfield        yde.d:Z
        //    99: new             Ljava/io/StringWriter;
        //   102: astore_3       
        //   103: aload_3        
        //   104: invokespecial   java/io/StringWriter.<init>:()V
        //   107: new             Lqke;
        //   110: astore          5
        //   112: aload           5
        //   114: aload_3        
        //   115: aload           6
        //   117: getfield        yde.a:Ljava/util/HashMap;
        //   120: aload           6
        //   122: getfield        yde.b:Ljava/util/HashMap;
        //   125: aload           6
        //   127: getfield        yde.c:Lude;
        //   130: aload           6
        //   132: getfield        yde.d:Z
        //   135: invokespecial   qke.<init>:(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Lp4j;Z)V
        //   138: aload           5
        //   140: aload           4
        //   142: invokevirtual   qke.g:(Ljava/lang/Object;)Lqke;
        //   145: pop            
        //   146: aload           5
        //   148: invokevirtual   qke.i:()V
        //   151: aload           5
        //   153: getfield        qke.b:Landroid/util/JsonWriter;
        //   156: invokevirtual   android/util/JsonWriter.flush:()V
        //   159: aload_3        
        //   160: invokevirtual   java/io/StringWriter.toString:()Ljava/lang/String;
        //   163: ldc             "utf-8"
        //   165: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //   168: areturn        
        //   169: aload_0        
        //   170: getfield        eoz.a:Ltgz;
        //   173: astore          4
        //   175: new             Lvgz;
        //   178: astore_3       
        //   179: aload_3        
        //   180: aload           4
        //   182: invokespecial   vgz.<init>:(Ltgz;)V
        //   185: new             Lnry;
        //   188: astore          5
        //   190: aload           5
        //   192: invokespecial   nry.<init>:()V
        //   195: getstatic       msy.I0:Lmsy;
        //   198: aload           5
        //   200: invokevirtual   msy.g:(Ls3a;)V
        //   203: new             Ljava/util/HashMap;
        //   206: astore          6
        //   208: aload           6
        //   210: aload           5
        //   212: getfield        nry.a:Ljava/util/HashMap;
        //   215: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   218: new             Ljava/util/HashMap;
        //   221: astore          4
        //   223: aload           4
        //   225: aload           5
        //   227: getfield        nry.b:Ljava/util/HashMap;
        //   230: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   233: aload           5
        //   235: getfield        nry.c:Llry;
        //   238: astore          7
        //   240: new             Ljava/io/ByteArrayOutputStream;
        //   243: astore          5
        //   245: aload           5
        //   247: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   250: new             Liry;
        //   253: astore          8
        //   255: aload           8
        //   257: aload           5
        //   259: aload           6
        //   261: aload           4
        //   263: aload           7
        //   265: invokespecial   iry.<init>:(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;Lp4j;)V
        //   268: aload           8
        //   270: aload_3        
        //   271: invokevirtual   iry.h:(Ljava/lang/Object;)Liry;
        //   274: pop            
        //   275: aload           5
        //   277: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   280: astore_3       
        //   281: aload_3        
        //   282: areturn        
        //   283: astore_3       
        //   284: new             Ljava/lang/UnsupportedOperationException;
        //   287: dup            
        //   288: ldc             "Failed to covert logging to UTF-8 byte array"
        //   290: aload_3        
        //   291: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   294: athrow         
        //   295: astore          4
        //   297: goto            159
        //   300: astore_3       
        //   301: goto            275
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  51     55     283    295    Ljava/io/UnsupportedEncodingException;
        //  59     107    283    295    Ljava/io/UnsupportedEncodingException;
        //  107    159    295    300    Ljava/io/IOException;
        //  159    169    283    295    Ljava/io/UnsupportedEncodingException;
        //  169    250    283    295    Ljava/io/UnsupportedEncodingException;
        //  250    275    300    304    Ljava/io/IOException;
        //  275    281    283    295    Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 142, Size: 142
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
}
