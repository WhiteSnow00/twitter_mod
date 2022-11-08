import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.rooms.ui.core.schedule.details.RoomScheduledSpaceDetailsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h3o extends gue implements rtb<String, q2o>
{
    public final /* synthetic */ RoomScheduledSpaceDetailsViewModel C0;
    
    public h3o(final RoomScheduledSpaceDetailsViewModel c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final String s = (String)o;
        zzd.f((Object)s, "it");
        final RoomScheduledSpaceDetailsViewModel c0 = this.C0;
        final aeo y0 = c0.Y0;
        Objects.requireNonNull(y0);
        MviViewModel.F((MviViewModel)c0, y0.h.a().firstElement().j((qtb)new jhb((rtb)new heo(y0, s), 21)), (String)null, (qqx)null, (rtb)new g3o((ap6)null), 3, (Object)null);
        return new q2o$k(s);
    }
}
