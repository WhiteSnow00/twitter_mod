import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$maybePostEntityTweet$4", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class j6n extends p0s implements ftb<vqn, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    
    public j6n(final RoomAudioSpaceViewModel e0, final go6<? super j6n> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final j6n j6n = new j6n(this.E0, (go6<? super j6n>)go6);
        j6n.D0 = d0;
        return (go6<fzv>)j6n;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final j6n j6n = (j6n)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        j6n.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final vqn vqn = (vqn)this.D0;
        if (vqn.u == wqn.E0) {
            final String b = vqn.b;
            final boolean b2 = false;
            if (b != null && b.length() != 0) {
                final r21 f = vqn.f;
                int n = b2 ? 1 : 0;
                if (f != null) {
                    n = (b2 ? 1 : 0);
                    if (f.E == null) {
                        n = 1;
                    }
                }
                if (n != 0) {
                    final String b3 = vqn.b;
                    if (b3 != null) {
                        final RoomAudioSpaceViewModel e0 = this.E0;
                        final a8o e2 = e0.e1;
                        final tg5 g = vqn.g;
                        Objects.requireNonNull(e2);
                        MviViewModel.N((MviViewModel)e0, e2.b.b(b3).p((psb)new oyf((qsb)new b8o(e2, b3, g), 17)).p((psb)new lql((qsb)new f8o(e2, b3), 26)).p((psb)new hvl((qsb)new g8o(e2, b3), 25)).p((psb)new dti((qsb)new i8o(e2, b3), 25)), (String)null, (jrx)null, (ftb)new ftb<Long, go6<? super fzv>, Object>(null) {
                            public final go6<fzv> create(final Object o, final go6<?> go6) {
                                return (go6<fzv>)new ftb<Long, go6<? super fzv>, Object>(go6) {};
                            }
                            
                            public final Object invoke(final Object o, final Object o2) {
                                ((Number)o).longValue();
                                final ftb<Long, go6<? super fzv>, Object> ftb = (ftb<Long, go6<? super fzv>, Object>)new ftb<Long, go6<? super fzv>, Object>((go6)o2) {
                                    public final go6<fzv> create(final Object o, final go6<?> go6) {
                                        return (go6<fzv>)new ftb<Long, go6<? super fzv>, Object>(go6) {};
                                    }
                                };
                                final fzv a = fzv.a;
                                ftb.invokeSuspend(a);
                                return a;
                            }
                            
                            public final Object invokeSuspend(final Object o) {
                                b1n.u(o);
                                return fzv.a;
                            }
                        }, 3, (Object)null);
                    }
                }
            }
        }
        return fzv.a;
    }
}
