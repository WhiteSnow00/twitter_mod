// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonStickerVariants extends fih<whr>
{
    @JsonField
    public bhr a;
    @JsonField(name = { "size_1x" })
    public bhr b;
    @JsonField(name = { "size_2x" })
    public bhr c;
    @JsonField(name = { "size_3x" })
    public bhr d;
    @JsonField(name = { "size_4x" })
    public bhr e;
    @JsonField
    public float f;
    
    public final Object s() {
        final bhr a = this.a;
        Object o = null;
        if (a == null) {
            i48.t("JsonStickerVariants must include a raw size");
        }
        else {
            final float f = this.f;
            if (f == 0.0f) {
                i48.t("JsonStickerVariants must include an aspect ratio");
            }
            else {
                o = new whr(a, this.b, this.c, this.d, this.e, f);
            }
        }
        return o;
    }
}
