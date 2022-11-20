import android.content.res.Resources;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pvo extends ste implements ftb<Point, edq, Point>
{
    public static final pvo D0;
    
    static {
        D0 = new pvo();
    }
    
    public pvo() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final Point point = (Point)o;
        final edq edq = (edq)o2;
        czd.f((Object)point, "buttonPosition");
        czd.f((Object)edq, "popupSize");
        return new Point(point.x - edq.a, point.y - edq.b + (int)(16 * Resources.getSystem().getDisplayMetrics().density));
    }
}
