// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.timeline.urt;

import com.twitter.api.model.json.core.GraphqlJsonTwitterUser;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineRichFeedbackBehaviorBlockUser extends lhh<g2t>
{
    @JsonField
    public long a;
    @JsonField
    public GraphqlJsonTwitterUser b;
    
    @Override
    public final h4j t() {
        final GraphqlJsonTwitterUser b = this.b;
        g2t.a a;
        if (b != null) {
            a = new g2t.a();
            a.a = b.a;
        }
        else {
            a = new g2t.a();
            a.a = this.a;
        }
        return a;
    }
}
