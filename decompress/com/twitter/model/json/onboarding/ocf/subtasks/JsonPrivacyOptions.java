// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPrivacyOptions extends lhh<b0l>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public Boolean c;
    @JsonField
    public String d;
    @JsonField
    public JsonOcfRichText e;
    @JsonField
    public Boolean f;
    @JsonField
    public String g;
    @JsonField
    public JsonOcfRichText h;
    @JsonField
    public xrv i;
    @JsonField
    public JsonOcfComponentCollection j;
    
    @Override
    public final h4j t() {
        final b0l$a b0l$a = new b0l$a();
        final String a = this.a;
        pf8.r(a);
        b0l$a.k = a;
        b0l$a.l = this.b;
        b0l$a.n = this.d;
        b0l$a.o = JsonOcfRichText.s(this.e);
        b0l$a.q = this.g;
        b0l$a.r = JsonOcfRichText.s(this.h);
        ((lsr$a)b0l$a).a = this.i;
        final int a2 = w4j.a;
        final JsonOcfComponentCollection j = this.j;
        n16 t;
        if (j != null) {
            t = j.t();
        }
        else {
            t = null;
        }
        ((lsr$a)b0l$a).j = t;
        final Boolean c = this.c;
        if (c != null) {
            b0l$a.m = c;
        }
        final Boolean f = this.f;
        if (f != null) {
            b0l$a.p = f;
        }
        return (h4j)b0l$a;
    }
}
