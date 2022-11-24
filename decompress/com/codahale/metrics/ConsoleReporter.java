// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

import java.util.Iterator;
import java.util.Date;
import java.util.SortedMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.TimeZone;
import java.io.PrintStream;
import java.util.Locale;
import java.text.DateFormat;

public class ConsoleReporter extends ScheduledReporter
{
    private static final int CONSOLE_WIDTH = 80;
    private final Clock clock;
    private final DateFormat dateFormat;
    private final Locale locale;
    private final PrintStream output;
    
    private ConsoleReporter(final MetricRegistry metricRegistry, final PrintStream output, final Locale locale, final Clock clock, final TimeZone timeZone, final TimeUnit timeUnit, final TimeUnit timeUnit2, final MetricFilter metricFilter) {
        super(metricRegistry, "console-reporter", metricFilter, timeUnit, timeUnit2);
        this.output = output;
        this.locale = locale;
        this.clock = clock;
        (this.dateFormat = DateFormat.getDateTimeInstance(3, 2, locale)).setTimeZone(timeZone);
    }
    
    public ConsoleReporter(final MetricRegistry metricRegistry, final PrintStream printStream, final Locale locale, final Clock clock, final TimeZone timeZone, final TimeUnit timeUnit, final TimeUnit timeUnit2, final MetricFilter metricFilter, final ConsoleReporter$1 consoleReporter$1) {
        this(metricRegistry, printStream, locale, clock, timeZone, timeUnit, timeUnit2, metricFilter);
    }
    
    public static ConsoleReporter.ConsoleReporter$Builder forRegistry(final MetricRegistry metricRegistry) {
        return new ConsoleReporter.ConsoleReporter$Builder(metricRegistry, (ConsoleReporter$1)null);
    }
    
    private void printCounter(final Map.Entry<String, Counter> entry) {
        this.output.printf(this.locale, "             count = %d%n", entry.getValue().getCount());
    }
    
    private void printGauge(final Map.Entry<String, Gauge> entry) {
        this.output.printf(this.locale, "             value = %s%n", entry.getValue().getValue());
    }
    
    private void printHistogram(final Histogram histogram) {
        this.output.printf(this.locale, "             count = %d%n", histogram.getCount());
        final Snapshot snapshot = histogram.getSnapshot();
        this.output.printf(this.locale, "               min = %d%n", snapshot.getMin());
        this.output.printf(this.locale, "               max = %d%n", snapshot.getMax());
        this.output.printf(this.locale, "              mean = %2.2f%n", snapshot.getMean());
        this.output.printf(this.locale, "            stddev = %2.2f%n", snapshot.getStdDev());
        this.output.printf(this.locale, "            median = %2.2f%n", snapshot.getMedian());
        this.output.printf(this.locale, "              75%% <= %2.2f%n", snapshot.get75thPercentile());
        this.output.printf(this.locale, "              95%% <= %2.2f%n", snapshot.get95thPercentile());
        this.output.printf(this.locale, "              98%% <= %2.2f%n", snapshot.get98thPercentile());
        this.output.printf(this.locale, "              99%% <= %2.2f%n", snapshot.get99thPercentile());
        this.output.printf(this.locale, "            99.9%% <= %2.2f%n", snapshot.get999thPercentile());
    }
    
    private void printMeter(final Meter meter) {
        this.output.printf(this.locale, "             count = %d%n", meter.getCount());
        this.output.printf(this.locale, "         mean rate = %2.2f events/%s%n", this.convertRate(meter.getMeanRate()), this.getRateUnit());
        this.output.printf(this.locale, "     1-minute rate = %2.2f events/%s%n", this.convertRate(meter.getOneMinuteRate()), this.getRateUnit());
        this.output.printf(this.locale, "     5-minute rate = %2.2f events/%s%n", this.convertRate(meter.getFiveMinuteRate()), this.getRateUnit());
        this.output.printf(this.locale, "    15-minute rate = %2.2f events/%s%n", this.convertRate(meter.getFifteenMinuteRate()), this.getRateUnit());
    }
    
    private void printTimer(final Timer timer) {
        final Snapshot snapshot = timer.getSnapshot();
        this.output.printf(this.locale, "             count = %d%n", timer.getCount());
        this.output.printf(this.locale, "         mean rate = %2.2f calls/%s%n", this.convertRate(timer.getMeanRate()), this.getRateUnit());
        this.output.printf(this.locale, "     1-minute rate = %2.2f calls/%s%n", this.convertRate(timer.getOneMinuteRate()), this.getRateUnit());
        this.output.printf(this.locale, "     5-minute rate = %2.2f calls/%s%n", this.convertRate(timer.getFiveMinuteRate()), this.getRateUnit());
        this.output.printf(this.locale, "    15-minute rate = %2.2f calls/%s%n", this.convertRate(timer.getFifteenMinuteRate()), this.getRateUnit());
        this.output.printf(this.locale, "               min = %2.2f %s%n", this.convertDuration((double)snapshot.getMin()), this.getDurationUnit());
        this.output.printf(this.locale, "               max = %2.2f %s%n", this.convertDuration((double)snapshot.getMax()), this.getDurationUnit());
        this.output.printf(this.locale, "              mean = %2.2f %s%n", this.convertDuration(snapshot.getMean()), this.getDurationUnit());
        this.output.printf(this.locale, "            stddev = %2.2f %s%n", this.convertDuration(snapshot.getStdDev()), this.getDurationUnit());
        this.output.printf(this.locale, "            median = %2.2f %s%n", this.convertDuration(snapshot.getMedian()), this.getDurationUnit());
        this.output.printf(this.locale, "              75%% <= %2.2f %s%n", this.convertDuration(snapshot.get75thPercentile()), this.getDurationUnit());
        this.output.printf(this.locale, "              95%% <= %2.2f %s%n", this.convertDuration(snapshot.get95thPercentile()), this.getDurationUnit());
        this.output.printf(this.locale, "              98%% <= %2.2f %s%n", this.convertDuration(snapshot.get98thPercentile()), this.getDurationUnit());
        this.output.printf(this.locale, "              99%% <= %2.2f %s%n", this.convertDuration(snapshot.get99thPercentile()), this.getDurationUnit());
        this.output.printf(this.locale, "            99.9%% <= %2.2f %s%n", this.convertDuration(snapshot.get999thPercentile()), this.getDurationUnit());
    }
    
    private void printWithBanner(final String s, final char c) {
        this.output.print(s);
        this.output.print(' ');
        for (int i = 0; i < 80 - s.length() - 1; ++i) {
            this.output.print(c);
        }
        this.output.println();
    }
    
    public void report(final SortedMap<String, Gauge> sortedMap, final SortedMap<String, Counter> sortedMap2, final SortedMap<String, Histogram> sortedMap3, final SortedMap<String, Meter> sortedMap4, final SortedMap<String, Timer> sortedMap5) {
        this.printWithBanner(this.dateFormat.format(new Date(this.clock.getTime())), '=');
        this.output.println();
        if (!sortedMap.isEmpty()) {
            this.printWithBanner("-- Gauges", '-');
            for (final Map.Entry<String, Gauge> entry : sortedMap.entrySet()) {
                this.output.println(entry.getKey());
                this.printGauge(entry);
            }
            this.output.println();
        }
        if (!sortedMap2.isEmpty()) {
            this.printWithBanner("-- Counters", '-');
            for (final Map.Entry<String, Counter> entry2 : sortedMap2.entrySet()) {
                this.output.println(entry2.getKey());
                this.printCounter(entry2);
            }
            this.output.println();
        }
        if (!sortedMap3.isEmpty()) {
            this.printWithBanner("-- Histograms", '-');
            for (final Map.Entry<String, V> entry3 : sortedMap3.entrySet()) {
                this.output.println(entry3.getKey());
                this.printHistogram((Histogram)entry3.getValue());
            }
            this.output.println();
        }
        if (!sortedMap4.isEmpty()) {
            this.printWithBanner("-- Meters", '-');
            for (final Map.Entry<String, V> entry4 : sortedMap4.entrySet()) {
                this.output.println(entry4.getKey());
                this.printMeter((Meter)entry4.getValue());
            }
            this.output.println();
        }
        if (!sortedMap5.isEmpty()) {
            this.printWithBanner("-- Timers", '-');
            for (final Map.Entry<String, V> entry5 : sortedMap5.entrySet()) {
                this.output.println(entry5.getKey());
                this.printTimer((Timer)entry5.getValue());
            }
            this.output.println();
        }
        this.output.println();
        this.output.flush();
    }
}
