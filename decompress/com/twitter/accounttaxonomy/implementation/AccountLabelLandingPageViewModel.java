// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.accounttaxonomy.implementation;

import kotlin.NoWhenBranchMatchedException;
import java.util.List;
import com.twitter.accounttaxonomy.api.AccountLabelLandingPageContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/accounttaxonomy/implementation/AccountLabelLandingPageViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lii;", "Lzh;", "Lxh;", "subsystem.tfa.account-taxonomy.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class AccountLabelLandingPageViewModel extends MviViewModel<ii, zh, xh>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(AccountLabelLandingPageViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public AccountLabelLandingPageViewModel(final AccountLabelLandingPageContentViewArgs accountLabelLandingPageContentViewArgs, final wh wh, final ibm ibm) {
        zzd.f((Object)accountLabelLandingPageContentViewArgs, "args");
        zzd.f((Object)wh, "pageContentFactory");
        zzd.f((Object)ibm, "releaseCompletable");
        ffa.w(accountLabelLandingPageContentViewArgs.getLabelType());
        ffa.w(accountLabelLandingPageContentViewArgs.getLabelType());
        k1b.i(1, "optInAccountType");
        if (wh$b.a[nb0.D(1)] == 1) {
            super((fae)ibm, (oax)new ii(1, (List)wh.b.getValue()));
            this.T((rtb)new AccountLabelLandingPageViewModel$a(this));
            this.N0 = oyz.f0(this, (rtb)new AccountLabelLandingPageViewModel$b(this));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
    
    public final iyh<zh> v() {
        return (iyh<zh>)this.N0.a((soe)AccountLabelLandingPageViewModel.O0[0]);
    }
}
