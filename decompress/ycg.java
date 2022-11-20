import android.view.View;
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ycg implements Callable<udg<adg>>
{
    public final int D0;
    public final LottieAnimationView E0;
    
    public ycg(final LottieAnimationView e0, final int d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    @Override
    public final Object call() throws Exception {
        final LottieAnimationView e0 = this.E0;
        udg<adg> udg;
        if (e0.S0) {
            final Context context = ((View)e0).getContext();
            final int d0 = this.D0;
            udg = cdg.e(context, d0, cdg.h(context, d0));
        }
        else {
            udg = cdg.e(((View)e0).getContext(), this.D0, null);
        }
        return udg;
    }
}
