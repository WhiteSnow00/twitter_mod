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
public class JsonShowCode extends lhh<j3q>
{
    @JsonField
    public iej a;
    @JsonField(typeConverter = h3q.class)
    public g3q b;
    @JsonField
    public String c;
    @JsonField
    public JsonOcfRichText d;
    @JsonField
    public xrv e;
    @JsonField
    public xrv f;
    @JsonField
    public JsonOcfComponentCollection g;
    
    @Override
    public final h4j t() {
        final j3q$a j3q$a = new j3q$a();
        ((lsr$a)j3q$a).h = this.a;
        final int a = w4j.a;
        final g3q b = this.b;
        pf8.r(b);
        zzd.f((Object)b, "style");
        j3q$a.k = b;
        final String c = this.c;
        pf8.q(c);
        j3q$a.l = c;
        j3q$a.m = JsonOcfRichText.s(this.d);
        ((lsr$a)j3q$a).a = this.e;
        ((lsr$a)j3q$a).b = this.f;
        final JsonOcfComponentCollection g = this.g;
        n16 t;
        if (g != null) {
            t = g.t();
        }
        else {
            t = null;
        }
        ((lsr$a)j3q$a).j = t;
        return (h4j)j3q$a;
    }
}
