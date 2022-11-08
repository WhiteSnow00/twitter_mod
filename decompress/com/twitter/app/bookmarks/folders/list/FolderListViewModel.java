// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.list;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/list/FolderListViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lkhb;", "Lhhb;", "Lghb;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class FolderListViewModel extends MviViewModel<khb, hhb, ghb>
{
    public static final /* synthetic */ soe<Object>[] P0;
    public final n52 N0;
    public final gyh O0;
    
    static {
        P0 = new soe[] { (soe)hi.m(FolderListViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public FolderListViewModel(final l52 l52, final n52 n0, final z7x z7x, final ibm ibm) {
        zzd.f((Object)l52, "navigationDelegate");
        zzd.f((Object)n0, "bookmarkFolderRepo");
        zzd.f((Object)z7x, "lifecycle");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new khb(false, 1, (hg8)null));
        this.N0 = n0;
        final b5j merge = b5j.merge((naj)z7x.l().filter((ptk)new jhb((rtb)new rtb<pmi, Boolean>() {
            public final Object invoke(final Object o) {
                zzd.f((Object)o, "it");
                return l52.d instanceof l62$d.f;
            }
        }, 0)), (naj)((b5j)l52.a).filter((ptk)new zt1((rtb)FolderListViewModel$b.C0, 4)));
        zzd.e((Object)merge, "merge(\n            lifec\u2026en.FolderList }\n        )");
        MviViewModel.M((MviViewModel)this, merge, (String)null, (qqx)null, (gub)new FolderListViewModel$c(this, (ap6)null), 3, (Object)null);
        this.O0 = oyz.f0(this, (rtb)new rtb<iyh<hhb>, oyv>() {
            public final /* synthetic */ FolderListViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)hhb$a.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)hhb$e.class), (gub)new f(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)hhb$c.class), (gub)new g(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)hhb$b.class), (gub)new h(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)hhb$d.class), (gub)new i(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)hhb$f.class), (gub)new m(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<hhb> v() {
        return (iyh<hhb>)this.O0.a((soe)FolderListViewModel.P0[0]);
    }
}
