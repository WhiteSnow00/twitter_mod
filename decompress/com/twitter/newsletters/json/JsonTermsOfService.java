// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonTermsOfService extends nge
{
    @JsonField(name = { "terms_of_service_url" })
    public String a;
    @JsonField(name = { "privacy_policy_url" })
    public String b;
}
