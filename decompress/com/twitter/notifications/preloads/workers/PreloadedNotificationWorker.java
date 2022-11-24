// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.preloads.workers;

import androidx.work.c$a$c;
import androidx.work.c$a;
import java.util.Objects;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.RxWorker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/notifications/preloads/workers/PreloadedNotificationWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "subsystem.tfa.notifications.features.preloads.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class PreloadedNotificationWorker extends RxWorker
{
    public final dxk L0;
    
    public PreloadedNotificationWorker(final Context context, final WorkerParameters workerParameters) {
        e0e.f((Object)context, "context");
        e0e.f((Object)workerParameters, "params");
        super(context, workerParameters);
        Objects.requireNonNull(hag.Companion);
        this.L0 = ((hag)((n5j)dr0.Companion.a()).B((Class)hag.class)).M7();
    }
    
    public final bbq<c$a> h() {
        this.L0.a.a();
        return (bbq<c$a>)bbq.v((Object)new c$a$c());
    }
}
