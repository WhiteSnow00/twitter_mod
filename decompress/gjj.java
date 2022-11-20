import android.widget.CompoundButton;
import android.view.View;
import android.widget.CheckBox;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjj extends zn1<nui, b>
{
    public gjj(final Class<nui> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             Lnui;.class
        //     3: invokespecial   zn1.<init>:(Ljava/lang/Class;)V
        //     6: return         
        //    Signature:
        //  (Ljava/lang/Class<Lnui;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 1
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
    
    public final /* bridge */ void k(final v7x v7x, final Object o, final xbm xbm) {
        this.o((b)v7x, (nui)o, xbm);
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        return (v7x)new b(da8.h(viewGroup, 2131624836, viewGroup, false), (a)new gjj.gjj$a());
    }
    
    @Override
    public final /* bridge */ void n(final zn1.b b, final nui nui, final xbm xbm) {
        this.o((b)b, nui, xbm);
    }
    
    public final void o(final b b, final nui nui, final xbm xbm) {
        final boolean d0 = xli.d0(nui.b);
        ((View)b.H0).setVisibility(0);
        ((CompoundButton)b.H0).setChecked(d0);
        ((View)b.H0).setEnabled(nui.c);
        super.n(b, nui, xbm);
    }
    
    public static final class b extends zn1.b
    {
        public final CheckBox H0;
        
        public b(final View view, final a a) {
            super(view, a);
            final CheckBox h0 = (CheckBox)view.findViewById(2131431378);
            jee.l((Object)h0);
            this.H0 = h0;
        }
        
        @Override
        public final void l0(final boolean enabled) {
            ((View)this.H0).setEnabled(enabled);
        }
    }
}
