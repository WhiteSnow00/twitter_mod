import java.util.WeakHashMap;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q94 extends ImageView
{
    public Animation$AnimationListener D0;
    public int E0;
    
    public q94(final Context context) {
        super(context);
        final float density = ((View)this).getContext().getResources().getDisplayMetrics().density;
        final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(jee.G0);
        this.E0 = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
        final WeakHashMap a = j6x.a;
        j6x$i.s((View)this, density * 4.0f);
        shapeDrawable.getPaint().setColor(this.E0);
        j6x$d.q((View)this, (Drawable)shapeDrawable);
    }
    
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        final Animation$AnimationListener d0 = this.D0;
        if (d0 != null) {
            d0.onAnimationEnd(((View)this).getAnimation());
        }
    }
    
    public final void onAnimationStart() {
        super.onAnimationStart();
        final Animation$AnimationListener d0 = this.D0;
        if (d0 != null) {
            d0.onAnimationStart(((View)this).getAnimation());
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
    }
    
    public final void setBackgroundColor(final int n) {
        if (((View)this).getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)((View)this).getBackground()).getPaint().setColor(n);
            this.E0 = n;
        }
    }
}
