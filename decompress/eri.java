import android.app.Notification$BigPictureStyle;
import android.os.Build$VERSION;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eri extends lri
{
    public Bitmap e;
    public IconCompat f;
    public boolean g;
    
    @Override
    public final void b(final jqi jqi) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Notification$BigPictureStyle bigPicture = new Notification$BigPictureStyle(((mri)jqi).b).setBigContentTitle(super.b).bigPicture(this.e);
        if (this.g) {
            final IconCompat f = this.f;
            if (f == null) {
                eri.eri$a.a(bigPicture, (Bitmap)null);
            }
            else if (sdk_INT >= 23) {
                eri.eri$b.a(bigPicture, f.m(((mri)jqi).a));
            }
            else if (f.j() == 1) {
                eri.eri$a.a(bigPicture, this.f.f());
            }
            else {
                eri.eri$a.a(bigPicture, (Bitmap)null);
            }
        }
        if (super.d) {
            eri.eri$a.b(bigPicture, super.c);
        }
        if (sdk_INT >= 31) {
            eri.eri$c.b(bigPicture, false);
            eri.eri$c.a(bigPicture, (CharSequence)null);
        }
    }
    
    @Override
    public final String f() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
