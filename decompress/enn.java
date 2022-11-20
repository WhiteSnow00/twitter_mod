import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.ui.core.history.RoomHistoryManagementViewModel$b;
import com.twitter.rooms.ui.core.history.RoomHistoryManagementViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.core.history.RoomHistoryManagementViewModel$updateAudioSpaceItem$1$1", f = "RoomHistoryManagementViewModel.kt", l = {}, m = "invokeSuspend")
public final class enn extends p0s implements ftb<p01, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomHistoryManagementViewModel E0;
    
    public enn(final RoomHistoryManagementViewModel e0, final go6<? super enn> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final enn enn = new enn(this.E0, (go6<? super enn>)go6);
        enn.D0 = d0;
        return (go6<fzv>)enn;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final enn enn = (enn)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        enn.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final p01 p = (p01)this.D0;
        final RoomHistoryManagementViewModel e0 = this.E0;
        final enn$a enn$a = new enn$a(p, e0);
        final RoomHistoryManagementViewModel$b companion = RoomHistoryManagementViewModel.Companion;
        ((MviViewModel)e0).T((qsb)enn$a);
        return fzv.a;
    }
}
