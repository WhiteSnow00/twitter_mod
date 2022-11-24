import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sdz
{
    public static volatile yfz a;
    public static final Object b;
    
    static {
        sdz.a = tfz.F0;
        b = new Object();
    }
    
    public static boolean a(final Context p0, final Uri p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //     4: astore_1       
        //     5: ldc             "com.google.android.gms.phenotype"
        //     7: aload_1        
        //     8: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    11: istore_3       
        //    12: iconst_0       
        //    13: istore          4
        //    15: iload_3        
        //    16: ifne            36
        //    19: ldc             "PhenotypeClientHelper"
        //    21: aload_1        
        //    22: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    25: ldc             " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
        //    27: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    30: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    33: pop            
        //    34: iconst_0       
        //    35: ireturn        
        //    36: getstatic       sdz.a:Lyfz;
        //    39: invokevirtual   yfz.b:()Z
        //    42: ifeq            58
        //    45: getstatic       sdz.a:Lyfz;
        //    48: invokevirtual   yfz.a:()Ljava/lang/Object;
        //    51: checkcast       Ljava/lang/Boolean;
        //    54: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    57: ireturn        
        //    58: getstatic       sdz.b:Ljava/lang/Object;
        //    61: astore_1       
        //    62: aload_1        
        //    63: monitorenter   
        //    64: getstatic       sdz.a:Lyfz;
        //    67: invokevirtual   yfz.b:()Z
        //    70: ifeq            90
        //    73: getstatic       sdz.a:Lyfz;
        //    76: invokevirtual   yfz.a:()Ljava/lang/Object;
        //    79: checkcast       Ljava/lang/Boolean;
        //    82: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    85: istore_3       
        //    86: aload_1        
        //    87: monitorexit    
        //    88: iload_3        
        //    89: ireturn        
        //    90: ldc             "com.google.android.gms"
        //    92: aload_0        
        //    93: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    96: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    99: ifeq            105
        //   102: goto            164
        //   105: aload_0        
        //   106: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   109: astore          5
        //   111: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   114: bipush          29
        //   116: if_icmpge       124
        //   119: iconst_0       
        //   120: istore_2       
        //   121: goto            127
        //   124: ldc             268435456
        //   126: istore_2       
        //   127: aload           5
        //   129: ldc             "com.google.android.gms.phenotype"
        //   131: iload_2        
        //   132: invokevirtual   android/content/pm/PackageManager.resolveContentProvider:(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
        //   135: astore          5
        //   137: iload           4
        //   139: istore_3       
        //   140: aload           5
        //   142: ifnull          193
        //   145: ldc             "com.google.android.gms"
        //   147: aload           5
        //   149: getfield        android/content/pm/ProviderInfo.packageName:Ljava/lang/String;
        //   152: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   155: ifne            164
        //   158: iload           4
        //   160: istore_3       
        //   161: goto            193
        //   164: aload_0        
        //   165: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   168: astore_0       
        //   169: aload_0        
        //   170: ldc             "com.google.android.gms"
        //   172: iconst_0       
        //   173: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   176: astore_0       
        //   177: iload           4
        //   179: istore_3       
        //   180: aload_0        
        //   181: getfield        android/content/pm/ApplicationInfo.flags:I
        //   184: sipush          129
        //   187: iand           
        //   188: ifeq            193
        //   191: iconst_1       
        //   192: istore_3       
        //   193: new             Lagz;
        //   196: astore_0       
        //   197: aload_0        
        //   198: iload_3        
        //   199: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   202: invokespecial   agz.<init>:(Ljava/lang/Object;)V
        //   205: aload_0        
        //   206: putstatic       sdz.a:Lyfz;
        //   209: aload_1        
        //   210: monitorexit    
        //   211: getstatic       sdz.a:Lyfz;
        //   214: invokevirtual   yfz.a:()Ljava/lang/Object;
        //   217: checkcast       Ljava/lang/Boolean;
        //   220: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   223: ireturn        
        //   224: astore_0       
        //   225: aload_1        
        //   226: monitorexit    
        //   227: aload_0        
        //   228: athrow         
        //   229: astore_0       
        //   230: iload           4
        //   232: istore_3       
        //   233: goto            193
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  64     88     224    229    Any
        //  90     102    224    229    Any
        //  105    119    224    229    Any
        //  127    137    224    229    Any
        //  145    158    224    229    Any
        //  164    169    224    229    Any
        //  169    177    229    236    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  169    177    224    229    Any
        //  180    191    224    229    Any
        //  193    211    224    229    Any
        //  225    227    224    229    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0193:
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
}
