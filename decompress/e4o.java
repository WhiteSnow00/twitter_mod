import java.util.WeakHashMap;
import android.view.View;
import android.content.res.Resources;
import android.widget.ImageView;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e4o extends pue implements hub<Point, beq, Point>
{
    public final c4o F0;
    public final ImageView G0;
    
    public e4o(final c4o f0, final ImageView g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final Point point = (Point)o;
        final beq beq = (beq)o2;
        e0e.f((Object)point, "anchorPosition");
        e0e.f((Object)beq, "popupSize");
        final View f0 = this.F0.F0;
        e0e.f((Object)f0, "<this>");
        final WeakHashMap a = b7x.a;
        final int d = b7x$e.d(f0);
        boolean b = true;
        if (d != 1) {
            b = false;
        }
        int n;
        if (b) {
            n = point.x - ((View)this.G0).getWidth();
        }
        else {
            n = ((View)this.G0).getWidth() * 2 + point.x - beq.a;
        }
        return new Point(n, (int)(((View)this.G0).getHeight() * Resources.getSystem().getDisplayMetrics().density) / 2 + point.y + (int)(16 * Resources.getSystem().getDisplayMetrics().density));
    }
}
