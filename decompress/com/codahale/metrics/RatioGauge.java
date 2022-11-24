// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

public abstract class RatioGauge implements Gauge<Double>
{
    public abstract RatioGauge.RatioGauge$Ratio getRatio();
    
    public Double getValue() {
        return this.getRatio().getValue();
    }
    
    public /* bridge */ Object getValue() {
        return this.getValue();
    }
}
