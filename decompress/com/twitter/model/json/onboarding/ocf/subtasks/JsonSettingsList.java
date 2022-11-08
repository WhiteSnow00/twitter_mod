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
public class JsonSettingsList extends lhh<cop>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField
    public List<fqp> d;
    @JsonField
    public xrv e;
    @JsonField
    public xrv f;
    @JsonField
    public JsonOcfRichText g;
    @JsonField
    public ioh h;
    @JsonField
    public boolean i;
    @JsonField
    public iej j;
    @JsonField
    public s3a k;
    @JsonField
    public JsonOcfComponentCollection l;
    @JsonField
    public boolean m;
    
    @Override
    public final h4j t() {
        final cop$a cop$a = new cop$a();
        ((lsr$a)cop$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)cop$a).g = JsonOcfRichText.s(this.b);
        ((lsr$a)cop$a).h = this.j;
        cop$a.l = this.c;
        cop$a.k = this.d;
        cop$a.m = JsonOcfRichText.s(this.g);
        ((lsr$a)cop$a).a = this.e;
        ((lsr$a)cop$a).b = this.f;
        cop$a.n = this.h;
        cop$a.p = this.k;
        cop$a.o = this.i;
        final JsonOcfComponentCollection l = this.l;
        n16 t;
        if (l != null) {
            t = l.t();
        }
        else {
            t = null;
        }
        ((lsr$a)cop$a).j = t;
        cop$a.q = this.m;
        return (h4j)cop$a;
    }
}
