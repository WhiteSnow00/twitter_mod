import android.app.Notification;
import android.graphics.Bitmap;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k5f
{
    public final Resources a;
    public final kwg b;
    public final sql c;
    public final ba7 d;
    
    public k5f(final Resources a, final kwg b, final sql c, final ba7 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final kog<Notification> a(final qqi qqi, final lsi lsi, final Bitmap bitmap) {
        final rqi rqi = new rqi();
        this.d.a(z97.D0, qqi, lsi, (Bitmap)null, bitmap);
        qqi.m((vqi)rqi);
        return (kog<Notification>)kog.k((Object)qqi.b());
    }
}
