// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonStickerVariants extends tih<sir>
{
    @JsonField
    public xhr a;
    @JsonField(name = { "size_1x" })
    public xhr b;
    @JsonField(name = { "size_2x" })
    public xhr c;
    @JsonField(name = { "size_3x" })
    public xhr d;
    @JsonField(name = { "size_4x" })
    public xhr e;
    @JsonField
    public float f;
    
    @Override
    public final Object s() {
        final xhr a = this.a;
        Object o = null;
        if (a == null) {
            mqb.o("JsonStickerVariants must include a raw size");
        }
        else {
            final float f = this.f;
            if (f == 0.0f) {
                mqb.o("JsonStickerVariants must include an aspect ratio");
            }
            else {
                o = new sir(a, this.b, this.c, this.d, this.e, f);
            }
        }
        return o;
    }
}
