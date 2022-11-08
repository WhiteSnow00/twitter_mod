// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSearchBox extends lhh<m5p>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final h4j t() {
        final m5p$a m5p$a = new m5p$a();
        m5p$a.a = this.a;
        m5p$a.b = this.b;
        return (h4j)m5p$a;
    }
}
