import android.net.Uri;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.api.upload.request.internal.BaseUploadRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class y4r extends BaseUploadRequest<z4r>
{
    public final boolean n1;
    public a o1;
    public z4r p1;
    
    public y4r(final Context context, final UserIdentifier userIdentifier, final jvg jvg, final List<d2h> list, final boolean b) {
        this(userIdentifier, jvg.g(), jvg.c, (List)list, b);
    }
    
    public y4r(final Context p0, final UserIdentifier p1, final Uri p2, final m1h p3, final List<d2h> p4, final boolean p5) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: aload_3        
        //     4: aload           4
        //     6: invokespecial   com/twitter/api/upload/request/internal/BaseUploadRequest.<init>:(Lcom/twitter/util/user/UserIdentifier;Landroid/net/Uri;Lm1h;Ljava/util/List;)V
        //     9: aload_0        
        //    10: iload           5
        //    12: putfield        y4r.n1:Z
        //    15: aload_0        
        //    16: iconst_3       
        //    17: invokevirtual   wv0.Q:(I)Lwv0;
        //    20: pop            
        //    21: return         
        //    Signature:
        //  (Landroid/content/Context;Lcom/twitter/util/user/UserIdentifier;Landroid/net/Uri;Lm1h;Ljava/util/List<Ld2h;>;Z)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 6
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
    
    public void e(final atm<xrc<z4r, kbv>> atm) {
        super.e((atm<xrc<Object, Object>>)atm);
        final a o1 = this.o1;
        if (o1 != null) {
            o1.e(this.p1, atm);
        }
    }
    
    public asc<z4r, kbv> g0() {
        return (asc<z4r, kbv>)v8g.c((Class)z4r.class);
    }
    
    public final xrc<z4r, kbv> i0(final xrc<z4r, kbv> xrc) {
        this.p1 = (z4r)xrc.g;
        return xrc;
    }
    
    public interface a
    {
        void e(final z4r p0, final atm<xrc<z4r, kbv>> p1);
    }
}
