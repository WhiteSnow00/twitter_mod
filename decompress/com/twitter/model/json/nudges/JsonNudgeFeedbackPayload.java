// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNudgeFeedbackPayload extends lhh<zzi>
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
    
    @Override
    public final h4j t() {
        final zzi$a zzi$a = new zzi$a();
        zzi$a.a = this.a;
        zzi$a.b = this.b;
        zzi$a.c = this.c;
        zzi$a.d = this.d;
        zzi$a.e = this.e;
        zzi$a.f = this.f;
        zzi$a.g = this.g;
        zzi$a.h = this.h;
        return (h4j)zzi$a;
    }
}
