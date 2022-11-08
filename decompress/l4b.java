import android.view.View;
import java.util.Objects;
import com.twitter.rooms.ui.spacebar.FleetlineViewModel;
import com.twitter.rooms.ui.spacebar.FleetlineViewBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l4b extends gue implements rtb<pmi, oyv>
{
    public final /* synthetic */ FleetlineViewBinder C0;
    public final /* synthetic */ r4b D0;
    public final /* synthetic */ FleetlineViewModel E0;
    
    public l4b(final FleetlineViewBinder c0, final r4b d0, final FleetlineViewModel e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pmi pmi = (pmi)o;
        final FleetlineViewBinder c0 = this.C0;
        final r4b d0 = this.D0;
        final FleetlineViewModel e0 = this.E0;
        Objects.requireNonNull(c0);
        ((View)d0.a()).setVisibility(8);
        boolean b = true;
        d0.b(true);
        if (((ri8)e0.C0).a() == 0) {
            b = false;
        }
        d0.b(b);
        c0.g.removeCallbacks((Runnable)c0.i);
        c0.e.onNext((Object)Boolean.TRUE);
        return oyv.a;
    }
}
