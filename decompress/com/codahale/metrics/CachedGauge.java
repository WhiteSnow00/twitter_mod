// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public abstract class CachedGauge<T> implements Gauge<T>
{
    private final Clock clock;
    private final AtomicLong reloadAt;
    private final long timeoutNS;
    private volatile T value;
    
    public CachedGauge(final long n, final TimeUnit timeUnit) {
        this(Clock.defaultClock(), n, timeUnit);
    }
    
    public CachedGauge(final Clock clock, final long n, final TimeUnit timeUnit) {
        this.clock = clock;
        this.reloadAt = new AtomicLong(0L);
        this.timeoutNS = timeUnit.toNanos(n);
    }
    
    private boolean shouldLoad() {
        long value;
        long tick;
        do {
            tick = this.clock.getTick();
            value = this.reloadAt.get();
            if (value > tick) {
                return false;
            }
        } while (!this.reloadAt.compareAndSet(value, tick + this.timeoutNS));
        return true;
    }
    
    public T getValue() {
        if (this.shouldLoad()) {
            this.value = this.loadValue();
        }
        return this.value;
    }
    
    public abstract T loadValue();
}
