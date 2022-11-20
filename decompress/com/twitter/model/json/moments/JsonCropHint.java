// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCropHint extends qhh<l67>
{
    @JsonField
    public j67$a a;
    @JsonField(name = { "portrait_3_4" })
    public j67$a b;
    @JsonField(name = { "portrait_9_16" })
    public j67$a c;
    @JsonField(name = { "landscape_16_9" })
    public j67$a d;
    
    public final n4j t() {
        final l67$a l67$a = new l67$a();
        l67$a.a = this.a;
        l67$a.b = this.b;
        l67$a.c = this.c;
        l67$a.d = this.d;
        return (n4j)l67$a;
    }
}
