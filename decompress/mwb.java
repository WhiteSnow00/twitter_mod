import android.view.View;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwb extends cws
{
    public static final Point u;
    public final Drawable t;
    
    static {
        u = new Point(0, 0);
    }
    
    public mwb(final gob gob, final jp jp, final String s, final ncq ncq, final ncq ncq2, final abm abm, final ViewGroup viewGroup, final Drawable t) {
        super(gob, jp, s, ncq, ncq2, abm, ImageView$ScaleType.FIT_CENTER, viewGroup);
        this.t = t;
        viewGroup.addView((View)super.c, 0);
    }
}
