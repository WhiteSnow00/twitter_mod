// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.service.core.diagnostics;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/twitter/analytics/service/core/diagnostics/CEDataLossDeletedOnMaxShelfLifeException;", "Lcom/twitter/analytics/service/core/diagnostics/AnalyticsPipelineDataLossException;", "<init>", "()V", "Companion", "a", "lib.core.analytics.service.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class CEDataLossDeletedOnMaxShelfLifeException extends AnalyticsPipelineDataLossException
{
    public static final CEDataLossDeletedOnMaxShelfLifeException.CEDataLossDeletedOnMaxShelfLifeException$a Companion;
    public static final cro E0;
    
    static {
        Companion = new CEDataLossDeletedOnMaxShelfLifeException.CEDataLossDeletedOnMaxShelfLifeException$a();
        E0 = cro.d;
    }
    
    public CEDataLossDeletedOnMaxShelfLifeException() {
        super("ClientEvent logs deleted on max shelf life.", CEDataLossDeletedOnMaxShelfLifeException.E0);
    }
}
