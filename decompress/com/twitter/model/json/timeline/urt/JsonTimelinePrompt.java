// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelinePrompt extends tih<c2t>
{
    @JsonField(name = { "content" }, typeConverter = l2t.class)
    public d2t a;
    @JsonField(name = { "clientEventInfo" })
    public b1p b;
    
    @Override
    public final Object s() {
        final d2t a = this.a;
        c2t c2t;
        if (a != null) {
            c2t = new c2t(a, this.b);
        }
        else {
            c2t = null;
        }
        return c2t;
    }
    
    @JsonObject
    public static class JsonTimelinePromptContent extends tih<d2t>
    {
        @JsonField(name = { "relevancePrompt" })
        public c3t a;
        @JsonField(name = { "onboardingLikesStartPrompt" })
        public glj b;
        
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
