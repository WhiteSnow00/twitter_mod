import com.twitter.rooms.ui.utils.schedule.edit.RoomScheduledSpaceEditViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.utils.schedule.edit.RoomScheduledSpaceEditViewModel$editSpace$2$2", f = "RoomScheduledSpaceEditViewModel.kt", l = {}, m = "invokeSuspend")
public final class e5o extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public final RoomScheduledSpaceEditViewModel D0;
    
    public e5o(final RoomScheduledSpaceEditViewModel d0, final go6<? super e5o> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new e5o(this.D0, (go6<? super e5o>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e5o e5o = (e5o)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e5o.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.D0.V((Object)m4o$e.a);
        return fzv.a;
    }
}
