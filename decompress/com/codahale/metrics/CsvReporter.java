// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.io.IOException;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.io.File;
import java.nio.charset.Charset;

public class CsvReporter extends ScheduledReporter
{
    private static final pag LOGGER;
    private static final Charset UTF_8;
    private final Clock clock;
    private final File directory;
    private final Locale locale;
    
    static {
        LOGGER = sag.e((Class)CsvReporter.class);
        UTF_8 = Charset.forName("UTF-8");
    }
    
    private CsvReporter(final MetricRegistry metricRegistry, final File directory, final Locale locale, final TimeUnit timeUnit, final TimeUnit timeUnit2, final Clock clock, final MetricFilter metricFilter) {
        super(metricRegistry, "csv-reporter", metricFilter, timeUnit, timeUnit2);
        this.directory = directory;
        this.locale = locale;
        this.clock = clock;
    }
    
    public CsvReporter(final MetricRegistry metricRegistry, final File file, final Locale locale, final TimeUnit timeUnit, final TimeUnit timeUnit2, final Clock clock, final MetricFilter metricFilter, final CsvReporter$1 csvReporter$1) {
        this(metricRegistry, file, locale, timeUnit, timeUnit2, clock, metricFilter);
    }
    
    public static CsvReporter.CsvReporter$Builder forRegistry(final MetricRegistry metricRegistry) {
        return new CsvReporter.CsvReporter$Builder(metricRegistry, (CsvReporter$1)null);
    }
    
    private void report(final long n, final String s, final String s2, final String s3, final Object... array) {
        try {
            final File directory = this.directory;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.sanitize(s));
            sb.append(".csv");
            final File file = new File(directory, sb.toString());
            final boolean exists = file.exists();
            if (exists || file.createNewFile()) {
                final PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file, true), CsvReporter.UTF_8));
                Label_0153: {
                    if (exists) {
                        break Label_0153;
                    }
                    try {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("t,");
                        sb2.append(s2);
                        printWriter.println(sb2.toString());
                        final Locale locale = this.locale;
                        printWriter.printf(locale, String.format(locale, "%d,%s%n", n, s3), array);
                    }
                    finally {
                        printWriter.close();
                    }
                }
            }
        }
        catch (final IOException ex) {
            CsvReporter.LOGGER.b((Object)s, (Object)ex);
        }
    }
    
    private void reportCounter(final long n, final String s, final Counter counter) {
        this.report(n, s, "count", "%d", counter.getCount());
    }
    
    private void reportGauge(final long n, final String s, final Gauge gauge) {
        this.report(n, s, "value", "%s", gauge.getValue());
    }
    
    private void reportHistogram(final long n, final String s, final Histogram histogram) {
        final Snapshot snapshot = histogram.getSnapshot();
        this.report(n, s, "count,max,mean,min,stddev,p50,p75,p95,p98,p99,p999", "%d,%d,%f,%d,%f,%f,%f,%f,%f,%f,%f", histogram.getCount(), snapshot.getMax(), snapshot.getMean(), snapshot.getMin(), snapshot.getStdDev(), snapshot.getMedian(), snapshot.get75thPercentile(), snapshot.get95thPercentile(), snapshot.get98thPercentile(), snapshot.get99thPercentile(), snapshot.get999thPercentile());
    }
    
    private void reportMeter(final long n, final String s, final Meter meter) {
        this.report(n, s, "count,mean_rate,m1_rate,m5_rate,m15_rate,rate_unit", "%d,%f,%f,%f,%f,events/%s", meter.getCount(), this.convertRate(meter.getMeanRate()), this.convertRate(meter.getOneMinuteRate()), this.convertRate(meter.getFiveMinuteRate()), this.convertRate(meter.getFifteenMinuteRate()), this.getRateUnit());
    }
    
    private void reportTimer(final long n, final String s, final Timer timer) {
        final Snapshot snapshot = timer.getSnapshot();
        this.report(n, s, "count,max,mean,min,stddev,p50,p75,p95,p98,p99,p999,mean_rate,m1_rate,m5_rate,m15_rate,rate_unit,duration_unit", "%d,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,calls/%s,%s", timer.getCount(), this.convertDuration((double)snapshot.getMax()), this.convertDuration(snapshot.getMean()), this.convertDuration((double)snapshot.getMin()), this.convertDuration(snapshot.getStdDev()), this.convertDuration(snapshot.getMedian()), this.convertDuration(snapshot.get75thPercentile()), this.convertDuration(snapshot.get95thPercentile()), this.convertDuration(snapshot.get98thPercentile()), this.convertDuration(snapshot.get99thPercentile()), this.convertDuration(snapshot.get999thPercentile()), this.convertRate(timer.getMeanRate()), this.convertRate(timer.getOneMinuteRate()), this.convertRate(timer.getFiveMinuteRate()), this.convertRate(timer.getFifteenMinuteRate()), this.getRateUnit(), this.getDurationUnit());
    }
    
    public void report(final SortedMap<String, Gauge> sortedMap, final SortedMap<String, Counter> sortedMap2, final SortedMap<String, Histogram> sortedMap3, final SortedMap<String, Meter> sortedMap4, final SortedMap<String, Timer> sortedMap5) {
        final long seconds = TimeUnit.MILLISECONDS.toSeconds(this.clock.getTime());
        for (final Map.Entry entry : sortedMap.entrySet()) {
            this.reportGauge(seconds, (String)entry.getKey(), (Gauge)entry.getValue());
        }
        for (final Map.Entry entry2 : sortedMap2.entrySet()) {
            this.reportCounter(seconds, (String)entry2.getKey(), (Counter)entry2.getValue());
        }
        for (final Map.Entry entry3 : sortedMap3.entrySet()) {
            this.reportHistogram(seconds, (String)entry3.getKey(), (Histogram)entry3.getValue());
        }
        for (final Map.Entry entry4 : sortedMap4.entrySet()) {
            this.reportMeter(seconds, (String)entry4.getKey(), (Meter)entry4.getValue());
        }
        for (final Map.Entry entry5 : sortedMap5.entrySet()) {
            this.reportTimer(seconds, (String)entry5.getKey(), (Timer)entry5.getValue());
        }
    }
    
    public String sanitize(final String s) {
        return s;
    }
}
