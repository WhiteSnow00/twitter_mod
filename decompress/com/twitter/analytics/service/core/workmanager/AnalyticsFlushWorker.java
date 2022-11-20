// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.service.core.workmanager;

import androidx.work.c$a$c;
import java.util.Objects;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lcom/twitter/analytics/service/core/workmanager/AnalyticsFlushWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "lib.core.analytics.service.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AnalyticsFlushWorker extends Worker
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public AnalyticsFlushWorker(final Context context, final WorkerParameters workerParameters) {
        czd.f((Object)context, "context");
        czd.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
    }
    
    public final c$a g() {
        Objects.requireNonNull(r00.Companion);
        final r00 p4 = ed.a().P4();
        czd.e((Object)p4, "get().analyticsLogFlushTrigger");
        rw0.c((oj)new q00((Object)p4, 0));
        return (c$a)new c$a$c();
    }
    
    public static final class a
    {
    }
}
