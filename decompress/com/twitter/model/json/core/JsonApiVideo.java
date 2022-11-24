// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonApiVideo extends tih<hi0>
{
    @JsonField
    public ne0 a;
    @JsonField
    public int b;
    @JsonField
    public pf0 c;
    @JsonField
    public List<a3h> d;
    @JsonField
    public String e;
    
    @Override
    public final Object s() {
        return new hi0(this.a, this.b, this.c, this.d, this.e);
    }
}
