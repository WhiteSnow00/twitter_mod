// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationUsers extends tih<ewi>
{
    @JsonField
    public dwi a;
    @JsonField
    public dwi b;
    @JsonField
    public dwi c;
    @JsonField(name = { "context" })
    public List<ori> d;
    
    @Override
    public final Object s() {
        final dwi a = this.a;
        Object o;
        if (a == null) {
            mqb.o("Missing recipient");
            o = null;
        }
        else {
            final ewi$a ewi$a = new ewi$a();
            ewi$a.a = a;
            ewi$a.b = this.b;
            ewi$a.c = this.c;
            ewi$a.o((List)this.d);
            o = ((z4j)ewi$a).e();
        }
        return o;
    }
}
