// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.common;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterErrors extends aih<pav>
{
    @JsonField
    public List<mav> a;
    
    @Override
    public final Object s() {
        return new pav(ced.g((List)this.a));
    }
}
