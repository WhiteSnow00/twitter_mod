// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTemporaryAppPwRequest extends tih<ses>
{
    @JsonField(name = { "temporary_password" })
    public String a;
    
    @Override
    public final Object s() {
        return new ses(this.a);
    }
}
