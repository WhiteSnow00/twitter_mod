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
public class JsonAlertDialog extends qhh<uw>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public ssv c;
    @JsonField
    public ssv d;
    @JsonField
    public ssv e;
    @JsonField
    public JsonOcfComponentCollection f;
    
    public final n4j t() {
        final uw$b uw$b = new uw$b();
        ((dtr$a)uw$b).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)uw$b).g = JsonOcfRichText.s(this.b);
        ((dtr$a)uw$b).a = this.c;
        ((dtr$a)uw$b).c = this.d;
        uw$b.k = this.e;
        final JsonOcfComponentCollection f = this.f;
        x06 t;
        if (f != null) {
            t = f.t();
        }
        else {
            t = null;
        }
        ((dtr$a)uw$b).j = t;
        return (n4j)uw$b;
    }
}
