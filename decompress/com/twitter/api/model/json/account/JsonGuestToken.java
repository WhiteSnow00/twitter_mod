// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonGuestToken extends fih<l9c>
{
    @JsonField
    public String a;
    
    public final Object s() {
        final String a = this.a;
        l9c l9c;
        if (a != null) {
            l9c = new l9c(a);
        }
        else {
            l9c = null;
        }
        return l9c;
    }
}
