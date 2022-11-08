import android.app.Activity;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import android.view.ViewGroup$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j16
{
    public static final ViewGroup$LayoutParams a;
    
    static {
        a = new ViewGroup$LayoutParams(-2, -2);
    }
    
    public static void a(final ComponentActivity componentActivity, final gub gub) {
        zzd.f((Object)componentActivity, "<this>");
        final View child = ((ViewGroup)((Activity)componentActivity).getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        ComposeView composeView;
        if (child instanceof ComposeView) {
            composeView = (ComposeView)child;
        }
        else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext((le6)null);
            composeView.setContent((gub<? super m76, ? super Integer, oyv>)gub);
        }
        else {
            final ComposeView composeView2 = new ComposeView((Context)componentActivity, null, 6);
            composeView2.setParentCompositionContext((le6)null);
            composeView2.setContent((gub<? super m76, ? super Integer, oyv>)gub);
            final View decorView = ((Activity)componentActivity).getWindow().getDecorView();
            zzd.e((Object)decorView, "window.decorView");
            if (rp2.P(decorView) == null) {
                decorView.setTag(2131432598, (Object)componentActivity);
            }
            if (oyz.v(decorView) == null) {
                decorView.setTag(2131432601, (Object)componentActivity);
            }
            if (kbx.a(decorView) == null) {
                kbx.b(decorView, (yso)componentActivity);
            }
            componentActivity.setContentView((View)composeView2, j16.a);
        }
    }
}
