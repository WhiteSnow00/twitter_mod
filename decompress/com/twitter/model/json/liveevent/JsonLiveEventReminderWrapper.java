// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveEventReminderWrapper extends tih<uxf>
{
    @JsonField(name = { "remind_me_subscription" })
    public qxf a;
    
    @Override
    public final Object s() {
        final uxf$a uxf$a = new uxf$a();
        uxf$a.a = this.a;
        return ((z4j)uxf$a).e();
    }
}
