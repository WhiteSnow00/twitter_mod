// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.accounttaxonomy.implementation;

import kotlin.NoWhenBranchMatchedException;
import java.util.List;
import com.twitter.accounttaxonomy.api.AccountLabelLandingPageContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/accounttaxonomy/implementation/AccountLabelLandingPageViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lhi;", "Lzh;", "Lxh;", "subsystem.tfa.account-taxonomy.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccountLabelLandingPageViewModel extends MviViewModel<hi, zh, xh>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)AccountLabelLandingPageViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public AccountLabelLandingPageViewModel(final AccountLabelLandingPageContentViewArgs accountLabelLandingPageContentViewArgs, final wh wh, final xbm xbm) {
        czd.f((Object)accountLabelLandingPageContentViewArgs, "args");
        czd.f((Object)wh, "pageContentFactory");
        czd.f((Object)xbm, "releaseCompletable");
        tqf.A(accountLabelLandingPageContentViewArgs.getLabelType());
        tqf.A(accountLabelLandingPageContentViewArgs.getLabelType());
        da8.m(1, "optInAccountType");
        if (wh$b.a[ib0.E(1)] == 1) {
            super((k9e)xbm, (jbx)new hi(1, (List)wh.b.getValue()));
            this.T((qsb)new AccountLabelLandingPageViewModel$a(this));
            this.O0 = ewj.n(this, (qsb)new AccountLabelLandingPageViewModel$b(this));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
    
    public final jyh<zh> v() {
        return (jyh<zh>)this.O0.a((coe)AccountLabelLandingPageViewModel.P0[0]);
    }
}
