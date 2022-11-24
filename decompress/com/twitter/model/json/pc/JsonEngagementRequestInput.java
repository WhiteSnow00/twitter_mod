// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.pc;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEngagementRequestInput extends nge
{
    @JsonField
    public String a;
    @JsonField
    public boolean b;
    @JsonField
    public JsonEngagementMetadataInput c;
    
    public static JsonEngagementRequestInput s(final gjl gjl) {
        final JsonEngagementRequestInput jsonEngagementRequestInput = new JsonEngagementRequestInput();
        jsonEngagementRequestInput.a = gjl.a;
        jsonEngagementRequestInput.b = gjl.d();
        return jsonEngagementRequestInput;
    }
}
