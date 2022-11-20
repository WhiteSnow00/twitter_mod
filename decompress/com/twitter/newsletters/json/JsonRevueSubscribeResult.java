// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRevueSubscribeResult extends fih<nwm>
{
    @JsonField(name = { "revue_account_id" })
    public String a;
    @JsonField(name = { "subscription_status" }, typeConverter = oie.class)
    public aor b;
    
    public final Object s() {
        return new nwm(this.a, this.b);
    }
}
