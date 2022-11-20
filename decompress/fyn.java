import java.util.WeakHashMap;
import android.content.res.Resources;
import android.view.View;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyn extends ste implements ftb<Point, edq, Point>
{
    public final dyn D0;
    public final View E0;
    
    public fyn(final dyn d0, final View e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final Point point = (Point)o;
        final edq edq = (edq)o2;
        czd.f((Object)point, "shareButtonPosition");
        czd.f((Object)edq, "popupSize");
        final View d0 = this.D0.D0;
        czd.f((Object)d0, "<this>");
        final WeakHashMap a = j6x.a;
        final int d2 = j6x$e.d(d0);
        boolean b = true;
        if (d2 != 1) {
            b = false;
        }
        int x;
        if (b) {
            x = point.x;
        }
        else {
            x = this.E0.getWidth() + point.x - edq.a;
        }
        return new Point(x, point.y - edq.b - (int)(16 * Resources.getSystem().getDisplayMetrics().density));
    }
}
