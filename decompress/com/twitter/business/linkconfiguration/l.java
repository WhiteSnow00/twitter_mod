// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$8", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class l extends l1s implements hub<bff$m, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public l(final LinkModuleConfigurationViewModel f0, final mp6<? super l> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new l(this.F0, (mp6<? super l>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final l l = (l)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        l.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        this.F0.V0.b();
        final LinkModuleConfigurationViewModel f0 = this.F0;
        Objects.requireNonNull(f0);
        if (c5l.Companion.b() && !f0.W0.getHasFeaturedSpotlight()) {
            ((MviViewModel)f0).V((Object)zef$c.a);
        }
        else {
            f0.X(false);
        }
        return vzv.a;
    }
}
