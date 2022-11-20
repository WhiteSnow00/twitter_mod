// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.sru;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSruError extends fih<v4r>
{
    @JsonField
    public int a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    public final Object s() {
        return new v4r(this.a, this.b, this.c);
    }
}
