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
public class JsonEmailVerification extends qhh<a0a>
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
    public pcj e;
    @JsonField
    public pcj f;
    @JsonField
    public ssv g;
    @JsonField
    public ssv h;
    @JsonField
    public ssv i;
    @JsonField
    public boolean j;
    @JsonField
    public Integer k;
    @JsonField
    public JsonOcfComponentCollection l;
    
    public final n4j t() {
        final a0a.a a = new a0a.a();
        a.n = this.f;
        a.o = this.e;
        a.a = this.g;
        final int a2 = c5j.a;
        a.c = this.h;
        a.m = this.i;
        a.f = JsonOcfRichText.s(this.a);
        a.g = JsonOcfRichText.s(this.b);
        a.k = JsonOcfRichText.s(this.c);
        a.l = this.d;
        a.p = this.j;
        a.q = this.k;
        final JsonOcfComponentCollection l = this.l;
        x06 t;
        if (l != null) {
            t = l.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (n4j)a;
    }
}
