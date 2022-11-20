// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.explore;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonExploreSettingsResponse extends fih<xka>
{
    @JsonField(name = { "use_personalized_trends" })
    public boolean a;
    @JsonField(name = { "use_current_location" })
    public boolean b;
    @JsonField(name = { "places" })
    public List<JsonPlaces> c;
    @JsonField(name = { "is_unified_trends" })
    public boolean d;
    
    public final Object s() {
        final ArrayList c = this.c;
        String a;
        if (c != null && !c.isEmpty()) {
            a = this.c.get(0).a;
        }
        else {
            a = "0";
        }
        final ArrayList c2 = this.c;
        String b;
        if (c2 != null && !c2.isEmpty()) {
            b = this.c.get(0).b;
        }
        else {
            b = "";
        }
        final xka$a xka$a = new xka$a();
        xka$a.d = this.a;
        xka$a.a = this.b;
        xka$a.b = a;
        xka$a.c = b;
        return ((n4j)xka$a).e();
    }
    
    @JsonObject
    public static class JsonPlaces extends qfe
    {
        @JsonField(name = { "place_id" })
        public String a;
        @JsonField(name = { "name" })
        public String b;
    }
}
