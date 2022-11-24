import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.annotation.TargetApi;

// 
// Decompiled by Procyon v0.6.0
// 

@TargetApi(21)
public final class gt0 extends uhk
{
    public final a12 a;
    public final ej4 b;
    
    public gt0(final a12 a, final ej4 b) {
        this.a = a;
        this.b = b;
    }
    
    public final cj4<Bitmap> a(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        final Bitmap bitmap = (Bitmap)((ark)this.a).get(i12.c(n, n2, bitmap$Config));
        xd.D(bitmap.getAllocationByteCount() >= i12.b(bitmap$Config) * (n * n2));
        bitmap.reconfigure(n, n2, bitmap$Config);
        final ej4 b = this.b;
        final a12 a = this.a;
        final dj4 a2 = b.a;
        final Class<cj4> j0 = cj4.J0;
        a2.b();
        return cj4.q(bitmap, (asm<Bitmap>)a, (cj4.c)a2, null);
    }
}
