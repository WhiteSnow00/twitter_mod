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
public class JsonEnterDate extends lhh<e5a>
{
    @JsonField
    public iej a;
    @JsonField
    public kcj b;
    @JsonField
    public ga8 c;
    @JsonField
    public ga8 d;
    @JsonField
    public JsonOcfRichText e;
    @JsonField
    public JsonOcfRichText f;
    @JsonField
    public String g;
    @JsonField
    public JsonOcfRichText h;
    @JsonField
    public xrv i;
    @JsonField
    public xrv j;
    @JsonField
    public JsonOcfComponentCollection k;
    
    @Override
    public final h4j t() {
        final e5a$a e5a$a = new e5a$a();
        final xrv i = this.i;
        pf8.r(i);
        ((lsr$a)e5a$a).a = i;
        final int a = w4j.a;
        ((lsr$a)e5a$a).b = this.j;
        final iej a2 = this.a;
        pf8.r(a2);
        ((lsr$a)e5a$a).h = a2;
        e5a$a.l = this.c;
        e5a$a.m = this.d;
        final String g = this.g;
        pf8.r(g);
        zzd.f((Object)g, "hintText");
        e5a$a.k = g;
        e5a$a.n = JsonOcfRichText.s(this.h);
        e5a$a.p = JsonOcfRichText.s(this.f);
        e5a$a.o = JsonOcfRichText.s(this.e);
        e5a$a.q = this.b;
        final JsonOcfComponentCollection k = this.k;
        n16 t;
        if (k != null) {
            t = k.t();
        }
        else {
            t = null;
        }
        ((lsr$a)e5a$a).j = t;
        return (h4j)e5a$a;
    }
}
