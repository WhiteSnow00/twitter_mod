// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import java.util.AbstractCollection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonStickerItem extends tih<ajr>
{
    @JsonField
    public ihr a;
    @JsonField
    public List<ihr> b;
    
    @Override
    public final Object s() {
        final ihr a = this.a;
        Object o;
        if (a == null) {
            mqb.o("JsonStickerItem must contain a sticker");
            o = null;
        }
        else {
            if (this.b == null) {
                final ged$b g0 = ged.G0;
                final int a2 = o5j.a;
                this.b = (AbstractCollection)g0;
            }
            o = new ajr(a, ged.g((List)this.b));
        }
        return o;
    }
}
