// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.channels;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPinnedListsPutResponse extends tih<gfk>
{
    @JsonField
    public List<wek> a;
    
    @Override
    public final Object s() {
        return new gfk((List)this.a);
    }
}
