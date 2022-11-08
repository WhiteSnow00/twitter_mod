// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.timeline.urt;

import com.twitter.api.model.json.core.GraphqlJsonTwitterUser;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineRichFeedbackBehaviorMuteUser extends lhh<n2t>
{
    @JsonField
    public long a;
    @JsonField
    public GraphqlJsonTwitterUser b;
    
    @Override
    public final h4j t() {
        final GraphqlJsonTwitterUser b = this.b;
        long a;
        if (b == null) {
            a = this.a;
        }
        else {
            a = b.a;
        }
        final n2t$a n2t$a = new n2t$a();
        n2t$a.a = a;
        return (h4j)n2t$a;
    }
}
