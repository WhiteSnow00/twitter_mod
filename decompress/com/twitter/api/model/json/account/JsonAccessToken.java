// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonAccessToken extends fih<mf>
{
    @JsonField
    public String a;
    
    public final Object s() {
        final String a = this.a;
        mf mf;
        if (a != null) {
            mf = new mf(a);
        }
        else {
            mf = null;
        }
        return mf;
    }
}
