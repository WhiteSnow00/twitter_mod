// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLocationPermissionPrompt extends qhh<b6g>
{
    @JsonField
    public oej a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public ssv c;
    @JsonField
    public ssv d;
    @JsonField
    public ssv e;
    @JsonField
    public ssv f;
    @JsonField(typeConverter = w6k.class)
    public int g;
    
    public final n4j t() {
        final b6g$a b6g$a = new b6g$a();
        ((dtr$a)b6g$a).h = this.a;
        final int a = c5j.a;
        b6g$a.k = JsonOcfRichText.s(this.b);
        b6g$a.l = this.c;
        b6g$a.m = this.d;
        b6g$a.n = this.e;
        b6g$a.o = this.f;
        b6g$a.p = this.g;
        return (n4j)b6g$a;
    }
}
