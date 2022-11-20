// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profilemodules.json.newsletters;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonRevueAccount extends qfe
{
    @JsonField(name = { "newsletter_info" })
    public gwm a;
    @JsonField(name = { "account_settings" })
    public JsonAccountSettings b;
    @JsonField(name = { "profile_info" })
    public iwm c;
}
