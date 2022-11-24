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
public class JsonGraphQlGetBroadcastsResponse extends tih<j2c>
{
    @JsonField
    public List<b> a;
    
    @Override
    public final Object s() {
        Object o;
        if (this.a != null) {
            final Map a = nuh.a(0);
            for (final b b : this.a) {
                ((HashMap<String, noj>)a).put(b.w(), new noj((Object)b));
            }
            o = new j2c(a, nuh.a(0));
        }
        else {
            o = null;
        }
        return o;
    }
}
