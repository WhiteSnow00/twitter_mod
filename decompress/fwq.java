import java.util.List;
import com.twitter.rooms.ui.tab.tabItem.card.SpacesTabCardViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.tab.tabItem.card.SpacesTabCardViewModel$subscribeAudioSpace$1", f = "SpacesTabCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class fwq extends p0s implements qsb<go6<? super fzv>, Object>
{
    public final SpacesTabCardViewModel D0;
    public final String E0;
    public final String F0;
    public final List<qfc> G0;
    
    public fwq(final SpacesTabCardViewModel d0, final String e0, final String f0, final List<? extends qfc> g0, final go6<? super fwq> go6) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = (List<qfc>)g0;
        super(1, (go6)go6);
    }
    
    public final go6<fzv> create(final go6<?> go6) {
        return (go6<fzv>)new fwq(this.D0, this.E0, this.F0, this.G0, (go6<? super fwq>)go6);
    }
    
    public final Object invoke(final Object o) {
        final fwq fwq = (fwq)this.create((go6<?>)o);
        final fzv a = fzv.a;
        fwq.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final SpacesTabCardViewModel d0 = this.D0;
        final awq.c c = new awq.c(djo.f(this.E0), this.F0, this.G0);
        final SpacesTabCardViewModel.g companion = SpacesTabCardViewModel.Companion;
        d0.V((Object)c);
        return fzv.a;
    }
}
