// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentInfoBadge extends tih<fmd>
{
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    
    @Override
    public final Object s() {
        return new fmd(this.a, js4.g(this.c, 255), js4.g(this.b, 255));
    }
}
