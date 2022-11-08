// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNotificationsPermissionPrompt extends lhh<jxi>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public xrv d;
    @JsonField
    public xrv e;
    @JsonField
    public xrv f;
    @JsonField
    public xrv g;
    @JsonField(typeConverter = bjl.class)
    public ajl h;
    @JsonField(typeConverter = o6k.class)
    public int i;
    
    @Override
    public final h4j t() {
        final jxi$a jxi$a = new jxi$a();
        ((lsr$a)jxi$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)jxi$a).g = JsonOcfRichText.s(this.b);
        jxi$a.k = JsonOcfRichText.s(this.c);
        jxi$a.l = this.d;
        jxi$a.m = this.e;
        jxi$a.n = this.f;
        jxi$a.o = this.g;
        jxi$a.q = this.i;
        jxi$a.p = this.h;
        return (h4j)jxi$a;
    }
}
