// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonPasswordStrength extends tih<ozj>
{
    @JsonField(name = { "pass" })
    public boolean a;
    @JsonField(name = { "message" })
    public String b;
    
    @Override
    public final Object s() {
        return new ozj(this.a);
    }
}
