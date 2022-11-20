import com.twitter.rooms.ui.tab.tabItem.card.SpacesTabCardViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.tab.tabItem.card.SpacesTabCardViewModel$unsubscribeAudioSpace$1", f = "SpacesTabCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class gwq extends p0s implements qsb<go6<? super fzv>, Object>
{
    public final SpacesTabCardViewModel D0;
    
    public gwq(final SpacesTabCardViewModel d0, final go6<? super gwq> go6) {
        this.D0 = d0;
        super(1, (go6)go6);
    }
    
    public final go6<fzv> create(final go6<?> go6) {
        return (go6<fzv>)new gwq(this.D0, (go6<? super gwq>)go6);
    }
    
    public final Object invoke(final Object o) {
        final gwq gwq = (gwq)this.create((go6<?>)o);
        final fzv a = fzv.a;
        gwq.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SpacesTabCardViewModel d0 = this.D0;
        final awq.b a = awq.b.a;
        final SpacesTabCardViewModel.g companion = SpacesTabCardViewModel.Companion;
        d0.V((Object)a);
        return fzv.a;
    }
}
