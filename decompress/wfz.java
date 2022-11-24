import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wfz implements tez
{
    public qml<x1u<byte[]>> a;
    public final qml<x1u<byte[]>> b;
    public final cez c;
    
    public wfz(final Context context, final cez c) {
        this.c = c;
        final h73 e = h73.e;
        e2u.b(context);
        final a2u c2 = e2u.a().c((k4a)e);
        if (h73.d.contains(new v4a("json"))) {
            this.a = new lxe((qml<Object>)new rfz(c2));
        }
        this.b = new lxe((qml<Object>)new vfz(c2));
    }
    
    public static vaa<byte[]> b(final cez p0, final a8d p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   cez.a:()I
        //     4: istore_2       
        //     5: aload_1        
        //     6: getfield        a8d.G0:Ljava/lang/Object;
        //     9: checkcast       Ltcz;
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
        //    29: putfield        tcz.i:Ljava/lang/Boolean;
        //    32: aload_1        
        //    33: getfield        a8d.G0:Ljava/lang/Object;
        //    36: checkcast       Ltcz;
        //    39: astore_0       
        //    40: aload_0        
        //    41: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //    44: putfield        tcz.g:Ljava/lang/Boolean;
        //    47: aload_1        
        //    48: getfield        a8d.F0:Ljava/lang/Object;
        //    51: checkcast       Lk6z;
        //    54: new             Lxcz;
        //    57: dup            
        //    58: aload_0        
        //    59: invokespecial   xcz.<init>:(Ltcz;)V
        //    62: putfield        k6z.a:Ljava/lang/Object;
        //    65: invokestatic    mgz.a:()Lmgz;
        //    68: pop            
        //    69: iload_2        
        //    70: ifne            186
        //    73: aload_1        
        //    74: getfield        a8d.F0:Ljava/lang/Object;
        //    77: checkcast       Lk6z;
        //    80: astore_0       
        //    81: new             Lo6z;
        //    84: astore_1       
        //    85: aload_1        
        //    86: aload_0        
        //    87: invokespecial   o6z.<init>:(Lk6z;)V
        //    90: new             Lwee;
        //    93: astore          4
        //    95: aload           4
        //    97: invokespecial   wee.<init>:()V
        //   100: getstatic       omi.K0:Lomi;
        //   103: aload           4
        //   105: invokevirtual   omi.s:(Lu4a;)V
        //   108: aload           4
        //   110: iconst_1       
        //   111: putfield        wee.d:Z
        //   114: new             Ljava/io/StringWriter;
        //   117: astore_0       
        //   118: aload_0        
        //   119: invokespecial   java/io/StringWriter.<init>:()V
        //   122: new             Lnle;
        //   125: astore          5
        //   127: aload           5
        //   129: aload_0        
        //   130: aload           4
        //   132: getfield        wee.a:Ljava/util/HashMap;
        //   135: aload           4
        //   137: getfield        wee.b:Ljava/util/HashMap;
        //   140: aload           4
        //   142: getfield        wee.c:Lsee;
        //   145: aload           4
        //   147: getfield        wee.d:Z
        //   150: invokespecial   nle.<init>:(Ljava/io/Writer;Ljava/util/Map;Ljava/util/Map;Lb5j;Z)V
        //   153: aload           5
        //   155: aload_1        
        //   156: invokevirtual   nle.g:(Ljava/lang/Object;)Lnle;
        //   159: pop            
        //   160: aload           5
        //   162: invokevirtual   nle.i:()V
        //   165: aload           5
        //   167: getfield        nle.b:Landroid/util/JsonWriter;
        //   170: invokevirtual   android/util/JsonWriter.flush:()V
        //   173: aload_0        
        //   174: invokevirtual   java/io/StringWriter.toString:()Ljava/lang/String;
        //   177: ldc             "utf-8"
        //   179: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //   182: astore_0       
        //   183: goto            289
        //   186: aload_1        
        //   187: getfield        a8d.F0:Ljava/lang/Object;
        //   190: checkcast       Lk6z;
        //   193: astore_1       
        //   194: new             Lo6z;
        //   197: astore_0       
        //   198: aload_0        
        //   199: aload_1        
        //   200: invokespecial   o6z.<init>:(Lk6z;)V
        //   203: new             Lbby;
        //   206: astore_1       
        //   207: aload_1        
        //   208: invokespecial   bby.<init>:()V
        //   211: getstatic       omi.K0:Lomi;
        //   214: aload_1        
        //   215: invokevirtual   omi.s:(Lu4a;)V
        //   218: new             Ljava/util/HashMap;
        //   221: astore          5
        //   223: aload           5
        //   225: aload_1        
        //   226: getfield        bby.a:Ljava/util/HashMap;
        //   229: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   232: new             Ljava/util/HashMap;
        //   235: astore          4
        //   237: aload           4
        //   239: aload_1        
        //   240: getfield        bby.b:Ljava/util/HashMap;
        //   243: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //   246: aload_1        
        //   247: getfield        bby.c:Lsay;
        //   250: astore          6
        //   252: new             Ljava/io/ByteArrayOutputStream;
        //   255: astore_1       
        //   256: aload_1        
        //   257: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   260: new             Lc200;
        //   263: astore          7
        //   265: aload           7
        //   267: aload_1        
        //   268: aload           5
        //   270: aload           4
        //   272: aload           6
        //   274: invokespecial   c200.<init>:(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;Lb5j;)V
        //   277: aload           7
        //   279: aload_0        
        //   280: invokevirtual   c200.h:(Ljava/lang/Object;)Lc200;
        //   283: pop            
        //   284: aload_1        
        //   285: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   288: astore_0       
        //   289: new             Lza1;
        //   292: dup            
        //   293: aload_0        
        //   294: getstatic       zzk.G0:Lzzk;
        //   297: invokespecial   za1.<init>:(Ljava/lang/Object;Lzzk;)V
        //   300: areturn        
        //   301: astore_0       
        //   302: new             Ljava/lang/UnsupportedOperationException;
        //   305: dup            
        //   306: ldc             "Failed to covert logging to UTF-8 byte array"
        //   308: aload_0        
        //   309: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   312: athrow         
        //   313: astore_1       
        //   314: goto            173
        //   317: astore_0       
        //   318: goto            284
        //    Signature:
        //  (Lcez;La8d;)Lvaa<[B>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                  
        //  -----  -----  -----  -----  --------------------------------------
        //  65     69     301    313    Ljava/io/UnsupportedEncodingException;
        //  73     122    301    313    Ljava/io/UnsupportedEncodingException;
        //  122    173    313    317    Ljava/io/IOException;
        //  173    183    301    313    Ljava/io/UnsupportedEncodingException;
        //  186    260    301    313    Ljava/io/UnsupportedEncodingException;
        //  260    284    317    321    Ljava/io/IOException;
        //  284    289    301    313    Ljava/io/UnsupportedEncodingException;
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
    public final void a(final a8d a8d) {
        if (this.c.a() == 0) {
            final lxe a = this.a;
            if (a != null) {
                ((x1u)a.get()).a((vaa)b(this.c, a8d));
            }
            return;
        }
        this.b.get().a((vaa)b(this.c, a8d));
    }
}
