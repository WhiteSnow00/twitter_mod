// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/profiles/edit/EditPronounsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lst9;", "", "Lit9;", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditPronounsViewModel extends MviViewModel<st9, Object, it9>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(EditPronounsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public EditPronounsViewModel(final sso sso, final ibm ibm, final ht9 ht9, final w8x w8x) {
        zzd.f((Object)sso, "savedStateHandler");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)ht9, "editPronounsDataSource");
        zzd.f((Object)w8x, "viewModelStore");
        super((fae)ibm, (oax)new st9((String)null, false, 3, (hg8)null));
        final psa e = psa.e("pronouns_speed_bump_bottom_sheet_fatigue");
        if (e.c()) {
            e.b();
            final b5j take = b5j.interval(2L, TimeUnit.SECONDS).take(1L);
            zzd.e((Object)take, "interval(2, TimeUnit.SECONDS).take(1)");
            MviViewModel.M((MviViewModel)this, take, (String)null, (qqx)null, (gub)new EditPronounsViewModel$a(this, (ap6)null), 3, (Object)null);
        }
        fk7.v0(this.w(), null, 0, (gub)new EditPronounsViewModel$b(this, w8x, (ap6)null), 3);
        ((rtb)new xaz((rtb)new EditPronounsViewModel$e((MviViewModel)this, sso)).D0).invoke((Object)new EditPronounsViewModel$c(this));
        this.N0 = oyz.f0(this, (rtb)new EditPronounsViewModel$d(this, ht9));
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.N0.a((soe)EditPronounsViewModel.O0[0]);
    }
}
