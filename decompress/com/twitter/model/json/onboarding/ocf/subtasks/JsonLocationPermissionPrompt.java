// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonLocationPermissionPrompt extends lhh<m6g>
{
    @JsonField
    public iej a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public xrv c;
    @JsonField
    public xrv d;
    @JsonField
    public xrv e;
    @JsonField
    public xrv f;
    @JsonField(typeConverter = o6k.class)
    public int g;
    
    @Override
    public final h4j t() {
        final m6g.a a = new m6g.a();
        a.h = this.a;
        final int a2 = w4j.a;
        a.k = JsonOcfRichText.s(this.b);
        a.l = this.c;
        a.m = this.d;
        a.n = this.e;
        a.o = this.f;
        a.p = this.g;
        return (h4j)a;
    }
}
