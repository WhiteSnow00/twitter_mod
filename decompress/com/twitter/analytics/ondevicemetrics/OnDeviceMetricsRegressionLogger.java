// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.ondevicemetrics;

import androidx.work.c;
import androidx.work.c$a$c;
import com.twitter.util.user.UserIdentifier;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000f¨\u0006\u0010" }, d2 = { "Lcom/twitter/analytics/ondevicemetrics/OnDeviceMetricsRegressionLogger;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Ldij;", "statisticsAggregator", "Lcij;", "metricsRepository", "Lfca;", "Lelm;", "eventReporter", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ldij;Lcij;Lfca;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "lib.core.analytics.ondevicemetrics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class OnDeviceMetricsRegressionLogger extends Worker
{
    public final dij I0;
    public final cij J0;
    public final fca<elm> K0;
    
    public OnDeviceMetricsRegressionLogger(final Context context, final WorkerParameters workerParameters) {
        czd.f((Object)context, "context");
        czd.f((Object)workerParameters, "workerParameters");
        final zhj$b companion = zhj.Companion;
        this(context, workerParameters, companion.a().k4(), companion.a().K4(), (fca<elm>)companion.a().r());
    }
    
    public OnDeviceMetricsRegressionLogger(final Context context, final WorkerParameters workerParameters, final dij i0, final cij j0, final fca<elm> k0) {
        czd.f((Object)context, "context");
        czd.f((Object)workerParameters, "workerParameters");
        czd.f((Object)i0, "statisticsAggregator");
        czd.f((Object)j0, "metricsRepository");
        czd.f((Object)k0, "eventReporter");
        super(context, workerParameters);
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public final c$a g() {
        s9g.a("OnDeviceMetric", "Creating event logs for on device metrics.");
        final String[] value = ((c)this).E0.b.a.get("ODMRegressedMetrics");
        final boolean b = value instanceof String[];
        int[] array = null;
        String[] array2;
        if (b) {
            array2 = value;
        }
        else {
            array2 = null;
        }
        final Integer[] value2 = ((c)this).E0.b.a.get("ODMRegressedAnomalies");
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
                s9g.a("OnDeviceMetric", sb.toString());
                this.K0.b(c, (elm)new aij(s, n3, this.J0.a(s), this.I0.c(s), this.I0.d()));
            }
        }
        return (c$a)new c$a$c();
    }
}
