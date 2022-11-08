// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.Comparator;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.twitter.model.json.onboarding.ocf.JsonTimelineQuery;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserRecommendationsURT extends lhh<tgw>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public int c;
    @JsonField
    public xrv d;
    @JsonField
    public xrv e;
    @JsonField
    public List<mxm> f;
    @JsonField
    public JsonTimelineQuery g;
    @JsonField
    public boolean h;
    @JsonField
    public JsonOcfComponentCollection i;
    
    @Override
    public final h4j t() {
        final tgw$a tgw$a = new tgw$a();
        ((lsr$a)tgw$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)tgw$a).g = JsonOcfRichText.s(this.b);
        tgw$a.m = this.c;
        tgw$a.n = this.h;
        ((lsr$a)tgw$a).a = this.d;
        ((lsr$a)tgw$a).b = this.e;
        tgw$a.l = JsonTimelineQuery.s(this.g);
        tgw$a.k = ijf.C((Comparator)blb.H0, (List)this.f);
        final JsonOcfComponentCollection i = this.i;
        n16 t;
        if (i != null) {
            t = i.t();
        }
        else {
            t = null;
        }
        ((lsr$a)tgw$a).j = t;
        return (h4j)tgw$a;
    }
}
