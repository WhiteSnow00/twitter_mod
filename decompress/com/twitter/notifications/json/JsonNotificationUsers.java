// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationUsers extends fih<nvi>
{
    @JsonField
    public mvi a;
    @JsonField
    public mvi b;
    @JsonField
    public mvi c;
    @JsonField(name = { "context" })
    public List<yqi> d;
    
    public final Object s() {
        final mvi a = this.a;
        Object o;
        if (a == null) {
            i48.t("Missing recipient");
            o = null;
        }
        else {
            final nvi$a nvi$a = new nvi$a();
            nvi$a.a = a;
            nvi$a.b = this.b;
            nvi$a.c = this.c;
            nvi$a.o((List)this.d);
            o = ((n4j)nvi$a).e();
        }
        return o;
    }
}
