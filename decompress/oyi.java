import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oyi extends a3e<oui, a>
{
    public oyi(final Class<oui> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             Loui;.class
        //     3: invokespecial   a3e.<init>:(Ljava/lang/Class;)V
        //     6: return         
        //    Signature:
        //  (Ljava/lang/Class<Loui;>;)V
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
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final a a = (a)v7x;
        final String a2 = ((oui)o).a;
        Objects.requireNonNull(a);
        if (ikr.e((CharSequence)a2)) {
            ((View)a.E0).setVisibility(8);
        }
        else {
            a.E0.setText((CharSequence)a2);
        }
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        return (v7x)new a(da8.h(viewGroup, 2131625024, viewGroup, false));
    }
    
    public static final class a extends nk8
    {
        public final TextView E0;
        
        public a(final View view) {
            super(view);
            final TextView e0 = (TextView)view.findViewById(16908310);
            jee.l((Object)e0);
            final TextView textView = e0;
            this.E0 = e0;
        }
    }
}
