import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jia implements rd9
{
    public final p90 a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final zph d;
    public final ahk e;
    public final pz6<q73, ui4> f;
    public final lyr<Integer> g;
    public final lyr<Integer> h;
    
    public jia(final p90 p0, final ScheduledExecutorService p1, final ExecutorService p2, final zph p3, final ahk p4, final pz6<q73, ui4> p5, final lyr<Integer> p6, final lyr<Integer> p7, final lyr<Boolean> p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        jia.a:Lp90;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        jia.b:Ljava/util/concurrent/ScheduledExecutorService;
        //    14: aload_0        
        //    15: aload_3        
        //    16: putfield        jia.c:Ljava/util/concurrent/ExecutorService;
        //    19: aload_0        
        //    20: aload           4
        //    22: putfield        jia.d:Lzph;
        //    25: aload_0        
        //    26: aload           5
        //    28: putfield        jia.e:Lahk;
        //    31: aload_0        
        //    32: aload           6
        //    34: putfield        jia.f:Lpz6;
        //    37: aload_0        
        //    38: aload           7
        //    40: putfield        jia.g:Llyr;
        //    43: aload_0        
        //    44: aload           8
        //    46: putfield        jia.h:Llyr;
        //    49: return         
        //    Signature:
        //  (Lp90;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ExecutorService;Lzph;Lahk;Lpz6<Lq73;Lui4;>;Llyr<Ljava/lang/Integer;>;Llyr<Ljava/lang/Integer;>;Llyr<Ljava/lang/Boolean;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 9
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
    
    public final Drawable a(final ui4 ui4) {
        Object o = ui4;
        synchronized (o) {
            final pa0 e0 = ((si4)o).E0;
            ia0 a;
            if (e0 == null) {
                a = null;
            }
            else {
                a = e0.a;
            }
            monitorexit(o);
            synchronized (o) {
                final pa0 e2 = ((si4)o).E0;
                monitorexit(o);
                Objects.requireNonNull(e2);
                if (a != null) {
                    o = a.h();
                }
                else {
                    o = null;
                }
                final ia0 a2 = e2.a;
                final l90 a3 = this.a.a(e2, new Rect(0, 0, a2.getWidth(), a2.getHeight()));
                final int intValue = (int)this.g.get();
                Object o2;
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            o2 = new udv();
                        }
                        else {
                            o2 = new npe();
                        }
                    }
                    else {
                        o2 = new hrb(this.c(e2), false);
                    }
                }
                else {
                    o2 = new hrb(this.c(e2), true);
                }
                final n90 n90 = new n90((l02)o2, a3);
                final int intValue2 = (int)this.h.get();
                if (intValue2 > 0) {
                    final a2b a2b = new a2b(intValue2);
                    final ahk e3 = this.e;
                    if (o == null) {
                        o = Bitmap$Config.ARGB_8888;
                    }
                    final if8 if8 = new if8(e3, (o02)n90, (Bitmap$Config)o, this.c);
                    o = a2b;
                    o = if8;
                }
                else {
                    o = null;
                }
                final h02 h02 = new h02(this.e, (l02)o2, (qb0)new m90(a3), (o02)n90, (m02)o, (n02)o);
                return (Drawable)new k90((jb0)new lb0((jb0)h02, (lb0$b)h02, this.d, this.b));
            }
        }
    }
    
    public final boolean b(final ui4 ui4) {
        return ui4 instanceof si4;
    }
    
    public final y90 c(final pa0 pa0) {
        return new y90((q73)new ob0(pa0.hashCode(), false), (pz6)this.f);
    }
}
