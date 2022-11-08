// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonGuestToken extends aih<lac>
{
    @JsonField
    public String a;
    
    @Override
    public final Object s() {
        final String a = this.a;
        lac lac;
        if (a != null) {
            lac = new lac(a);
        }
        else {
            lac = null;
        }
        return lac;
    }
}
