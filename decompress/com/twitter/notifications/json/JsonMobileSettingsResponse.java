// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMobileSettingsResponse extends eih<lhh>
{
    @JsonField
    public String a;
    @JsonField
    public jrp b;
    @JsonField
    public jrp c;
    @JsonField
    public Map<String, String> d;
    @JsonField
    public Map<String, String> e;
    @JsonField
    public Long f;
    @JsonField
    public khe g;
    
    public final z4j t() {
        final lhh.a a = new lhh.a();
        a.a = this.a;
        a.b = this.b;
        a.c = this.c;
        a.d = this.d;
        a.e = this.e;
        a.f = this.f;
        final khe g = this.g;
        if (g != null) {
            a.g = g.a;
        }
        return a;
    }
}
