// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNFTsSlice extends tih<w6i.b>
{
    @JsonField
    public List<u4i> a;
    @JsonField
    public qfq b;
    
    @Override
    public final Object s() {
        return new w6i.b(this.a, this.b);
    }
}
