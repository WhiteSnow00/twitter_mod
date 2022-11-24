// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.card;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserValue extends tih<jlw>
{
    @JsonField
    public String a;
    
    @Override
    public final Object s() {
        return new jlw(this.a);
    }
}
