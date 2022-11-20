import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yhp extends o32
{
    public static final yhp.yhp$a Companion;
    public final edq f;
    
    static {
        Companion = new yhp.yhp$a();
        edq.Companion.b(100, 100);
    }
    
    public yhp(final Context context, final edq f) {
        super(10, context, 1);
        this.f = f;
    }
    
    public final xh4<Bitmap> a(final Bitmap bitmap, ghk a) {
        czd.f((Object)bitmap, "sourceBitmap");
        czd.f((Object)a, "bitmapFactory");
        final edq b = edq.Companion.b(bitmap.getWidth(), bitmap.getHeight());
        Bitmap$Config bitmap$Config;
        if ((bitmap$Config = bitmap.getConfig()) == null) {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final edq p = b.p(this.f);
        a = (ghk)a.a(p.a, p.b, bitmap$Config);
        czd.e((Object)a, "bitmapFactory.createBitm\u2026ight, sourceBitmapConfig)");
        try {
            final Object h = ((xh4)a).h();
            final Bitmap bitmap2 = (Bitmap)h;
            new Canvas(bitmap2).drawBitmap(bitmap, (Rect)null, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), (Paint)null);
            this.e((Bitmap)h);
            final xh4 a2 = ((xh4)a).a();
            czd.e((Object)a2, "{\n            val destin\u2026tmapRef.clone()\n        }");
            return (xh4<Bitmap>)a2;
        }
        finally {
            xh4.e((xh4)a);
        }
    }
}
