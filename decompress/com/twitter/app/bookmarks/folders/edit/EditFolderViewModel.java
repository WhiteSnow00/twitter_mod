// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.edit;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/edit/EditFolderViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lxgb;", "Lvgb;", "Lwgb;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class EditFolderViewModel extends MviViewModel<xgb, vgb, wgb>
{
    public static final /* synthetic */ soe<Object>[] P0;
    public final n52 N0;
    public final gyh O0;
    
    static {
        P0 = new soe[] { (soe)hi.m(EditFolderViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public EditFolderViewModel(final n52 n0, final l52 l52, final w8x w8x, final ibm ibm) {
        zzd.f((Object)n0, "bookmarkFolderRepo");
        zzd.f((Object)l52, "navigationDelegate");
        zzd.f((Object)w8x, "viewModelStore");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new xgb((String)null, (String)null, (String)null, false, 15, (hg8)null));
        this.N0 = n0;
        final kl8 i = fk7.l(this.w(), (gub)new EditFolderViewModel$d(w8x, (ap6)null));
        final b5j ofType = ((b5j)l52.a).ofType((Class)l62$d.d.class);
        zzd.b((Object)ofType, "ofType(R::class.java)");
        MviViewModel.M((MviViewModel)this, ofType, (String)null, (qqx)null, (gub)new EditFolderViewModel$a(this, i, (ap6)null), 3, (Object)null);
        fk7.v0(this.w(), null, 0, (gub)new EditFolderViewModel$b(this, i, (ap6)null), 3);
        this.O0 = oyz.f0(this, (rtb)new rtb<iyh<vgb>, oyv>() {
            public final /* synthetic */ EditFolderViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)vgb$b.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)vgb$a.class), (gub)new f(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<vgb> v() {
        return (iyh<vgb>)this.O0.a((soe)EditFolderViewModel.P0[0]);
    }
}
