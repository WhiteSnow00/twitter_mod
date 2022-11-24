// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonGetPlacesResponse extends tih<t2c>
{
    @JsonField(name = { "autotag_place_id" })
    public String a;
    @JsonField(name = { "geo_search_request_id" })
    public String b;
    @JsonField(name = { "attributions" })
    public List<mgk> c;
    @JsonField
    public List<JsonGetPlacesResponse.JsonGetPlacesResponse$JsonTwitterPlaceWrapper> d;
    
    @Override
    public final Object s() {
        return new t2c(this.a, new t5e((Iterable)this.d, (lub)com.twitter.model.json.geo.a.a).t3(), this.b, (List)this.c);
    }
}
