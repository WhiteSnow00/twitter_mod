// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNFTsSlice extends fih<d6i$b>
{
    @JsonField
    public List<b4i> a;
    @JsonField
    public teq b;
    
    public final Object s() {
        return new d6i$b((List)this.a, this.b);
    }
}
