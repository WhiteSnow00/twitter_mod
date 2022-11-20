// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.posttweetactions.ui.share;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/app/posttweetactions/ui/share/ShareSheetViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lyup;", "", "subsystem.tfa.post-tweet-actions.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class ShareSheetViewModel extends MviViewModel
{
    public final ShareSheetArgs O0;
    
    public ShareSheetViewModel(final ShareSheetArgs o0, final xbm xbm) {
        czd.f((Object)o0, "args");
        czd.f((Object)xbm, "releaseComplete");
        super((k9e)xbm, (jbx)new yup(o0.getTweetId()));
        this.O0 = o0;
    }
}
