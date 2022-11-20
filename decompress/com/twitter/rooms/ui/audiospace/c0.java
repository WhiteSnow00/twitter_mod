// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import java.util.Objects;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$4", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class c0 extends p0s implements ftb<d1n$f, go6<? super fzv>, Object>
{
    public Object D0;
    public final k7o E0;
    
    public c0(final k7o e0, final go6<? super c0> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final c0 c0 = new c0(this.E0, (go6<? super c0>)go6);
        c0.D0 = d0;
        return (go6<fzv>)c0;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c0 c0 = (c0)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        c0.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final d1n$f d1n$f = (d1n$f)this.D0;
        final k7o e0 = this.E0;
        final vwp a = d1n$f.a;
        Objects.requireNonNull(e0);
        czd.f((Object)a, "content");
        rpb.T(e0.d, cnr.d((sy5)new zog((ppg)new yog((lcq)e0.b(), (ytk)new bu4((qsb)new c7o(e0, a), 15)), (psb)new ap((qsb)new d7o(e0, a), 17)), (qsb)e7o.D0, (nsb)cnr.c));
        return fzv.a;
    }
}
