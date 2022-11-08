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
public class JsonSelectAvatar extends lhh<fcp>
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
    public JsonOcfComponentCollection e;
    
    @Override
    public final h4j t() {
        final fcp$a fcp$a = new fcp$a();
        ((lsr$a)fcp$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)fcp$a).g = JsonOcfRichText.s(this.b);
        ((lsr$a)fcp$a).a = this.c;
        ((lsr$a)fcp$a).b = this.d;
        final JsonOcfComponentCollection e = this.e;
        n16 t;
        if (e != null) {
            t = e.t();
        }
        else {
            t = null;
        }
        ((lsr$a)fcp$a).j = t;
        return (h4j)fcp$a;
    }
}
