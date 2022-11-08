// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.ondevicemetrics;

import androidx.work.c$a$c;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import androidx.work.c;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000f¨\u0006\u0010" }, d2 = { "Lcom/twitter/analytics/ondevicemetrics/OnDeviceMetricsRegressionLogger;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lxhj;", "statisticsAggregator", "Lwhj;", "metricsRepository", "Lxca;", "Lokm;", "eventReporter", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lxhj;Lwhj;Lxca;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "lib.core.analytics.ondevicemetrics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class OnDeviceMetricsRegressionLogger extends Worker
{
    public final xhj H0;
    public final whj I0;
    public final xca<okm> J0;
    
    public OnDeviceMetricsRegressionLogger(final Context context, final WorkerParameters workerParameters) {
        zzd.f((Object)context, "context");
        zzd.f((Object)workerParameters, "workerParameters");
        final thj$b companion = thj.Companion;
        this(context, workerParameters, companion.a().k4(), companion.a().K4(), (xca<okm>)companion.a().r());
    }
    
    public OnDeviceMetricsRegressionLogger(final Context context, final WorkerParameters workerParameters, final xhj h0, final whj i0, final xca<okm> j0) {
        zzd.f((Object)context, "context");
        zzd.f((Object)workerParameters, "workerParameters");
        zzd.f((Object)h0, "statisticsAggregator");
        zzd.f((Object)i0, "metricsRepository");
        zzd.f((Object)j0, "eventReporter");
        super(context, workerParameters);
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final c.a g() {
        cag.a("OnDeviceMetric", "Creating event logs for on device metrics.");
        final String[] value = ((c)this).D0.b.a.get("ODMRegressedMetrics");
        final boolean b = value instanceof String[];
        int[] array = null;
        String[] array2;
        if (b) {
            array2 = value;
        }
        else {
            array2 = null;
        }
        final Integer[] value2 = ((c)this).D0.b.a.get("ODMRegressedAnomalies");
        if (value2 instanceof Integer[]) {
            final Integer[] array3 = value2;
            final int[] array4 = new int[array3.length];
            int n = 0;
            while (true) {
                array = array4;
                if (n >= array3.length) {
                    break;
                }
                array4[n] = array3[n];
                ++n;
            }
        }
        final UserIdentifier c = UserIdentifier.Companion.c();
        if (array2 != null) {
            for (int length = array2.length, i = 0, n2 = 0; i < length; ++i, ++n2) {
                final String s = array2[i];
                int n3;
                if (array != null) {
                    n3 = array[n2];
                }
                else {
                    n3 = 0;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Encountered regression: anomalies in ");
                sb.append(s);
                sb.append(" with ");
                sb.append(n3);
                sb.append(" anomalies");
                cag.a("OnDeviceMetric", sb.toString());
                this.J0.b(c, (okm)new uhj(s, n3, this.I0.a(s), (Map)this.H0.c(s), this.H0.d()));
            }
        }
        return (c.a)new c$a$c();
    }
}
