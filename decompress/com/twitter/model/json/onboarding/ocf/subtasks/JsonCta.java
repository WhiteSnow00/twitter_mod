// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.List;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCta extends lhh<c87>
{
    @JsonField
    public iej a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public JsonOcfRichText d;
    @JsonField
    public xrv e;
    @JsonField
    public xrv f;
    @JsonField(typeConverter = q53.class)
    public int g;
    @JsonField(typeConverter = q53.class)
    public int h;
    @JsonField(typeConverter = tds.class)
    public int i;
    @JsonField(typeConverter = e53.class)
    public int j;
    @JsonField(typeConverter = a87.class)
    public int k;
    @JsonField
    public kdj l;
    @JsonField
    public List<ecj> m;
    @JsonField
    public JsonOcfRichText n;
    @JsonField
    public JsonOcfComponentCollection o;
    
    @Override
    public final h4j t() {
        final c87$a c87$a = new c87$a();
        ((lsr$a)c87$a).h = this.a;
        final int a = w4j.a;
        ((lsr$a)c87$a).f = JsonOcfRichText.s(this.b);
        ((lsr$a)c87$a).g = JsonOcfRichText.s(this.c);
        c87$a.k = JsonOcfRichText.s(this.d);
        ((lsr$a)c87$a).a = this.e;
        ((lsr$a)c87$a).b = this.f;
        c87$a.l = this.g;
        c87$a.m = this.h;
        c87$a.n = this.i;
        c87$a.o = this.j;
        c87$a.p = this.k;
        c87$a.q = this.l;
        c87$a.r = this.m;
        c87$a.s = JsonOcfRichText.s(this.n);
        final JsonOcfComponentCollection o = this.o;
        n16 t;
        if (o != null) {
            t = o.t();
        }
        else {
            t = null;
        }
        ((lsr$a)c87$a).j = t;
        return (h4j)c87$a;
    }
}
