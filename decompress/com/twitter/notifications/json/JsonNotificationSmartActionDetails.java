// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject
public class JsonNotificationSmartActionDetails extends tih<xvi>
{
    @JsonField(name = { "target_ids" })
    public List<String> a;
    @JsonField(name = { "time_stamp" })
    public String b;
    @JsonField(name = { "max_notification_slots" })
    public String c;
    
    @Override
    public final Object s() {
        final List e = kr4.e((Iterable)this.a, (nuk)z7g.f);
        final long long1 = Long.parseLong(this.b);
        String c;
        if ((c = this.c) == null) {
            c = "1";
        }
        return new xvi(e, long1, Integer.parseInt(c));
    }
}
