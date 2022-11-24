// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.choiceselection;

import com.twitter.weaver.mvi.MviViewModel;

@vb8(c = "com.twitter.android.onboarding.core.choiceselection.PrimaryChoiceSelectionViewModel$intents$2$1", f = "PrimaryChoiceSelectionViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends l1s implements hub<fzk.a, mp6<? super vzv>, Object>
{
    public final PrimaryChoiceSelectionViewModel F0;
    
    public a(final PrimaryChoiceSelectionViewModel f0, final mp6<? super a> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new a(this.F0, (mp6<? super a>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (mp6<?>)o2);
        final vzv a2 = vzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final PrimaryChoiceSelectionViewModel f0 = this.F0;
        final stb<mzk, vzv> stb = (stb<mzk, vzv>)new stb<mzk, vzv>(f0) {
            public final PrimaryChoiceSelectionViewModel F0;
            
            public final Object invoke(final Object o) {
                final mzk mzk = (mzk)o;
                e0e.f((Object)mzk, "state");
                final aa4 b = mzk.b;
                if (b != null) {
                    final PrimaryChoiceSelectionViewModel f0 = this.F0;
                    ((MviViewModel)f0).V((Object)new ezk$a(f0.Q0.indexOf(b)));
                }
                return vzv.a;
            }
        };
        final ape[] s0 = PrimaryChoiceSelectionViewModel.S0;
        ((MviViewModel)f0).T((stb)stb);
        return vzv.a;
    }
}
