// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.twitter.model.stratostore.MediaColorData;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonApiImage extends tih<pf0>
{
    @JsonField
    public String a;
    @JsonField
    public MediaColorData b;
    @JsonField(name = { "original_img_url" })
    public String c;
    @JsonField(name = { "original_img_width" })
    public int d;
    @JsonField(name = { "original_img_height" })
    public int e;
    @JsonField(name = { "salient_rect" })
    public w6d f;
    
    @Override
    public final Object s() {
        return new pf0(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
