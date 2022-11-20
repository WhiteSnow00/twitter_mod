// 
// Decompiled by Procyon v0.6.0
// 

public final class bbu extends zau
{
    public static final a Companion;
    public final sbu f;
    public final long g;
    public final yvk h;
    public boolean i;
    
    static {
        Companion = new a();
    }
    
    public bbu(final vvt p0, final y0k p1, final b0r p2, final h5j<taf> p3, final sbu p4, final long p5, final yvk p6) {
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
        //    12: aload           4
        //    14: ldc             "systemClock"
        //    16: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    19: aload           7
        //    21: ldc             "prefetchOffsetHandler"
        //    23: invokestatic    czd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //    26: aload_0        
        //    27: ldc             "home-timeline-api-time-to-first-request"
        //    29: aload_1        
        //    30: aload_2        
        //    31: aconst_null    
        //    32: iconst_0       
        //    33: aload_3        
        //    34: invokespecial   zau.<init>:(Ljava/lang/String;Lvvt;Ly0k;Lb0r;ZLh5j;)V
        //    37: aload_0        
        //    38: aload           4
        //    40: putfield        bbu.f:Lsbu;
        //    43: aload_0        
        //    44: lload           5
        //    46: putfield        bbu.g:J
        //    49: aload_0        
        //    50: aload           7
        //    52: putfield        bbu.h:Lyvk;
        //    55: return         
        //    Signature:
        //  (Lvvt;Ly0k;Lb0r;Lh5j<Ltaf;>;Lsbu;JLyvk;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 8
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
        if (taf instanceof taf$k) {
            final yvk h = this.h;
            long n = 0L;
            Label_0056: {
                if (h.d || h.e) {
                    n = h.c;
                    if (n != -1L) {
                        break Label_0056;
                    }
                }
                n = this.f.a();
            }
            if (!this.i) {
                vvt.b(super.a, "home-timeline-api-time-to-first-request", super.b, (b0r)null, this.g, n, (j06)null, (Long)null, 224);
                this.i = true;
            }
        }
    }
    
    public static final class a
    {
    }
}
