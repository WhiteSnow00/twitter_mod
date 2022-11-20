// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import java.util.regex.Pattern;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonStickerImage extends fih<bhr>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public long c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    
    public final Object s() {
        final int a = this.a;
        Object o = null;
        if (a <= 0) {
            final String e = this.e;
            final Pattern a2 = ikr.a;
            if (!czd.a((Object)e, (Object)"svg")) {
                i48.t("JsonStickerImage must have a height > 0");
                return o;
            }
        }
        if (this.b <= 0) {
            final String e2 = this.e;
            final Pattern a3 = ikr.a;
            if (!czd.a((Object)e2, (Object)"svg")) {
                i48.t("JsonStickerImage must have a width > 0");
                return o;
            }
        }
        if (this.c <= 0L) {
            i48.t("JsonStickerImage must have a byteCount > 0");
        }
        else if (ikr.e((CharSequence)this.d)) {
            i48.t("JsonStickerImage must have a url");
        }
        else if (ikr.e((CharSequence)this.e)) {
            i48.t("JsonStickerImage must have a type");
        }
        else {
            o = new bhr(edq.g(this.b, this.a), this.d, this.e);
        }
        return o;
    }
}
