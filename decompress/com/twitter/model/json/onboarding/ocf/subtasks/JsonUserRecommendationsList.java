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
public class JsonUserRecommendationsList extends lhh<hgw>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public List<egw> c;
    @JsonField(typeConverter = mib.class)
    public int d;
    @JsonField
    public String e;
    @JsonField
    public int f;
    @JsonField
    public xrv g;
    @JsonField
    public xrv h;
    @JsonField
    public JsonOcfRichText i;
    @JsonField
    public JsonOcfRichText j;
    @JsonField
    public List<mxm> k;
    @JsonField(typeConverter = ngw.class)
    public int l;
    @JsonField
    public JsonOcfComponentCollection m;
    
    @Override
    public final h4j t() {
        final hgw$a hgw$a = new hgw$a();
        ((lsr$a)hgw$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)hgw$a).g = JsonOcfRichText.s(this.b);
        hgw$a.k = this.c;
        hgw$a.l = this.d;
        hgw$a.m = this.e;
        hgw$a.r = this.f;
        ((lsr$a)hgw$a).a = this.g;
        ((lsr$a)hgw$a).b = this.h;
        hgw$a.n = JsonOcfRichText.s(this.i);
        hgw$a.o = JsonOcfRichText.s(this.j);
        hgw$a.p = ijf.C((Comparator)zmx.G0, (List)this.k);
        hgw$a.q = this.l;
        final JsonOcfComponentCollection m = this.m;
        n16 t;
        if (m != null) {
            t = m.t();
        }
        else {
            t = null;
        }
        ((lsr$a)hgw$a).j = t;
        return (h4j)hgw$a;
    }
}
