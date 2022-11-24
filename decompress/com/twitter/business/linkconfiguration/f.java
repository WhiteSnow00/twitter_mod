// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.List;
import com.twitter.business.model.listselection.BusinessListSelectionData$LinkModuleCallToActionLabel;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import java.util.Objects;

@vb8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$2", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends l1s implements hub<bff$b, mp6<? super vzv>, Object>
{
    public final LinkModuleConfigurationViewModel F0;
    
    public f(final LinkModuleConfigurationViewModel f0, final mp6<? super f> mp6) {
        this.F0 = f0;
        super(2, (mp6)mp6);
    }
    
    public final mp6<vzv> create(final Object o, final mp6<?> mp6) {
        return (mp6<vzv>)new f(this.F0, (mp6<? super f>)mp6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (mp6<?>)o2);
        final vzv a = vzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(Object o) {
        jb2.M0(o);
        final aff s0 = this.F0.S0;
        Objects.requireNonNull(s0);
        final fg4 fg4 = new fg4(aff.c);
        ((o1p)fg4).r = s0.a;
        final int a = o5j.a;
        sbw.b((tlm)fg4);
        final LinkModuleConfigurationViewModel f0 = this.F0;
        Objects.requireNonNull(f0);
        final v93[] values = v93.values();
        final ArrayList list = new ArrayList();
        for (final v93 v93 : values) {
            final String a2 = f0.R0.a(v93);
            if (a2 != null) {
                Objects.requireNonNull(f0.X0);
                x93 x93 = null;
                switch (((Enum)v93).ordinal()) {
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                    case 8: {
                        x93 = x93.N0;
                        break;
                    }
                    case 7: {
                        x93 = x93.M0;
                        break;
                    }
                    case 6: {
                        x93 = x93.L0;
                        break;
                    }
                    case 5: {
                        x93 = x93.K0;
                        break;
                    }
                    case 4: {
                        x93 = x93.J0;
                        break;
                    }
                    case 3: {
                        x93 = x93.I0;
                        break;
                    }
                    case 2: {
                        x93 = x93.H0;
                        break;
                    }
                    case 1: {
                        x93 = x93.G0;
                        break;
                    }
                    case 0: {
                        x93 = x93.F0;
                        break;
                    }
                }
                o = new BusinessListSelectionData$LinkModuleCallToActionLabel(a2, x93);
            }
            else {
                o = null;
            }
            if (o != null) {
                list.add(o);
            }
        }
        ((MviViewModel)f0).V((Object)new zef$b((List)list));
        return vzv.a;
    }
}
