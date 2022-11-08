// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonDmUpdateEventBuilder extends lhh<l49>
{
    @JsonField
    public String a;
    @JsonField
    public Long b;
    
    @Override
    public final h4j t() {
        final l49$a l49$a = new l49$a();
        l49$a.c = this.a;
        l49$a.d = this.b;
        return (h4j)l49$a;
    }
}
