// 
// Decompiled by Procyon v0.6.0
// 

public final class xau extends zau
{
    public static final xau.xau$a Companion;
    public boolean f;
    public final vau g;
    
    static {
        Companion = new xau.xau$a();
    }
    
    public xau(final vvt p0, final y0k p1, final b0r p2, final h5j<taf> p3) {
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
        //    12: aload_0        
        //    13: ldc             "home-timeline-api-operation"
        //    15: aload_1        
        //    16: aconst_null    
        //    17: aload_2        
        //    18: iconst_0       
        //    19: aload_3        
        //    20: invokespecial   zau.<init>:(Ljava/lang/String;Lvvt;Ly0k;Lb0r;ZLh5j;)V
        //    23: aload_0        
        //    24: new             Lvau;
        //    27: dup            
        //    28: invokespecial   vau.<init>:()V
        //    31: putfield        xau.g:Lvau;
        //    34: return         
        //    Signature:
        //  (Lvvt;Ly0k;Lb0r;Lh5j<Ltaf;>;)V
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
    
    public final void a(final taf taf) {
        czd.f((Object)taf, "event");
        if (this.f) {
            return;
        }
        this.g.a(taf);
        if (taf instanceof taf$i) {
            final taf$i taf$i = (taf$i)taf;
            if (czd.a((Object)taf$i.a, (Object)this.g.a)) {
                final Long d = taf$i.d;
                if (d != null) {
                    final long longValue = d.longValue();
                    final b0r c = super.c;
                    if (c != null) {
                        ((u0k)c).b(Long.valueOf(longValue));
                    }
                }
                final Long b = taf$i.b;
                final bsc c2 = taf$i.c;
                final Long d2 = taf$i.d;
                if (b != null) {
                    final long longValue2 = b;
                    final Integer n = null;
                    Integer value = null;
                    Label_0155: {
                        if (c2 != null) {
                            final int[] z = c2.z;
                            if (z != null) {
                                value = z[1];
                                break Label_0155;
                            }
                        }
                        value = null;
                    }
                    final long n2 = this.c(value);
                    Integer value2 = null;
                    Label_0190: {
                        if (c2 != null) {
                            final int[] z2 = c2.z;
                            if (z2 != null) {
                                value2 = z2[2];
                                break Label_0190;
                            }
                        }
                        value2 = null;
                    }
                    final long n3 = this.c(value2);
                    Integer value3 = null;
                    Label_0225: {
                        if (c2 != null) {
                            final int[] z3 = c2.z;
                            if (z3 != null) {
                                value3 = z3[3];
                                break Label_0225;
                            }
                        }
                        value3 = null;
                    }
                    final long n4 = this.c(value3);
                    Integer value4 = null;
                    Label_0260: {
                        if (c2 != null) {
                            final int[] z4 = c2.z;
                            if (z4 != null) {
                                value4 = z4[4];
                                break Label_0260;
                            }
                        }
                        value4 = null;
                    }
                    final long n5 = longValue2 + n2 + n3 + n4 + this.c(value4);
                    final b0r c3 = super.c;
                    if (c3 != null && ((z0k)c3).a0()) {
                        Long n6;
                        if (asa.b().b("home_timeline_performance_zipkin_pct_metadata_enabled", false)) {
                            n6 = d2;
                        }
                        else {
                            n6 = null;
                        }
                        vvt.b(super.a, "home-timeline-api-operation", (y0k)null, super.c, (long)b, n5, (j06)null, n6, 96);
                        final vvt a = super.a;
                        final b0r c4 = super.c;
                        Integer value5 = n;
                        if (c2 != null) {
                            final int[] z5 = c2.z;
                            value5 = n;
                            if (z5 != null) {
                                value5 = z5[5];
                            }
                        }
                        vvt.b(a, "home-timeline-response-parse", (y0k)null, c4, n5, n5 + this.c(value5), (j06)null, (Long)null, 224);
                        this.f = true;
                    }
                }
            }
        }
    }
    
    public final int c(final Integer n) {
        if (n != null) {
            return n.intValue();
        }
        return 0;
    }
}
