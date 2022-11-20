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
public class JsonStickerItem extends fih<eir>
{
    @JsonField
    public mgr a;
    @JsonField
    public List<mgr> b;
    
    public final Object s() {
        final mgr a = this.a;
        Object o;
        if (a == null) {
            i48.t("JsonStickerItem must contain a sticker");
            o = null;
        }
        else {
            if (this.b == null) {
                final gdd$b e0 = gdd.E0;
                final int a2 = c5j.a;
                this.b = (AbstractCollection)e0;
            }
            o = new eir(a, gdd.g((List)this.b));
        }
        return o;
    }
}
