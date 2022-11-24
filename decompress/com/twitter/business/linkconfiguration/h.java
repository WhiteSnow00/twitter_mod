// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$4", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class h extends l1s implements hub<bff$l, mp6<? super vzv>, Object>
{
    public Object F0;
    public final LinkModuleConfigurationViewModel G0;
    
    public h(final LinkModuleConfigurationViewModel g0, final mp6<? super h> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final h h = new h(this.G0, (mp6<? super h>)mp6);
        h.F0 = f0;
        return (mp6<vzv>)h;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final h h = (h)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        h.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final bff$l bff$l = (bff$l)this.F0;
        final LinkModuleConfigurationViewModel g0 = this.G0;
        g0.e1 = LinkModuleDomainConfig.copy$default(g0.e1, (String)null, (v93)null, bff$l.a.b, 3, (Object)null);
        final LinkModuleConfigurationViewModel g2 = this.G0;
        ((MviViewModel)g2).Q((stb)new stb<LinkModuleConfigurationViewModel$b, LinkModuleConfigurationViewModel$b>(g2) {
            public final LinkModuleConfigurationViewModel F0;
            
            public final Object invoke(final Object o) {
                final LinkModuleConfigurationViewModel$b linkModuleConfigurationViewModel$b = (LinkModuleConfigurationViewModel$b)o;
                e0e.f((Object)linkModuleConfigurationViewModel$b, "$this$setState");
                final LinkModuleConfigurationViewModel f0 = this.F0;
                return LinkModuleConfigurationViewModel$b.l(linkModuleConfigurationViewModel$b, false, (String)null, f0.Q0.b(f0.e1.getUrl()), false, false, false, 59);
            }
        });
        return vzv.a;
    }
}
