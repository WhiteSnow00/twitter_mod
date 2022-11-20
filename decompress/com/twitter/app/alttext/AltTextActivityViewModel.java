// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.alttext;

import com.twitter.alttext.AltTextActivityContentViewArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/alttext/AltTextActivityViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Loy;", "", "Lly;", "feature.tfa.alttext.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AltTextActivityViewModel extends MviViewModel<oy, Object, ly>
{
    public static final coe<Object>[] P0;
    public final hyh O0;
    
    static {
        P0 = new coe[] { (coe)w9.f((Class)AltTextActivityViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public AltTextActivityViewModel(final AltTextActivityContentViewArgs altTextActivityContentViewArgs, final xbm xbm) {
        czd.f((Object)altTextActivityContentViewArgs, "contentViewArgs");
        czd.f((Object)xbm, "releaseCompletable");
        final ew9 editableImage = altTextActivityContentViewArgs.getEditableImage();
        final aw9 editableGif = altTextActivityContentViewArgs.getEditableGif();
        String altText;
        if ((altText = altTextActivityContentViewArgs.getAltText()) == null) {
            altText = "";
        }
        super((k9e)xbm, (jbx)new oy(editableImage, editableGif, altText, altText));
        this.O0 = ewj.n(this, (qsb)new AltTextActivityViewModel$a(this));
    }
    
    public final jyh<Object> v() {
        return (jyh<Object>)this.O0.a((coe)AltTextActivityViewModel.P0[0]);
    }
}
