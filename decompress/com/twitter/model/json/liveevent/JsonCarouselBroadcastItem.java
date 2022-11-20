// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCarouselBroadcastItem extends qhh<hl3>
{
    @JsonField
    public String a;
    
    public final n4j t() {
        final String a = this.a;
        jee.l((Object)a);
        return new hl3.a(a);
    }
}
