import android.content.Context;
import java.io.IOException;
import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
import android.graphics.Bitmap$CompressFormat;
import android.util.Size;
import android.net.Uri;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyo extends gue implements rtb<Bitmap, gvj<? extends Uri, ? extends Size>>
{
    public final /* synthetic */ jyo<Object> C0;
    public final /* synthetic */ boolean D0;
    public final /* synthetic */ String E0;
    public final /* synthetic */ int F0;
    
    public kyo(final jyo<Object> p0, final boolean p1, final String p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: putfield        kyo.C0:Ljyo;
        //     5: aload_0        
        //     6: iconst_1       
        //     7: putfield        kyo.D0:Z
        //    10: aload_0        
        //    11: aload_2        
        //    12: putfield        kyo.E0:Ljava/lang/String;
        //    15: aload_0        
        //    16: iload_3        
        //    17: putfield        kyo.F0:I
        //    20: aload_0        
        //    21: iconst_1       
        //    22: invokespecial   gue.<init>:(I)V
        //    25: return         
        //    Signature:
        //  (Ljyo<Ljava/lang/Object;>;ZLjava/lang/String;I)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
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
    
    public final Object invoke(Object o) {
        final Bitmap bitmap = (Bitmap)o;
        zzd.f((Object)bitmap, "bitmap");
        final jyo<Object> c0 = this.C0;
        final Context a = c0.a;
        final boolean d0 = this.D0;
        final String c2 = l7k.c(c0.g, this.E0);
        final int w = pf8.w(this.F0, (kk4)new fud(0, 100));
        zzd.f((Object)a, "context");
        zzd.f((Object)c2, "fileName");
        Bitmap$CompressFormat bitmap$CompressFormat;
        if (d0) {
            bitmap$CompressFormat = Bitmap$CompressFormat.PNG;
        }
        else {
            bitmap$CompressFormat = Bitmap$CompressFormat.JPEG;
        }
        zzd.f((Object)bitmap$CompressFormat, "compressFormat");
        String s;
        if (bitmap$CompressFormat == Bitmap$CompressFormat.PNG) {
            s = "png";
        }
        else {
            s = "jpg";
        }
        try {
            a.getExternalCacheDir();
            goto Label_0134;
        }
        catch (final Exception ex) {
            e9a.d((Throwable)ex);
        }
        catch (final ArrayIndexOutOfBoundsException ex2) {
            goto Label_0132;
        }
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(o);
            sb.append("/");
            sb.append(c2);
            sb.append(".");
            sb.append(s);
            final FileOutputStream fileOutputStream = new FileOutputStream(sb.toString());
            bitmap.compress(bitmap$CompressFormat, w, (OutputStream)fileOutputStream);
            fileOutputStream.close();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(c2);
            sb2.append(".");
            sb2.append(s);
            o = new File((File)o, sb2.toString());
            goto Label_0356;
        }
        catch (final IOException ex3) {}
    }
}
