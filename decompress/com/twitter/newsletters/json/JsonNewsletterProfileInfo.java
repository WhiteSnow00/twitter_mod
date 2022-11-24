// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.newsletters.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNewsletterProfileInfo extends nge
{
    @JsonField(name = { "newsletter_info" })
    public hhi a;
    @JsonField(name = { "account_settings" })
    public JsonAccountSettings b;
    @JsonField(name = { "profile_info" })
    public zwm c;
}
