// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.media.sticker;

import java.util.ArrayList;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonStickerCatalogResponse extends fih<sgr>
{
    @JsonField
    public List<bir> a;
    @JsonField
    public List<bir> b;
    
    public final Object s() {
        final ArrayList a = this.a;
        Object o;
        if (a == null) {
            i48.t("Sticker response must include categories");
            o = null;
        }
        else {
            final List g = gdd.g((List)a);
            final ArrayList b = this.b;
            Object o2;
            if (b == null) {
                o2 = gdd.E0;
                final int a2 = c5j.a;
            }
            else {
                o2 = fq4.c((List)b, (jtb)gie.b);
            }
            o = new sgr(g, (List)o2);
        }
        return o;
    }
}
