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

public final class ma4 extends ImageView
{
    public Animation$AnimationListener C0;
    public int D0;
    
    public ma4(final Context context) {
        super(context);
        final float density = ((View)this).getContext().getResources().getDisplayMetrics().density;
        final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(ck1.E0);
        this.D0 = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
        final WeakHashMap a = p5x.a;
        p5x$i.s((View)this, density * 4.0f);
        shapeDrawable.getPaint().setColor(this.D0);
        p5x$d.q((View)this, (Drawable)shapeDrawable);
    }
    
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        final Animation$AnimationListener c0 = this.C0;
        if (c0 != null) {
            c0.onAnimationEnd(((View)this).getAnimation());
        }
    }
    
    public final void onAnimationStart() {
        super.onAnimationStart();
        final Animation$AnimationListener c0 = this.C0;
        if (c0 != null) {
            c0.onAnimationStart(((View)this).getAnimation());
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
    }
    
    public final void setBackgroundColor(final int n) {
        if (((View)this).getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable)((View)this).getBackground()).getPaint().setColor(n);
            this.D0 = n;
        }
    }
}
