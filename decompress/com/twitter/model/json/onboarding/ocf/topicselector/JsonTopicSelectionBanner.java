// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTopicSelectionBanner extends lhh<eqt>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    
    @Override
    public final h4j t() {
        final eqt$a eqt$a = new eqt$a();
        eqt$a.a = JsonOcfRichText.s(this.a);
        eqt$a.b = JsonOcfRichText.s(this.b);
        eqt$a.c = JsonOcfRichText.s(this.c);
        return (h4j)eqt$a;
    }
}
