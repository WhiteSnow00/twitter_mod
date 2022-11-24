// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonChoiceSelectionSearch extends tih<p94>
{
    @JsonField
    public boolean a;
    @JsonField
    public String b;
    @JsonField
    public JsonOcfRichText c;
    
    @Override
    public final Object s() {
        final p94$a p94$a = new p94$a();
        p94$a.a = this.a;
        p94$a.c = this.b;
        p94$a.b = JsonOcfRichText.s(this.c);
        return ((z4j)p94$a).e();
    }
}
