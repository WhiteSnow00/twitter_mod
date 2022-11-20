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
public class JsonEnterDate extends qhh<n4a>
{
    @JsonField
    public oej a;
    @JsonField
    public pcj b;
    @JsonField
    public q98 c;
    @JsonField
    public q98 d;
    @JsonField
    public JsonOcfRichText e;
    @JsonField
    public JsonOcfRichText f;
    @JsonField
    public String g;
    @JsonField
    public JsonOcfRichText h;
    @JsonField
    public ssv i;
    @JsonField
    public ssv j;
    @JsonField
    public JsonOcfComponentCollection k;
    
    public final n4j t() {
        final n4a$a n4a$a = new n4a$a();
        final ssv i = this.i;
        jee.l((Object)i);
        ((dtr$a)n4a$a).a = i;
        final int a = c5j.a;
        ((dtr$a)n4a$a).b = this.j;
        final oej a2 = this.a;
        jee.l((Object)a2);
        ((dtr$a)n4a$a).h = a2;
        n4a$a.l = this.c;
        n4a$a.m = this.d;
        final String g = this.g;
        jee.l((Object)g);
        czd.f((Object)g, "hintText");
        n4a$a.k = g;
        n4a$a.n = JsonOcfRichText.s(this.h);
        n4a$a.p = JsonOcfRichText.s(this.f);
        n4a$a.o = JsonOcfRichText.s(this.e);
        n4a$a.q = this.b;
        final JsonOcfComponentCollection k = this.k;
        x06 t;
        if (k != null) {
            t = k.t();
        }
        else {
            t = null;
        }
        ((dtr$a)n4a$a).j = t;
        return (n4j)n4a$a;
    }
}
