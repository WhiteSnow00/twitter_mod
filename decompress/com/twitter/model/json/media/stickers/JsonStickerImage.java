// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import java.util.regex.Pattern;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonStickerImage extends tih<xhr>
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
    
    @Override
    public final Object s() {
        final int a = this.a;
        Object o = null;
        if (a <= 0) {
            final String e = this.e;
            final Pattern a2 = flr.a;
            if (!e0e.a((Object)e, (Object)"svg")) {
                mqb.o("JsonStickerImage must have a height > 0");
                return o;
            }
        }
        if (this.b <= 0) {
            final String e2 = this.e;
            final Pattern a3 = flr.a;
            if (!e0e.a((Object)e2, (Object)"svg")) {
                mqb.o("JsonStickerImage must have a width > 0");
                return o;
            }
        }
        if (this.c <= 0L) {
            mqb.o("JsonStickerImage must have a byteCount > 0");
        }
        else if (flr.e((CharSequence)this.d)) {
            mqb.o("JsonStickerImage must have a url");
        }
        else if (flr.e((CharSequence)this.e)) {
            mqb.o("JsonStickerImage must have a type");
        }
        else {
            o = new xhr(beq.g(this.b, this.a), this.d, this.e);
        }
        return o;
    }
}
