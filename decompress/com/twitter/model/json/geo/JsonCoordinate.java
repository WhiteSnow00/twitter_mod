// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCoordinate extends tih<jw6>
{
    @JsonField
    public double a;
    @JsonField
    public double b;
    
    @Override
    public final Object s() {
        return new jw6(this.a, this.b);
    }
}
