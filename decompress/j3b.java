import android.view.View;
import java.util.Objects;
import com.twitter.rooms.ui.spacebar.FleetlineViewBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j3b extends ste implements qsb<tmi, fzv>
{
    public final FleetlineViewBinder D0;
    public final m3b E0;
    
    public j3b(final FleetlineViewBinder d0, final m3b e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tmi tmi = (tmi)o;
        final FleetlineViewBinder d0 = this.D0;
        final m3b e0 = this.E0;
        Objects.requireNonNull(d0);
        ((View)e0.a()).setVisibility(0);
        ((View)e0.a()).setAlpha(0.0f);
        ((View)e0.a()).animate().alpha(1.0f).start();
        e0.b(false);
        d0.g.postDelayed((Runnable)d0.i, 3000L);
        return fzv.a;
    }
}
