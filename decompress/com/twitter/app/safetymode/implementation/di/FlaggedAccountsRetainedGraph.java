// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.safetymode.implementation.di;

import com.twitter.timeline.generic.view.GenericTimelineViewGraph;
import kotlin.Metadata;
import com.twitter.timeline.generic.retained.GenericTimelineRetainedGraph;

@d5j
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003\u00c0\u0006\u0003" }, d2 = { "Lcom/twitter/app/safetymode/implementation/di/FlaggedAccountsRetainedGraph;", "Lcom/twitter/timeline/generic/retained/GenericTimelineRetainedGraph;", "FlaggedAccountsViewGraph", "feature.tfa.safety-mode.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public interface FlaggedAccountsRetainedGraph extends GenericTimelineRetainedGraph
{
    @d5j
    @Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002\u00c0\u0006\u0003" }, d2 = { "Lcom/twitter/app/safetymode/implementation/di/FlaggedAccountsRetainedGraph$FlaggedAccountsViewGraph;", "Lcom/twitter/timeline/generic/view/GenericTimelineViewGraph;", "feature.tfa.safety-mode.implementation_release" }, k = 1, mv = { 1, 7, 1 })
    public interface FlaggedAccountsViewGraph extends GenericTimelineViewGraph
    {
    }
}
