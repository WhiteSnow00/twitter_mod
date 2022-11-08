import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Bitmap$Config;
import android.graphics.Paint;
import java.util.Objects;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsi extends lj1
{
    public final /* synthetic */ rpg<xqb> a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hsi c;
    public final /* synthetic */ int d;
    
    public gsi(final rpg<xqb> a, final boolean b, final hsi c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void e(final h88<wi4<ui4>> h88) {
        zzd.f((Object)h88, "dataSource");
        final ob ob = (ob)h88;
        if (ob.f() != null) {
            final rpg<xqb> a = this.a;
            final Throwable f = ob.f();
            zzd.c((Object)f);
            a.onError(f);
        }
    }
    
    @Override
    public final void g(final Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (this.b && (bitmap2 = bitmap) != null) {
            Objects.requireNonNull(this.c);
            final Paint paint = new Paint(3);
            final ncq$a companion = ncq.Companion;
            final int width = bitmap.getWidth();
            final ncq b = companion.b(width, width);
            pf8.r(b);
            int m = b.m();
            pf8.r(b);
            final int i = b.m();
            boolean b2 = true;
            Bitmap scaledBitmap;
            if (m > i) {
                scaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i, true);
                m = i;
            }
            else {
                b2 = false;
                scaledBitmap = bitmap;
            }
            final Bitmap bitmap3 = Bitmap.createBitmap(m, m, Bitmap$Config.ARGB_8888);
            final Shader$TileMode clamp = Shader$TileMode.CLAMP;
            paint.setShader((Shader)new BitmapShader(scaledBitmap, clamp, clamp));
            final Canvas canvas = new Canvas(bitmap3);
            final float n = m / 2.0f;
            canvas.drawCircle(n, n, n, paint);
            if (b2) {
                scaledBitmap.recycle();
            }
            bitmap2 = bitmap;
            if (bitmap3 != null) {
                bitmap2 = bitmap3;
            }
        }
        this.a.b((Object)new xqb(snj.b((Object)bitmap2), this.d));
    }
}
