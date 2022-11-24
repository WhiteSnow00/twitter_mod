import android.view.View;
import java.util.HashMap;
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tdg implements Callable<oeg<udg>>
{
    public final String F0;
    public final LottieAnimationView G0;
    
    public tdg(final LottieAnimationView g0, final String f0) {
        this.G0 = g0;
        this.F0 = f0;
    }
    
    @Override
    public final Object call() throws Exception {
        final LottieAnimationView g0 = this.G0;
        oeg<udg> oeg;
        if (g0.U0) {
            final Context context = ((View)g0).getContext();
            final String f0 = this.F0;
            final HashMap a = wdg.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("asset_");
            sb.append(f0);
            oeg = wdg.b(context, f0, sb.toString());
        }
        else {
            oeg = wdg.b(((View)g0).getContext(), this.F0, null);
        }
        return oeg;
    }
}
