// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.account;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonPhoneNumberAvailability extends tih<cck>
{
    @JsonField
    public boolean a;
    @JsonField
    public boolean b;
    
    @Override
    public final Object s() {
        return new cck(this.a, this.b);
    }
}
