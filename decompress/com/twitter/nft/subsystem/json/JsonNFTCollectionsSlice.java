// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNFTCollectionsSlice extends tih<u1i.a>
{
    @JsonField
    public List<t1i> a;
    @JsonField
    public qfq b;
    
    @Override
    public final Object s() {
        return new u1i.a(this.a, this.b);
    }
}
