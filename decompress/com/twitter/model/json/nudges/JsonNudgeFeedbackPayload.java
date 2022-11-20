// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNudgeFeedbackPayload extends qhh<f0j>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField(name = { "cta_option1" })
    public String e;
    @JsonField(name = { "cta_option2" })
    public String f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    
    public final n4j t() {
        final f0j$a f0j$a = new f0j$a();
        f0j$a.a = this.a;
        f0j$a.b = this.b;
        f0j$a.c = this.c;
        f0j$a.d = this.d;
        f0j$a.e = this.e;
        f0j$a.f = this.f;
        f0j$a.g = this.g;
        f0j$a.h = this.h;
        return (n4j)f0j$a;
    }
}
