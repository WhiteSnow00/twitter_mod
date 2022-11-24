import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.twitter.ui.view.CircleProgressBar;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewStub$OnInflateListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ypf implements ViewStub$OnInflateListener
{
    public final zpf F0;
    
    public ypf(final zpf f0) {
        this.F0 = f0;
    }
    
    public final void onInflate(final ViewStub viewStub, final View view) {
        final zpf f0 = this.F0;
        e0e.f((Object)f0, "this$0");
        f0.I0 = (FrescoMediaImageView)view.findViewById(2131430247);
        f0.H0 = (CircleProgressBar)view.findViewById(2131428246);
        final Context context = view.getContext();
        e0e.e((Object)context, "view.context");
        final Object a = qo6.a;
        final Drawable c = ie9.c(qo6$c.b(context, 2131232353), qo6.b(context, 2131100880));
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167445);
        final CircleProgressBar h0 = f0.H0;
        if (h0 != null) {
            h0.setCenterDrawable((Drawable)new InsetDrawable(c, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize));
        }
        final FrescoMediaImageView i0 = f0.I0;
        if (i0 != null) {
            i0.setOverlayDrawable((Drawable)new ColorDrawable(qo6.b(context, 2131099710)));
        }
    }
}
