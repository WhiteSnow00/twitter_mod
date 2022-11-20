import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnz
{
    public static final f3a e;
    public final kky a;
    public final oqy<w000> b;
    public final hjy c;
    public final oqy<Executor> d;
    
    static {
        e = new f3a("AssetPackManager");
    }
    
    public dnz(final kky p0, final oqy<w000> p1, final hjy p2, final yxz p3, final uty p4, final nqy p5, final rmy p6, final oqy<Executor> p7, final e9y p8, final yxy p9) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: new             Landroid/os/Handler;
        //     7: dup            
        //     8: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //    11: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //    14: pop            
        //    15: aload_0        
        //    16: aload_1        
        //    17: putfield        dnz.a:Lkky;
        //    20: aload_0        
        //    21: aload_2        
        //    22: putfield        dnz.b:Loqy;
        //    25: aload_0        
        //    26: aload_3        
        //    27: putfield        dnz.c:Lhjy;
        //    30: aload_0        
        //    31: aload           4
        //    33: putfield        dnz.d:Loqy;
        //    36: return         
        //    Signature:
        //  (Lkky;Loqy<Lw000;>;Lhjy;Lyxz;Luty;Lnqy;Lrmy;Loqy<Ljava/util/concurrent/Executor;>;Le9y;Lyxy;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 5
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public final void a(final boolean f) {
        final hjy c = this.c;
        synchronized (c) {
            final boolean b = ((rny)c).e != null;
            monitorexit(c);
            final hjy c2 = this.c;
            synchronized (c2) {
                ((rny)c2).f = f;
                ((rny)c2).b();
                monitorexit(c2);
                if (f && !b) {
                    ((Executor)this.d.a()).execute((Runnable)new tzz((Object)this, 2));
                }
            }
        }
    }
}
