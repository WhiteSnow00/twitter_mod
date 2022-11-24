// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.FIELD_NAME)
public class JsonCursorTimestamp extends tih<ma7>
{
    @JsonField
    public long a;
    
    @Override
    public final Object s() {
        return new ma7();
    }
}
