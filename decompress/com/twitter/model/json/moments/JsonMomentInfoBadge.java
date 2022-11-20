// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentInfoBadge extends fih<eld>
{
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    
    public final Object s() {
        return new eld(this.a, dr4.g(this.c, 255), dr4.g(this.b, 255));
    }
}
