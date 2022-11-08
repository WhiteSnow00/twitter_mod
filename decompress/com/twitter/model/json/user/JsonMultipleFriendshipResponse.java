// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.user;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMultipleFriendshipResponse extends aih<fth>
{
    @JsonField
    public long a;
    @JsonField
    public boolean b;
    @JsonField
    public boolean c;
    
    @Override
    public final Object s() {
        final fth$a fth$a = new fth$a();
        fth$a.a = this.a;
        fth$a.b = this.b;
        fth$a.c = this.c;
        return ((h4j)fth$a).j();
    }
}
