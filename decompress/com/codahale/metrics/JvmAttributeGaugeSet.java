// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

import java.util.Collections;
import java.util.Locale;
import java.util.HashMap;
import java.util.Map;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class JvmAttributeGaugeSet implements MetricSet
{
    private final RuntimeMXBean runtime;
    
    public JvmAttributeGaugeSet() {
        this(ManagementFactory.getRuntimeMXBean());
    }
    
    public JvmAttributeGaugeSet(final RuntimeMXBean runtime) {
        this.runtime = runtime;
    }
    
    public static /* synthetic */ RuntimeMXBean access$000(final JvmAttributeGaugeSet set) {
        return set.runtime;
    }
    
    public Map<String, Metric> getMetrics() {
        final HashMap hashMap = new HashMap();
        hashMap.put("name", new Gauge<String>() {
            public String getValue() {
                return JvmAttributeGaugeSet.access$000(JvmAttributeGaugeSet.this).getName();
            }
        });
        hashMap.put("vendor", new Gauge<String>() {
            public String getValue() {
                return String.format(Locale.US, "%s %s %s (%s)", JvmAttributeGaugeSet.access$000(JvmAttributeGaugeSet.this).getVmVendor(), JvmAttributeGaugeSet.access$000(JvmAttributeGaugeSet.this).getVmName(), JvmAttributeGaugeSet.access$000(JvmAttributeGaugeSet.this).getVmVersion(), JvmAttributeGaugeSet.access$000(JvmAttributeGaugeSet.this).getSpecVersion());
            }
        });
        hashMap.put("uptime", new Gauge<Long>() {
            public Long getValue() {
                return JvmAttributeGaugeSet.access$000(JvmAttributeGaugeSet.this).getUptime();
            }
        });
        return (Map<String, Metric>)Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
