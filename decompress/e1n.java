import java.util.WeakHashMap;
import android.view.View;
import android.content.res.Resources;
import android.widget.ImageView;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e1n extends gue implements gub<Point, ncq, Point>
{
    public final /* synthetic */ x0n C0;
    public final /* synthetic */ ImageView D0;
    
    public e1n(final x0n c0, final ImageView d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final Point point = (Point)o;
        final ncq ncq = (ncq)o2;
        zzd.f((Object)point, "anchorPosition");
        zzd.f((Object)ncq, "popupSize");
        final View c0 = this.C0.C0;
        zzd.f((Object)c0, "<this>");
        final WeakHashMap a = p5x.a;
        final int d = p5x$e.d(c0);
        boolean b = true;
        if (d != 1) {
            b = false;
        }
        int n;
        if (b) {
            n = point.x + (int)(8 * Resources.getSystem().getDisplayMetrics().density);
        }
        else {
            n = ((View)this.D0).getWidth() + point.x - ncq.a - (int)(8 * Resources.getSystem().getDisplayMetrics().density);
        }
        return new Point(n, point.y - ncq.b - (int)(16 * Resources.getSystem().getDisplayMetrics().density));
    }
}
