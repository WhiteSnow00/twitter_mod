// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$11$3$1", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<ynj<bo6>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    public final t6n F0;
    
    public f(final RoomAudioSpaceViewModel e0, final t6n f0, final go6<? super f> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final f f = new f(this.E0, this.F0, (go6<? super f>)go6);
        f.D0 = d0;
        return (go6<fzv>)f;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final bo6 bo6 = (bo6)ynj.d((ynj)this.D0);
        if (bo6 != null) {
            final String m = bo6.M();
            if (m != null) {
                final RoomAudioSpaceViewModel e0 = this.E0;
                final t0n$a t0n$a = new t0n$a((long)this.F0.K, m);
                final coe[] n1 = RoomAudioSpaceViewModel.n1;
                ((MviViewModel)e0).V((Object)t0n$a);
                return fzv.a;
            }
        }
        final RoomAudioSpaceViewModel e2 = this.E0;
        final t6n f0 = this.F0;
        final coe[] n2 = RoomAudioSpaceViewModel.n1;
        Objects.requireNonNull(e2);
        final String h = f0.h;
        if (h != null) {
            ((MviViewModel)e2).V((Object)new t0n$b(h));
        }
        return fzv.a;
    }
}
