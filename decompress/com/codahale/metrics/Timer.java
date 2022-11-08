// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;

public class Timer implements Metered, Sampling
{
    private final Clock clock;
    private final Histogram histogram;
    private final Meter meter;
    
    public Timer() {
        this((Reservoir)new ExponentiallyDecayingReservoir());
    }
    
    public Timer(final Reservoir reservoir) {
        this(reservoir, Clock.defaultClock());
    }
    
    public Timer(final Reservoir reservoir, final Clock clock) {
        this.meter = new Meter(clock);
        this.clock = clock;
        this.histogram = new Histogram(reservoir);
    }
    
    private void update(final long n) {
        if (n >= 0L) {
            this.histogram.update(n);
            this.meter.mark();
        }
    }
    
    public long getCount() {
        return this.histogram.getCount();
    }
    
    public double getFifteenMinuteRate() {
        return this.meter.getFifteenMinuteRate();
    }
    
    public double getFiveMinuteRate() {
        return this.meter.getFiveMinuteRate();
    }
    
    public double getMeanRate() {
        return this.meter.getMeanRate();
    }
    
    public double getOneMinuteRate() {
        return this.meter.getOneMinuteRate();
    }
    
    public Snapshot getSnapshot() {
        return this.histogram.getSnapshot();
    }
    
    public Timer.Timer$Context time() {
        return new Timer.Timer$Context(this, this.clock, (Timer$1)null);
    }
    
    public <T> T time(final Callable<T> callable) throws Exception {
        final long tick = this.clock.getTick();
        try {
            return callable.call();
        }
        finally {
            this.update(this.clock.getTick() - tick);
        }
    }
    
    public void update(final long n, final TimeUnit timeUnit) {
        this.update(timeUnit.toNanos(n));
    }
}
