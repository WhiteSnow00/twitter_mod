// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.fleets.page.thread.utils;

import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006" }, d2 = { "Lcom/twitter/app/fleets/page/thread/utils/FleetsVideoView;", "Lgil;", "Lyzw;", "videoFile", "Lfzv;", "setVideoFile", "feature.tfa.fleets.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class FleetsVideoView extends gil
{
    public yzw J0;
    
    public FleetsVideoView(final Context context, final AttributeSet set) {
        czd.f((Object)context, "context");
        super(context, set, 0);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final yzw j0 = this.J0;
        if (super.E0 == null && j0 != null) {
            this.setVideoFile(j0);
        }
    }
    
    public void setVideoFile(final yzw yzw) {
        czd.f((Object)yzw, "videoFile");
        super.setVideoFile(yzw);
        this.J0 = yzw;
    }
}
