// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;

public class Slf4jReporter extends ScheduledReporter
{
    private final Slf4jReporter.Slf4jReporter$LoggerProxy loggerProxy;
    private final llg marker;
    
    private Slf4jReporter(final MetricRegistry metricRegistry, final Slf4jReporter.Slf4jReporter$LoggerProxy loggerProxy, final llg marker, final TimeUnit timeUnit, final TimeUnit timeUnit2, final MetricFilter metricFilter) {
        super(metricRegistry, "logger-reporter", metricFilter, timeUnit, timeUnit2);
        this.loggerProxy = loggerProxy;
        this.marker = marker;
    }
    
    public static Slf4jReporter.Slf4jReporter$Builder forRegistry(final MetricRegistry metricRegistry) {
        return new Slf4jReporter.Slf4jReporter$Builder(metricRegistry, (Slf4jReporter$1)null);
    }
    
    private void logCounter(final String s, final Counter counter) {
        this.loggerProxy.log(this.marker, "type=COUNTER, name={}, count={}", new Object[] { s, counter.getCount() });
    }
    
    private void logGauge(final String s, final Gauge gauge) {
        this.loggerProxy.log(this.marker, "type=GAUGE, name={}, value={}", new Object[] { s, gauge.getValue() });
    }
    
    private void logHistogram(final String s, final Histogram histogram) {
        final Snapshot snapshot = histogram.getSnapshot();
        this.loggerProxy.log(this.marker, "type=HISTOGRAM, name={}, count={}, min={}, max={}, mean={}, stddev={}, median={}, p75={}, p95={}, p98={}, p99={}, p999={}", new Object[] { s, histogram.getCount(), snapshot.getMin(), snapshot.getMax(), snapshot.getMean(), snapshot.getStdDev(), snapshot.getMedian(), snapshot.get75thPercentile(), snapshot.get95thPercentile(), snapshot.get98thPercentile(), snapshot.get99thPercentile(), snapshot.get999thPercentile() });
    }
    
    private void logMeter(final String s, final Meter meter) {
        this.loggerProxy.log(this.marker, "type=METER, name={}, count={}, mean_rate={}, m1={}, m5={}, m15={}, rate_unit={}", new Object[] { s, meter.getCount(), this.convertRate(meter.getMeanRate()), this.convertRate(meter.getOneMinuteRate()), this.convertRate(meter.getFiveMinuteRate()), this.convertRate(meter.getFifteenMinuteRate()), this.getRateUnit() });
    }
    
    private void logTimer(final String s, final Timer timer) {
        final Snapshot snapshot = timer.getSnapshot();
        this.loggerProxy.log(this.marker, "type=TIMER, name={}, count={}, min={}, max={}, mean={}, stddev={}, median={}, p75={}, p95={}, p98={}, p99={}, p999={}, mean_rate={}, m1={}, m5={}, m15={}, rate_unit={}, duration_unit={}", new Object[] { s, timer.getCount(), this.convertDuration((double)snapshot.getMin()), this.convertDuration((double)snapshot.getMax()), this.convertDuration(snapshot.getMean()), this.convertDuration(snapshot.getStdDev()), this.convertDuration(snapshot.getMedian()), this.convertDuration(snapshot.get75thPercentile()), this.convertDuration(snapshot.get95thPercentile()), this.convertDuration(snapshot.get98thPercentile()), this.convertDuration(snapshot.get99thPercentile()), this.convertDuration(snapshot.get999thPercentile()), this.convertRate(timer.getMeanRate()), this.convertRate(timer.getOneMinuteRate()), this.convertRate(timer.getFiveMinuteRate()), this.convertRate(timer.getFifteenMinuteRate()), this.getRateUnit(), this.getDurationUnit() });
    }
    
    public String getRateUnit() {
        final StringBuilder g = w48.g("events/");
        g.append(super.getRateUnit());
        return g.toString();
    }
    
    public void report(final SortedMap<String, Gauge> sortedMap, final SortedMap<String, Counter> sortedMap2, final SortedMap<String, Histogram> sortedMap3, final SortedMap<String, Meter> sortedMap4, final SortedMap<String, Timer> sortedMap5) {
        for (final Map.Entry entry : sortedMap.entrySet()) {
            this.logGauge((String)entry.getKey(), (Gauge)entry.getValue());
        }
        for (final Map.Entry entry2 : sortedMap2.entrySet()) {
            this.logCounter((String)entry2.getKey(), (Counter)entry2.getValue());
        }
        for (final Map.Entry entry3 : sortedMap3.entrySet()) {
            this.logHistogram((String)entry3.getKey(), (Histogram)entry3.getValue());
        }
        for (final Map.Entry entry4 : sortedMap4.entrySet()) {
            this.logMeter((String)entry4.getKey(), (Meter)entry4.getValue());
        }
        for (final Map.Entry entry5 : sortedMap5.entrySet()) {
            this.logTimer((String)entry5.getKey(), (Timer)entry5.getValue());
        }
    }
}
