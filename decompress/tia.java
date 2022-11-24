import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tia implements ce9
{
    public final m90 a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final uqh d;
    public final uhk e;
    public final zz6<z73, aj4> f;
    public final zzr<Integer> g;
    public final zzr<Integer> h;
    
    public tia(final m90 p0, final ScheduledExecutorService p1, final ExecutorService p2, final uqh p3, final uhk p4, final zz6<z73, aj4> p5, final zzr<Integer> p6, final zzr<Integer> p7, final zzr<Boolean> p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        tia.a:Lm90;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        tia.b:Ljava/util/concurrent/ScheduledExecutorService;
        //    14: aload_0        
        //    15: aload_3        
        //    16: putfield        tia.c:Ljava/util/concurrent/ExecutorService;
        //    19: aload_0        
        //    20: aload           4
        //    22: putfield        tia.d:Luqh;
        //    25: aload_0        
        //    26: aload           5
        //    28: putfield        tia.e:Luhk;
        //    31: aload_0        
        //    32: aload           6
        //    34: putfield        tia.f:Lzz6;
        //    37: aload_0        
        //    38: aload           7
        //    40: putfield        tia.g:Lzzr;
        //    43: aload_0        
        //    44: aload           8
        //    46: putfield        tia.h:Lzzr;
        //    49: return         
        //    Signature:
        //  (Lm90;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ExecutorService;Luqh;Luhk;Lzz6<Lz73;Laj4;>;Lzzr<Ljava/lang/Integer;>;Lzzr<Ljava/lang/Integer;>;Lzzr<Ljava/lang/Boolean;>;)V
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
    
    @Override
    public final Drawable a(final aj4 aj4) {
        Object a = aj4;
        synchronized (a) {
            final oa0 h0 = ((yi4)a).H0;
            ha0 a2;
            if (h0 == null) {
                a2 = null;
            }
            else {
                a2 = h0.a;
            }
            monitorexit(a);
            synchronized (a) {
                final oa0 h2 = ((yi4)a).H0;
                monitorexit(a);
                Objects.requireNonNull(h2);
                Bitmap$Config bitmap$Config;
                if (a2 != null) {
                    bitmap$Config = a2.i();
                }
                else {
                    bitmap$Config = null;
                }
                a = h2.a;
                a = new Rect(0, 0, ((ha0)a).getWidth(), ((ha0)a).getHeight());
                final j90 a3 = this.a.a(h2, (Rect)a);
                final int intValue = this.g.get();
                Object o;
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            o = new amz();
                        }
                        else {
                            o = new wpe();
                        }
                    }
                    else {
                        o = new frb(this.c(h2), false);
                    }
                }
                else {
                    o = new frb(this.c(h2), true);
                }
                final k90 k90 = new k90((o02)o, a3);
                final int intValue2 = this.h.get();
                if (intValue2 > 0) {
                    a = new w1b(intValue2);
                    final uhk e = this.e;
                    if (bitmap$Config == null) {
                        bitmap$Config = Bitmap$Config.ARGB_8888;
                    }
                    a = new xf8(e, (r02)k90, bitmap$Config, this.c);
                }
                final j02 j02 = new j02(this.e, (o02)o, (ob0)new gdg(a3), (r02)k90, (p02)a, (q02)a);
                return (Drawable)new i90((ib0)new kb0((ib0)j02, (kb0.kb0$b)j02, this.d, this.b));
            }
        }
    }
    
    @Override
    public final boolean b(final aj4 aj4) {
        return aj4 instanceof yi4;
    }
    
    public final v90 c(final oa0 oa0) {
        return new v90((z73)new mb0(oa0.hashCode(), false), this.f);
    }
}
