// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationContextUser extends tih<ori>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        final boolean e = flr.e((CharSequence)this.a);
        Object o = null;
        if (e) {
            mqb.o("Context user missing screen name");
        }
        else if (flr.e((CharSequence)this.b)) {
            mqb.o("Context user missing avatar");
        }
        else {
            final ori$a ori$a = new ori$a();
            final String a = this.a;
            e0e.f((Object)a, "screenName");
            ori$a.a = a;
            final String b = this.b;
            e0e.f((Object)b, "imageUrl");
            ori$a.b = b;
            o = ((z4j)ori$a).e();
        }
        return o;
    }
}
