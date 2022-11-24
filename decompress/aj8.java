import android.graphics.Bitmap;
import java.util.Map;
import android.content.res.Resources;
import android.content.Context;
import java.io.File;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class aj8 implements n9d
{
    public final List<Future<d9d>> a;
    public final dxg b;
    
    public aj8(final dxg b) {
        this.b = b;
        this.a = new ArrayList();
    }
    
    public final void a(final Drawable imageDrawable, final ImageView imageView) {
        imageView.setImageDrawable(imageDrawable);
    }
    
    public final void b(final String s, final n9d$b n9d$b) {
        final z8d z8d = new z8d(z8d.g(s));
        ((bsm)z8d).i = (bsm$b)new ui8(n9d$b);
        this.h(z8d);
    }
    
    public void c(final String s, final ImageView imageView) {
        this.i(new z8d(z8d.h(s, beq.g(256, 256))), imageView);
    }
    
    public final void d(final File file, final ImageView imageView) {
        final e2h j0 = e2h.J0;
        dwg.d(file).c((bdq)new yi8(this, imageView));
    }
    
    public void e(final String s, final int n, final int n2, final n9d$b n9d$b) {
        final z8d z8d = new z8d(z8d.h(s, beq.g(n, n2)));
        ((bsm)z8d).i = (bsm$b)new vi8(n9d$b);
        this.h(z8d);
    }
    
    public final void f(final Context context, final String s, final ImageView imageView) {
        final Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            this.c(s, imageView);
            return;
        }
        final zi8 zi8 = new zi8(drawable, imageView);
        final Resources resources = context.getResources();
        final z8d z8d = new z8d(z8d.h(s, beq.g(320, 568)));
        ((bsm)z8d).i = (bsm$b)new wi8((n9d$c)zi8, resources);
        this.h(z8d);
    }
    
    public final void g(final Context p0, final String p1, final Map<String, Bitmap> p2, final double p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: invokestatic    z8d.g:(Ljava/lang/String;)Lz8d$a;
        //     8: invokespecial   z8d.<init>:(Lz8d$a;)V
        //    11: astore_1       
        //    12: aload_1        
        //    13: new             Lti8;
        //    16: dup            
        //    17: dload_3        
        //    18: aload_2        
        //    19: invokespecial   ti8.<init>:(DLjava/util/Map;)V
        //    22: putfield        bsm.i:Lbsm$b;
        //    25: aload_0        
        //    26: aload_1        
        //    27: invokevirtual   aj8.h:(Lz8d;)V
        //    30: return         
        //    Signature:
        //  (Landroid/content/Context;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Landroid/graphics/Bitmap;>;D)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 5
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2027)
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
    
    public final void h(final z8d z8d) {
        final f8j d = this.b.d(z8d);
        this.a.add(d);
        d.i((fa3)new id2((Object)this, (Object)d, 1));
    }
    
    public final void i(final z8d z8d, final ImageView imageView) {
        ((bsm)z8d).i = (bsm$b)new xi8(imageView);
        this.h(z8d);
    }
}
