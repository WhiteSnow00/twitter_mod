// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.twitter.model.json.onboarding.JsonOcfHorizonIcon;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonChoiceValue extends tih<aa4>
{
    @JsonField
    public String a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public JsonOcfHorizonIcon d;
    
    @Override
    public final Object s() {
        final JsonOcfHorizonIcon d = this.d;
        zdj zdj;
        if (d == null) {
            zdj = zdj.H0;
        }
        else {
            zdj = d.a;
        }
        final String a = this.a;
        if (a != null) {
            final JsonOcfRichText b = this.b;
            if (b != null) {
                final pej s = JsonOcfRichText.s(b);
                vmw.g((Object)s);
                return new aa4(a, s, JsonOcfRichText.s(this.c), zdj);
            }
        }
        return null;
    }
}
