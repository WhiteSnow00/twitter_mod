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
public class JsonCta extends qhh<g77>
{
    @JsonField
    public oej a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public JsonOcfRichText d;
    @JsonField
    public ssv e;
    @JsonField
    public ssv f;
    @JsonField(typeConverter = h53.class)
    public int g;
    @JsonField(typeConverter = h53.class)
    public int h;
    @JsonField(typeConverter = oes.class)
    public int i;
    @JsonField(typeConverter = v43.class)
    public int j;
    @JsonField(typeConverter = e77.class)
    public int k;
    @JsonField
    public pdj l;
    @JsonField
    public List<jcj> m;
    @JsonField
    public JsonOcfRichText n;
    @JsonField
    public JsonOcfComponentCollection o;
    
    public final n4j t() {
        final g77.a a = new g77.a();
        a.h = this.a;
        final int a2 = c5j.a;
        a.f = JsonOcfRichText.s(this.b);
        a.g = JsonOcfRichText.s(this.c);
        a.k = JsonOcfRichText.s(this.d);
        a.a = this.e;
        a.b = this.f;
        a.l = this.g;
        a.m = this.h;
        a.n = this.i;
        a.o = this.j;
        a.p = this.k;
        a.q = this.l;
        a.r = this.m;
        a.s = JsonOcfRichText.s(this.n);
        final JsonOcfComponentCollection o = this.o;
        x06 t;
        if (o != null) {
            t = o.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (n4j)a;
    }
}
