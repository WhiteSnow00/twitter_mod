// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.posttweetactions.ui.share;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/app/posttweetactions/ui/share/ShareSheetViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Liup;", "", "subsystem.tfa.post-tweet-actions.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class ShareSheetViewModel extends MviViewModel
{
    public final ShareSheetArgs N0;
    
    public ShareSheetViewModel(final ShareSheetArgs n0, final ibm ibm) {
        zzd.f((Object)n0, "args");
        zzd.f((Object)ibm, "releaseComplete");
        super((fae)ibm, (oax)new iup(n0.getTweetId()));
        this.N0 = n0;
    }
}
