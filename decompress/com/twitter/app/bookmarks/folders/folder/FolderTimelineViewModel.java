// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.bookmarks.folders.folder;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/bookmarks/folders/folder/FolderTimelineViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lwhb;", "Lqhb;", "Lphb;", "feature.tfa.bookmarks.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class FolderTimelineViewModel extends MviViewModel<whb, qhb, phb>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(FolderTimelineViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public FolderTimelineViewModel(final l52 l52, final pca<z42> pca, final ibm ibm) {
        zzd.f((Object)l52, "navigationDelegate");
        zzd.f((Object)pca, "eventObservable");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new whb(false, (String)null, 3, (hg8)null));
        final b5j ofType = pca.v0().ofType((Class)z42.a.class);
        zzd.b((Object)ofType, "ofType(R::class.java)");
        MviViewModel.M((MviViewModel)this, ofType, (String)null, (qqx)null, (gub)new FolderTimelineViewModel$a(this, (ap6)null), 3, (Object)null);
        final b5j ofType2 = ((b5j)l52.a).ofType((Class)l62$d.g.class);
        zzd.b((Object)ofType2, "ofType(R::class.java)");
        MviViewModel.M((MviViewModel)this, ofType2, (String)null, (qqx)null, (gub)new FolderTimelineViewModel$b(this, (ap6)null), 3, (Object)null);
        this.N0 = oyz.f0(this, (rtb)new rtb<iyh<qhb>, oyv>() {
            public final /* synthetic */ FolderTimelineViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)qhb$a$b.class), (gub)new a(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)qhb$a$a.class), (gub)new b(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<qhb> v() {
        return (iyh<qhb>)this.N0.a((soe)FolderTimelineViewModel.O0[0]);
    }
}
