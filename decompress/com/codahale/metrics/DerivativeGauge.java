// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

public abstract class DerivativeGauge<F, T> implements Gauge<T>
{
    private final Gauge<F> base;
    
    public DerivativeGauge(final Gauge<F> base) {
        this.base = base;
    }
    
    public T getValue() {
        return this.transform(this.base.getValue());
    }
    
    public abstract T transform(final F p0);
}
