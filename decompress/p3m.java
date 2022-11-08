import com.twitter.ui.user.BaseUserView;
import com.twitter.ui.view.GroupedRowView;
import android.view.LayoutInflater;
import com.twitter.ui.user.UserSocialView;
import android.view.ViewGroup;
import android.database.Cursor;
import android.view.View;
import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView$a;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p3m extends xkw
{
    public boolean R0;
    public final boolean S0;
    public boolean T0;
    
    public p3m(final Context p0, final int p1, final BaseUserView$a<UserView> p2, final dsb p3, final b84 p4, final boolean p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: iload_2        
        //     3: aload_3        
        //     4: aload           4
        //     6: iconst_1       
        //     7: aconst_null    
        //     8: iconst_1       
        //     9: invokespecial   xkw.<init>:(Landroid/content/Context;ILcom/twitter/ui/user/BaseUserView$a;Ldsb;ZLdz5;Z)V
        //    12: aload_0        
        //    13: iconst_0       
        //    14: putfield        p3m.S0:Z
        //    17: return         
        //    Signature:
        //  (Landroid/content/Context;ILcom/twitter/ui/user/BaseUserView$a<Lcom/twitter/ui/user/UserView;>;Ldsb;Lb84;Z)V
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
    
    public final View f(final Context context, int n, final ViewGroup viewGroup) {
        if (!this.S0) {
            if (this.l()) {
                n = 2131624181;
            }
            else {
                n = 2131625946;
            }
            final UserSocialView userSocialView = (UserSocialView)LayoutInflater.from(context).inflate(n, viewGroup, false);
            this.k((UserView)userSocialView);
            return (View)userSocialView;
        }
        final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2131624596, viewGroup, false);
        groupedRowView.setStyle(2);
        this.k(this.j((View)groupedRowView));
        return (View)groupedRowView;
    }
    
    public final void h(final View view, final Context context, final Cursor cursor, final int n) {
        super.h(view, context, cursor, n);
        final UserSocialView userSocialView = (UserSocialView)this.j(view);
        if (super.G0) {
            ((BaseUserView)userSocialView).setProfileDescription(bgl.d((jeu)tkp.a(cursor.getBlob(8), (alp)jeu.I0)));
            if (this.T0) {
                ((BaseUserView)userSocialView).setProfileDescriptionMaxLines(2);
            }
        }
        else {
            ((BaseUserView)userSocialView).setProfileDescription((jeu)null);
        }
        if (this.R0) {
            userSocialView.setScreenNameColor(goz.J(context, 2130969093));
        }
    }
    
    public final UserView j(final View view) {
        if (this.S0) {
            return (UserView)((ViewGroup)view).getChildAt(0);
        }
        return (UserView)view;
    }
}
