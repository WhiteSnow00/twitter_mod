// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Meter implements Metered
{
    private static final long TICK_INTERVAL;
    private final Clock clock;
    private final LongAdder count;
    private final AtomicLong lastTick;
    private final EWMA m15Rate;
    private final EWMA m1Rate;
    private final EWMA m5Rate;
    private final long startTime;
    
    static {
        TICK_INTERVAL = TimeUnit.SECONDS.toNanos(5L);
    }
    
    public Meter() {
        this(Clock.defaultClock());
    }
    
    public Meter(final Clock clock) {
        this.m1Rate = EWMA.oneMinuteEWMA();
        this.m5Rate = EWMA.fiveMinuteEWMA();
        this.m15Rate = EWMA.fifteenMinuteEWMA();
        this.count = new LongAdder();
        this.clock = clock;
        final long tick = clock.getTick();
        this.startTime = tick;
        this.lastTick = new AtomicLong(tick);
    }
    
    private void tickIfNecessary() {
        final long value = this.lastTick.get();
        final long tick = this.clock.getTick();
        final long n = tick - value;
        final long tick_INTERVAL = Meter.TICK_INTERVAL;
        if (n > tick_INTERVAL && this.lastTick.compareAndSet(value, tick - n % tick_INTERVAL)) {
            for (long n2 = n / tick_INTERVAL, n3 = 0L; n3 < n2; ++n3) {
                this.m1Rate.tick();
                this.m5Rate.tick();
                this.m15Rate.tick();
            }
        }
    }
    
    public long getCount() {
        return this.count.sum();
    }
    
    public double getFifteenMinuteRate() {
        this.tickIfNecessary();
        return this.m15Rate.getRate(TimeUnit.SECONDS);
    }
    
    public double getFiveMinuteRate() {
        this.tickIfNecessary();
        return this.m5Rate.getRate(TimeUnit.SECONDS);
    }
    
    public double getMeanRate() {
        if (this.getCount() == 0L) {
            return 0.0;
        }
        return this.getCount() / (double)(this.clock.getTick() - this.startTime) * TimeUnit.SECONDS.toNanos(1L);
    }
    
    public double getOneMinuteRate() {
        this.tickIfNecessary();
        return this.m1Rate.getRate(TimeUnit.SECONDS);
    }
    
    public void mark() {
        this.mark(1L);
    }
    
    public void mark(final long n) {
        this.tickIfNecessary();
        this.count.add(n);
        this.m1Rate.update(n);
        this.m5Rate.update(n);
        this.m15Rate.update(n);
    }
}
