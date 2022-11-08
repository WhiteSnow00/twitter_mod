// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.twitter.model.json.onboarding.ocf.JsonTimelineQuery;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonGenericUrt extends lhh<l1c>
{
    @JsonField
    public iej a;
    @JsonField
    public xrv b;
    @JsonField
    public JsonTimelineQuery c;
    @JsonField
    public String d;
    @JsonField
    public bej e;
    @JsonField
    public abi f;
    @JsonField
    public pcj g;
    @JsonField
    public JsonOcfComponentCollection h;
    
    @Override
    public final h4j t() {
        final l1c.a a = new l1c.a();
        ((lsr$a)a).h = this.a;
        final int a2 = w4j.a;
        final xrv b = this.b;
        pf8.r(b);
        ((lsr$a)a).a = b;
        a.k = JsonTimelineQuery.s(this.c);
        a.l = this.d;
        a.m = this.e;
        a.n = this.f;
        a.o = this.g;
        final JsonOcfComponentCollection h = this.h;
        n16 t;
        if (h != null) {
            t = h.t();
        }
        else {
            t = null;
        }
        ((lsr$a)a).j = t;
        return (h4j)a;
    }
}
