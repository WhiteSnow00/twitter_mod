// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.service.core.diagnostics;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003" }, d2 = { "Lcom/twitter/analytics/service/core/diagnostics/AnalyticsPipelineDataLossException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "lib.core.analytics.service.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public abstract class AnalyticsPipelineDataLossException extends RuntimeException
{
    public final String D0;
    public final uro E0;
    
    public AnalyticsPipelineDataLossException(final String d0, final uro e0) {
        czd.f((Object)e0, "sampler");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final String getMessage() {
        return this.D0;
    }
}
