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
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u0011" }, d2 = { "Lcom/twitter/analytics/ondevicemetrics/OnDeviceMetricsRegressionEvaluator;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lcij;", "metricsRepository", "Ldij;", "metricsStatisticsAggregator", "Lthj;", "anomalyEvaluator", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcij;Ldij;Lthj;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "lib.core.analytics.ondevicemetrics.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class OnDeviceMetricsRegressionEvaluator extends Worker
{
    public static final a Companion;
    public final cij I0;
    public final dij J0;
    public final thj K0;
    
    static {
        Companion = new a();
    }
    
    public OnDeviceMetricsRegressionEvaluator(final Context context, final WorkerParameters workerParameters) {
        czd.f((Object)context, "context");
        czd.f((Object)workerParameters, "workerParameters");
        final zhj$b companion = zhj.Companion;
        this(context, workerParameters, companion.a().K4(), companion.a().k4(), companion.a().o8());
    }
    
    public OnDeviceMetricsRegressionEvaluator(final Context context, final WorkerParameters workerParameters, final cij i0, final dij j0, final thj k0) {
        czd.f((Object)context, "context");
        czd.f((Object)workerParameters, "workerParameters");
        czd.f((Object)i0, "metricsRepository");
        czd.f((Object)j0, "metricsStatisticsAggregator");
        czd.f((Object)k0, "anomalyEvaluator");
        super(context, workerParameters);
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public final c$a g() {
        final de0 d0 = de0.D0;
        s9g.a("OnDeviceMetric", "Performing anomaly detection and regression logging for on device metrics.");
        final cij i0 = this.I0;
        Objects.requireNonNull(i0);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final amq a = i0.a;
        final osl$a osl$a = new osl$a();
        ((fp1$a)osl$a).t(itl.c("anomaly_state"), new Object[] { d0 });
        ((fp1$a)osl$a).r("creation_time");
        Object e = a.e((osl)((n4j)osl$a).e());
        try {
            if (((y0m)e).moveToFirst()) {
                do {
                    final rhj rhj = new rhj(((eij$b)((y0m)e).a()).getName(), ((eij$b)((y0m)e).a()).getValue(), ((eij$b)((y0m)e).a()).L(), ((eij$b)((y0m)e).a()).r1(), de0.valueOf(((eij$b)((y0m)e).a()).V2()));
                    if (linkedHashMap.containsKey(((eij$b)((y0m)e).a()).getName())) {
                        final Object value = linkedHashMap.get(((eij$b)((y0m)e).a()).getName());
                        List list;
                        if (value instanceof List && (value instanceof mne || value instanceof one)) {
                            list = (List)value;
                        }
                        else {
                            list = null;
                        }
                        if (list == null) {
                            continue;
                        }
                        list.add(rhj);
                    }
                    else {
                        linkedHashMap.put(((eij$b)((y0m)e).a()).getName(), s9i.w(rhj));
                    }
                } while (((y0m)e).moveToNext());
            }
            wiy.v((Closeable)e, (Throwable)null);
            final int size = linkedHashMap.size();
            final StringBuilder sb = new StringBuilder();
            sb.append("Found metrics to evaluate for anomalies: ");
            sb.append(size);
            s9g.a("OnDeviceMetric", sb.toString());
            e = new LinkedHashMap();
            for (final Map.Entry<String, V> entry : linkedHashMap.entrySet()) {
                final String s = entry.getKey();
                final Iterator iterator2 = ((List)entry.getValue()).iterator();
                while (iterator2.hasNext()) {
                    final rhj rhj2 = (rhj)iterator2.next();
                    final cij i2 = this.I0;
                    final de0 a2 = this.K0.a(rhj2);
                    Objects.requireNonNull(i2);
                    czd.f((Object)rhj2, "metric");
                    czd.f((Object)a2, "anomalyState");
                    Label_0736: {
                        if (a2 == d0) {
                            break Label_0736;
                        }
                        final amq a3 = i2.a;
                        final osl$a osl$a2 = new osl$a();
                        ((fp1$a)osl$a2).s(itl.a(new String[] { itl.b("name", (Object)rhj2.a), itl.b("version", (Object)rhj2.c), itl.b("value", (Object)rhj2.b), itl.b("creation_time", (Object)rhj2.d) }));
                        final y0m e2 = a3.e((osl)((n4j)osl$a2).e());
                        try {
                            if (e2.moveToFirst()) {
                                do {
                                    final f60 c = i2.b.c();
                                    czd.e((Object)c, "writer.rowWriter");
                                    ((eij.eij$c.a)c.a).c(a2.toString());
                                    c.f(itl.c("_id"), new Object[] { ((x9s$b)e2.a()).f0() });
                                } while (e2.moveToNext());
                            }
                            wiy.v((Closeable)e2, (Throwable)null);
                            continue;
                        }
                        finally {
                            try {}
                            finally {
                                wiy.v((Closeable)e2, (Throwable)iterator2);
                            }
                        }
                    }
                    break;
                }
                final List a4 = this.I0.a(s);
                this.J0.a(a4);
                final Iterator iterator3 = mq4.z0((Iterable)a4).iterator();
                int n = 0;
                while (iterator3.hasNext() && ((rhj)iterator3.next()).e == de0.E0) {
                    ++n;
                }
                if (n >= asa.b().f("on_device_metrics_anomaly_to_regression_factor", 3)) {
                    ((Map<String, Integer>)e).put(s, Integer.valueOf(n));
                }
            }
            final cij i3 = this.I0;
            final int f = asa.b().f("on_device_metrics_number_entries_tracked", 25);
            final amq a5 = i3.a;
            final osl$a osl$a3 = new osl$a();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("COUNT(*) > ");
            sb2.append(f);
            ((fp1$a)osl$a3).p("name", sb2.toString());
            Object o = a5.e((osl)((n4j)osl$a3).e());
            try {
                if (((y0m)o).moveToFirst()) {
                    do {
                        final String name = ((eij$b)((y0m)o).a()).getName();
                        final int c2 = i3.a.c();
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("(  SELECT _id FROM on_device_metrics WHERE (name = '");
                        sb3.append(name);
                        sb3.append("') AND (anomaly_state <> '");
                        sb3.append(d0);
                        sb3.append("') ORDER BY creation_time DESC LIMIT ");
                        sb3.append(c2);
                        sb3.append(" OFFSET ");
                        sb3.append(f);
                        sb3.append("  )");
                        final String string = sb3.toString();
                        final cmq b = i3.b;
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("_id IN ");
                        sb4.append(string);
                        final int b2 = b.b(sb4.toString());
                        final String name2 = ((eij$b)((y0m)o).a()).getName();
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("Deleted older ");
                        sb5.append(b2);
                        sb5.append(" rows from table for ");
                        sb5.append(name2);
                        sb5.append(".");
                        s9g.a("OnDeviceMetric", sb5.toString());
                    } while (((y0m)o).moveToNext());
                }
                wiy.v((Closeable)o, (Throwable)null);
                this.J0.b(asa.b().f("on_device_metrics_min_app_version", 0));
                final HashMap<String, String[]> hashMap = new HashMap<String, String[]>();
                o = ((Map<String, Integer>)e).keySet().toArray(new String[0]);
                czd.d(o, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                hashMap.put("ODMRegressedMetrics", (String[])o);
                o = mq4.L0((Collection)((Map<String, Integer>)e).values());
                final String b3 = b.b;
                final Integer[] array = new Integer[((String[])o).length];
                for (int j = 0; j < ((String[])o).length; ++j) {
                    array[j] = Integer.valueOf(o[j]);
                }
                hashMap.put("ODMRegressedAnomalies", (String[])array);
                final b b4 = new b((Map)hashMap);
                b.f(b4);
                return (c$a)new c$a$c(b4);
            }
            finally {
                try {}
                finally {
                    final Throwable t;
                    wiy.v((Closeable)o, t);
                }
            }
        }
        finally {
            try {}
            finally {
                final Throwable t2;
                wiy.v((Closeable)e, t2);
            }
        }
    }
    
    public static final class a
    {
    }
}
