// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.vibe;

import com.twitter.model.vibe.VibeAnnotation;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.model.vibe.Vibe;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVibe extends aih<Vibe>
{
    @JsonField
    public String a;
    @JsonField(name = { "img_url", "imgUrl" })
    public String b;
    @JsonField(name = { "img_description", "imgDescription" })
    public String c;
    @JsonField(name = { "discovery_query_text", "discoveryQueryText" })
    public String d;
    @JsonField
    public VibeAnnotation e;
    
    @Override
    public final Object s() {
        return new Vibe(this.a, this.b, this.c, this.d, this.e);
    }
}
