import java.util.WeakHashMap;
import android.view.View;
import android.content.res.Resources;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpq extends gue implements gub<Point, ncq, Point>
{
    public final /* synthetic */ fpq C0;
    
    public gpq(final fpq c0) {
        this.C0 = c0;
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
            n = point.x - ((View)this.C0.R0).getWidth();
        }
        else {
            n = ((View)this.C0.R0).getWidth() * 2 + point.x - ncq.a;
        }
        return new Point(n, (int)(((View)this.C0.R0).getHeight() * Resources.getSystem().getDisplayMetrics().density) / 2 + point.y + (int)(16 * Resources.getSystem().getDisplayMetrics().density));
    }
}
