// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMediaResponse extends fih<ezg>
{
    @JsonField
    public long a;
    
    public final Object s() {
        return new ezg(this.a);
    }
}
