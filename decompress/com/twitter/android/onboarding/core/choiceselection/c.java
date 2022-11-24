// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.choiceselection;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.onboarding.core.choiceselection.PrimaryChoiceSelectionViewModel$intents$2$2", f = "PrimaryChoiceSelectionViewModel.kt", l = {}, m = "invokeSuspend")
public final class c extends l1s implements hub<fzk.b, mp6<? super vzv>, Object>
{
    public Object F0;
    public final PrimaryChoiceSelectionViewModel G0;
    
    public c(final PrimaryChoiceSelectionViewModel g0, final mp6<? super c> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final c c = new c(this.G0, (mp6<? super c>)mp6);
        c.F0 = f0;
        return (mp6<vzv>)c;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final c c = (c)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        c.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final fzk.b b = (fzk.b)this.F0;
        final PrimaryChoiceSelectionViewModel g0 = this.G0;
        final stb<mzk, vzv> stb = (stb<mzk, vzv>)new stb<mzk, vzv>(b, g0) {
            public final fzk.b F0;
            public final PrimaryChoiceSelectionViewModel G0;
            
            public final Object invoke(final Object o) {
                final mzk mzk = (mzk)o;
                e0e.f((Object)mzk, "state");
                if (!e0e.a((Object)mzk.b, (Object)this.F0.a)) {
                    final PrimaryChoiceSelectionViewModel g0 = this.G0;
                    final b b = new b(this.F0);
                    final ape[] s0 = PrimaryChoiceSelectionViewModel.S0;
                    ((MviViewModel)g0).Q((stb)b);
                    ((MviViewModel)this.G0).V((Object)ezk$b.a);
                }
                return vzv.a;
            }
        };
        final ape[] s0 = PrimaryChoiceSelectionViewModel.S0;
        ((MviViewModel)g0).T((stb)stb);
        return vzv.a;
    }
}
