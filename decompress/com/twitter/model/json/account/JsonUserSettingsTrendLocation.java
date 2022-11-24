// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserSettingsTrendLocation extends tih<ojw.c>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    
    public JsonUserSettingsTrendLocation() {
        this.a = 1L;
    }
    
    @Override
    public final Object s() {
        return new ojw.c(this.a, this.b);
    }
}
