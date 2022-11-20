// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNFTAvatarMetadata extends fih<c0i>
{
    @JsonField(name = { "nft" })
    public b4i a;
    @JsonField(name = { "collection_metadata" })
    public tlx b;
    
    public final Object s() {
        return new c0i(this.a, this.b);
    }
}
