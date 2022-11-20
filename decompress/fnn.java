// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.core.history.RoomHistoryManagementViewModel$updateAudioSpaceItem$1$2", f = "RoomHistoryManagementViewModel.kt", l = {}, m = "invokeSuspend")
public final class fnn extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public fnn(final go6<? super fnn> go6) {
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new fnn((go6<? super fnn>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final Throwable t = (Throwable)o;
        final fnn fnn = new fnn((go6<? super fnn>)o2);
        final fzv a = fzv.a;
        fnn.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        return fzv.a;
    }
}
