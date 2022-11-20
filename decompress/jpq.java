import com.twitter.weaver.mvi.MviViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.twitter.rooms.cards.view.SpacesCardViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.cards.view.SpacesCardViewModel$subscribeAudioSpace$1$1", f = "SpacesCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class jpq extends p0s implements ftb<fzv, go6<? super fzv>, Object>
{
    public final SpacesCardViewModel D0;
    
    public jpq(final SpacesCardViewModel d0, final go6<? super jpq> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new jpq(this.D0, (go6<? super jpq>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((jpq)this.create(o, (go6<?>)o2)).invokeSuspend(fzv.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final jbx s = ((MviViewModel)this.D0).S();
        wpq$i wpq$i;
        if (s instanceof wpq$i) {
            wpq$i = (wpq$i)s;
        }
        else {
            wpq$i = null;
        }
        if (wpq$i == null) {
            return fzv.a;
        }
        final SpacesCardViewModel d0 = this.D0;
        d0.T0.g("set_reminder", "audiospace_card");
        d0.W0.c((elm)new af4(vba.Companion.e("audiospace", "", "", "set_reminder", "click")));
        final SpacesCardViewModel d2 = this.D0;
        final String f = djo.f(d2.Q0);
        final String f2 = wpq$i.a.f();
        final List g = wpq$i.g;
        final ArrayList list = new ArrayList(iq4.H((Iterable)g, 10));
        final Iterator iterator = g.iterator();
        while (iterator.hasNext()) {
            list.add((Object)((qfc)iterator.next()).I0);
        }
        ((MviViewModel)d2).V((Object)new emq$d(f, f2, (List)list));
        final SpacesCardViewModel d3 = this.D0;
        d3.P0.g(d3.Q0, true);
        ((MviViewModel)this.D0).Q((qsb)new qsb<wpq, wpq>(wpq$i) {
            public final wpq$i D0;
            
            public final Object invoke(final Object o) {
                czd.f((Object)o, "$this$setState");
                return wpq$i.m(this.D0, true);
            }
        });
        return fzv.a;
    }
}
