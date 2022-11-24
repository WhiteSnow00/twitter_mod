import android.graphics.Bitmap;
import android.util.Size;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tzo<T> implements szo<T>
{
    public final Context a;
    public final bxo b;
    public final bxo c;
    public final bxo d;
    public final c0p<T> e;
    public final b0p<T> f;
    public final String g;
    
    public tzo(final UserIdentifier userIdentifier, final Context a, final bxo b, final bxo c, final bxo d, final c0p<T> e, final b0p<T> f) {
        e0e.f((Object)userIdentifier, "user");
        e0e.f((Object)a, "themedContext");
        e0e.f((Object)b, "mainScheduler");
        e0e.f((Object)c, "ioScheduler");
        e0e.f((Object)d, "computationScheduler");
        e0e.f((Object)e, "viewProvider");
        e0e.f((Object)f, "viewPreparer");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = k5b.m("tmp_screenshot_", userIdentifier.getId(), "_");
    }
    
    public final bbq<awj<Uri, Size>> a(final bbq<T> p0, final boolean p1, final String p2, final int p3, final bxo p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_0        
        //     3: getfield        tzo.c:Lbxo;
        //     6: invokevirtual   tzo.b:(Lbbq;Lbxo;)Lbbq;
        //     9: new             Lwcn;
        //    12: dup            
        //    13: new             Luzo;
        //    16: dup            
        //    17: aload_0        
        //    18: aload_2        
        //    19: iload_3        
        //    20: invokespecial   uzo.<init>:(Ltzo;Ljava/lang/String;I)V
        //    23: bipush          21
        //    25: invokespecial   wcn.<init>:(Lstb;I)V
        //    28: invokevirtual   bbq.w:(Lrtb;)Lbbq;
        //    31: aload           4
        //    33: invokevirtual   bbq.y:(Lbxo;)Lbbq;
        //    36: areturn        
        //    Signature:
        //  (Lbbq<TT;>;ZLjava/lang/String;ILbxo;)Lbbq<Lawj<Landroid/net/Uri;Landroid/util/Size;>;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 5
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    
    public final bbq<Bitmap> b(final bbq<T> bbq, final bxo bxo) {
        e0e.f((Object)bxo, "deliveryScheduler");
        return (bbq<Bitmap>)((bbq)new hcq((idq)bbq.y(this.b).w((rtb)new vyn((stb)new tzo$a(this), 19)), (rtb)new uyn((stb)new tzo$b(this), 22))).y(this.c).w((rtb)new w1n((stb)tzo$c.F0, 24)).y(bxo);
    }
}
