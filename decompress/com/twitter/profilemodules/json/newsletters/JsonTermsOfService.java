// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTermsOfService extends qfe
{
    @JsonField(name = { "terms_of_service_url" })
    public String a;
    @JsonField(name = { "privacy_policy_url" })
    public String b;
}
