// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonAccountSettings extends qfe
{
    @JsonField(name = { "twitter_profile_subscriptions_enabled" })
    public boolean a;
}
