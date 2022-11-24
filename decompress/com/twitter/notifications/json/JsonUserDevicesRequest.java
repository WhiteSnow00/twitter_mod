// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserDevicesRequest extends eih<ibw>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public int d;
    @JsonField
    public String e;
    @JsonField
    public int f;
    @JsonField
    public String g;
    @JsonField
    public Map<String, String> h;
    
    public final z4j t() {
        final ibw$a ibw$a = new ibw$a();
        ibw$a.a = this.a;
        ibw$a.b = this.b;
        ibw$a.c = this.c;
        ibw$a.d = this.d;
        ibw$a.e = this.e;
        ibw$a.f = this.f;
        ibw$a.h = this.h;
        ibw$a.g = this.g;
        return (z4j)ibw$a;
    }
}
