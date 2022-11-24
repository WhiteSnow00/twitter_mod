import android.view.View;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.graphics.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owb extends kxs
{
    public static final Point u;
    public final Drawable t;
    
    static {
        u = new Point(0, 0);
    }
    
    public owb(final dob dob, final mp mp, final String s, final beq beq, final beq beq2, final ccm ccm, final ViewGroup viewGroup, final Drawable t) {
        super(dob, mp, s, beq, beq2, ccm, ImageView$ScaleType.FIT_CENTER, viewGroup);
        this.t = t;
        viewGroup.addView((View)super.c, 0);
    }
}
