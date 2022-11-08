// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUnhydratedTweetAttachedTopicFollowPrompt extends aih<d6t>
{
    @JsonField
    public xwm a;
    @JsonField
    public zcu b;
    @JsonField
    public qzo c;
    @JsonField
    public cvs d;
    
    @Override
    public final Object s() {
        final xwm a = this.a;
        Object o;
        if (a == null) {
            zi.A("A JsonTweetAttachedTopicFollowPrompt must have a non-null description");
            o = null;
        }
        else {
            final d6t.a a2 = new d6t.a();
            a2.a = (xwm<xes>)a;
            a2.b = this.b;
            a2.c = this.c;
            a2.d = this.d;
            o = a2.e();
        }
        return o;
    }
}
