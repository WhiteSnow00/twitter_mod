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
public class JsonEnterText extends qhh<b6a>
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
    public oej f;
    @JsonField
    public int g;
    @JsonField
    public boolean h;
    @JsonField(typeConverter = v61.class)
    public u61 i;
    @JsonField
    public boolean j;
    @JsonField(typeConverter = uoj.class)
    public toj k;
    @JsonField(typeConverter = xqd.class)
    public int l;
    @JsonField(typeConverter = d6a.class)
    public int m;
    @JsonField
    public String n;
    @JsonField
    public ssv o;
    @JsonField
    public ssv p;
    @JsonField
    public JsonOcfComponentCollection q;
    
    public JsonEnterText() {
        this.i = u61.G0;
        this.k = toj.E0;
    }
    
    public final n4j t() {
        final b6a$a b6a$a = new b6a$a();
        ((dtr$a)b6a$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)b6a$a).g = JsonOcfRichText.s(this.b);
        ((dtr$a)b6a$a).h = this.f;
        b6a$a.m = JsonOcfRichText.s(this.e);
        b6a$a.k = this.c;
        b6a$a.l = this.d;
        b6a$a.n = this.g;
        b6a$a.o = this.h;
        b6a$a.p = this.i;
        b6a$a.q = this.j;
        b6a$a.r = this.k;
        b6a$a.s = this.l;
        b6a$a.u = this.n;
        b6a$a.t = this.m;
        ((dtr$a)b6a$a).a = this.o;
        ((dtr$a)b6a$a).b = this.p;
        final JsonOcfComponentCollection q = this.q;
        x06 t;
        if (q != null) {
            t = q.t();
        }
        else {
            t = null;
        }
        ((dtr$a)b6a$a).j = t;
        return (n4j)b6a$a;
    }
}
