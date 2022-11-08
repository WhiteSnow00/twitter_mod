// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.user;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMultipleDestroyFriendshipResponse extends aih<eth>
{
    @JsonField(name = { "id_str", "id" })
    public long a;
    @JsonField
    public boolean b;
    
    @Override
    public final Object s() {
        final eth$a eth$a = new eth$a();
        eth$a.a = this.a;
        eth$a.b = this.b;
        return ((h4j)eth$a).j();
    }
}
