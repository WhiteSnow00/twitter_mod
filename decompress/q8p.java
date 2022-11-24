import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView$a;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8p extends w9t
{
    public final Context n;
    public final b8p o;
    public final dsb p;
    public final fca<j4u> q;
    public final glq r;
    public final nlq s;
    
    public q8p(final Context p0, final p p1, final oc1 p2, final tsc p3, final UserIdentifier p4, final dsb p5, final fci<?> p6, final sfv p7, final boolean p8, final b8p p9, final fca<j4u> p10, final glq p11, final nlq p12) {
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
        //    16: iconst_0       
        //    17: aload           11
        //    19: aload           12
        //    21: invokespecial   w9t.<init>:(Landroid/content/Context;Landroidx/fragment/app/p;Loc1;Ltsc;Lcom/twitter/util/user/UserIdentifier;Ldsb;Lfci;Ly81;Lsfv;ZZLglq;Lnlq;)V
        //    24: aload_0        
        //    25: aload_1        
        //    26: putfield        q8p.n:Landroid/content/Context;
        //    29: aload_0        
        //    30: aload           9
        //    32: putfield        q8p.o:Lb8p;
        //    35: aload_0        
        //    36: aload           6
        //    38: putfield        q8p.p:Ldsb;
        //    41: aload_0        
        //    42: aload           10
        //    44: putfield        q8p.q:Lfca;
        //    47: aload_0        
        //    48: aload           11
        //    50: putfield        q8p.r:Lglq;
        //    53: aload_0        
        //    54: aload           12
        //    56: putfield        q8p.s:Lnlq;
        //    59: return         
        //    Signature:
        //  (Landroid/content/Context;Landroidx/fragment/app/p;Loc1;Ltsc;Lcom/twitter/util/user/UserIdentifier;Ldsb;Lfci<*>;Lsfv;ZLb8p;Lfca<Lj4u;>;Lglq;Lnlq;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 13
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
        if (this.r.a()) {
            return (BaseUserView$a<UserView>)new ug2((Object)this, 0);
        }
        return (BaseUserView$a<UserView>)new p8p(this, super.a(b));
    }
    
    public final fg4 d(final fg4 fg4) {
        ((o1p)fg4).x = this.o.a();
        final int a = o5j.a;
        return fg4;
    }
    
    public final BaseUserView$a<UserView> g() {
        return (BaseUserView$a<UserView>)new gpo((Object)this, (Object)super.g());
    }
}
