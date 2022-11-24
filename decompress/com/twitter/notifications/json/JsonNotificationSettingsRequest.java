// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationSettingsRequest extends nge
{
    @JsonField
    public long a;
    @JsonField
    public long b;
    @JsonField
    public JsonUserDevicesRequest c;
    @JsonField
    public JsonUserDevicesRequest d;
}
