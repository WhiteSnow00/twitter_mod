import java.util.Objects;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fj4 extends zi4 implements edc
{
    public cj4<Bitmap> H0;
    public volatile Bitmap I0;
    public final ysl J0;
    public final int K0;
    public final int L0;
    
    public fj4(final Bitmap p0, final asm<Bitmap> p1, final ysl p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: aload_0        
        //     5: invokespecial   zi4.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        fj4.I0:Landroid/graphics/Bitmap;
        //    13: aload_0        
        //    14: getfield        fj4.I0:Landroid/graphics/Bitmap;
        //    17: astore_1       
        //    18: aload_2        
        //    19: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    22: pop            
        //    23: aload_0        
        //    24: aload_1        
        //    25: aload_2        
        //    26: invokestatic    cj4.m:(Ljava/lang/Object;Lasm;)Lcj4;
        //    29: putfield        fj4.H0:Lcj4;
        //    32: aload_0        
        //    33: aload_3        
        //    34: putfield        fj4.J0:Lysl;
        //    37: aload_0        
        //    38: iconst_0       
        //    39: putfield        fj4.K0:I
        //    42: aload_0        
        //    43: iconst_0       
        //    44: putfield        fj4.L0:I
        //    47: return         
        //    Signature:
        //  (Landroid/graphics/Bitmap;Lasm<Landroid/graphics/Bitmap;>;Lysl;I)V
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
    
    public fj4(cj4<Bitmap> h0, final ysl j0, final int k0, final int l0) {
        synchronized (h0) {
            if (h0.i()) {
                final cj4<Bitmap> a = h0.a();
                monitorexit(h0);
                h0 = a;
            }
            else {
                final cj4<Bitmap> cj4 = null;
                monitorexit(h0);
                h0 = cj4;
            }
            Objects.requireNonNull(h0);
            this.H0 = h0;
            this.I0 = h0.h();
            this.J0 = j0;
            this.K0 = k0;
            this.L0 = l0;
        }
    }
    
    public final ysl a() {
        return this.J0;
    }
    
    public final int b() {
        return i12.d(this.I0);
    }
    
    public final void close() {
        synchronized (this) {
            final cj4<Bitmap> h0 = this.H0;
            this.H0 = null;
            this.I0 = null;
            monitorexit(this);
            if (h0 != null) {
                h0.close();
            }
        }
    }
    
    public final Bitmap e() {
        return this.I0;
    }
    
    public final int getHeight() {
        final int k0 = this.K0;
        int width = 0;
        final int n = 0;
        if (k0 % 180 == 0) {
            final int l0 = this.L0;
            if (l0 != 5) {
                if (l0 != 7) {
                    final Bitmap i0 = this.I0;
                    int height;
                    if (i0 == null) {
                        height = n;
                    }
                    else {
                        height = i0.getHeight();
                    }
                    return height;
                }
            }
        }
        final Bitmap i2 = this.I0;
        if (i2 != null) {
            width = i2.getWidth();
        }
        return width;
    }
    
    public final int getWidth() {
        final int k0 = this.K0;
        int height = 0;
        final int n = 0;
        if (k0 % 180 == 0) {
            final int l0 = this.L0;
            if (l0 != 5) {
                if (l0 != 7) {
                    final Bitmap i0 = this.I0;
                    int width;
                    if (i0 == null) {
                        width = n;
                    }
                    else {
                        width = i0.getWidth();
                    }
                    return width;
                }
            }
        }
        final Bitmap i2 = this.I0;
        if (i2 != null) {
            height = i2.getHeight();
        }
        return height;
    }
    
    public final boolean isClosed() {
        synchronized (this) {
            return this.H0 == null;
        }
    }
}
