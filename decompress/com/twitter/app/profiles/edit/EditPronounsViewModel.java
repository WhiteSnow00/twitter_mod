// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.profiles.edit;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/profiles/edit/EditPronounsViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lcu9;", "", "Lst9;", "feature.tfa.profiles.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditPronounsViewModel extends MviViewModel<cu9, Object, st9>
{
    public static final ape<Object>[] R0;
    public final yyh Q0;
    
    static {
        R0 = new ape[] { (ape)lb0.h(EditPronounsViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public EditPronounsViewModel(final duo duo, final kcm kcm, final rt9 rt9, final kax kax) {
        e0e.f((Object)duo, "savedStateHandler");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)rt9, "editPronounsDataSource");
        e0e.f((Object)kax, "viewModelStore");
        super((iae)kcm, (ccx)new cu9((String)null, false, 3, (wg8)null));
        final usa e = usa.e("pronouns_speed_bump_bottom_sheet_fatigue");
        if (e.c()) {
            e.b();
            final t5j take = t5j.interval(2L, TimeUnit.SECONDS).take(1L);
            e0e.e((Object)take, "interval(2, TimeUnit.SECONDS).take(1)");
            MviViewModel.M((MviViewModel)this, take, (String)null, (asx)null, (hub)new EditPronounsViewModel$a(this, (mp6)null), 3, (Object)null);
        }
        ma7.D(this.w(), (yy6)null, 0, (hub)new EditPronounsViewModel$b(this, kax, (mp6)null), 3);
        ((stb)new EditPronounsViewModel$e((MviViewModel)this, duo)).invoke((Object)new EditPronounsViewModel$c(this));
        this.Q0 = hfe.v((MviViewModel)this, (stb)new EditPronounsViewModel$d(this, rt9));
    }
    
    public final azh<Object> v() {
        return (azh<Object>)this.Q0.a((ape)EditPronounsViewModel.R0[0]);
    }
}
