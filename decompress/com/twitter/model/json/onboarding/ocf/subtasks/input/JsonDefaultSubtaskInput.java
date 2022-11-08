// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks.input;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonDefaultSubtaskInput extends ige
{
    @JsonField
    public String a;
    
    public static JsonDefaultSubtaskInput s(final mrd mrd) {
        final JsonDefaultSubtaskInput jsonDefaultSubtaskInput = new JsonDefaultSubtaskInput();
        final xrv a = mrd.a;
        pf8.r(a);
        jsonDefaultSubtaskInput.a = a.b;
        return jsonDefaultSubtaskInput;
    }
}
