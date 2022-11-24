import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j7n extends pue implements stb<l7n, vzv>
{
    public final RoomAudioSpaceViewModel F0;
    
    public j7n(final RoomAudioSpaceViewModel f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final l7n l7n = (l7n)o;
        e0e.f((Object)l7n, "state");
        final Long k = l7n.K;
        if (k != null) {
            final RoomAudioSpaceViewModel f0 = this.F0;
            MviViewModel.N((MviViewModel)f0, (bbq)f0.g1.c.b(k.longValue(), l7n.N), (String)null, (asx)null, (hub)new i7n(f0, (mp6)null), 3, (Object)null);
        }
        return vzv.a;
    }
}
