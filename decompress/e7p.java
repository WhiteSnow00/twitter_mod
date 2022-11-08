import com.twitter.ui.user.UserView;
import com.twitter.ui.user.BaseUserView$a;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e7p extends k8t
{
    public final Context l;
    public final q6p m;
    public final dsb n;
    public final pba<b3u> o;
    
    public e7p(final Context p0, final p p1, final oc1 p2, final psc p3, final UserIdentifier p4, final dsb p5, final mbi<?> p6, final jev p7, final boolean p8, final q6p p9, final pba<b3u> p10) {
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
        //    17: invokespecial   k8t.<init>:(Landroid/content/Context;Landroidx/fragment/app/p;Loc1;Lpsc;Lcom/twitter/util/user/UserIdentifier;Ldsb;Lmbi;Ly81;Ljev;ZZ)V
        //    20: aload_0        
        //    21: aload_1        
        //    22: putfield        e7p.l:Landroid/content/Context;
        //    25: aload_0        
        //    26: aload           9
        //    28: putfield        e7p.m:Lq6p;
        //    31: aload_0        
        //    32: aload           6
        //    34: putfield        e7p.n:Ldsb;
        //    37: aload_0        
        //    38: aload           10
        //    40: putfield        e7p.o:Lpba;
        //    43: return         
        //    Signature:
        //  (Landroid/content/Context;Landroidx/fragment/app/p;Loc1;Lpsc;Lcom/twitter/util/user/UserIdentifier;Ldsb;Lmbi<*>;Ljev;ZLq6p;Lpba<Lb3u;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 11
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
        return (BaseUserView$a<UserView>)new xno((Object)this, (Object)new i8t((k8t)this, b), 1);
    }
    
    public final zf4 d(final zf4 zf4) {
        zf4.x = this.m.a();
        final int a = w4j.a;
        return zf4;
    }
    
    public final BaseUserView$a<UserView> g() {
        return (BaseUserView$a<UserView>)new adw((Object)this, (Object)new e8t((k8t)this));
    }
}
