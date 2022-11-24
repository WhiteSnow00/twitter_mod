// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.twitter.nft.subsystem.model.NFTOpenseaCollectionMetadata;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.nft.subsystem.model.NFTCollection;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNFTCollection extends tih<NFTCollection>
{
    @JsonField(name = { "name" })
    public String a;
    @JsonField(name = { "metadata" })
    public NFTOpenseaCollectionMetadata b;
    
    @Override
    public final Object s() {
        return new NFTCollection(this.a, this.b);
    }
}
