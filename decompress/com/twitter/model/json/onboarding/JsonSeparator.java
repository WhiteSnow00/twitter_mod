// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSeparator extends tih<rkp>
{
    @JsonField
    public JsonOcfRichText a;
    
    @Override
    public final Object s() {
        final rkp.a a = new rkp.a();
        a.a = JsonOcfRichText.s(this.a);
        return a.e();
    }
}
