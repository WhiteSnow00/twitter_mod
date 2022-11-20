// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.explore;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonExploreLocation extends fih<uja>
{
    @JsonField
    public String a;
    @JsonField(name = { "place_id" })
    public String b;
    @JsonField(name = { "location_type" }, typeConverter = tee.class)
    public int c;
    
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final uja t() {
        final uja$a uja$a = new uja$a();
        uja$a.a = this.a;
        uja$a.b = this.b;
        return (uja)((n4j)uja$a).e();
    }
    
    @JsonObject
    public static class JsonTwitterLocationPlaceLocationType extends qfe
    {
        @JsonField(name = { "original_name" }, typeConverter = tee.class)
        public int a;
    }
}
