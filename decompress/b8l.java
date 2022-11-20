import android.view.View;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView$ScaleType;
import java.util.Objects;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b8l extends ste implements nsb<ImageView>
{
    public final a8l D0;
    
    public b8l(final a8l d0) {
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        final a8l.a companion = a8l.Companion;
        final Context a = this.D0.a;
        Objects.requireNonNull(companion);
        final ImageView imageView = new ImageView(a);
        ((View)imageView).setId(2131427684);
        imageView.setScaleType(ImageView$ScaleType.FIT_CENTER);
        ((View)imageView).setContentDescription((CharSequence)null);
        ((View)imageView).setImportantForAccessibility(2);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(((View)imageView).getResources().getDimensionPixelSize(2131165312), ((View)imageView).getResources().getDimensionPixelSize(2131165312));
        layoutParams.addRule(12);
        layoutParams.addRule(21);
        ((View)imageView).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        return imageView;
    }
}
