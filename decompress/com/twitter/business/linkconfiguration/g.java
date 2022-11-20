// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.business.features.linkmodule.model.LinkModuleDomainConfig;
import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;
import com.twitter.business.model.listselection.BusinessListSelectionData;

@sa8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$3", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class g extends p0s implements ftb<eef$c, go6<? super fzv>, Object>
{
    public Object D0;
    public final LinkModuleConfigurationViewModel E0;
    
    public g(final LinkModuleConfigurationViewModel e0, final go6<? super g> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final g g = new g(this.E0, (go6<? super g>)go6);
        g.D0 = d0;
        return (go6<fzv>)g;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final g g = (g)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        g.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final eef$c eef$c = (eef$c)this.D0;
        final LinkModuleConfigurationViewModel e0 = this.E0;
        final BusinessListSelectionData a = eef$c.a;
        if (a instanceof BusinessListSelectionData.LinkModuleCallToActionLabel) {
            final LinkModuleDomainConfig c1 = e0.c1;
            final g93 w0 = e0.W0;
            final f93 callToAction = ((BusinessListSelectionData.LinkModuleCallToActionLabel)a).getCallToAction();
            Objects.requireNonNull(w0);
            czd.f((Object)callToAction, "input");
            d93 d93 = null;
            switch (((Enum)callToAction).ordinal()) {
                default: {
                    throw new NoWhenBranchMatchedException();
                }
                case 8: {
                    d93 = d93.N0;
                    break;
                }
                case 7: {
                    d93 = d93.M0;
                    break;
                }
                case 6: {
                    d93 = d93.L0;
                    break;
                }
                case 5: {
                    d93 = d93.K0;
                    break;
                }
                case 4: {
                    d93 = d93.J0;
                    break;
                }
                case 3: {
                    d93 = d93.I0;
                    break;
                }
                case 2: {
                    d93 = d93.H0;
                    break;
                }
                case 1: {
                    d93 = d93.G0;
                    break;
                }
                case 0: {
                    d93 = d93.F0;
                    break;
                }
            }
            e0.c1 = LinkModuleDomainConfig.copy$default(c1, null, d93, null, 5, null);
            final LinkModuleConfigurationViewModel e2 = this.E0;
            ((MviViewModel)e2).Q((qsb)new g$a(e2));
            return fzv.a;
        }
        final BusinessListSelectionData a2 = eef$c.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Argument of type ");
        sb.append(a2);
        sb.append(" cannot be handled.");
        throw new IllegalArgumentException(sb.toString());
    }
}
