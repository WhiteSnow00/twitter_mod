import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.res.Resources;
import java.util.List;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class txo implements h7f
{
    public final wld C0;
    public final wld D0;
    public final bra<TextView, txo.txo$a> E0;
    public int F0;
    public boolean G0;
    public final List<wld> H0;
    
    public txo(final Resources p0, final wld p1, final wld p2, final bra<TextView, txo.txo$a> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: iconst_0       
        //    10: putfield        txo.G0:Z
        //    13: aload_0        
        //    14: aload_1        
        //    15: putfield        txo.C0:Lwld;
        //    18: aload_0        
        //    19: aload_2        
        //    20: putfield        txo.D0:Lwld;
        //    23: aload_0        
        //    24: aload_3        
        //    25: putfield        txo.E0:Lbra;
        //    28: aload_0        
        //    29: aload_1        
        //    30: iconst_1       
        //    31: anewarray       Lwld;
        //    34: dup            
        //    35: iconst_0       
        //    36: aload_2        
        //    37: aastore        
        //    38: invokestatic    ijf.w:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;
        //    41: putfield        txo.H0:Ljava/util/List;
        //    44: return         
        //    Signature:
        //  (Landroid/content/res/Resources;Lwld;Lwld;Lbra<Landroid/widget/TextView;Ltxo$a;>;)V
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
    
    public final void a(int f0) {
        this.F0 = f0;
        if (f0 != 2) {
            for (final wld wld : this.H0) {
                if (wld.i != null) {
                    f0 = 1;
                }
                else {
                    f0 = 0;
                }
                if (f0 != 0) {
                    wld.b().setVisibility(8);
                }
            }
        }
        else {
            final wld d0 = this.D0;
            if (d0 != null) {
                if (this.G0) {
                    d0.b().setVisibility(0);
                    this.C0.b().setVisibility(8);
                }
                else {
                    d0.b().setVisibility(8);
                    this.C0.b().setVisibility(0);
                }
                final ViewTreeObserver viewTreeObserver = this.C0.b().getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new rxo(this, viewTreeObserver));
            }
            else {
                this.C0.b().setVisibility(0);
            }
        }
    }
    
    public final View getView() {
        return this.C0.b();
    }
}
