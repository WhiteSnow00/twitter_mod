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

public final class ta4 extends ImageView
{
    public Animation$AnimationListener F0;
    public int G0;
    
    public ta4(final Context context) {
        super(context);
        final float density = ((View)this).getContext().getResources().getDisplayMetrics().density;
        final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(pk7.H0);
        this.G0 = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
        final WeakHashMap a = b7x.a;
        b7x$i.s((View)this, density * 4.0f);
        shapeDrawable.getPaint().setColor(this.G0);
        b7x$d.q((View)this, (Drawable)shapeDrawable);
    }
    
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        final Animation$AnimationListener f0 = this.F0;
        if (f0 != null) {
            f0.onAnimationEnd(((View)this).getAnimation());
        }
    }
    
    public final void onAnimationStart() {
        super.onAnimationStart();
        final Animation$AnimationListener f0 = this.F0;
        if (f0 != null) {
            f0.onAnimationStart(((View)this).getAnimation());
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
    }
    
    public final void setBackgroundColor(final int n) {
        if (((View)this).getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)((View)this).getBackground()).getPaint().setColor(n);
            this.G0 = n;
        }
    }
}
