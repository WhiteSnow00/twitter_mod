import android.app.Dialog;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.DialogInterface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejh implements lw8, mw8
{
    public final daq<ajh, vrm<pmi, pav>> C0;
    public final daq<vo6, fjh> D0;
    public final daq<vo6, fjh> E0;
    public final rd6 F0;
    public final Context G0;
    public final zml<fjh> H0;
    public final zml<vo6> I0;
    public fjh J0;
    public vo6 K0;
    
    public ejh(final daq<ajh, vrm<pmi, pav>> p0, final daq<vo6, fjh> p1, final daq<vo6, fjh> p2, final ibm p3, final Context p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Lrd6;
        //     8: dup            
        //     9: invokespecial   rd6.<init>:()V
        //    12: putfield        ejh.F0:Lrd6;
        //    15: aload_0        
        //    16: new             Lzml;
        //    19: dup            
        //    20: invokespecial   zml.<init>:()V
        //    23: putfield        ejh.H0:Lzml;
        //    26: aload_0        
        //    27: new             Lzml;
        //    30: dup            
        //    31: invokespecial   zml.<init>:()V
        //    34: putfield        ejh.I0:Lzml;
        //    37: aload_0        
        //    38: aload_1        
        //    39: putfield        ejh.C0:Ldaq;
        //    42: aload_0        
        //    43: aload_2        
        //    44: putfield        ejh.D0:Ldaq;
        //    47: aload_0        
        //    48: aload_3        
        //    49: putfield        ejh.E0:Ldaq;
        //    52: aload_0        
        //    53: aload           4
        //    55: putfield        ejh.G0:Landroid/content/Context;
        //    58: return         
        //    Signature:
        //  (Ldaq<Lajh;Lvrm<Lpmi;Lpav;>;>;Ldaq<Lvo6;Lfjh;>;Ldaq<Lvo6;Lfjh;>;Libm;Landroid/content/Context;)V
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
        final fjh j0 = this.J0;
        if (j0 != null) {
            this.H0.onNext((Object)j0);
        }
    }
    
    public final void a(final vo6 vo6, final p p3, final boolean b) {
        final String x2 = vo6.X2();
        final zf4 zf4 = new zf4(UserIdentifier.getCurrent());
        zf4.q(new String[] { zf4.E(null, x2, "", "moderate_tweet") });
        saw.b((okm)zf4);
        final ajh ajh = new ajh(vo6.G(), vo6.C0.b1, true);
        final rd6 f0 = this.F0;
        final n9q s = this.C0.S((Object)ajh);
        final jl2 jl2 = new jl2((Object)this, (Object)vo6, 3);
        Objects.requireNonNull(s);
        f0.a(((n9q)new taq((ubq)s, (qtb)jl2)).G((fk6)new djh(this, b, vo6, p3), (fk6)jvb.e));
    }
    
    public final void b(final vo6 vo6) {
        final String x2 = vo6.X2();
        final zf4 zf4 = new zf4(UserIdentifier.getCurrent());
        zf4.q(new String[] { zf4.E(null, x2, "", "restore_tweet") });
        saw.b((okm)zf4);
        final ajh ajh = new ajh(vo6.G(), vo6.C0.b1, false);
        final rd6 f0 = this.F0;
        final n9q s = this.C0.S((Object)ajh);
        final fo9 fo9 = new fo9(this, vo6, 6);
        Objects.requireNonNull(s);
        final taq taq = new taq((ubq)s, (qtb)fo9);
        final zml<fjh> h0 = this.H0;
        Objects.requireNonNull(h0);
        f0.a(((n9q)taq).G((fk6)new hc3((zml)h0, 1), (fk6)jvb.e));
    }
    
    public final void l0(final Dialog dialog, final int n, final int n2) {
        final vo6 k0 = this.K0;
        if (k0 != null && n2 == -1) {
            this.I0.onNext((Object)k0);
            psc.c().a((ksc)new z12(this.G0, UserIdentifier.getCurrent(), this.K0.J(), this.K0.D0, 1)).D();
        }
    }
}
