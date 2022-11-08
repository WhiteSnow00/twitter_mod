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
public class JsonInterestPicker extends lhh<fwd>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public List<rvd> d;
    @JsonField
    public List<String> e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField(typeConverter = wwd.class)
    public String h;
    @JsonField
    public xrv i;
    @JsonField
    public xrv j;
    @JsonField
    public boolean k;
    @JsonField
    public JsonOcfComponentCollection l;
    
    @Override
    public final h4j t() {
        final fwd$a fwd$a = new fwd$a();
        ((lsr$a)fwd$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)fwd$a).g = JsonOcfRichText.s(this.b);
        fwd$a.l = this.d;
        fwd$a.m = this.e;
        fwd$a.n = this.f;
        fwd$a.o = this.g;
        ((lsr$a)fwd$a).a = this.i;
        ((lsr$a)fwd$a).b = this.j;
        fwd$a.k = JsonOcfRichText.s(this.c);
        fwd$a.q = this.k;
        fwd$a.p = this.h;
        final JsonOcfComponentCollection l = this.l;
        n16 t;
        if (l != null) {
            t = l.t();
        }
        else {
            t = null;
        }
        ((lsr$a)fwd$a).j = t;
        return (h4j)fwd$a;
    }
}
