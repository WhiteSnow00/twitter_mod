// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.soloader;

import java.io.IOException;
import java.io.File;
import android.content.Context;

public final class a extends e
{
    public final int j;
    
    public a(final Context context, final File file, final String s) {
        super(context, s, file);
        this.j = 1;
    }
    
    @Override
    public final byte[] h() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/facebook/soloader/e.h:Ljava/io/File;
        //     4: invokevirtual   java/io/File.getCanonicalFile:()Ljava/io/File;
        //     7: astore_3       
        //     8: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //    11: astore_2       
        //    12: aload_2        
        //    13: iconst_2       
        //    14: invokevirtual   android/os/Parcel.writeByte:(B)V
        //    17: aload_2        
        //    18: aload_3        
        //    19: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //    22: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //    25: aload_2        
        //    26: aload_3        
        //    27: invokevirtual   java/io/File.lastModified:()J
        //    30: invokevirtual   android/os/Parcel.writeLong:(J)V
        //    33: aload_0        
        //    34: getfield        com/facebook/soloader/g.d:Landroid/content/Context;
        //    37: astore          4
        //    39: aload           4
        //    41: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    44: astore_3       
        //    45: aload_3        
        //    46: ifnull          66
        //    49: aload_3        
        //    50: aload           4
        //    52: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    55: iconst_0       
        //    56: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    59: getfield        android/content/pm/PackageInfo.versionCode:I
        //    62: istore_1       
        //    63: goto            68
        //    66: iconst_0       
        //    67: istore_1       
        //    68: aload_2        
        //    69: iload_1        
        //    70: invokevirtual   android/os/Parcel.writeInt:(I)V
        //    73: aload_0        
        //    74: getfield        com/facebook/soloader/a.j:I
        //    77: iconst_1       
        //    78: iand           
        //    79: ifne            98
        //    82: aload_2        
        //    83: iconst_0       
        //    84: invokevirtual   android/os/Parcel.writeByte:(B)V
        //    87: aload_2        
        //    88: invokevirtual   android/os/Parcel.marshall:()[B
        //    91: astore_3       
        //    92: aload_2        
        //    93: invokevirtual   android/os/Parcel.recycle:()V
        //    96: aload_3        
        //    97: areturn        
        //    98: aload_0        
        //    99: getfield        com/facebook/soloader/g.d:Landroid/content/Context;
        //   102: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //   105: getfield        android/content/pm/ApplicationInfo.nativeLibraryDir:Ljava/lang/String;
        //   108: astore_3       
        //   109: aload_3        
        //   110: ifnonnull       129
        //   113: aload_2        
        //   114: iconst_1       
        //   115: invokevirtual   android/os/Parcel.writeByte:(B)V
        //   118: aload_2        
        //   119: invokevirtual   android/os/Parcel.marshall:()[B
        //   122: astore_3       
        //   123: aload_2        
        //   124: invokevirtual   android/os/Parcel.recycle:()V
        //   127: aload_3        
        //   128: areturn        
        //   129: new             Ljava/io/File;
        //   132: astore          4
        //   134: aload           4
        //   136: aload_3        
        //   137: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   140: aload           4
        //   142: invokevirtual   java/io/File.getCanonicalFile:()Ljava/io/File;
        //   145: astore_3       
        //   146: aload_3        
        //   147: invokevirtual   java/io/File.exists:()Z
        //   150: ifne            169
        //   153: aload_2        
        //   154: iconst_1       
        //   155: invokevirtual   android/os/Parcel.writeByte:(B)V
        //   158: aload_2        
        //   159: invokevirtual   android/os/Parcel.marshall:()[B
        //   162: astore_3       
        //   163: aload_2        
        //   164: invokevirtual   android/os/Parcel.recycle:()V
        //   167: aload_3        
        //   168: areturn        
        //   169: aload_2        
        //   170: iconst_2       
        //   171: invokevirtual   android/os/Parcel.writeByte:(B)V
        //   174: aload_2        
        //   175: aload_3        
        //   176: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   179: invokevirtual   android/os/Parcel.writeString:(Ljava/lang/String;)V
        //   182: aload_2        
        //   183: aload_3        
        //   184: invokevirtual   java/io/File.lastModified:()J
        //   187: invokevirtual   android/os/Parcel.writeLong:(J)V
        //   190: aload_2        
        //   191: invokevirtual   android/os/Parcel.marshall:()[B
        //   194: astore_3       
        //   195: aload_2        
        //   196: invokevirtual   android/os/Parcel.recycle:()V
        //   199: aload_3        
        //   200: areturn        
        //   201: astore_3       
        //   202: aload_2        
        //   203: invokevirtual   android/os/Parcel.recycle:()V
        //   206: aload_3        
        //   207: athrow         
        //   208: astore_3       
        //   209: goto            66
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  12     45     201    208    Any
        //  49     63     208    212    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  49     63     208    212    Ljava/lang/RuntimeException;
        //  49     63     201    208    Any
        //  68     92     201    208    Any
        //  98     109    201    208    Any
        //  113    123    201    208    Any
        //  129    163    201    208    Any
        //  169    195    201    208    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
    public final g$f l() throws IOException {
        return (g$f)new a(this);
    }
    
    public final class a extends e$b
    {
        public final File J0;
        public final int K0;
        public final com.facebook.soloader.a L0;
        
        public a(final com.facebook.soloader.a l0, final e e) throws IOException {
            super((e)(this.L0 = l0), (g)e);
            this.J0 = new File(l0.d.getApplicationInfo().nativeLibraryDir);
            this.K0 = l0.j;
        }
    }
}
