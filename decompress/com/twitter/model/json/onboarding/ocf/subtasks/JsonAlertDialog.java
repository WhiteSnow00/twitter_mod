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
public class JsonAlertDialog extends lhh<tw>
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
    public xrv e;
    @JsonField
    public JsonOcfComponentCollection f;
    
    @Override
    public final h4j t() {
        final tw.b b = new tw.b();
        b.f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        b.g = JsonOcfRichText.s(this.b);
        b.a = this.c;
        b.c = this.d;
        b.k = this.e;
        final JsonOcfComponentCollection f = this.f;
        n16 t;
        if (f != null) {
            t = f.t();
        }
        else {
            t = null;
        }
        b.j = t;
        return (h4j)b;
    }
}
