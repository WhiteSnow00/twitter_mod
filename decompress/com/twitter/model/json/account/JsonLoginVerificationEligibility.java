// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLoginVerificationEligibility extends tih<lfg>
{
    @JsonField(name = { "enrolled" })
    public String a;
    @JsonField(name = { "enrolled_elsewhere" })
    public boolean b;
    
    @Override
    public final Object s() {
        return new lfg(this.a, this.b);
    }
}
