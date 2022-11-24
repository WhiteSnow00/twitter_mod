// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Objects;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationAction extends tih<ypi>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        Object o;
        if (flr.e((CharSequence)this.a)) {
            mqb.o("Notification action missing id");
            o = null;
        }
        else {
            final ypi$a ypi$a = new ypi$a();
            final String a = this.a;
            e0e.f((Object)a, "type");
            Objects.requireNonNull(ypi.Companion);
            Integer n;
            if ((n = ypi.k.get(a)) == null) {
                n = 0;
            }
            ypi$a.a = n.intValue();
            ypi$a.b = this.b;
            ypi$a.c = this.c;
            o = ((z4j)ypi$a).j();
        }
        return o;
    }
}
