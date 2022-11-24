// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.sru;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSruError extends tih<u5r>
{
    @JsonField
    public int a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        return new u5r(this.a, this.b, this.c);
    }
}
