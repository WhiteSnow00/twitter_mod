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
public class JsonSelectBanner extends lhh<kcp>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public xrv c;
    @JsonField
    public xrv d;
    @JsonField
    public dsr e;
    @JsonField
    public JsonOcfComponentCollection f;
    
    @Override
    public final h4j t() {
        final kcp$a kcp$a = new kcp$a();
        ((lsr$a)kcp$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)kcp$a).g = JsonOcfRichText.s(this.b);
        ((lsr$a)kcp$a).a = this.c;
        ((lsr$a)kcp$a).b = this.d;
        kcp$a.k = this.e;
        final JsonOcfComponentCollection f = this.f;
        n16 t;
        if (f != null) {
            t = f.t();
        }
        else {
            t = null;
        }
        ((lsr$a)kcp$a).j = t;
        return (h4j)kcp$a;
    }
}
