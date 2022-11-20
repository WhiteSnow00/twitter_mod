// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.nft.subsystem.model.NFTCollection;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNFTCollectionWithNFTs extends fih<c1i>
{
    @JsonField(name = { "collection" })
    public NFTCollection a;
    @JsonField(name = { "nfts" })
    public List<b4i> b;
    
    public final Object s() {
        return new c1i(this.a, (List)this.b);
    }
}
