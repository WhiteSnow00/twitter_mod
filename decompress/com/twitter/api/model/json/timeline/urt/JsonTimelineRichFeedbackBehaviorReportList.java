// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.timeline.urt;

import com.twitter.api.model.json.core.GraphqlJsonTwitterUser;
import com.twitter.model.json.core.JsonTwitterList;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineRichFeedbackBehaviorReportList extends lhh<j2t>
{
    @JsonField
    public long a;
    @JsonField
    public long b;
    @JsonField
    public JsonTwitterList c;
    @JsonField
    public GraphqlJsonTwitterUser d;
    
    @Override
    public final h4j t() {
        final JsonTwitterList c = this.c;
        if (c != null) {
            final GraphqlJsonTwitterUser d = this.d;
            if (d != null) {
                final j2t$a j2t$a = new j2t$a();
                j2t$a.a = c.c;
                j2t$a.b = d.a;
                return (h4j)j2t$a;
            }
        }
        final j2t$a j2t$a = new j2t$a();
        j2t$a.a = this.a;
        j2t$a.b = this.b;
        return (h4j)j2t$a;
    }
}
