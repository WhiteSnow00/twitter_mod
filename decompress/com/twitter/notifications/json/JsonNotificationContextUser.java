// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationContextUser extends fih<yqi>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public final Object s() {
        final boolean e = ikr.e((CharSequence)this.a);
        Object o = null;
        if (e) {
            i48.t("Context user missing screen name");
        }
        else if (ikr.e((CharSequence)this.b)) {
            i48.t("Context user missing avatar");
        }
        else {
            final yqi.a a = new yqi.a();
            final String a2 = this.a;
            czd.f((Object)a2, "screenName");
            a.a = a2;
            final String b = this.b;
            czd.f((Object)b, "imageUrl");
            a.b = b;
            o = a.e();
        }
        return o;
    }
}
