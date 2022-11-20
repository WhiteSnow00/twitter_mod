// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.json;

import java.util.Map;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserDevicesRequest extends qhh<saw>
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
    
    public final n4j t() {
        final saw$a saw$a = new saw$a();
        saw$a.a = this.a;
        saw$a.b = this.b;
        saw$a.c = this.c;
        saw$a.d = this.d;
        saw$a.e = this.e;
        saw$a.f = this.f;
        saw$a.h = this.h;
        saw$a.g = this.g;
        return (n4j)saw$a;
    }
}
