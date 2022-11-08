// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

import java.util.Collection;
import java.util.TreeSet;
import java.util.SortedSet;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentMap;
import java.util.List;

public class MetricRegistry implements MetricSet
{
    private final List<MetricRegistryListener> listeners;
    private final ConcurrentMap<String, Metric> metrics;
    
    public MetricRegistry() {
        this.metrics = this.buildMap();
        this.listeners = new CopyOnWriteArrayList<MetricRegistryListener>();
    }
    
    private static void append(final StringBuilder sb, final String s) {
        if (s != null && !s.isEmpty()) {
            if (sb.length() > 0) {
                sb.append('.');
            }
            sb.append(s);
        }
    }
    
    private <T extends Metric> SortedMap<String, T> getMetrics(final Class<T> clazz, final MetricFilter metricFilter) {
        final TreeMap treeMap = new TreeMap();
        for (final Map.Entry<K, Object> entry : this.metrics.entrySet()) {
            if (clazz.isInstance(entry.getValue()) && metricFilter.matches((String)entry.getKey(), (Metric)entry.getValue())) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (SortedMap<String, T>)Collections.unmodifiableSortedMap((SortedMap<String, ?>)treeMap);
    }
    
    private <T extends Metric> T getOrAdd(final String s, final MetricRegistry.MetricRegistry$MetricBuilder<T> metricRegistry$MetricBuilder) {
        final Metric metric = this.metrics.get(s);
        if (metricRegistry$MetricBuilder.isInstance(metric)) {
            return (T)metric;
        }
        if (metric == null) {
            try {
                return this.register(s, metricRegistry$MetricBuilder.newMetric());
            }
            catch (final IllegalArgumentException ex) {
                final Metric metric2 = this.metrics.get(s);
                if (metricRegistry$MetricBuilder.isInstance(metric2)) {
                    return (T)metric2;
                }
            }
        }
        throw new IllegalArgumentException(l7k.c(s, " is already used for a different type of metric"));
    }
    
    public static String name(final Class<?> clazz, final String... array) {
        return name(clazz.getName(), array);
    }
    
    public static String name(final String s, final String... array) {
        final StringBuilder sb = new StringBuilder();
        append(sb, s);
        if (array != null) {
            for (int length = array.length, i = 0; i < length; ++i) {
                append(sb, array[i]);
            }
        }
        return sb.toString();
    }
    
    private void notifyListenerOfAddedMetric(final MetricRegistryListener metricRegistryListener, final Metric metric, final String s) {
        if (metric instanceof Gauge) {
            metricRegistryListener.onGaugeAdded(s, (Gauge)metric);
        }
        else if (metric instanceof Counter) {
            metricRegistryListener.onCounterAdded(s, (Counter)metric);
        }
        else if (metric instanceof Histogram) {
            metricRegistryListener.onHistogramAdded(s, (Histogram)metric);
        }
        else if (metric instanceof Meter) {
            metricRegistryListener.onMeterAdded(s, (Meter)metric);
        }
        else {
            if (!(metric instanceof Timer)) {
                final StringBuilder g = w48.g("Unknown metric type: ");
                g.append(metric.getClass());
                throw new IllegalArgumentException(g.toString());
            }
            metricRegistryListener.onTimerAdded(s, (Timer)metric);
        }
    }
    
    private void notifyListenerOfRemovedMetric(final String s, final Metric metric, final MetricRegistryListener metricRegistryListener) {
        if (metric instanceof Gauge) {
            metricRegistryListener.onGaugeRemoved(s);
        }
        else if (metric instanceof Counter) {
            metricRegistryListener.onCounterRemoved(s);
        }
        else if (metric instanceof Histogram) {
            metricRegistryListener.onHistogramRemoved(s);
        }
        else if (metric instanceof Meter) {
            metricRegistryListener.onMeterRemoved(s);
        }
        else {
            if (!(metric instanceof Timer)) {
                final StringBuilder g = w48.g("Unknown metric type: ");
                g.append(metric.getClass());
                throw new IllegalArgumentException(g.toString());
            }
            metricRegistryListener.onTimerRemoved(s);
        }
    }
    
    private void onMetricAdded(final String s, final Metric metric) {
        final Iterator<MetricRegistryListener> iterator = this.listeners.iterator();
        while (iterator.hasNext()) {
            this.notifyListenerOfAddedMetric(iterator.next(), metric, s);
        }
    }
    
    private void onMetricRemoved(final String s, final Metric metric) {
        final Iterator<MetricRegistryListener> iterator = this.listeners.iterator();
        while (iterator.hasNext()) {
            this.notifyListenerOfRemovedMetric(s, metric, iterator.next());
        }
    }
    
    private void registerAll(final String s, final MetricSet set) throws IllegalArgumentException {
        for (final Map.Entry<String, V> entry : set.getMetrics().entrySet()) {
            if (entry.getValue() instanceof MetricSet) {
                this.registerAll(name(s, entry.getKey()), (MetricSet)entry.getValue());
            }
            else {
                this.register(name(s, entry.getKey()), (Metric)entry.getValue());
            }
        }
    }
    
    public void addListener(final MetricRegistryListener metricRegistryListener) {
        this.listeners.add(metricRegistryListener);
        for (final Map.Entry entry : this.metrics.entrySet()) {
            this.notifyListenerOfAddedMetric(metricRegistryListener, (Metric)entry.getValue(), (String)entry.getKey());
        }
    }
    
    public ConcurrentMap<String, Metric> buildMap() {
        return (ConcurrentMap<String, Metric>)new ConcurrentHashMap();
    }
    
    public Counter counter(final String s) {
        return this.getOrAdd(s, (MetricRegistry.MetricRegistry$MetricBuilder<Counter>)MetricRegistry.MetricRegistry$MetricBuilder.COUNTERS);
    }
    
    public SortedMap<String, Counter> getCounters() {
        return this.getCounters(MetricFilter.ALL);
    }
    
    public SortedMap<String, Counter> getCounters(final MetricFilter metricFilter) {
        return this.getMetrics(Counter.class, metricFilter);
    }
    
    public SortedMap<String, Gauge> getGauges() {
        return this.getGauges(MetricFilter.ALL);
    }
    
    public SortedMap<String, Gauge> getGauges(final MetricFilter metricFilter) {
        return this.getMetrics(Gauge.class, metricFilter);
    }
    
    public SortedMap<String, Histogram> getHistograms() {
        return this.getHistograms(MetricFilter.ALL);
    }
    
    public SortedMap<String, Histogram> getHistograms(final MetricFilter metricFilter) {
        return this.getMetrics(Histogram.class, metricFilter);
    }
    
    public SortedMap<String, Meter> getMeters() {
        return this.getMeters(MetricFilter.ALL);
    }
    
    public SortedMap<String, Meter> getMeters(final MetricFilter metricFilter) {
        return this.getMetrics(Meter.class, metricFilter);
    }
    
    public Map<String, Metric> getMetrics() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends Metric>)this.metrics);
    }
    
    public SortedSet<String> getNames() {
        return Collections.unmodifiableSortedSet(new TreeSet<String>((Collection<? extends String>)this.metrics.keySet()));
    }
    
    public SortedMap<String, Timer> getTimers() {
        return this.getTimers(MetricFilter.ALL);
    }
    
    public SortedMap<String, Timer> getTimers(final MetricFilter metricFilter) {
        return this.getMetrics(Timer.class, metricFilter);
    }
    
    public Histogram histogram(final String s) {
        return this.getOrAdd(s, (MetricRegistry.MetricRegistry$MetricBuilder<Histogram>)MetricRegistry.MetricRegistry$MetricBuilder.HISTOGRAMS);
    }
    
    public Meter meter(final String s) {
        return this.getOrAdd(s, (MetricRegistry.MetricRegistry$MetricBuilder<Meter>)MetricRegistry.MetricRegistry$MetricBuilder.METERS);
    }
    
    public <T extends Metric> T register(final String s, final T t) throws IllegalArgumentException {
        if (t instanceof MetricSet) {
            this.registerAll(s, (MetricSet)t);
        }
        else {
            if (this.metrics.putIfAbsent(s, t) != null) {
                throw new IllegalArgumentException(zi.y("A metric named ", s, " already exists"));
            }
            this.onMetricAdded(s, t);
        }
        return t;
    }
    
    public void registerAll(final MetricSet set) throws IllegalArgumentException {
        this.registerAll(null, set);
    }
    
    public boolean remove(final String s) {
        final Metric metric = this.metrics.remove(s);
        if (metric != null) {
            this.onMetricRemoved(s, metric);
            return true;
        }
        return false;
    }
    
    public void removeListener(final MetricRegistryListener metricRegistryListener) {
        this.listeners.remove(metricRegistryListener);
    }
    
    public void removeMatching(final MetricFilter metricFilter) {
        for (final Map.Entry<String, V> entry : this.metrics.entrySet()) {
            if (metricFilter.matches((String)entry.getKey(), (Metric)entry.getValue())) {
                this.remove(entry.getKey());
            }
        }
    }
    
    public Timer timer(final String s) {
        return this.getOrAdd(s, (MetricRegistry.MetricRegistry$MetricBuilder<Timer>)MetricRegistry.MetricRegistry$MetricBuilder.TIMERS);
    }
}
