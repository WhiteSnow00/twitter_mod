// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonInAppNotificationSubtask extends qhh<xfd>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public int b;
    @JsonField
    public ssv c;
    
    public final n4j t() {
        final xfd$a xfd$a = new xfd$a();
        xfd$a.k = JsonOcfRichText.s(this.a);
        xfd$a.l = this.b;
        ((dtr$a)xfd$a).a = this.c;
        final int a = c5j.a;
        return (n4j)xfd$a;
    }
}
