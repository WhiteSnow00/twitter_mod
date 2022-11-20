// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveEventReminderWrapper extends fih<zwf>
{
    @JsonField(name = { "remind_me_subscription" })
    public vwf a;
    
    public final Object s() {
        final zwf$a zwf$a = new zwf$a();
        zwf$a.a = this.a;
        return ((n4j)zwf$a).e();
    }
}
