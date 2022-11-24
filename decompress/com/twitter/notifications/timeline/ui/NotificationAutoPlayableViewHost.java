// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.timeline.ui;

import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f" }, d2 = { "Lcom/twitter/notifications/timeline/ui/NotificationAutoPlayableViewHost;", "Landroid/widget/FrameLayout;", "Lm81;", "Lk81;", "autoPlayableItem", "getAutoPlayableItem", "()Lk81;", "setAutoPlayableItem", "(Lk81;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "subsystem.tfa.notifications.timeline.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class NotificationAutoPlayableViewHost extends FrameLayout implements m81
{
    public k81 F0;
    
    public NotificationAutoPlayableViewHost(final Context context, final AttributeSet set) {
        e0e.f((Object)context, "context");
        super(context, set);
    }
    
    public k81 getAutoPlayableItem() {
        Object o;
        if ((o = this.F0) == null) {
            o = k81.g;
        }
        return (k81)o;
    }
    
    public void setAutoPlayableItem(final k81 f0) {
        e0e.f((Object)f0, "autoPlayableItem");
        this.F0 = f0;
    }
}
