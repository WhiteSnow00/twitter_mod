// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.liveevent;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLiveEventAttribution extends qhh<qof>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    public final n4j t() {
        final String a = this.a;
        jee.k(a);
        final qof.a a2 = new qof.a(a);
        a2.b = this.b;
        return a2;
    }
}
