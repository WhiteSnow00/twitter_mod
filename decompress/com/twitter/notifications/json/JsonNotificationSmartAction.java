// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationSmartAction extends tih<wvi>
{
    @JsonField(name = { "notification_action" })
    public String a;
    @JsonField(name = { "action_details" })
    public xvi b;
    @JsonField(name = { "score" })
    public String c;
    
    @Override
    public final Object s() {
        final String a = this.a;
        final xvi b = this.b;
        String c;
        if ((c = this.c) == null) {
            c = "-1";
        }
        return new wvi(a, b, Double.parseDouble(c));
    }
}
