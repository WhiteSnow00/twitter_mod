// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.timeline.urt;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTimelineFeedbackInfo extends aih<cvs>
{
    @JsonField(name = { "feedbackKeys" })
    public List<String> a;
    @JsonField
    public String b;
    @JsonField
    public vva c;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a == null) {
            zi.A("A JsonTimelineFeedbackInfo must have a non-null feedbackActionKeys");
            o = null;
        }
        else {
            o = new cvs(this.a, this.b, this.c);
        }
        return o;
    }
    
    @JsonObject
    public static class JsonTimelineFeedbackDisplayContext extends aih<vva>
    {
        @JsonField
        public String a;
        
        @Override
        public final Object s() {
            Object o;
            if (pjr.e((CharSequence)this.a)) {
                o = null;
            }
            else {
                o = new vva(this.a);
            }
            return o;
        }
    }
}
