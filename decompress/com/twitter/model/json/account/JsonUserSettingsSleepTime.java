// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserSettingsSleepTime extends tih<ojw.b>
{
    @JsonField
    public boolean a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    
    @Override
    public final Object s() {
        return new ojw.b(this.a, this.b, this.c);
    }
}
