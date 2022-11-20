import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.ui.core.schedule.details.RoomScheduledSpaceDetailsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.core.schedule.details.RoomScheduledSpaceDetailsViewModel$unsubscribeAudioSpace$1", f = "RoomScheduledSpaceDetailsViewModel.kt", l = {}, m = "invokeSuspend")
public final class g4o extends p0s implements qsb<go6<? super fzv>, Object>
{
    public final RoomScheduledSpaceDetailsViewModel D0;
    public final String E0;
    
    public g4o(final RoomScheduledSpaceDetailsViewModel d0, final String e0, final go6<? super g4o> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(1, (go6)go6);
    }
    
    public final go6<fzv> create(final go6<?> go6) {
        return (go6<fzv>)new g4o(this.D0, this.E0, (go6<? super g4o>)go6);
    }
    
    public final Object invoke(final Object o) {
        final g4o g4o = (g4o)this.create((go6<?>)o);
        final fzv a = fzv.a;
        g4o.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final RoomScheduledSpaceDetailsViewModel d0 = this.D0;
        final qsb<h4o, fzv> qsb = (qsb<h4o, fzv>)new qsb<h4o, fzv>(d0) {
            public final RoomScheduledSpaceDetailsViewModel D0;
            
            public final Object invoke(final Object o) {
                final h4o h4o = (h4o)o;
                czd.f((Object)h4o, "state");
                chw.E0((Object)h4o, (Class)h4o.b.class);
                final h4o.b b = (h4o.b)h4o;
                final RoomScheduledSpaceDetailsViewModel d0 = this.D0;
                final f4o f4o = new f4o(b);
                final coe[] g1 = RoomScheduledSpaceDetailsViewModel.g1;
                ((MviViewModel)d0).Q((qsb)f4o);
                return fzv.a;
            }
        };
        final coe[] g1 = RoomScheduledSpaceDetailsViewModel.g1;
        ((MviViewModel)d0).T((qsb)qsb);
        this.D0.Q0.g(this.E0, false);
        ((MviViewModel)this.D0).V((Object)e3o$h.a);
        return fzv.a;
    }
}
