// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.channels;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPinnedList extends tih<wek>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        return new wek(this.a, this.b);
    }
}
