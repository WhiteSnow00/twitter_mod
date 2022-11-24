// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonUserPhoneNumber extends tih<jgw>
{
    @JsonField(name = { "phone_number" })
    public String a;
    @JsonField(name = { "phone_number_verified" })
    public boolean b;
    
    @Override
    public final Object s() {
        return new jgw(this.a, Boolean.valueOf(this.b));
    }
}
