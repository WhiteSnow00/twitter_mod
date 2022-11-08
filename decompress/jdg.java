import android.view.View;
import java.util.HashMap;
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdg implements Callable<eeg<kdg>>
{
    public final /* synthetic */ String C0;
    public final /* synthetic */ LottieAnimationView D0;
    
    public jdg(final LottieAnimationView d0, final String c0) {
        this.D0 = d0;
        this.C0 = c0;
    }
    
    @Override
    public final Object call() throws Exception {
        final LottieAnimationView d0 = this.D0;
        eeg<kdg> eeg;
        if (d0.R0) {
            final Context context = ((View)d0).getContext();
            final String c0 = this.C0;
            final HashMap a = mdg.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("asset_");
            sb.append(c0);
            eeg = mdg.b(context, c0, sb.toString());
        }
        else {
            eeg = mdg.b(((View)d0).getContext(), this.C0, null);
        }
        return eeg;
    }
}
