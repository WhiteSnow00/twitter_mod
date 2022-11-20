import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.ui.core.schedule.details.RoomScheduledSpaceDetailsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.core.schedule.details.RoomScheduledSpaceDetailsViewModel$subscribeAudioSpace$1", f = "RoomScheduledSpaceDetailsViewModel.kt", l = {}, m = "invokeSuspend")
public final class e4o extends p0s implements qsb<go6<? super fzv>, Object>
{
    public final RoomScheduledSpaceDetailsViewModel D0;
    public final String E0;
    
    public e4o(final RoomScheduledSpaceDetailsViewModel d0, final String e0, final go6<? super e4o> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(1, (go6)go6);
    }
    
    public final go6<fzv> create(final go6<?> go6) {
        return (go6<fzv>)new e4o(this.D0, this.E0, (go6<? super e4o>)go6);
    }
    
    public final Object invoke(final Object o) {
        final e4o e4o = (e4o)this.create((go6<?>)o);
        final fzv a = fzv.a;
        e4o.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomScheduledSpaceDetailsViewModel d0 = this.D0;
        final e4o$a e4o$a = new e4o$a(d0);
        final coe[] g1 = RoomScheduledSpaceDetailsViewModel.g1;
        ((MviViewModel)d0).T((qsb)e4o$a);
        this.D0.Q0.g(this.E0, true);
        return fzv.a;
    }
}
