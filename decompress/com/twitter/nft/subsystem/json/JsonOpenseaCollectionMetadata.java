// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.nft.subsystem.json;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.twitter.nft.subsystem.model.NFTOpenseaCollectionMetadata;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOpenseaCollectionMetadata extends tih<NFTOpenseaCollectionMetadata>
{
    @JsonField(name = { "banner_image_url" })
    public String a;
    @JsonField(name = { "created_date_msec" })
    public Long b;
    @JsonField(name = { "description" })
    public String c;
    @JsonField(name = { "featured" })
    public Boolean d;
    @JsonField(name = { "featured_image_url" })
    public String e;
    @JsonField(name = { "image_url" })
    public String f;
    @JsonField(name = { "name" })
    public String g;
    @JsonField(name = { "slug" })
    public String h;
    @JsonField(name = { "verified" })
    public Boolean i;
    
    @Override
    public final Object s() {
        return new NFTOpenseaCollectionMetadata(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
