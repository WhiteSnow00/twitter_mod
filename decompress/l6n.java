import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$maybeSubscribeEntityReplyCount$2$1$1", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class l6n extends p0s implements ftb<vpu, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    
    public l6n(final RoomAudioSpaceViewModel e0, final go6<? super l6n> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final l6n l6n = new l6n(this.E0, (go6<? super l6n>)go6);
        l6n.D0 = d0;
        return (go6<fzv>)l6n;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final l6n l6n = (l6n)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        l6n.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final xrc t = ((orc)this.D0).T();
        final RoomAudioSpaceViewModel e0 = this.E0;
        if (t.b && neg.c((upu.a)t.g)) {
            final nh0$a n = i48.n((upu.a)t.g);
            if (n != null) {
                final vf3.b j0 = n.J0;
                if (j0 != null) {
                    final l6n$a l6n$a = new l6n$a(((vf3)j0.e()).I0);
                    final coe[] n2 = RoomAudioSpaceViewModel.n1;
                    ((MviViewModel)e0).Q((qsb)l6n$a);
                }
            }
        }
        return fzv.a;
    }
}
