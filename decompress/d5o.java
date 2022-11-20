import java.util.Objects;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.List;
import java.util.Calendar;
import com.twitter.rooms.ui.utils.schedule.edit.RoomScheduledSpaceEditViewModel;
import tv.periscope.android.api.EditBroadcastResponse;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.utils.schedule.edit.RoomScheduledSpaceEditViewModel$editSpace$2$1", f = "RoomScheduledSpaceEditViewModel.kt", l = {}, m = "invokeSuspend")
public final class d5o extends p0s implements ftb<EditBroadcastResponse, go6<? super fzv>, Object>
{
    public final RoomScheduledSpaceEditViewModel D0;
    public final String E0;
    public final String F0;
    public final Calendar G0;
    public final List<AudioSpaceTopicItem> H0;
    public final boolean I0;
    
    public d5o(final RoomScheduledSpaceEditViewModel d0, final String e0, final String f0, final Calendar g0, final List<AudioSpaceTopicItem> h0, final boolean i0, final go6<? super d5o> go6) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new d5o(this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, (go6<? super d5o>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d5o d5o = (d5o)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        d5o.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomScheduledSpaceEditViewModel d0 = this.D0;
        final String e0 = this.E0;
        final String f0 = this.F0;
        final long timeInMillis = this.G0.getTimeInMillis();
        final List<AudioSpaceTopicItem> h0 = this.H0;
        final boolean i0 = this.I0;
        Objects.requireNonNull(d0);
        czd.f((Object)e0, "roomId");
        czd.f((Object)f0, "spaceName");
        czd.f((Object)h0, "topics");
        d0.V((Object)m4o$d.a);
        d0.V((Object)m4o$c.a);
        d0.Q0.a(e0, f0, timeInMillis, (List)h0, i0);
        return fzv.a;
    }
}
