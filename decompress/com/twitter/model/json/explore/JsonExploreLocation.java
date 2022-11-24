// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.explore;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonExploreLocation extends tih<ala>
{
    @JsonField
    public String a;
    @JsonField(name = { "place_id" })
    public String b;
    @JsonField(name = { "location_type" }, typeConverter = rfe.class)
    public int c;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final ala t() {
        final ala$a ala$a = new ala$a();
        ala$a.a = this.a;
        ala$a.b = this.b;
        return (ala)((z4j)ala$a).e();
    }
}
