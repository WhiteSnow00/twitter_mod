// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonInAppNotificationSubtask extends lhh<tgd>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public int b;
    @JsonField
    public xrv c;
    
    @Override
    public final h4j t() {
        final tgd$a tgd$a = new tgd$a();
        tgd$a.k = JsonOcfRichText.s(this.a);
        tgd$a.l = this.b;
        ((lsr$a)tgd$a).a = this.c;
        final int a = w4j.a;
        return (h4j)tgd$a;
    }
}
