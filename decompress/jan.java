import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.rooms.ui.core.consumptionpreview.RoomConsumptionPreviewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jan extends ste implements qsb<nan, fzv>
{
    public final int D0;
    public final RoomConsumptionPreviewViewModel E0;
    
    public jan(final int d0, final RoomConsumptionPreviewViewModel e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nan nan = (nan)o;
        czd.f((Object)nan, "state");
        final ye3 d = nan.d;
        final ye3 d2 = ye3.D0;
        boolean b = true;
        if (d != d2 || this.D0 != 1) {
            b = false;
        }
        final RoomConsumptionPreviewViewModel e0 = this.E0;
        final coe[] g1 = RoomConsumptionPreviewViewModel.g1;
        Objects.requireNonNull(e0);
        ((MviViewModel)e0).T((qsb)new kan(e0, b));
        return fzv.a;
    }
}
