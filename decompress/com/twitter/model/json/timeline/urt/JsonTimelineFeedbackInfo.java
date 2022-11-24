// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineFeedbackInfo extends tih<kws>
{
    @JsonField(name = { "feedbackKeys" })
    public List<String> a;
    @JsonField
    public String b;
    @JsonField
    public wva c;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a == null) {
            c0e.i("A JsonTimelineFeedbackInfo must have a non-null feedbackActionKeys");
            o = null;
        }
        else {
            o = new kws((List)this.a, this.b, this.c);
        }
        return o;
    }
    
    @JsonObject
    public static class JsonTimelineFeedbackDisplayContext extends tih<wva>
    {
        @JsonField
        public String a;
        
        @Override
        public final Object s() {
            Object o;
            if (flr.e((CharSequence)this.a)) {
                o = null;
            }
            else {
                o = new wva(this.a);
            }
            return o;
        }
    }
}
