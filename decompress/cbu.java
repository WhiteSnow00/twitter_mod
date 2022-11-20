// 
// Decompiled by Procyon v0.6.0
// 

public final class cbu extends zau
{
    public static final cbu.cbu$a Companion;
    public boolean f;
    
    static {
        Companion = new cbu.cbu$a();
    }
    
    public cbu(final vvt p0, final y0k p1, final b0r p2, final h5j<taf> p3, final long p4, final sbu p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "tracer"
        //     3: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_3        
        //     7: ldc             "eventObservable"
        //     9: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload           6
        //    14: ldc             "systemClock"
        //    16: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    19: aload_0        
        //    20: ldc             "home-timeline-first-seen-ttft"
        //    22: aload_1        
        //    23: aload_2        
        //    24: aconst_null    
        //    25: iconst_1       
        //    26: aload_3        
        //    27: invokespecial   zau.<init>:(Ljava/lang/String;Lvvt;Ly0k;Lb0r;ZLh5j;)V
        //    30: aload_2        
        //    31: ifnull          59
        //    34: aload_0        
        //    35: getfield        zau.e:Lg0r;
        //    38: astore_1       
        //    39: aload_1        
        //    40: ifnull          59
        //    43: aload_1        
        //    44: aload           6
        //    46: invokevirtual   sbu.a:()J
        //    49: lload           4
        //    51: lsub           
        //    52: aconst_null    
        //    53: iconst_2       
        //    54: aconst_null    
        //    55: invokestatic    jxa.u:(Lgjg;JLjava/util/concurrent/TimeUnit;ILjava/lang/Object;)Z
        //    58: pop            
        //    59: return         
        //    Signature:
        //  (Lvvt;Ly0k;Lb0r;Lh5j<Ltaf;>;JLsbu;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 7
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
    
    public final void a(final taf taf) {
        czd.f((Object)taf, "event");
        if (this.f) {
            return;
        }
        if (taf instanceof taf$w) {
            final g0r e = super.e;
            int n = 0;
            if (e != null) {
                n = n;
                if (ze.g(e.l)) {
                    n = 1;
                }
            }
            if (n != 0) {
                super.e.stop();
                this.f = true;
            }
        }
    }
}
