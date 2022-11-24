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

public final class upc implements View$OnClickListener
{
    public final boolean F0;
    public final HorizonInlineTooltipView G0;
    public final View H0;
    public final ptb I0;
    
    public upc(final boolean f0, final HorizonInlineTooltipView g0, final View h0, final ptb i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void onClick(final View view) {
        final boolean f0 = this.F0;
        final HorizonInlineTooltipView g0 = this.G0;
        final View h0 = this.H0;
        final ptb i0 = this.I0;
        final int d1 = HorizonInlineTooltipView.d1;
        e0e.f((Object)g0, "this$0");
        e0e.f((Object)i0, "$onDismiss");
        if (f0 && !ma7.A()) {
            final ard c1 = g0.c1;
            Objects.requireNonNull(c1);
            boolean b = false;
            Float value;
            if (h0 == null) {
                value = null;
            }
            else {
                final int[] array = new int[2];
                h0.getLocationInWindow(array);
                final int n = array[0];
                final int n2 = h0.getWidth() / 2;
                final int[] array2 = new int[2];
                ((View)c1.a).getLocationInWindow(array2);
                final int n3 = array2[0];
                final int n4 = ((View)c1.a).getWidth() + n3;
                value = Float.valueOf(ard.Companion.a(n2 + n, (n3 + n4) / 2, n3, n4));
            }
            final ImageView d2 = g0.c1.d;
            e0e.e((Object)d2, "bottomPointer");
            if (((View)d2).getVisibility() == 0) {
                b = true;
            }
            float n5 = 1.0f;
            final rsa interpolator = new rsa();
            final long duration = (long)(((View)g0).getHeight() / ((View)g0).getResources().getDisplayMetrics().density / cn1.Companion.a(0.75f, 0.1f, 10.0f));
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
            if (b) {
                n6 = ((View)g0).getHeight() / (float)2;
            }
            else {
                n6 = -(((View)g0).getHeight() / (float)2);
            }
            final y06 y06 = new y06();
            ((View)g0).animate().withLayer().alpha(0.0f).scaleX(n5).scaleY(0.0f).translationX(floatValue).translationY(n6).setInterpolator((TimeInterpolator)interpolator).setDuration(duration).setListener((Animator$AnimatorListener)new e8x((View)g0, y06)).start();
            ((yz5)y06).q((sj)new qbk((Object)i0, 25));
        }
        else {
            ((View)g0).setVisibility(8);
            i0.invoke();
        }
    }
}
