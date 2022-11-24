// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMediaSource extends tih<o0h>
{
    @JsonField
    public ttr a;
    @JsonField(typeConverter = l1h.class)
    public int b;
    
    @Override
    public final Object s() {
        return new o0h(this.a, this.b);
    }
}
