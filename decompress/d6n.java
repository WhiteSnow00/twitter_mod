import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d6n extends gue implements rtb<f6n, oyv>
{
    public final /* synthetic */ RoomAudioSpaceViewModel C0;
    
    public d6n(final RoomAudioSpaceViewModel c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final f6n f6n = (f6n)o;
        zzd.f((Object)f6n, "state");
        final Long k = f6n.K;
        if (k != null) {
            final RoomAudioSpaceViewModel c0 = this.C0;
            MviViewModel.N((MviViewModel)c0, c0.d1.c.b(k.longValue(), f6n.N), (String)null, (qqx)null, (gub)new c6n(c0, (ap6)null), 3, (Object)null);
        }
        return oyv.a;
    }
}
