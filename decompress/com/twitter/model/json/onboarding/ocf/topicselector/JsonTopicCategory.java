// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import java.util.List;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTopicCategory extends lhh<lkt>
{
    @JsonField
    public String a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public List<mkt> c;
    
    @Override
    public final h4j t() {
        final lkt$a lkt$a = new lkt$a();
        lkt$a.a = this.a;
        lkt$a.b = JsonOcfRichText.s(this.b);
        lkt$a.c = this.c;
        return (h4j)lkt$a;
    }
}
