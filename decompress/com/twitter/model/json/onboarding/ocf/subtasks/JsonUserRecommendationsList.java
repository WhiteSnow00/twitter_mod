// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Comparator;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserRecommendationsList extends qhh<ahw>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public List<xgw> c;
    @JsonField(typeConverter = jhb.class)
    public int d;
    @JsonField
    public String e;
    @JsonField
    public int f;
    @JsonField
    public ssv g;
    @JsonField
    public ssv h;
    @JsonField
    public JsonOcfRichText i;
    @JsonField
    public JsonOcfRichText j;
    @JsonField
    public List<dym> k;
    @JsonField(typeConverter = ghw.class)
    public int l;
    @JsonField
    public JsonOcfComponentCollection m;
    
    public final n4j t() {
        final ahw$a ahw$a = new ahw$a();
        ((dtr$a)ahw$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)ahw$a).g = JsonOcfRichText.s(this.b);
        ahw$a.k = this.c;
        ahw$a.l = this.d;
        ahw$a.m = this.e;
        ahw$a.r = this.f;
        ((dtr$a)ahw$a).a = this.g;
        ((dtr$a)ahw$a).b = this.h;
        ahw$a.n = JsonOcfRichText.s(this.i);
        ahw$a.o = JsonOcfRichText.s(this.j);
        ahw$a.p = rif.C((Comparator)dk8.G0, (List)this.k);
        ahw$a.q = this.l;
        final JsonOcfComponentCollection m = this.m;
        x06 t;
        if (m != null) {
            t = m.t();
        }
        else {
            t = null;
        }
        ((dtr$a)ahw$a).j = t;
        return (n4j)ahw$a;
    }
}
