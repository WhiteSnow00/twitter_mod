// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.ondevicemetrics;

import androidx.work.c$a$c;
import java.util.List;
import java.util.Collections;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;
import java.util.concurrent.TimeUnit;
import java.util.Objects;

public final class OnDeviceMetricsAnalysisScheduler
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public OnDeviceMetricsAnalysisScheduler(final urx urx) {
        czd.f((Object)urx, "workManager");
        if (asa.b().b("on_device_metrics_enabled", false)) {
            final lfa e0 = lfa.E0;
            Objects.requireNonNull(OnDeviceMetricsAnalysisScheduler.Companion);
            final n3k$a n3k$a = (n3k$a)((osx$a)new n3k$a((Class)PeriodicScheduler.class, 24L, TimeUnit.HOURS)).g(60L, TimeUnit.SECONDS);
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            urx.e("ODMAnalysisScheduler", e0, (n3k)((osx$a)((osx$a)((osx$a)n3k$a).e(1, 10000L)).a("OnDeviceMetricsRegressionEvaluation")).b());
        }
        else {
            s9g.a("OnDeviceMetric", "Removing all scheduled work if any.");
            urx.b("OnDeviceMetricsRegressionEvaluation");
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/analytics/ondevicemetrics/OnDeviceMetricsAnalysisScheduler$PeriodicScheduler;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "lib.core.analytics.ondevicemetrics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class PeriodicScheduler extends Worker
    {
        public PeriodicScheduler(final Context context, final WorkerParameters workerParameters) {
            czd.f((Object)context, "context");
            czd.f((Object)workerParameters, "workerParameters");
            super(context, workerParameters);
        }
        
        public final c$a g() {
            s9g.a("OnDeviceMetric", "Scheduling periodically analysis jobs.");
            final urx l = zhj.Companion.a().l();
            Objects.requireNonNull(OnDeviceMetricsAnalysisScheduler.Companion);
            final olj$a olj$a = new olj$a((Class)OnDeviceMetricsRegressionEvaluator.class);
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            final olj olj = (olj)((osx$a)((osx$a)((osx$a)olj$a).e(1, 10000L)).a("OnDeviceMetricsRegressionEvaluation")).b();
            Objects.requireNonNull(l);
            final nbu a = l.a("OnDeviceMetric", (List)Collections.singletonList(olj));
            final olj olj2 = (olj)((osx$a)((osx$a)((osx$a)new olj$a((Class)OnDeviceMetricsRegressionLogger.class)).e(1, 10000L)).a("OnDeviceMetricsRegressionEvaluation")).b();
            Objects.requireNonNull(a);
            a.o((List)Collections.singletonList(olj2)).c();
            return (c$a)new c$a$c();
        }
    }
    
    public static final class a
    {
    }
}
