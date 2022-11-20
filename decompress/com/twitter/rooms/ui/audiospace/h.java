// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$12", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends p0s implements ftb<d1n$r, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    
    public h(final RoomAudioSpaceViewModel e0, final go6<? super h> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final h h = new h(this.E0, (go6<? super h>)go6);
        h.D0 = d0;
        return (go6<fzv>)h;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final d1n$r d1n$r = (d1n$r)this.D0;
        final qqp a = d1n$r.a;
        final f1a f0 = f1a.F0;
        final int n = 1;
        int a2;
        if (czd.a((Object)a, (Object)new qqp.j(f0, true)) || czd.a((Object)a, (Object)new qqp.j(f1a.G0, true)) || czd.a((Object)a, (Object)new qqp.j(f1a.D0, true)) || czd.a((Object)a, (Object)new qqp.j(f1a.H0, true)) || czd.a((Object)a, (Object)new qqp.j(f1a.N0, true)) || czd.a((Object)a, (Object)new qqp.j(f1a.O0, true)) || czd.a((Object)a, (Object)new qqp.j(f1a.K0, true))) {
            a2 = n;
        }
        else {
            a2 = (czd.a((Object)a, (Object)new qqp.j(f1a.I0, true)) ? 1 : 0);
        }
        if (a2 != 0) {
            final RoomAudioSpaceViewModel e0 = this.E0;
            final h$a h$a = new h$a(d1n$r);
            final coe[] n2 = RoomAudioSpaceViewModel.n1;
            ((MviViewModel)e0).Q((qsb)h$a);
        }
        return fzv.a;
    }
}
