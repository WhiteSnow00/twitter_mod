// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Objects;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationAction extends fih<hpi>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    public final Object s() {
        Object o;
        if (ikr.e((CharSequence)this.a)) {
            i48.t("Notification action missing id");
            o = null;
        }
        else {
            final hpi.a a = new hpi.a();
            final String a2 = this.a;
            czd.f((Object)a2, "type");
            Objects.requireNonNull(hpi.Companion);
            Integer n;
            if ((n = hpi.k.get(a2)) == null) {
                n = 0;
            }
            a.a = n.intValue();
            a.b = this.b;
            a.c = this.c;
            o = a.j();
        }
        return o;
    }
}
