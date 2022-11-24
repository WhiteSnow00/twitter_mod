// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.FIELD_NAME)
public class JsonTwoFactorAuthMethod extends tih<xhv>
{
    @JsonField
    public long a;
    @JsonField
    public fiv b;
    @JsonField
    public List<div> c;
    
    @Override
    public final Object s() {
        final long a = this.a;
        if (a > 0L) {
            final fiv b = this.b;
            if (b != null) {
                return new xhv(a, b, (List)this.c);
            }
        }
        return null;
    }
}
