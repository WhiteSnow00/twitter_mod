// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.business.linkconfiguration;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.List;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import java.util.Objects;

@sa8(c = "com.twitter.business.linkconfiguration.LinkModuleConfigurationViewModel$intents$2$2", f = "LinkModuleConfigurationViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<eef$b, go6<? super fzv>, Object>
{
    public final LinkModuleConfigurationViewModel D0;
    
    public f(final LinkModuleConfigurationViewModel d0, final go6<? super f> go6) {
        this.D0 = d0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new f(this.D0, (go6<? super f>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(Object o) {
        b1n.u(o);
        final def q0 = this.D0.Q0;
        Objects.requireNonNull(q0);
        final af4 af4 = new af4(def.c);
        ((u0p)af4).r = q0.a;
        final int a = c5j.a;
        cbw.b((elm)af4);
        final LinkModuleConfigurationViewModel d0 = this.D0;
        Objects.requireNonNull(d0);
        final d93[] values = d93.values();
        final ArrayList list = new ArrayList();
        for (final d93 d2 : values) {
            final String a2 = d0.P0.a(d2);
            if (a2 != null) {
                Objects.requireNonNull(d0.V0);
                f93 f93 = null;
                switch (((Enum)d2).ordinal()) {
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                    case 8: {
                        f93 = f93.L0;
                        break;
                    }
                    case 7: {
                        f93 = f93.K0;
                        break;
                    }
                    case 6: {
                        f93 = f93.J0;
                        break;
                    }
                    case 5: {
                        f93 = f93.I0;
                        break;
                    }
                    case 4: {
                        f93 = f93.H0;
                        break;
                    }
                    case 3: {
                        f93 = f93.G0;
                        break;
                    }
                    case 2: {
                        f93 = f93.F0;
                        break;
                    }
                    case 1: {
                        f93 = f93.E0;
                        break;
                    }
                    case 0: {
                        f93 = f93.D0;
                        break;
                    }
                }
                o = new BusinessListSelectionData.LinkModuleCallToActionLabel(a2, f93);
            }
            else {
                o = null;
            }
            if (o != null) {
                list.add(o);
            }
        }
        ((MviViewModel)d0).V((Object)new cef$b((List)list));
        return fzv.a;
    }
}
