import com.twitter.ui.user.BaseUserView;
import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView$a;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h4j extends w9t
{
    public final c4j n;
    
    public h4j(final Context p0, final p p1, final oc1 p2, final tsc p3, final UserIdentifier p4, final dsb p5, final fci<?> p6, final sfv p7, final boolean p8, final boolean p9, final c4j p10, final glq p11, final nlq p12) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: aload_3        
        //     4: aload           4
        //     6: aload           5
        //     8: aload           6
        //    10: aload           7
        //    12: aconst_null    
        //    13: aload           8
        //    15: iconst_0       
        //    16: iconst_1       
        //    17: aload           10
        //    19: aload           11
        //    21: invokespecial   w9t.<init>:(Landroid/content/Context;Landroidx/fragment/app/p;Loc1;Ltsc;Lcom/twitter/util/user/UserIdentifier;Ldsb;Lfci;Ly81;Lsfv;ZZLglq;Lnlq;)V
        //    24: aload_0        
        //    25: aload           9
        //    27: putfield        h4j.n:Lc4j;
        //    30: return         
        //    Signature:
        //  (Landroid/content/Context;Landroidx/fragment/app/p;Loc1;Ltsc;Lcom/twitter/util/user/UserIdentifier;Ldsb;Lfci<*>;Lsfv;ZZLc4j;Lglq;Lnlq;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 12
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
    
    public final BaseUserView$a<UserView> a(final boolean b) {
        if (b) {
            return (BaseUserView$a<UserView>)super.a(true);
        }
        return (BaseUserView$a<UserView>)new sw7((Object)this, 0);
    }
    
    public final BaseUserView$a<UserView> g() {
        return (BaseUserView$a<UserView>)new g4j((w9t)this, 0);
    }
    
    public final void i(final UserView userView) {
        this.h(userView, super.a, userView.getScribeElement(), "follow");
        final c4j n = this.n;
        n.a.add(((BaseUserView)userView).getUserId());
        n.c.onNext((Object)n.a);
    }
    
    public final void j(final UserView userView) {
        this.h(userView, super.a, userView.getScribeElement(), "unfollow");
        final c4j n = this.n;
        n.a.remove(((BaseUserView)userView).getUserId());
        n.c.onNext((Object)n.a);
    }
}
