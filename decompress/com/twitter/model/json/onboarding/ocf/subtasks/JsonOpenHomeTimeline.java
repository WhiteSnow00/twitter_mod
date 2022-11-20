// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOpenHomeTimeline extends qhh<lmj>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public ssv c;
    @JsonField
    public ssv d;
    
    public final n4j t() {
        final lmj$a lmj$a = new lmj$a();
        ((dtr$a)lmj$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)lmj$a).g = JsonOcfRichText.s(this.b);
        lmj$a.k = this.c;
        ((dtr$a)lmj$a).a = this.d;
        return (n4j)lmj$a;
    }
}
