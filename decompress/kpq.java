// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.cards.view.SpacesCardViewModel$subscribeAudioSpace$1$2", f = "SpacesCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class kpq extends p0s implements ftb<Throwable, go6<? super fzv>, Object>
{
    public kpq(final go6<? super kpq> go6) {
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new kpq((go6<? super kpq>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final Throwable t = (Throwable)o;
        final kpq kpq = new kpq((go6<? super kpq>)o2);
        final fzv a = fzv.a;
        kpq.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        return fzv.a;
    }
}
