// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.vibe;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.vibe.Vibe;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPreCuratedVibes extends aih<dtk>
{
    @JsonField
    public List<Vibe> a;
    
    @Override
    public final Object s() {
        return new dtk((List)this.a);
    }
}
