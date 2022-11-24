// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$1", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends l1s implements hub<bff$k, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public e(final LinkModuleConfigurationViewModel f0, final mp6<? super e> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new e(this.F0, (mp6<? super e>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final aff s0 = this.F0.S0;
        Objects.requireNonNull(s0);
        final fg4 fg4 = new fg4(aff.b);
        ((o1p)fg4).r = s0.a;
        final int a = o5j.a;
        sbw.b((tlm)fg4);
        final LinkModuleConfigurationViewModel f0 = this.F0;
        String url;
        if ((url = f0.e1.getUrl()) == null) {
            url = "";
        }
        ((MviViewModel)f0).V((Object)new zef$d(url, this.F0.e1.getCta()));
        return vzv.a;
    }
}
