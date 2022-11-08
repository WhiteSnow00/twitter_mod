// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineRichFeedbackBehaviorReportTweet extends lhh<k2t>
{
    @JsonField(name = { "entryID" })
    public long a;
    
    @Override
    public final h4j t() {
        final k2t$a k2t$a = new k2t$a();
        k2t$a.a = this.a;
        return (h4j)k2t$a;
    }
}
