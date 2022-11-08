import java.util.List;
import android.content.Context;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnu extends eo1<qxi, eo1$b>
{
    public gnu(final Class<qxi> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             Lqxi;.class
        //     3: invokespecial   eo1.<init>:(Ljava/lang/Class;)V
        //     6: return         
        //    Signature:
        //  (Ljava/lang/Class<Lqxi;>;)V
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
        return (c7x)new eo1$b(w30.B(viewGroup, 2131624834, viewGroup, false), (eo1$a)new a());
    }
    
    public static final class a implements eo1$a
    {
        public final String a(final mui mui, final Context context) {
            if (!(mui instanceof qxi)) {
                return null;
            }
            final qxi qxi = (qxi)mui;
            final vpp$c a = ((mui)qxi).a;
            if (((mui)qxi).b.equalsIgnoreCase("off")) {
                return a.j;
            }
            final List d = qxi.d;
            if (d == null) {
                return null;
            }
            final int size = d.size();
            return context.getResources().getQuantityString(2131820669, size, new Object[] { size });
        }
    }
}
