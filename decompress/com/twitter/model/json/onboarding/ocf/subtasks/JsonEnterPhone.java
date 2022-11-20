// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEnterPhone extends qhh<v5a>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField
    public List<v84> d;
    @JsonField
    public String e;
    @JsonField
    public wqp f;
    @JsonField
    public ssv g;
    @JsonField
    public ssv h;
    @JsonField
    public List<wqp> i;
    @JsonField
    public JsonOcfComponentCollection j;
    
    public final n4j t() {
        final v5a$a v5a$a = new v5a$a();
        ((dtr$a)v5a$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)v5a$a).g = JsonOcfRichText.s(this.b);
        v5a$a.k = this.c;
        v5a$a.l = this.d;
        v5a$a.m = this.e;
        v5a$a.n = this.f;
        v5a$a.o = this.i;
        ((dtr$a)v5a$a).a = this.g;
        ((dtr$a)v5a$a).b = this.h;
        final JsonOcfComponentCollection j = this.j;
        x06 t;
        if (j != null) {
            t = j.t();
        }
        else {
            t = null;
        }
        ((dtr$a)v5a$a).j = t;
        return (n4j)v5a$a;
    }
}
