// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTopicSelectionCart extends lhh<fqt>
{
    @JsonField
    public List<String> a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    
    @Override
    public final h4j t() {
        final fqt.a a = new fqt.a();
        a.a = this.a;
        a.b = JsonOcfRichText.s(this.b);
        a.c = JsonOcfRichText.s(this.c);
        return a;
    }
}
