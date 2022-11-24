import android.os.Bundle;
import android.app.Dialog;
import android.content.DialogInterface;
import android.app.Activity;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v6t implements vw8
{
    public final y6t F0;
    public final n2s G0;
    public final w6t H0;
    public final fci<?> I0;
    public final List<wl> J0;
    public String K0;
    
    public v6t(final Activity p0, final y6t p1, final n2s p2, final w6t p3, final fci<?> p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/ArrayList;
        //     8: dup            
        //     9: invokespecial   java/util/ArrayList.<init>:()V
        //    12: putfield        v6t.J0:Ljava/util/ArrayList;
        //    15: aload_0        
        //    16: aload_1        
        //    17: putfield        v6t.F0:Ly6t;
        //    20: aload_0        
        //    21: aload_2        
        //    22: putfield        v6t.G0:Ln2s;
        //    25: aload_0        
        //    26: aload_3        
        //    27: putfield        v6t.H0:Lw6t;
        //    30: aload_0        
        //    31: aload_3        
        //    32: invokevirtual   w6t.b:()Ls6t;
        //    35: getfield        s6t.H0:Ljava/lang/String;
        //    38: putfield        v6t.K0:Ljava/lang/String;
        //    41: aload_0        
        //    42: aload           4
        //    44: putfield        v6t.I0:Lfci;
        //    47: return         
        //    Signature:
        //  (Landroid/app/Activity;Ly6t;Ln2s;Lw6t;Lfci<*>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 5
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
    
    public final void R0(final DialogInterface dialogInterface, final int n) {
        sbw.b((tlm)new fg4(dda.g("home", this.K0, "customize", "", "hide")));
    }
    
    public final void k0(final Dialog dialog, int b, final int n) {
        if (b == 808 && n >= 0 && n < this.J0.size()) {
            b = this.J0.get(n).b;
            if (1 == b) {
                sbw.b((tlm)new fg4(dda.g("home", this.K0, "customize", "see_top", "click")));
                this.F0.a(s6t.I0);
            }
            else if (2 == b) {
                sbw.b((tlm)new fg4(dda.g("home", this.K0, "customize", "see_latest", "click")));
                this.F0.a(s6t.J0);
            }
            else if (3 == b) {
                this.I0.d((cn)new cn6());
                sbw.b((tlm)new fg4(dda.g("home", this.K0, "customize", "see_preferences", "click")));
            }
            else if (4 == b) {
                this.G0.b(true);
            }
            else if (5 == b) {
                this.G0.b(false);
            }
        }
    }
    
    public final void q0(final Dialog dialog, final int n, final Bundle bundle) {
        sbw.b((tlm)new fg4(dda.g("home", this.K0, "customize", "", "show")));
    }
    
    public final void s0(final DialogInterface dialogInterface, final int n) {
        sbw.b((tlm)new fg4(dda.g("home", this.K0, "customize", "cancel", "click")));
    }
}
