import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jez implements fdz
{
    public rll<o0u<byte[]>> a;
    public final rll<o0u<byte[]>> b;
    public final ocz c;
    
    public jez(final Context context, final ocz c) {
        this.c = c;
        final y63 e = y63.e;
        w0u.b(context);
        final r0u c2 = w0u.a().c((y3a)e);
        if (y63.d.contains(new j4a("json"))) {
            this.a = new exe((rll<Object>)new eez(c2));
        }
        this.b = new exe((rll<Object>)new iez(c2));
    }
    
    public static haa<byte[]> b(final ocz p0, final gzm p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   ocz.a:()I
        //     4: istore_2       
        //     5: aload_1        
        //     6: getfield        gzm.D0:Ljava/lang/Object;
        //     9: checkcast       Lfbz;
        //    12: astore_0       
        //    13: iload_2        
        //    14: ifne            22
        //    17: iconst_1       
        //    18: istore_3       
        //    19: goto            24
        //    22: iconst_0       
        //    23: istore_3       
        //    24: aload_0        
        //    25: iload_3        
        //    26: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    29: putfield        fbz.i:Ljava/lang/Boolean;
        //    32: aload_1        
        //    33: getfield        gzm.D0:Ljava/lang/Object;
        //    36: checkcast       Lfbz;
        //    39: astore_0       
        //    40: aload_0        
        //    41: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    44: putfield        fbz.g:Ljava/lang/Boolean;
        //    47: aload_1        
        //    48: getfield        gzm.C0:Ljava/lang/Object;
        //    51: checkcast       Lx4z;
        //    54: new             Ljbz;
        //    57: dup            
        //    58: aload_0        
        //    59: invokespecial   jbz.<init>:(Lfbz;)V
        //    62: putfield        x4z.a:Ljava/lang/Object;
        //    65: invokestatic    zez.a:()Lzez;
        //    68: pop            
        //    69: iload_2        
        //    70: ifne            186
        //    73: aload_1        
        //    74: getfield        gzm.C0:Ljava/lang/Object;
        //    77: checkcast       Lx4z;
        //    80: astore_0       
        //    81: new             Lb5z;
        //    84: astore_1       
        //    85: aload_1        
        //    86: aload_0        
        //    87: invokespecial   b5z.<init>:(Lx4z;)V
        //    90: new             Lree;
        //    93: astore          4
        //    95: aload           4
        //    97: invokespecial   ree.<init>:()V
        //   100: getstatic       tdy.J1:Ltdy;
        //   103: aload           4
        //   105: invokevirtual   tdy.A:(Li4a;)V
        //   108: aload           4
        //   110: iconst_1       
        //   111: putfield        ree.d:Z
        //   114: new             Ljava/io/StringWriter;
        //   117: astore_0       
        //   118: aload_0        
        //   119: invokespecial   java/io/StringWriter.<init>:()V
        //   122: new             Lgle;
        //   125: astore          5
        //   127: aload           5
        //   129: aload_0        
        //   130: aload           4
        //   132: getfield        ree.a:Ljava/util/HashMap;
        //   135: aload           4
        //   137: getfield        ree.b:Ljava/util/HashMap;
        //   140: aload           4
        //   142: getfield        ree.c:Lnee;
        //   145: aload           4
        //   147: getfield        ree.d:Z
        //   150: invokespecial   gle.<init>:(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Lj4j;Z)V
        //   153: aload           5
        //   155: aload_1        
        //   156: invokevirtual   gle.g:(Ljava/lang/Object;)Lgle;
        //   159: pop            
        //   160: aload           5
        //   162: invokevirtual   gle.i:()V
        //   165: aload           5
        //   167: getfield        gle.b:Landroid/util/JsonWriter;
        //   170: invokevirtual   android/util/JsonWriter.flush:()V
        //   173: aload_0        
        //   174: invokevirtual   java/io/StringWriter.toString:()Ljava/lang/String;
        //   177: ldc             "utf-8"
        //   179: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //   182: astore_0       
        //   183: goto            296
        //   186: aload_1        
        //   187: getfield        gzm.C0:Ljava/lang/Object;
        //   190: checkcast       Lx4z;
        //   193: astore_1       
        //   194: new             Lb5z;
        //   197: astore_0       
        //   198: aload_0        
        //   199: aload_1        
        //   200: invokespecial   b5z.<init>:(Lx4z;)V
        //   203: new             Lr9y;
        //   206: astore          5
        //   208: aload           5
        //   210: invokespecial   r9y.<init>:()V
        //   213: getstatic       tdy.J1:Ltdy;
        //   216: aload           5
        //   218: invokevirtual   tdy.A:(Li4a;)V
        //   221: new             Ljava/util/HashMap;
        //   224: astore          4
        //   226: aload           4
        //   228: aload           5
        //   230: getfield        r9y.a:Ljava/util/HashMap;
        //   233: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   236: new             Ljava/util/HashMap;
        //   239: astore_1       
        //   240: aload_1        
        //   241: aload           5
        //   243: getfield        r9y.b:Ljava/util/HashMap;
        //   246: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   249: aload           5
        //   251: getfield        r9y.c:Li9y;
        //   254: astore          6
        //   256: new             Ljava/io/ByteArrayOutputStream;
        //   259: astore          5
        //   261: aload           5
        //   263: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   266: new             Lr000;
        //   269: astore          7
        //   271: aload           7
        //   273: aload           5
        //   275: aload           4
        //   277: aload_1        
        //   278: aload           6
        //   280: invokespecial   r000.<init>:(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;Lj4j;)V
        //   283: aload           7
        //   285: aload_0        
        //   286: invokevirtual   r000.h:(Ljava/lang/Object;)Lr000;
        //   289: pop            
        //   290: aload           5
        //   292: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   295: astore_0       
        //   296: new             Lza1;
        //   299: dup            
        //   300: aload_0        
        //   301: getstatic       azk.D0:Lazk;
        //   304: invokespecial   za1.<init>:(Ljava/lang/Object;Lazk;)V
        //   307: areturn        
        //   308: astore_0       
        //   309: new             Ljava/lang/UnsupportedOperationException;
        //   312: dup            
        //   313: ldc             "Failed to covert logging to UTF-8 byte array"
        //   315: aload_0        
        //   316: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   319: athrow         
        //   320: astore_1       
        //   321: goto            173
        //   324: astore_0       
        //   325: goto            290
        //    Signature:
        //  (Locz;Lgzm;)Lhaa<[B>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  65     69     308    320    Ljava/io/UnsupportedEncodingException;
        //  73     122    308    320    Ljava/io/UnsupportedEncodingException;
        //  122    173    320    324    Ljava/io/IOException;
        //  173    183    308    320    Ljava/io/UnsupportedEncodingException;
        //  186    266    308    320    Ljava/io/UnsupportedEncodingException;
        //  266    290    324    328    Ljava/io/IOException;
        //  290    296    308    320    Ljava/io/UnsupportedEncodingException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 155, Size: 155
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
    
    @Override
    public final void a(final gzm gzm) {
        if (this.c.a() == 0) {
            final exe a = this.a;
            if (a != null) {
                ((o0u)a.get()).a((haa)b(this.c, gzm));
            }
            return;
        }
        this.b.get().a((haa)b(this.c, gzm));
    }
}
