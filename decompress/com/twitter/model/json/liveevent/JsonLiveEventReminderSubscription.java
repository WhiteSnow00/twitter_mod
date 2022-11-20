// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveEventReminderSubscription extends fih<vwf>
{
    @JsonField
    public Boolean a;
    @JsonField
    public Boolean b;
    @JsonField
    public String c;
    
    public final Object s() {
        final vwf$a vwf$a = new vwf$a();
        vwf$a.a = z3u.b(this.a);
        vwf$a.b = z3u.b(this.b);
        vwf$a.c = this.c;
        return ((n4j)vwf$a).e();
    }
}
