import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.notifications.settings.implementation.TweetSettingsViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.notifications.settings.implementation.TweetSettingsViewModel$fetchFriendship$2", f = "TweetSettingsViewModel.kt", l = {}, m = "invokeSuspend")
public final class ctu extends p0s implements ftb<lvj<? extends ynj<cgv>, ? extends n1c>, go6<? super fzv>, Object>
{
    public Object D0;
    public final TweetSettingsViewModel E0;
    
    public ctu(final TweetSettingsViewModel e0, final go6<? super ctu> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final ctu ctu = new ctu(this.E0, (go6<? super ctu>)go6);
        ctu.D0 = d0;
        return (go6<fzv>)ctu;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final ctu ctu = (ctu)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        ctu.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lvj lvj = (lvj)this.D0;
        if (((ynj)lvj.D0).f()) {
            final TweetSettingsViewModel e0 = this.E0;
            final Object c = ((ynj)lvj.D0).c();
            czd.e(c, "it.first.get()");
            final msu$a msu$a = new msu$a((cgv)c, ((n1c)lvj.E0).k1);
            final int s0 = TweetSettingsViewModel.S0;
            ((MviViewModel)e0).V((Object)msu$a);
        }
        return fzv.a;
    }
}
