// 
// Decompiled by Procyon v0.6.0
// 

public final class fau extends gau
{
    public static final a Companion;
    public boolean f;
    public final cau g;
    public boolean h;
    
    static {
        Companion = new a();
    }
    
    public fau(final fvt p0, final u0k p1, final izq p2, final b5j<hbf> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "tracer"
        //     3: invokestatic    zzd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_3        
        //     7: ldc             "eventObservable"
        //     9: invokestatic    zzd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0        
        //    13: ldc             "home-timeline-prepare"
        //    15: aload_1        
        //    16: aconst_null    
        //    17: aload_2        
        //    18: iconst_1       
        //    19: aload_3        
        //    20: invokespecial   gau.<init>:(Ljava/lang/String;Lfvt;Lu0k;Lizq;ZLb5j;)V
        //    23: aload_0        
        //    24: new             Lcau;
        //    27: dup            
        //    28: invokespecial   cau.<init>:()V
        //    31: putfield        fau.g:Lcau;
        //    34: return         
        //    Signature:
        //  (Lfvt;Lu0k;Lizq;Lb5j<Lhbf;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
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
    
    public final void a(final hbf hbf) {
        zzd.f((Object)hbf, "event");
        if (this.f) {
            return;
        }
        this.g.a(hbf);
        if (hbf instanceof hbf$g) {
            if (zzd.a((Object)((hbf$g)hbf).a, (Object)this.g.a)) {
                this.h = true;
            }
        }
        else if (hbf instanceof hbf$s) {
            if (this.h) {
                final mzq e = super.e;
                if (e != null) {
                    e.start();
                }
            }
        }
        else if (hbf instanceof hbf$r) {
            final mzq e2 = super.e;
            int n = 0;
            if (e2 != null) {
                n = n;
                if (hi.h(((bq1)e2).l)) {
                    n = 1;
                }
            }
            if (n != 0) {
                ((bq1)super.e).stop();
                this.f = true;
            }
        }
    }
    
    public static final class a
    {
    }
}
