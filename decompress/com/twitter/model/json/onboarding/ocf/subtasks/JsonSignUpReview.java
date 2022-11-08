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
public class JsonSignUpReview extends lhh<z5q>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public kcj c;
    @JsonField
    public kcj d;
    @JsonField
    public kcj e;
    @JsonField
    public kcj f;
    @JsonField
    public ea8 g;
    @JsonField
    public JsonOcfRichText h;
    @JsonField
    public JsonOcfRichText i;
    @JsonField
    public xrv j;
    @JsonField
    public xrv k;
    @JsonField
    public xrv l;
    @JsonField
    public xrv m;
    @JsonField
    public xrv n;
    @JsonField
    public xrv o;
    @JsonField
    public xrv p;
    @JsonField
    public boolean q;
    @JsonField
    public String r;
    @JsonField
    public String s;
    @JsonField
    public String t;
    @JsonField
    public String u;
    @JsonField
    public JsonOcfComponentCollection v;
    
    @Override
    public final h4j t() {
        final z5q.a a = new z5q.a();
        a.k = this.a;
        a.l = this.b;
        a.m = this.c;
        a.n = this.d;
        a.o = this.e;
        a.p = this.f;
        a.q = this.g;
        a.r = JsonOcfRichText.s(this.h);
        a.s = JsonOcfRichText.s(this.i);
        a.t = this.j;
        a.u = this.k;
        a.v = this.l;
        a.w = this.m;
        a.x = this.n;
        a.y = this.o;
        a.z = this.p;
        a.A = this.q;
        a.B = this.r;
        a.C = this.s;
        a.D = this.t;
        a.E = this.u;
        final JsonOcfComponentCollection v = this.v;
        n16 t;
        if (v != null) {
            t = v.t();
        }
        else {
            t = null;
        }
        a.j = t;
        final int a2 = w4j.a;
        return (h4j)a;
    }
}
