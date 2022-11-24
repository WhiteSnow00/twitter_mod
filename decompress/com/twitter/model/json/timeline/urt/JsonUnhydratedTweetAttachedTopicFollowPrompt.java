// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUnhydratedTweetAttachedTopicFollowPrompt extends tih<p7t>
{
    @JsonField
    public fym a;
    @JsonField
    public feu b;
    @JsonField
    public b1p c;
    @JsonField
    public kws d;
    
    @Override
    public final Object s() {
        final fym a = this.a;
        Object o;
        if (a == null) {
            c0e.i("A JsonTweetAttachedTopicFollowPrompt must have a non-null description");
            o = null;
        }
        else {
            final p7t$a p7t$a = new p7t$a();
            p7t$a.a = a;
            p7t$a.b = this.b;
            p7t$a.c = this.c;
            p7t$a.d = this.d;
            o = ((z4j)p7t$a).e();
        }
        return o;
    }
}
