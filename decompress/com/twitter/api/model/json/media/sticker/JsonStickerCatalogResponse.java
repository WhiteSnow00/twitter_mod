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
public class JsonStickerCatalogResponse extends aih<xfr>
{
    public static final kub<hhr, hhr> c;
    @JsonField
    public List<hhr> a;
    @JsonField
    public List<hhr> b;
    
    static {
        JsonStickerCatalogResponse.c = uzf.c;
    }
    
    @Override
    public final Object s() {
        final ArrayList a = this.a;
        Object o;
        if (a == null) {
            xpa.p("Sticker response must include categories");
            o = null;
        }
        else {
            final List g = ced.g((List)a);
            final ArrayList b = this.b;
            Object o2;
            if (b == null) {
                o2 = ced.D0;
                final int a2 = w4j.a;
            }
            else {
                o2 = hr4.c((List)b, (kub)JsonStickerCatalogResponse.c);
            }
            o = new xfr(g, (List)o2);
        }
        return o;
    }
}
