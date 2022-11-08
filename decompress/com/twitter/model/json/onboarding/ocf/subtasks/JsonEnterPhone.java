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
public class JsonEnterPhone extends lhh<n6a>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField
    public List<t94> d;
    @JsonField
    public String e;
    @JsonField
    public fqp f;
    @JsonField
    public xrv g;
    @JsonField
    public xrv h;
    @JsonField
    public List<fqp> i;
    @JsonField
    public JsonOcfComponentCollection j;
    
    @Override
    public final h4j t() {
        final n6a$a n6a$a = new n6a$a();
        ((lsr$a)n6a$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)n6a$a).g = JsonOcfRichText.s(this.b);
        n6a$a.k = this.c;
        n6a$a.l = this.d;
        n6a$a.m = this.e;
        n6a$a.n = this.f;
        n6a$a.o = this.i;
        ((lsr$a)n6a$a).a = this.g;
        ((lsr$a)n6a$a).b = this.h;
        final JsonOcfComponentCollection j = this.j;
        n16 t;
        if (j != null) {
            t = j.t();
        }
        else {
            t = null;
        }
        ((lsr$a)n6a$a).j = t;
        return (h4j)n6a$a;
    }
}
