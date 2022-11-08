// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.ondevicemetrics;

import java.util.Iterator;
import androidx.work.c$a$c;
import androidx.work.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.io.Closeable;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Objects;
import androidx.work.c;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u0011" }, d2 = { "Lcom/twitter/analytics/ondevicemetrics/OnDeviceMetricsRegressionEvaluator;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lwhj;", "metricsRepository", "Lxhj;", "metricsStatisticsAggregator", "Lnhj;", "anomalyEvaluator", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lwhj;Lxhj;Lnhj;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "lib.core.analytics.ondevicemetrics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class OnDeviceMetricsRegressionEvaluator extends Worker
{
    public static final OnDeviceMetricsRegressionEvaluator.OnDeviceMetricsRegressionEvaluator$a Companion;
    public final whj H0;
    public final xhj I0;
    public final nhj J0;
    
    static {
        Companion = new OnDeviceMetricsRegressionEvaluator.OnDeviceMetricsRegressionEvaluator$a();
    }
    
    public OnDeviceMetricsRegressionEvaluator(final Context context, final WorkerParameters workerParameters) {
        zzd.f((Object)context, "context");
        zzd.f((Object)workerParameters, "workerParameters");
        final thj$b companion = thj.Companion;
        this(context, workerParameters, companion.a().K4(), companion.a().k4(), companion.a().o8());
    }
    
    public OnDeviceMetricsRegressionEvaluator(final Context context, final WorkerParameters workerParameters, final whj h0, final xhj i0, final nhj j0) {
        zzd.f((Object)context, "context");
        zzd.f((Object)workerParameters, "workerParameters");
        zzd.f((Object)h0, "metricsRepository");
        zzd.f((Object)i0, "metricsStatisticsAggregator");
        zzd.f((Object)j0, "anomalyEvaluator");
        super(context, workerParameters);
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final c.a g() {
        final he0 c0 = he0.C0;
        cag.a("OnDeviceMetric", "Performing anomaly detection and regression logging for on device metrics.");
        final whj h0 = this.H0;
        Objects.requireNonNull(h0);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final glq a = h0.a;
        final zrl$a zrl$a = new zrl$a();
        ((jp1$a)zrl$a).t(tsl.c("anomaly_state"), new Object[] { c0 });
        ((jp1$a)zrl$a).r("creation_time");
        Object e = a.e((zrl)((h4j)zrl$a).e());
        try {
            if (((j0m)e).moveToFirst()) {
                do {
                    final lhj lhj = new lhj(((yhj.b)((j0m)e).a()).getName(), ((yhj.b)((j0m)e).a()).getValue(), ((yhj.b)((j0m)e).a()).L(), ((yhj.b)((j0m)e).a()).r1(), he0.valueOf(((yhj.b)((j0m)e).a()).V2()));
                    if (linkedHashMap.containsKey(((yhj.b)((j0m)e).a()).getName())) {
                        final Object value = linkedHashMap.get(((yhj.b)((j0m)e).a()).getName());
                        List list;
                        if (value instanceof List && (value instanceof coe || value instanceof eoe)) {
                            list = (List)value;
                        }
                        else {
                            list = null;
                        }
                        if (list == null) {
                            continue;
                        }
                        list.add(lhj);
                    }
                    else {
                        linkedHashMap.put(((yhj.b)((j0m)e).a()).getName(), tdy.x0((Object[])new lhj[] { lhj }));
                    }
                } while (((j0m)e).moveToNext());
            }
            pf8.s((Closeable)e, null);
            final int size = linkedHashMap.size();
            final StringBuilder sb = new StringBuilder();
            sb.append("Found metrics to evaluate for anomalies: ");
            sb.append(size);
            cag.a("OnDeviceMetric", sb.toString());
            e = new LinkedHashMap();
            for (final Map.Entry<String, V> entry : linkedHashMap.entrySet()) {
                final String s = entry.getKey();
                final Iterator iterator2 = ((List)entry.getValue()).iterator();
                while (iterator2.hasNext()) {
                    final lhj lhj2 = (lhj)iterator2.next();
                    final whj h2 = this.H0;
                    final he0 a2 = this.J0.a(lhj2);
                    Objects.requireNonNull(h2);
                    zzd.f((Object)lhj2, "metric");
                    zzd.f((Object)a2, "anomalyState");
                    Label_0707: {
                        if (a2 == c0) {
                            break Label_0707;
                        }
                        final glq a3 = h2.a;
                        final zrl$a zrl$a2 = new zrl$a();
                        ((jp1$a)zrl$a2).s(tsl.a(new String[] { tsl.b("name", (Object)lhj2.a), tsl.b("version", (Object)lhj2.c), tsl.b("value", (Object)lhj2.b), tsl.b("creation_time", (Object)lhj2.d) }));
                        final j0m e2 = a3.e((zrl)((h4j)zrl$a2).e());
                        try {
                            if (e2.moveToFirst()) {
                                do {
                                    final d60 c2 = h2.b.c();
                                    zzd.e((Object)c2, "writer.rowWriter");
                                    ((yhj$c$a)c2.a).b(a2.toString());
                                    c2.f(tsl.c("_id"), new Object[] { ((d9s$b)e2.a()).f0() });
                                } while (e2.moveToNext());
                            }
                            pf8.s((Closeable)e2, null);
                            continue;
                        }
                        finally {
                            try {}
                            finally {
                                pf8.s((Closeable)e2, (Throwable)iterator2);
                            }
                        }
                    }
                    break;
                }
                final List a4 = this.H0.a(s);
                this.I0.a(a4);
                final Iterator iterator3 = or4.Z1((Iterable)a4).iterator();
                int n = 0;
                while (iterator3.hasNext() && ((lhj)iterator3.next()).e == he0.D0) {
                    ++n;
                }
                if (n >= dta.b().f("on_device_metrics_anomaly_to_regression_factor", 3)) {
                    ((Map<String, Integer>)e).put(s, Integer.valueOf(n));
                }
            }
            final whj h3 = this.H0;
            final int f = dta.b().f("on_device_metrics_number_entries_tracked", 25);
            final glq a5 = h3.a;
            final zrl$a zrl$a3 = new zrl$a();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("COUNT(*) > ");
            sb2.append(f);
            ((jp1$a)zrl$a3).p("name", sb2.toString());
            Object o = a5.e((zrl)((h4j)zrl$a3).e());
            try {
                if (((j0m)o).moveToFirst()) {
                    do {
                        final String name = ((yhj.b)((j0m)o).a()).getName();
                        final int c3 = h3.a.c();
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("(  SELECT _id FROM on_device_metrics WHERE (name = '");
                        sb3.append(name);
                        sb3.append("') AND (anomaly_state <> '");
                        sb3.append(c0);
                        sb3.append("') ORDER BY creation_time DESC LIMIT ");
                        sb3.append(c3);
                        sb3.append(" OFFSET ");
                        sb3.append(f);
                        sb3.append("  )");
                        final String string = sb3.toString();
                        final ilq b = h3.b;
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("_id IN ");
                        sb4.append(string);
                        final int b2 = b.b(sb4.toString());
                        final String name2 = ((yhj.b)((j0m)o).a()).getName();
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("Deleted older ");
                        sb5.append(b2);
                        sb5.append(" rows from table for ");
                        sb5.append(name2);
                        sb5.append(".");
                        cag.a("OnDeviceMetric", sb5.toString());
                    } while (((j0m)o).moveToNext());
                }
                pf8.s((Closeable)o, null);
                this.I0.b(dta.b().f("on_device_metrics_min_app_version", 0));
                final HashMap<String, String[]> hashMap = new HashMap<String, String[]>();
                o = ((Map<String, Integer>)e).keySet().toArray(new String[0]);
                zzd.d(o, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                hashMap.put("ODMRegressedMetrics", (String[])o);
                o = or4.l2((Collection)((Map<String, Integer>)e).values());
                final String b3 = b.b;
                final Integer[] array = new Integer[((String[])o).length];
                for (int i = 0; i < ((String[])o).length; ++i) {
                    array[i] = Integer.valueOf(o[i]);
                }
                hashMap.put("ODMRegressedAnomalies", (String[])array);
                final b b4 = new b(hashMap);
                b.f(b4);
                return (c.a)new c$a$c(b4);
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    pf8.s((Closeable)o, t);
                }
            }
        }
        finally {
            try {}
            finally {
                final Throwable t2;
                pf8.s((Closeable)e, t2);
            }
        }
    }
}
