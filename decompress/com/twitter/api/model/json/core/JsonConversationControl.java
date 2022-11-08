// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonConversationControl extends lhh<cr6>
{
    @JsonField(typeConverter = a.class)
    public JsonConversationControl.JsonConversationControl$a a;
    @JsonField
    public GraphqlJsonTwitterUser b;
    
    @Override
    public final h4j t() {
        final cr6.a a = new cr6.a();
        final JsonConversationControl.JsonConversationControl$a a2 = this.a;
        if (a2 != null) {
            a.a = a2.a;
        }
        final GraphqlJsonTwitterUser b = this.b;
        if (b != null) {
            final GraphqlJsonTwitterUser.JsonGraphQlLegacyTwitterUser m0 = b.m0;
            if (m0 != null) {
                a.b = m0.c;
            }
            else {
                a.b = b.c;
            }
        }
        return a;
    }
}
