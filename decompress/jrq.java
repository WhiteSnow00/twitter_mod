import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.cards.view.clips.SpacesClipCardViewModel$g;
import com.twitter.rooms.cards.view.clips.SpacesClipCardViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.cards.view.clips.SpacesClipCardViewModel$pollCardData$2$2", f = "SpacesClipCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class jrq extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public final SpacesClipCardViewModel D0;
    
    public jrq(final SpacesClipCardViewModel d0, final go6<? super jrq> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new jrq(this.D0, (go6<? super jrq>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final jrq jrq = (jrq)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        jrq.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SpacesClipCardViewModel d0 = this.D0;
        final SpacesClipCardViewModel$g companion = SpacesClipCardViewModel.Companion;
        ((MviViewModel)d0).Q((qsb)prq.D0);
        return fzv.a;
    }
}
