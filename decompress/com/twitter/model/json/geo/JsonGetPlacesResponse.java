// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGetPlacesResponse extends fih<t1c>
{
    @JsonField(name = { "autotag_place_id" })
    public String a;
    @JsonField(name = { "geo_search_request_id" })
    public String b;
    @JsonField(name = { "attributions" })
    public List<zfk> c;
    @JsonField
    public List<JsonTwitterPlaceWrapper> d;
    
    public final Object s() {
        return new t1c(this.a, new r4e((Iterable)this.d, (jtb)com.twitter.model.json.geo.a.a).s3(), this.b, (List)this.c);
    }
    
    @JsonObject
    public static class JsonTwitterPlaceWrapper extends qfe
    {
        @JsonField(name = { "place" })
        public qev a;
    }
}
