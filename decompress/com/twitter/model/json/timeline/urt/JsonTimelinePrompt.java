// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelinePrompt extends aih<t0t>
{
    @JsonField(name = { "content" }, typeConverter = c1t.class)
    public u0t a;
    @JsonField(name = { "clientEventInfo" })
    public qzo b;
    
    @Override
    public final Object s() {
        final u0t a = this.a;
        t0t t0t;
        if (a != null) {
            t0t = new t0t(a, this.b);
        }
        else {
            t0t = null;
        }
        return t0t;
    }
    
    @JsonObject
    public static class JsonTimelinePromptContent extends aih<u0t>
    {
        @JsonField(name = { "relevancePrompt" })
        public s1t a;
        @JsonField(name = { "onboardingLikesStartPrompt" })
        public mkj b;
        
        @Override
        public final Object s() {
            Object o = this.a;
            if (o == null) {
                o = this.b;
                if (o == null) {
                    o = null;
                }
            }
            return o;
        }
    }
}
