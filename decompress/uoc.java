import android.widget.ImageView;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import java.util.Objects;
import android.view.View;
import com.twitter.ui.components.inlinetooltip.HorizonInlineTooltipView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uoc implements View$OnClickListener
{
    public final boolean D0;
    public final HorizonInlineTooltipView E0;
    public final View F0;
    public final nsb G0;
    
    public uoc(final boolean d0, final HorizonInlineTooltipView e0, final View f0, final nsb g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        final boolean d0 = this.D0;
        final HorizonInlineTooltipView e0 = this.E0;
        final View f0 = this.F0;
        final nsb g0 = this.G0;
        final int b1 = HorizonInlineTooltipView.b1;
        czd.f((Object)e0, "this$0");
        czd.f((Object)g0, "$onDismiss");
        if (d0 && !q3j.M()) {
            final ypd a1 = e0.a1;
            Objects.requireNonNull(a1);
            boolean b2 = false;
            Float value;
            if (f0 == null) {
                value = null;
            }
            else {
                final int[] array = new int[2];
                f0.getLocationInWindow(array);
                final int n = array[0];
                final int n2 = f0.getWidth() / 2;
                final int[] array2 = new int[2];
                ((View)a1.a).getLocationInWindow(array2);
                final int n3 = array2[0];
                final int n4 = ((View)a1.a).getWidth() + n3;
                value = Float.valueOf(ypd.Companion.a(n2 + n, (n3 + n4) / 2, n3, n4));
            }
            final ImageView d2 = e0.a1.d;
            czd.e((Object)d2, "bottomPointer");
            if (((View)d2).getVisibility() == 0) {
                b2 = true;
            }
            float n5 = 1.0f;
            final jra interpolator = new jra();
            final long duration = (long)(((View)e0).getHeight() / ((View)e0).getResources().getDisplayMetrics().density / xm1.Companion.a(0.75f, 0.1f, 10.0f));
            if (value != null) {
                n5 = 0.0f;
            }
            float floatValue;
            if (value != null) {
                floatValue = value;
            }
            else {
                floatValue = 0.0f;
            }
            float n6;
            if (b2) {
                n6 = ((View)e0).getHeight() / (float)2;
            }
            else {
                n6 = -(((View)e0).getHeight() / (float)2);
            }
            final sz5 sz5 = new sz5();
            ((View)e0).animate().withLayer().alpha(0.0f).scaleX(n5).scaleY(0.0f).translationX(floatValue).translationY(n6).setInterpolator((TimeInterpolator)interpolator).setDuration(duration).setListener((Animator$AnimatorListener)new m7x((View)e0, sz5)).start();
            ((sy5)sz5).q((oj)new tzo((Object)g0, 21));
        }
        else {
            ((View)e0).setVisibility(8);
            g0.invoke();
        }
    }
}
