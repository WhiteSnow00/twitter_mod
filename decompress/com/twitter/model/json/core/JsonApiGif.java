// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonApiGif extends tih<jf0>
{
    @JsonField
    public String a;
    @JsonField
    public ne0 b;
    @JsonField
    public pf0 c;
    @JsonField
    public List<a3h> d;
    
    @Override
    public final Object s() {
        return new jf0(this.a, this.b, this.c, (List)this.d);
    }
}
