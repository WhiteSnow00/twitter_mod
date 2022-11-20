// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTwitterListsResponse extends fih<idv>
{
    @JsonField
    public String a;
    @JsonField
    public List<scv> b;
    
    public final Object s() {
        return new idv(gdd.g((List)this.b), this.a);
    }
}
