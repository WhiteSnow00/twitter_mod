// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.stickers;

import java.util.Date;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonStickerCategory extends fih<bir>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public bhr c;
    @JsonField
    public long d;
    @JsonField
    public List<eir> e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField(typeConverter = iie.class)
    public Date h;
    @JsonField(typeConverter = iie.class)
    public Date i;
    
    public final Object s() {
        final long a = this.a;
        if (a == 0L) {
            i48.t("JsonStickerCategory must have an annotation id");
        }
        else {
            final long d = this.d;
            if (d != 0L) {
                final List g = gdd.g((List)this.e);
                String b;
                if ((b = this.b) == null) {
                    b = "";
                }
                final bhr c = this.c;
                final boolean equals = "promoted".equals(this.f);
                final String g2 = this.g;
                final Date h = this.h;
                final Date i = this.i;
                rqs c2;
                if (h == null) {
                    if (i == null) {
                        c2 = rqs.c;
                    }
                    else {
                        c2 = new rqs(0L, i.getTime());
                    }
                }
                else {
                    final long time = h.getTime();
                    long time2;
                    if (i == null) {
                        time2 = Long.MAX_VALUE;
                    }
                    else {
                        time2 = i.getTime();
                    }
                    c2 = new rqs(time, time2);
                }
                return new bir(d, a, g, b, c, 0, equals, g2, c2);
            }
            i48.t("JsonStickerCategory must have an id");
        }
        return null;
    }
}
