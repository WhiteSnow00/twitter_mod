// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOpenHomeTimeline extends lhh<gmj>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public xrv c;
    @JsonField
    public xrv d;
    
    @Override
    public final h4j t() {
        final gmj$a gmj$a = new gmj$a();
        ((lsr$a)gmj$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        ((lsr$a)gmj$a).g = JsonOcfRichText.s(this.b);
        gmj$a.k = this.c;
        ((lsr$a)gmj$a).a = this.d;
        return (h4j)gmj$a;
    }
}
