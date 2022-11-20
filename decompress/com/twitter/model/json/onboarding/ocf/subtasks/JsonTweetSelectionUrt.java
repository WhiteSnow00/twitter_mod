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
public class JsonTweetSelectionUrt extends qhh<dsu>
{
    @JsonField
    public oej a;
    @JsonField
    public ssv b;
    @JsonField
    public ssv c;
    @JsonField
    public JsonTimelineQuery d;
    @JsonField
    public String e;
    @JsonField
    public gej f;
    @JsonField
    public cbi g;
    @JsonField
    public ucj h;
    @JsonField
    public JsonOcfComponentCollection i;
    
    public final n4j t() {
        final dsu.a a = new dsu.a();
        ((dtr$a)a).h = this.a;
        final int a2 = c5j.a;
        final ssv b = this.b;
        jee.l((Object)b);
        ((dtr$a)a).a = b;
        ((dtr$a)a).b = this.c;
        a.k = JsonTimelineQuery.s(this.d);
        a.l = this.e;
        a.m = this.f;
        a.n = this.g;
        a.o = this.h;
        final JsonOcfComponentCollection i = this.i;
        x06 t;
        if (i != null) {
            t = i.t();
        }
        else {
            t = null;
        }
        ((dtr$a)a).j = t;
        return (n4j)a;
    }
}
