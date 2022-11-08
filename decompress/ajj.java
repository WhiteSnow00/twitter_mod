import android.widget.CompoundButton;
import android.view.View;
import android.widget.CheckBox;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajj extends eo1<mui, b>
{
    public ajj(final Class<mui> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             Lmui;.class
        //     3: invokespecial   eo1.<init>:(Ljava/lang/Class;)V
        //     6: return         
        //    Signature:
        //  (Ljava/lang/Class<Lmui;>;)V
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
    
    public final c7x l(final ViewGroup viewGroup) {
        return (c7x)new b(w30.B(viewGroup, 2131624834, viewGroup, false), (eo1$a)new a());
    }
    
    public final void o(final b b, final mui mui, final ibm ibm) {
        final boolean d0 = poa.d0(mui.b);
        ((View)b.G0).setVisibility(0);
        ((CompoundButton)b.G0).setChecked(d0);
        ((View)b.G0).setEnabled(mui.c);
        super.n((eo1$b)b, mui, ibm);
    }
    
    public static final class a implements eo1$a
    {
        public final String a(final mui mui, final Context context) {
            return null;
        }
    }
    
    public static final class b extends eo1$b
    {
        public final CheckBox G0;
        
        public b(final View view, final eo1$a eo1$a) {
            super(view, eo1$a);
            final CheckBox g0 = (CheckBox)view.findViewById(2131431376);
            pf8.r(g0);
            this.G0 = g0;
        }
        
        public final void l0(final boolean enabled) {
            ((View)this.G0).setEnabled(enabled);
        }
    }
}
