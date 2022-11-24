import android.view.View;
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sdg implements Callable<oeg<udg>>
{
    public final int F0;
    public final LottieAnimationView G0;
    
    public sdg(final LottieAnimationView g0, final int f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    @Override
    public final Object call() throws Exception {
        final LottieAnimationView g0 = this.G0;
        oeg<udg> oeg;
        if (g0.U0) {
            final Context context = ((View)g0).getContext();
            final int f0 = this.F0;
            oeg = wdg.e(context, f0, wdg.h(context, f0));
        }
        else {
            oeg = wdg.e(((View)g0).getContext(), this.F0, null);
        }
        return oeg;
    }
}
