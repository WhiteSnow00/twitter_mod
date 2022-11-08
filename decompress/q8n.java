import android.content.res.Resources;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8n extends gue implements gub<Point, ncq, Point>
{
    public static final q8n C0;
    
    static {
        C0 = new q8n();
    }
    
    public q8n() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final Point point = (Point)o;
        final ncq ncq = (ncq)o2;
        zzd.f((Object)point, "anchorPosition");
        zzd.f((Object)ncq, "<anonymous parameter 1>");
        return new Point(point.x, point.y - (int)(16 * Resources.getSystem().getDisplayMetrics().density));
    }
}
