// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEnterText extends lhh<s6a>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public JsonOcfRichText e;
    @JsonField
    public iej f;
    @JsonField
    public int g;
    @JsonField
    public boolean h;
    @JsonField(typeConverter = b71.class)
    public a71 i;
    @JsonField
    public boolean j;
    @JsonField(typeConverter = ooj.class)
    public noj k;
    @JsonField(typeConverter = trd.class)
    public int l;
    @JsonField(typeConverter = u6a.class)
    public int m;
    @JsonField
    public String n;
    @JsonField
    public xrv o;
    @JsonField
    public xrv p;
    @JsonField
    public JsonOcfComponentCollection q;
    
    public JsonEnterText() {
        this.i = a71.F0;
        this.k = noj.D0;
    }
    
    @Override
    public final h4j t() {
        final s6a$a s6a$a = new s6a$a();
        ((lsr$a)s6a$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)s6a$a).g = JsonOcfRichText.s(this.b);
        ((lsr$a)s6a$a).h = this.f;
        s6a$a.m = JsonOcfRichText.s(this.e);
        s6a$a.k = this.c;
        s6a$a.l = this.d;
        s6a$a.n = this.g;
        s6a$a.o = this.h;
        s6a$a.p = this.i;
        s6a$a.q = this.j;
        s6a$a.r = this.k;
        s6a$a.s = this.l;
        s6a$a.u = this.n;
        s6a$a.t = this.m;
        ((lsr$a)s6a$a).a = this.o;
        ((lsr$a)s6a$a).b = this.p;
        final JsonOcfComponentCollection q = this.q;
        n16 t;
        if (q != null) {
            t = q.t();
        }
        else {
            t = null;
        }
        ((lsr$a)s6a$a).j = t;
        return (h4j)s6a$a;
    }
}
