// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.service.core.workmanager;

import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import androidx.work.c$a$c;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lcom/twitter/analytics/service/core/workmanager/AnalyticsCleanupWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "b", "lib.core.analytics.service.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class AnalyticsCleanupWorker extends Worker
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public AnalyticsCleanupWorker(final Context context, final WorkerParameters workerParameters) {
        czd.f((Object)context, "context");
        czd.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
    }
    
    public final c$a g() {
        for (final UserIdentifier userIdentifier : UserIdentifier.Companion.b()) {
            Objects.requireNonNull(l00.Companion);
            final l00 q0 = ed.a().q0();
            czd.e((Object)q0, "get().analyticsLogCleanupHelper");
            czd.f((Object)userIdentifier, "userIdentifier");
            final Iterator iterator2 = mq4.R0((Iterable)q0.a.a.values()).iterator();
            while (iterator2.hasNext()) {
                ((u00)iterator2.next()).a(userIdentifier);
            }
        }
        return (c$a)new c$a$c();
    }
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public b(final urx urx) {
            czd.f((Object)urx, "workManager");
            urx.e("ScribeDeleteWorker", lfa.E0, (n3k)((osx$a)new n3k$a((Class)AnalyticsCleanupWorker.class, 86400000L, TimeUnit.MILLISECONDS)).b());
        }
    }
}
