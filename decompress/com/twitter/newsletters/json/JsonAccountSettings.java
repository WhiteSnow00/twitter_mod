// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonAccountSettings extends nge
{
    @JsonField(name = { "twitter_profile_subscriptions_enabled" })
    public boolean a;
}
