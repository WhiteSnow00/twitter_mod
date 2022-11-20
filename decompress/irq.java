import com.twitter.util.user.UserIdentifier;
import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.cards.view.clips.SpacesClipCardViewModel$g;
import java.util.Objects;
import com.twitter.rooms.cards.view.clips.SpacesClipCardViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.cards.view.clips.SpacesClipCardViewModel$pollCardData$2$1", f = "SpacesClipCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class irq extends p0s implements ftb<lvj<? extends r21, ? extends t21>, go6<? super fzv>, Object>
{
    public Object D0;
    public final SpacesClipCardViewModel E0;
    
    public irq(final SpacesClipCardViewModel e0, final go6<? super irq> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final irq irq = new irq(this.E0, (go6<? super irq>)go6);
        irq.D0 = d0;
        return (go6<fzv>)irq;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final irq irq = (irq)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        irq.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lvj lvj = (lvj)this.D0;
        final SpacesClipCardViewModel e0 = this.E0;
        final r21 r21 = (r21)lvj.D0;
        final t21 t21 = (t21)lvj.E0;
        final SpacesClipCardViewModel$g companion = SpacesClipCardViewModel.Companion;
        Objects.requireNonNull(e0);
        ((MviViewModel)e0).T((qsb)new frq(e0, r21, t21));
        final r21 r22 = (r21)lvj.D0;
        czd.f((Object)r22, "audioSpace");
        final ds5 y = r22.Y;
        Object b;
        if (y != null) {
            b = y.b;
        }
        else {
            b = null;
        }
        tg5 b2;
        if (b instanceof bs5$a) {
            b2 = ((bs5$a)b).b;
        }
        else {
            b2 = null;
        }
        if (b2 == null) {
            final s21 o2 = ((r21)lvj.D0).O;
            if (o2 != null) {
                final cgv e2 = o2.e();
                if (e2 != null) {
                    final UserIdentifier f = e2.f();
                    if (f != null) {
                        final SpacesClipCardViewModel e3 = this.E0;
                        final h5j compose = e3.W0.b(f).compose((pbj)vnj.D0);
                        czd.e((Object)compose, "userRepository.getUser(i\u2026tional.unwrapIfPresent())");
                        MviViewModel.M((MviViewModel)e3, compose, (String)null, (jrx)null, (ftb)new ftb<cgv, go6<? super fzv>, Object>(e3, null) {
                            public Object D0;
                            public final SpacesClipCardViewModel E0;
                            
                            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                                final ftb<cgv, go6<? super fzv>, Object> ftb = (ftb<cgv, go6<? super fzv>, Object>)new ftb<cgv, go6<? super fzv>, Object>(this.E0, go6) {
                                    public Object D0;
                                    public final SpacesClipCardViewModel E0;
                                };
                                ftb.D0 = d0;
                                return (go6<fzv>)ftb;
                            }
                            
                            public final Object invoke(final Object o, final Object o2) {
                                final ftb<cgv, go6<? super fzv>, Object> ftb = (ftb<cgv, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                                final fzv a = fzv.a;
                                ftb.invokeSuspend(a);
                                return a;
                            }
                            
                            public final Object invokeSuspend(final Object o) {
                                b1n.u(o);
                                final cgv cgv = (cgv)this.D0;
                                final SpacesClipCardViewModel e0 = this.E0;
                                final irq$a$a irq$a$a = new irq$a$a(cgv);
                                final SpacesClipCardViewModel$g companion = SpacesClipCardViewModel.Companion;
                                ((MviViewModel)e0).Q((qsb)irq$a$a);
                                return fzv.a;
                            }
                        }, 3, (Object)null);
                    }
                }
            }
        }
        else {
            ((MviViewModel)this.E0).Q((qsb)new irq$b(pv5.Companion.a(b2).F0));
        }
        return fzv.a;
    }
}
