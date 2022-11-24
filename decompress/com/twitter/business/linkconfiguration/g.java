// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.business.model.listselection.BusinessListSelectionData$LinkModuleCallToActionLabel;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$3", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends l1s implements hub<bff$c, mp6<? super vzv>, Object>
{
    public Object F0;
    public final LinkModuleConfigurationViewModel G0;
    
    public g(final LinkModuleConfigurationViewModel g0, final mp6<? super g> mp6) {
        this.G0 = g0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
        final g g = new g(this.G0, (mp6<? super g>)mp6);
        g.F0 = f0;
        return (mp6<vzv>)g;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        jb2.M0(o);
        final bff$c bff$c = (bff$c)this.F0;
        final LinkModuleConfigurationViewModel g0 = this.G0;
        final BusinessListSelectionData a = bff$c.a;
        if (a instanceof BusinessListSelectionData$LinkModuleCallToActionLabel) {
            final LinkModuleDomainConfig e1 = g0.e1;
            final y93 y0 = g0.Y0;
            final x93 callToAction = ((BusinessListSelectionData$LinkModuleCallToActionLabel)a).getCallToAction();
            Objects.requireNonNull(y0);
            e0e.f((Object)callToAction, "input");
            v93 v93 = null;
            switch (((Enum)callToAction).ordinal()) {
                default: {
                    throw new NoWhenBranchMatchedException();
                }
                case 8: {
                    v93 = v93.P0;
                    break;
                }
                case 7: {
                    v93 = v93.O0;
                    break;
                }
                case 6: {
                    v93 = v93.N0;
                    break;
                }
                case 5: {
                    v93 = v93.M0;
                    break;
                }
                case 4: {
                    v93 = v93.L0;
                    break;
                }
                case 3: {
                    v93 = v93.K0;
                    break;
                }
                case 2: {
                    v93 = v93.J0;
                    break;
                }
                case 1: {
                    v93 = v93.I0;
                    break;
                }
                case 0: {
                    v93 = v93.H0;
                    break;
                }
            }
            g0.e1 = LinkModuleDomainConfig.copy$default(e1, (String)null, v93, (String)null, 5, (Object)null);
            final LinkModuleConfigurationViewModel g2 = this.G0;
            ((MviViewModel)g2).Q((stb)new stb<LinkModuleConfigurationViewModel$b, LinkModuleConfigurationViewModel$b>(g2) {
                public final LinkModuleConfigurationViewModel F0;
                
                public final Object invoke(final Object o) {
                    final LinkModuleConfigurationViewModel$b linkModuleConfigurationViewModel$b = (LinkModuleConfigurationViewModel$b)o;
                    e0e.f((Object)linkModuleConfigurationViewModel$b, "$this$setState");
                    final LinkModuleConfigurationViewModel f0 = this.F0;
                    return LinkModuleConfigurationViewModel$b.l(linkModuleConfigurationViewModel$b, false, f0.Q0.a(f0.e1.getCta()), (String)null, false, false, false, 61);
                }
            });
            return vzv.a;
        }
        final BusinessListSelectionData a2 = bff$c.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Argument of type ");
        sb.append(a2);
        sb.append(" cannot be handled.");
        throw new IllegalArgumentException(sb.toString());
    }
}
