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
public class JsonEnterEmail extends lhh<j5a>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField
    public fqp d;
    @JsonField
    public xrv e;
    @JsonField
    public xrv f;
    @JsonField
    public List<fqp> g;
    @JsonField
    public JsonOcfComponentCollection h;
    
    @Override
    public final h4j t() {
        final j5a$a j5a$a = new j5a$a();
        ((lsr$a)j5a$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)j5a$a).g = JsonOcfRichText.s(this.b);
        j5a$a.k = this.c;
        j5a$a.l = this.d;
        j5a$a.m = this.g;
        ((lsr$a)j5a$a).a = this.e;
        ((lsr$a)j5a$a).c = this.f;
        final JsonOcfComponentCollection h = this.h;
        n16 t;
        if (h != null) {
            t = h.t();
        }
        else {
            t = null;
        }
        ((lsr$a)j5a$a).j = t;
        return (h4j)j5a$a;
    }
}
