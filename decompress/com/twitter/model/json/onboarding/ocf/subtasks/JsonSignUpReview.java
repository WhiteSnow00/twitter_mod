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
public class JsonSignUpReview extends qhh<r6q>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public pcj c;
    @JsonField
    public pcj d;
    @JsonField
    public pcj e;
    @JsonField
    public pcj f;
    @JsonField
    public o98 g;
    @JsonField
    public JsonOcfRichText h;
    @JsonField
    public JsonOcfRichText i;
    @JsonField
    public ssv j;
    @JsonField
    public ssv k;
    @JsonField
    public ssv l;
    @JsonField
    public ssv m;
    @JsonField
    public ssv n;
    @JsonField
    public ssv o;
    @JsonField
    public ssv p;
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
    
    public final n4j t() {
        final r6q$a r6q$a = new r6q$a();
        r6q$a.k = this.a;
        r6q$a.l = this.b;
        r6q$a.m = this.c;
        r6q$a.n = this.d;
        r6q$a.o = this.e;
        r6q$a.p = this.f;
        r6q$a.q = this.g;
        r6q$a.r = JsonOcfRichText.s(this.h);
        r6q$a.s = JsonOcfRichText.s(this.i);
        r6q$a.t = this.j;
        r6q$a.u = this.k;
        r6q$a.v = this.l;
        r6q$a.w = this.m;
        r6q$a.x = this.n;
        r6q$a.y = this.o;
        r6q$a.z = this.p;
        r6q$a.A = this.q;
        r6q$a.B = this.r;
        r6q$a.C = this.s;
        r6q$a.D = this.t;
        r6q$a.E = this.u;
        final JsonOcfComponentCollection v = this.v;
        x06 t;
        if (v != null) {
            t = v.t();
        }
        else {
            t = null;
        }
        ((dtr$a)r6q$a).j = t;
        final int a = c5j.a;
        return (n4j)r6q$a;
    }
}
