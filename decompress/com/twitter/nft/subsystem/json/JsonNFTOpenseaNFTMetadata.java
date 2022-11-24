// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import java.util.List;
import com.twitter.nft.subsystem.model.NFTCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNFTOpenseaNFTMetadata extends tih<a5i>
{
    @JsonField(name = { "name" })
    public String a;
    @JsonField(name = { "schema" })
    public String b;
    @JsonField(name = { "description" })
    public String c;
    @JsonField(name = { "image_url" })
    public String d;
    @JsonField(name = { "creator_address" })
    public String e;
    @JsonField(name = { "creator_username" })
    public String f;
    @JsonField(name = { "creator_profile_image_url" })
    public String g;
    @JsonField(name = { "collection" })
    public NFTCollection h;
    @JsonField(name = { "traits" })
    public List<aoj> i;
    
    @Override
    public final Object s() {
        return new a5i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
