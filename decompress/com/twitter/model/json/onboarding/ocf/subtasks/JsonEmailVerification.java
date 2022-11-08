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
public class JsonEmailVerification extends lhh<p0a>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public String d;
    @JsonField
    public kcj e;
    @JsonField
    public kcj f;
    @JsonField
    public xrv g;
    @JsonField
    public xrv h;
    @JsonField
    public xrv i;
    @JsonField
    public boolean j;
    @JsonField
    public Integer k;
    @JsonField
    public JsonOcfComponentCollection l;
    
    @Override
    public final h4j t() {
        final p0a$a p0a$a = new p0a$a();
        p0a$a.n = this.f;
        p0a$a.o = this.e;
        ((lsr$a)p0a$a).a = this.g;
        final int a = w4j.a;
        ((lsr$a)p0a$a).c = this.h;
        ((kdk$a)p0a$a).m = this.i;
        ((lsr$a)p0a$a).f = JsonOcfRichText.s(this.a);
        ((lsr$a)p0a$a).g = JsonOcfRichText.s(this.b);
        ((kdk$a)p0a$a).k = JsonOcfRichText.s(this.c);
        ((kdk$a)p0a$a).l = this.d;
        p0a$a.p = this.j;
        p0a$a.q = this.k;
        final JsonOcfComponentCollection l = this.l;
        n16 t;
        if (l != null) {
            t = l.t();
        }
        else {
            t = null;
        }
        ((lsr$a)p0a$a).j = t;
        return (h4j)p0a$a;
    }
}
