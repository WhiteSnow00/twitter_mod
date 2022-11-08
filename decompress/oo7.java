import com.twitter.ui.user.BaseUserView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.database.Cursor;
import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView$a;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oo7 extends xkw
{
    public final int R0;
    
    public oo7(final Context p0, final int p1, final BaseUserView$a<UserView> p2, final dz5<Cursor> p3, final dsb p4, final b84 p5, final int p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: iload_2        
        //     3: aload_3        
        //     4: aload           5
        //     6: iconst_0       
        //     7: aload           4
        //     9: iconst_1       
        //    10: invokespecial   xkw.<init>:(Landroid/content/Context;ILcom/twitter/ui/user/BaseUserView$a;Ldsb;ZLdz5;Z)V
        //    13: aload_0        
        //    14: iload           6
        //    16: putfield        oo7.R0:I
        //    19: return         
        //    Signature:
        //  (Landroid/content/Context;ILcom/twitter/ui/user/BaseUserView$a<Lcom/twitter/ui/user/UserView;>;Ldz5<Landroid/database/Cursor;>;Ldsb;Lb84;I)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 7
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
    
    public final void g(final UserView userView, final long n) {
        userView.D1 = false;
        if (this.R0 == 1) {
            ((BaseUserView)userView).a((jeu)null, false);
        }
        else {
            super.g(userView, n);
        }
    }
    
    public final UserView i(final Context context, final ViewGroup viewGroup) {
        if (this.R0 == 1) {
            final UserView userView = (UserView)LayoutInflater.from(context).inflate(2131625932, viewGroup, false);
            this.k(userView);
            return userView;
        }
        return super.i(context, viewGroup);
    }
}
