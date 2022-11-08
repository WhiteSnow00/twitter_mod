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
public class JsonTweetSelectionUrt extends lhh<iru>
{
    @JsonField
    public iej a;
    @JsonField
    public xrv b;
    @JsonField
    public xrv c;
    @JsonField
    public JsonTimelineQuery d;
    @JsonField
    public String e;
    @JsonField
    public bej f;
    @JsonField
    public abi g;
    @JsonField
    public pcj h;
    @JsonField
    public JsonOcfComponentCollection i;
    
    @Override
    public final h4j t() {
        final iru$a iru$a = new iru$a();
        ((lsr$a)iru$a).h = this.a;
        final int a = w4j.a;
        final xrv b = this.b;
        pf8.r(b);
        ((lsr$a)iru$a).a = b;
        ((lsr$a)iru$a).b = this.c;
        ((em1$a)iru$a).k = JsonTimelineQuery.s(this.d);
        ((em1$a)iru$a).l = this.e;
        ((em1$a)iru$a).m = this.f;
        ((em1$a)iru$a).n = this.g;
        ((em1$a)iru$a).o = this.h;
        final JsonOcfComponentCollection i = this.i;
        n16 t;
        if (i != null) {
            t = i.t();
        }
        else {
            t = null;
        }
        ((lsr$a)iru$a).j = t;
        return (h4j)iru$a;
    }
}
