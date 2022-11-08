// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.vibe;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.vibe.VibeAnnotation;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVibeAnnotation extends aih<VibeAnnotation>
{
    @JsonField
    public long a;
    @JsonField
    public long b;
    @JsonField
    public long c;
    
    @Override
    public final Object s() {
        return new VibeAnnotation(this.a, this.b, this.c);
    }
}
