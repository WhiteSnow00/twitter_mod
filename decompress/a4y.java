import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a$f;
import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a4y<T> implements uhj<T>
{
    public final t5c F0;
    public final int G0;
    public final tf0<?> H0;
    public final long I0;
    public final long J0;
    
    public a4y(final t5c p0, final int p1, final tf0<?> p2, final long p3, final long p4, final String p5, final String p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        a4y.F0:Lt5c;
        //     9: aload_0        
        //    10: iload_2        
        //    11: putfield        a4y.G0:I
        //    14: aload_0        
        //    15: aload_3        
        //    16: putfield        a4y.H0:Ltf0;
        //    19: aload_0        
        //    20: lload           4
        //    22: putfield        a4y.I0:J
        //    25: aload_0        
        //    26: lload           6
        //    28: putfield        a4y.J0:J
        //    31: return         
        //    Signature:
        //  (Lt5c;ILtf0<*>;JJLjava/lang/String;Ljava/lang/String;)V
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
    
    public static di6 a(final j3y<?> j3y, final gm1<?> gm1, int n) {
        final ciz f1 = gm1.f1;
        di6 i0;
        if (f1 == null) {
            i0 = null;
        }
        else {
            i0 = f1.I0;
        }
        if (i0 != null && i0.G0) {
            final int[] i2 = i0.I0;
            final int n2 = 1;
            final int n3 = 1;
            Label_0145: {
                if (i2 != null) {
                    final int length = i2.length;
                    int j = 0;
                    while (true) {
                        while (j < length) {
                            if (i2[j] == n) {
                                n = n2;
                                if (n == 0) {
                                    return null;
                                }
                                break Label_0145;
                            }
                            else {
                                ++j;
                            }
                        }
                        n = 0;
                        continue;
                    }
                }
                final int[] k0 = i0.K0;
                if (k0 != null) {
                    final int length2 = k0.length;
                    int l = 0;
                    while (true) {
                        while (l < length2) {
                            if (k0[l] == n) {
                                n = n3;
                                if (n != 0) {
                                    return null;
                                }
                                break Label_0145;
                            }
                            else {
                                ++l;
                            }
                        }
                        n = 0;
                        continue;
                    }
                }
            }
            if (j3y.l < i0.J0) {
                return i0;
            }
        }
        return null;
    }
    
    public final void q(final mcs<T> mcs) {
        if (!this.F0.c()) {
            return;
        }
        final elo a = dlo.a().a;
        if (a != null && !a.G0) {
            return;
        }
        final j3y j3y = (j3y)this.F0.O0.get((Object)this.H0);
        if (j3y != null) {
            final a$f b = j3y.b;
            if (b instanceof gm1) {
                final gm1 gm1 = (gm1)b;
                final long i0 = this.I0;
                final int n = 1;
                final int n2 = 0;
                int n3;
                if (i0 > 0L) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                final int a2 = gm1.a1;
                int f0;
                int n5;
                int n6;
                int n7;
                if (a != null) {
                    final boolean b2 = (n3 & (a.H0 ? 1 : 0)) != 0x0;
                    final int i2 = a.I0;
                    final int j0 = a.J0;
                    f0 = a.F0;
                    final boolean b3 = gm1.f1 != null;
                    int n4 = b2 ? 1 : 0;
                    int j2 = j0;
                    if (b3) {
                        n4 = (b2 ? 1 : 0);
                        j2 = j0;
                        if (!gm1.g()) {
                            final di6 a3 = a((j3y<?>)j3y, (gm1<?>)gm1, this.G0);
                            if (a3 == null) {
                                return;
                            }
                            if (a3.H0 && this.I0 > 0L) {
                                n4 = n;
                            }
                            else {
                                n4 = 0;
                            }
                            j2 = a3.J0;
                        }
                    }
                    n5 = i2;
                    n6 = j2;
                    n7 = n4;
                }
                else {
                    f0 = 0;
                    n5 = 5000;
                    n6 = 100;
                    n7 = n3;
                }
                final t5c f2 = this.F0;
                int n8 = 0;
                int n9 = 0;
                Label_0373: {
                    if (mcs.s()) {
                        n8 = 0;
                        n9 = n2;
                    }
                    else {
                        if (mcs.q()) {
                            n9 = 100;
                        }
                        else {
                            final Exception n10 = mcs.n();
                            if (n10 instanceof ApiException) {
                                final Status f3 = ((ApiException)n10).F0;
                                final int g0 = f3.G0;
                                final bi6 j3 = f3.J0;
                                int g2;
                                if (j3 == null) {
                                    g2 = -1;
                                }
                                else {
                                    g2 = j3.G0;
                                }
                                n8 = g2;
                                n9 = g0;
                                break Label_0373;
                            }
                            n9 = 101;
                        }
                        n8 = -1;
                    }
                }
                long i3;
                long currentTimeMillis;
                int n11;
                if (n7 != 0) {
                    i3 = this.I0;
                    currentTimeMillis = System.currentTimeMillis();
                    n11 = (int)(SystemClock.elapsedRealtime() - this.J0);
                }
                else {
                    i3 = 0L;
                    currentTimeMillis = 0L;
                    n11 = -1;
                }
                final mah mah = new mah(this.G0, n9, n8, i3, currentTimeMillis, null, null, a2, n11);
                final long n12 = n5;
                final d6y s0 = f2.S0;
                ((Handler)s0).sendMessage(((Handler)s0).obtainMessage(18, (Object)new b4y(mah, f0, n12, n6)));
            }
        }
    }
}
