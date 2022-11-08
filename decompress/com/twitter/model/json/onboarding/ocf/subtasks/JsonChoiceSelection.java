// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonChoiceSelection extends lhh<l94>
{
    @JsonField
    public List<t94> a;
    @JsonField
    public String b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public JsonOcfRichText d;
    @JsonField
    public xrv e;
    @JsonField
    public xrv f;
    @JsonField
    public abi g;
    @JsonField
    public List<String> h;
    @JsonField
    public JsonOcfRichText i;
    @JsonField(typeConverter = j94.class)
    public i94 j;
    @JsonField
    public h94 k;
    @JsonField
    public ioh l;
    @JsonField
    public tdj m;
    @JsonField
    public iej n;
    @JsonField
    public JsonOcfComponentCollection o;
    
    @Override
    public final h4j t() {
        final l94.a a = new l94.a();
        a.k = this.a;
        a.l = this.b;
        a.f = JsonOcfRichText.s(this.c);
        final int a2 = w4j.a;
        a.g = JsonOcfRichText.s(this.d);
        a.a = this.e;
        a.b = this.f;
        i94 m = this.j;
        if (m == null) {
            m = i94.D0;
        }
        a.m = m;
        a.p = this.k;
        a.n = this.g;
        a.o = JsonOcfRichText.s(this.i);
        a.q = this.h;
        a.r = this.l;
        a.s = this.m;
        a.h = this.n;
        final JsonOcfComponentCollection o = this.o;
        n16 t;
        if (o != null) {
            t = o.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (h4j)a;
    }
}
