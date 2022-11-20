// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import com.bluelinelabs.logansquare.annotation.JsonField;
import tv.periscope.model.b;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonGraphQlGetBroadcastsResponse extends fih<j1c>
{
    @JsonField
    public List<b> a;
    
    public final Object s() {
        Object o;
        if (this.a != null) {
            final Map a = xth.a(0);
            for (final b b : this.a) {
                ((HashMap<String, ynj>)a).put(b.w(), new ynj((Object)b));
            }
            o = new j1c(a, xth.a(0));
        }
        else {
            o = null;
        }
        return o;
    }
}
