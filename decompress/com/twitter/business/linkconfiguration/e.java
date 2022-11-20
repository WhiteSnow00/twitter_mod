// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;

@sa8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$1", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class e extends p0s implements ftb<eef$k, go6<? super fzv>, Object>
{
    public final LinkModuleConfigurationViewModel D0;
    
    public e(final LinkModuleConfigurationViewModel d0, final go6<? super e> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new e(this.D0, (go6<? super e>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final e e = (e)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        e.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final def q0 = this.D0.Q0;
        Objects.requireNonNull(q0);
        final af4 af4 = new af4(def.b);
        ((u0p)af4).r = q0.a;
        final int a = c5j.a;
        cbw.b((elm)af4);
        final LinkModuleConfigurationViewModel d0 = this.D0;
        String url;
        if ((url = d0.c1.getUrl()) == null) {
            url = "";
        }
        ((MviViewModel)d0).V((Object)new cef$d(url, this.D0.c1.getCta()));
        return fzv.a;
    }
}
