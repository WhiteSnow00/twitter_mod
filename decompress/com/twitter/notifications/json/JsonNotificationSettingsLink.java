// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.twitter.model.notification.NotificationSettingsLink$a;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.notification.NotificationSettingsLink;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationSettingsLink extends eih<NotificationSettingsLink>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    
    public final z4j t() {
        final NotificationSettingsLink$a notificationSettingsLink$a = new NotificationSettingsLink$a();
        final String a = this.a;
        e0e.f((Object)a, "text");
        notificationSettingsLink$a.a = a;
        final String b = this.b;
        e0e.f((Object)b, "type");
        notificationSettingsLink$a.b = b;
        final String c = this.c;
        e0e.f((Object)c, "uri");
        notificationSettingsLink$a.c = c;
        final String d = this.d;
        e0e.f((Object)d, "scribeComponent");
        notificationSettingsLink$a.d = d;
        return (z4j)notificationSettingsLink$a;
    }
}
