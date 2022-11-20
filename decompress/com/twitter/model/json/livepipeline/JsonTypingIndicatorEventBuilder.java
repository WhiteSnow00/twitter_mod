// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import com.twitter.util.user.UserIdentifier;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTypingIndicatorEventBuilder extends qhh<unv>
{
    @JsonField
    public String a;
    @JsonField
    public Long b;
    
    public final n4j t() {
        final Long b = this.b;
        UserIdentifier d;
        if (b != null) {
            d = UserIdentifier.fromId((long)b);
        }
        else {
            d = UserIdentifier.UNDEFINED;
        }
        final unv$a unv$a = new unv$a();
        unv$a.c = this.a;
        unv$a.d = d;
        return (n4j)unv$a;
    }
}
