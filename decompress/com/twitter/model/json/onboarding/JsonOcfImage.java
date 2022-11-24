// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfImage extends tih<bej>
{
    @JsonField
    public b8d a;
    @JsonField
    public String b;
    
    @Override
    public final Object s() {
        final bej$a bej$a = new bej$a();
        bej$a.a = this.a;
        bej$a.b = this.b;
        return ((z4j)bej$a).j();
    }
}
