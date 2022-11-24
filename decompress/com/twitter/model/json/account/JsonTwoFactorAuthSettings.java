// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.FIELD_NAME)
public class JsonTwoFactorAuthSettings extends tih<yhv>
{
    @JsonField(name = { "twoFactorAuthEnabled" })
    public boolean a;
    @JsonField(name = { "methods" })
    public List<xhv> b;
    @JsonField(name = { "isOldPushUser" })
    public boolean c;
    
    @Override
    public final Object s() {
        return new yhv(this.a, this.c, (List)this.b);
    }
}
