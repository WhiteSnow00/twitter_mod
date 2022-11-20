// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfHeader extends fih<oej>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public pdj c;
    @JsonField
    public cgv d;
    
    public final Object s() {
        return new oej(JsonOcfRichText.s(this.a), JsonOcfRichText.s(this.b), this.c, this.d);
    }
}
