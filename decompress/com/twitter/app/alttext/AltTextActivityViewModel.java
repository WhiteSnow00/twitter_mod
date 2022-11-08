// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.alttext;

import com.twitter.alttext.AltTextActivityContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/alttext/AltTextActivityViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lny;", "", "Lky;", "feature.tfa.alttext.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AltTextActivityViewModel extends MviViewModel<ny, Object, ky>
{
    public static final /* synthetic */ soe<Object>[] O0;
    public final gyh N0;
    
    static {
        O0 = new soe[] { (soe)hi.m(AltTextActivityViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public AltTextActivityViewModel(final AltTextActivityContentViewArgs altTextActivityContentViewArgs, final ibm ibm) {
        zzd.f((Object)altTextActivityContentViewArgs, "contentViewArgs");
        zzd.f((Object)ibm, "releaseCompletable");
        final rw9 editableImage = altTextActivityContentViewArgs.getEditableImage();
        final nw9 editableGif = altTextActivityContentViewArgs.getEditableGif();
        String altText;
        if ((altText = altTextActivityContentViewArgs.getAltText()) == null) {
            altText = "";
        }
        super((fae)ibm, (oax)new ny(editableImage, editableGif, altText, altText));
        this.N0 = oyz.f0(this, (rtb)new rtb<iyh<Object>, oyv>() {
            public final /* synthetic */ AltTextActivityViewModel C0;
            
            public final Object invoke(final Object o) {
                final iyh iyh = (iyh)o;
                zzd.f((Object)iyh, "$this$weaver");
                iyh.a(g9m.a((Class)zx.class), (gub)new a(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)by.class), (gub)new b(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)cy.class), (gub)new c(this.C0, (ap6)null));
                iyh.a(g9m.a((Class)ay.class), (gub)new d(this.C0, (ap6)null));
                return oyv.a;
            }
        });
    }
    
    public final iyh<Object> v() {
        return (iyh<Object>)this.N0.a((soe)AltTextActivityViewModel.O0[0]);
    }
}
