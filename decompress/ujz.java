import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ujz
{
    public static final Logger a;
    public static final String b;
    
    static {
        a = Logger.getLogger(jiz.class.getName());
        b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
    }
    
    public static wiz b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //     5: astore_1       
        //     6: ldc             Lwiz;.class
        //     8: ldc             Lwiz;.class
        //    10: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    13: ifeq            23
        //    16: getstatic       ujz.b:Ljava/lang/String;
        //    19: astore_0       
        //    20: goto            68
        //    23: ldc             Lwiz;.class
        //    25: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    28: ldc             Lujz;.class
        //    30: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    33: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    36: ifeq            326
        //    39: ldc             "%s.BlazeGenerated%sLoader"
        //    41: iconst_2       
        //    42: anewarray       Ljava/lang/Object;
        //    45: dup            
        //    46: iconst_0       
        //    47: ldc             Lwiz;.class
        //    49: invokevirtual   java/lang/Class.getPackage:()Ljava/lang/Package;
        //    52: invokevirtual   java/lang/Package.getName:()Ljava/lang/String;
        //    55: aastore        
        //    56: dup            
        //    57: iconst_1       
        //    58: ldc             Lwiz;.class
        //    60: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //    63: aastore        
        //    64: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    67: astore_0       
        //    68: aload_0        
        //    69: iconst_1       
        //    70: aload_1        
        //    71: invokestatic    java/lang/Class.forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
        //    74: astore_0       
        //    75: aload_0        
        //    76: iconst_0       
        //    77: anewarray       Ljava/lang/Class;
        //    80: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    83: iconst_0       
        //    84: anewarray       Ljava/lang/Object;
        //    87: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    90: checkcast       Lujz;
        //    93: astore_0       
        //    94: ldc             Lwiz;.class
        //    96: aload_0        
        //    97: invokevirtual   ujz.a:()Lwiz;
        //   100: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //   103: checkcast       Lwiz;
        //   106: areturn        
        //   107: astore_2       
        //   108: new             Ljava/lang/IllegalStateException;
        //   111: astore_0       
        //   112: aload_0        
        //   113: aload_2        
        //   114: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   117: aload_0        
        //   118: athrow         
        //   119: astore_2       
        //   120: new             Ljava/lang/IllegalStateException;
        //   123: astore_0       
        //   124: aload_0        
        //   125: aload_2        
        //   126: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   129: aload_0        
        //   130: athrow         
        //   131: astore_2       
        //   132: new             Ljava/lang/IllegalStateException;
        //   135: astore_0       
        //   136: aload_0        
        //   137: aload_2        
        //   138: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   141: aload_0        
        //   142: athrow         
        //   143: astore_2       
        //   144: new             Ljava/lang/IllegalStateException;
        //   147: astore_0       
        //   148: aload_0        
        //   149: aload_2        
        //   150: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   153: aload_0        
        //   154: athrow         
        //   155: astore_0       
        //   156: ldc             Lujz;.class
        //   158: aload_1        
        //   159: invokestatic    java/util/ServiceLoader.load:(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;
        //   162: invokevirtual   java/util/ServiceLoader.iterator:()Ljava/util/Iterator;
        //   165: astore_1       
        //   166: new             Ljava/util/ArrayList;
        //   169: dup            
        //   170: invokespecial   java/util/ArrayList.<init>:()V
        //   173: astore_2       
        //   174: aload_1        
        //   175: invokeinterface java/util/Iterator.hasNext:()Z
        //   180: ifeq            236
        //   183: aload_2        
        //   184: ldc             Lwiz;.class
        //   186: aload_1        
        //   187: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   192: checkcast       Lujz;
        //   195: invokevirtual   ujz.a:()Lwiz;
        //   198: invokevirtual   java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
        //   201: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   204: pop            
        //   205: goto            174
        //   208: astore_0       
        //   209: getstatic       ujz.a:Ljava/util/logging/Logger;
        //   212: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
        //   215: ldc             "com.google.protobuf.GeneratedExtensionRegistryLoader"
        //   217: ldc             "load"
        //   219: ldc             "Unable to load "
        //   221: ldc             Lwiz;.class
        //   223: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   226: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   229: aload_0        
        //   230: invokevirtual   java/util/logging/Logger.logp:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   233: goto            174
        //   236: aload_2        
        //   237: invokevirtual   java/util/ArrayList.size:()I
        //   240: iconst_1       
        //   241: if_icmpne       253
        //   244: aload_2        
        //   245: iconst_0       
        //   246: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   249: checkcast       Lwiz;
        //   252: areturn        
        //   253: aload_2        
        //   254: invokevirtual   java/util/ArrayList.size:()I
        //   257: ifne            262
        //   260: aconst_null    
        //   261: areturn        
        //   262: ldc             Lwiz;.class
        //   264: ldc             "combine"
        //   266: iconst_1       
        //   267: anewarray       Ljava/lang/Class;
        //   270: dup            
        //   271: iconst_0       
        //   272: ldc             Ljava/util/Collection;.class
        //   274: aastore        
        //   275: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   278: aconst_null    
        //   279: iconst_1       
        //   280: anewarray       Ljava/lang/Object;
        //   283: dup            
        //   284: iconst_0       
        //   285: aload_2        
        //   286: aastore        
        //   287: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   290: checkcast       Lwiz;
        //   293: astore_0       
        //   294: aload_0        
        //   295: areturn        
        //   296: astore_0       
        //   297: new             Ljava/lang/IllegalStateException;
        //   300: dup            
        //   301: aload_0        
        //   302: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   305: athrow         
        //   306: astore_0       
        //   307: new             Ljava/lang/IllegalStateException;
        //   310: dup            
        //   311: aload_0        
        //   312: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   315: athrow         
        //   316: astore_0       
        //   317: new             Ljava/lang/IllegalStateException;
        //   320: dup            
        //   321: aload_0        
        //   322: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/Throwable;)V
        //   325: athrow         
        //   326: new             Ljava/lang/IllegalArgumentException;
        //   329: dup            
        //   330: ldc             Lwiz;.class
        //   332: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   335: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   338: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  68     75     155    326    Ljava/lang/ClassNotFoundException;
        //  75     94     143    155    Ljava/lang/NoSuchMethodException;
        //  75     94     131    143    Ljava/lang/InstantiationException;
        //  75     94     119    131    Ljava/lang/IllegalAccessException;
        //  75     94     107    119    Ljava/lang/reflect/InvocationTargetException;
        //  75     94     155    326    Ljava/lang/ClassNotFoundException;
        //  94     107    155    326    Ljava/lang/ClassNotFoundException;
        //  108    119    155    326    Ljava/lang/ClassNotFoundException;
        //  120    131    155    326    Ljava/lang/ClassNotFoundException;
        //  132    143    155    326    Ljava/lang/ClassNotFoundException;
        //  144    155    155    326    Ljava/lang/ClassNotFoundException;
        //  183    205    208    236    Ljava/util/ServiceConfigurationError;
        //  262    294    316    326    Ljava/lang/NoSuchMethodException;
        //  262    294    306    316    Ljava/lang/IllegalAccessException;
        //  262    294    296    306    Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 178, Size: 178
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
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
    
    public abstract wiz a();
}
