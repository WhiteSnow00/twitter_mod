// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonSmsVerifyCompleteResponse extends nge
{
    @JsonField(name = { "is_valid" })
    public boolean a;
    @JsonField(name = { "phone_number" })
    public String b;
}
