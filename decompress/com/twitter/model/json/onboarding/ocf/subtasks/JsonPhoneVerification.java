// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPhoneVerification extends lhh<cck>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public String d;
    @JsonField
    public kcj e;
    @JsonField
    public xrv f;
    @JsonField
    public xrv g;
    @JsonField
    public xrv h;
    @JsonField
    public String i;
    @JsonField
    public boolean j;
    @JsonField
    public kcj k;
    @JsonField
    public Integer l;
    @JsonField
    public JsonOcfComponentCollection m;
    
    @Override
    public final h4j t() {
        final cck$a cck$a = new cck$a();
        ((lsr$a)cck$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)cck$a).g = JsonOcfRichText.s(this.b);
        ((kdk$a)cck$a).k = JsonOcfRichText.s(this.c);
        ((kdk$a)cck$a).l = this.d;
        cck$a.n = this.i;
        cck$a.o = this.e;
        cck$a.p = this.j;
        cck$a.q = this.k;
        ((lsr$a)cck$a).a = this.f;
        ((lsr$a)cck$a).c = this.g;
        ((kdk$a)cck$a).m = this.h;
        cck$a.r = this.l;
        final JsonOcfComponentCollection m = this.m;
        n16 t;
        if (m != null) {
            t = m.t();
        }
        else {
            t = null;
        }
        ((lsr$a)cck$a).j = t;
        return (h4j)cck$a;
    }
}
