// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab;

import com.twitter.weaver.mvi.MviViewModel;

@sa8(c = "com.twitter.rooms.ui.stationstab.SpacesStationsTabViewModel$intents$2$1", f = "SpacesStationsTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<quq$b, go6<? super fzv>, Object>
{
    public final SpacesStationsTabViewModel D0;
    
    public a(final SpacesStationsTabViewModel d0, final go6<? super a> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new a(this.D0, (go6<? super a>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        this.D0.P0.V();
        final SpacesStationsTabViewModel d0 = this.D0;
        ((MviViewModel)d0).C((eaq)d0.O0.b(), (qsb)new qvq(d0, false));
        return fzv.a;
    }
}
