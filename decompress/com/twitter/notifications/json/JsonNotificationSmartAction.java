// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationSmartAction extends fih<fvi>
{
    @JsonField(name = { "notification_action" })
    public String a;
    @JsonField(name = { "action_details" })
    public gvi b;
    @JsonField(name = { "score" })
    public String c;
    
    public final Object s() {
        final String a = this.a;
        final gvi b = this.b;
        String c;
        if ((c = this.c) == null) {
            c = "-1";
        }
        return new fvi(a, b, Double.parseDouble(c));
    }
}
