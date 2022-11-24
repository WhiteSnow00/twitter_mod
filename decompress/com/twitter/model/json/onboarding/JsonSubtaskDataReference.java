// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSubtaskDataReference extends tih<ttr>
{
    public static final Map<String, Integer> c;
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    static {
        final kkg t = kkg.t();
        t.w((Object)"phone_number", (Object)1);
        t.w((Object)"email", (Object)4);
        final Integer value = 3;
        t.w((Object)"birthday", (Object)value);
        t.w((Object)"date", (Object)value);
        t.w((Object)"name", (Object)2);
        t.w((Object)"completed_follow_count", (Object)5);
        t.w((Object)"is_ready", (Object)6);
        t.w((Object)"selected_image", (Object)7);
        t.w((Object)"country_code", (Object)8);
        t.w((Object)"topic_follow_count", (Object)9);
        c = (Map)((z4j)t).e();
    }
    
    @Override
    public final Object s() {
        final Integer n = JsonSubtaskDataReference.c.get(this.b);
        Object o;
        if (n == null) {
            o = null;
        }
        else {
            o = new ttr(this.a, n);
        }
        return o;
    }
}
