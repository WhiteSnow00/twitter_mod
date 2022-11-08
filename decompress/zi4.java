import java.util.Objects;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zi4 extends ti4 implements cdc
{
    public wi4<Bitmap> E0;
    public volatile Bitmap F0;
    public final yrl G0;
    public final int H0;
    public final int I0;
    
    public zi4(final Bitmap p0, final uqm<Bitmap> p1, final yrl p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: aload_0        
        //     5: invokespecial   ti4.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        zi4.F0:Landroid/graphics/Bitmap;
        //    13: aload_0        
        //    14: getfield        zi4.F0:Landroid/graphics/Bitmap;
        //    17: astore_1       
        //    18: aload_2        
        //    19: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    22: pop            
        //    23: aload_0        
        //    24: aload_1        
        //    25: aload_2        
        //    26: invokestatic    wi4.m:(Ljava/lang/Object;Luqm;)Lwi4;
        //    29: putfield        zi4.E0:Lwi4;
        //    32: aload_0        
        //    33: aload_3        
        //    34: putfield        zi4.G0:Lyrl;
        //    37: aload_0        
        //    38: iconst_0       
        //    39: putfield        zi4.H0:I
        //    42: aload_0        
        //    43: iconst_0       
        //    44: putfield        zi4.I0:I
        //    47: return         
        //    Signature:
        //  (Landroid/graphics/Bitmap;Luqm<Landroid/graphics/Bitmap;>;Lyrl;I)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
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
    
    public zi4(wi4<Bitmap> e0, final yrl g0, final int h0, final int i0) {
        synchronized (e0) {
            if (e0.i()) {
                final wi4 a = e0.a();
                monitorexit(e0);
                e0 = (wi4<Bitmap>)a;
            }
            else {
                final wi4<Bitmap> wi4 = null;
                monitorexit(e0);
                e0 = wi4;
            }
            Objects.requireNonNull(e0);
            this.E0 = e0;
            this.F0 = (Bitmap)e0.h();
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
        }
    }
    
    public final yrl a() {
        return this.G0;
    }
    
    public final int b() {
        return g12.d(this.F0);
    }
    
    public final void close() {
        synchronized (this) {
            final wi4<Bitmap> e0 = this.E0;
            this.E0 = null;
            this.F0 = null;
            monitorexit(this);
            if (e0 != null) {
                e0.close();
            }
        }
    }
    
    public final Bitmap e() {
        return this.F0;
    }
    
    public final int getHeight() {
        final int h0 = this.H0;
        final int n = 0;
        int height = 0;
        if (h0 % 180 == 0) {
            final int i0 = this.I0;
            if (i0 != 5) {
                if (i0 != 7) {
                    final Bitmap f0 = this.F0;
                    if (f0 != null) {
                        height = f0.getHeight();
                    }
                    return height;
                }
            }
        }
        final Bitmap f2 = this.F0;
        int width;
        if (f2 == null) {
            width = n;
        }
        else {
            width = f2.getWidth();
        }
        return width;
    }
    
    public final int getWidth() {
        final int h0 = this.H0;
        final int n = 0;
        int width = 0;
        if (h0 % 180 == 0) {
            final int i0 = this.I0;
            if (i0 != 5) {
                if (i0 != 7) {
                    final Bitmap f0 = this.F0;
                    if (f0 != null) {
                        width = f0.getWidth();
                    }
                    return width;
                }
            }
        }
        final Bitmap f2 = this.F0;
        int height;
        if (f2 == null) {
            height = n;
        }
        else {
            height = f2.getHeight();
        }
        return height;
    }
    
    public final boolean isClosed() {
        synchronized (this) {
            return this.E0 == null;
        }
    }
}
