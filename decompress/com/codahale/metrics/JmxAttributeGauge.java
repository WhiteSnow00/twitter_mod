// 
// Decompiled by Procyon v0.6.0
// 

package com.codahale.metrics;

import javax.management.JMException;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import javax.management.ObjectName;
import javax.management.MBeanServerConnection;

public class JmxAttributeGauge implements Gauge<Object>
{
    private final String attributeName;
    private final MBeanServerConnection mBeanServerConn;
    private final ObjectName objectName;
    
    public JmxAttributeGauge(final MBeanServerConnection mBeanServerConn, final ObjectName objectName, final String attributeName) {
        this.mBeanServerConn = mBeanServerConn;
        this.objectName = objectName;
        this.attributeName = attributeName;
    }
    
    public JmxAttributeGauge(final ObjectName objectName, final String s) {
        this(ManagementFactory.getPlatformMBeanServer(), objectName, s);
    }
    
    public Object getValue() {
        Object attribute = null;
        try {
            attribute = this.mBeanServerConn.getAttribute(this.objectName, this.attributeName);
            return attribute;
        }
        catch (final IOException | JMException ex) {
            return attribute;
        }
    }
}
