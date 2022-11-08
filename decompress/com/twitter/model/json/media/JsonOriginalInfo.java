// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOriginalInfo extends lhh<moj>
{
    @JsonField
    public String a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public JsonRect[] d;
    @JsonField
    public JsonRect e;
    
    public final moj$a u() {
        final moj$a moj$a = new moj$a();
        String a;
        if ((a = this.a) == null) {
            a = "";
        }
        moj$a.a = a;
        moj$a.b = ncq.g(this.b, this.c);
        if (this.b > 0 && this.c > 0 && this.d != null) {
            final ijf h = ijf.H();
            final float n = 1.0f / this.b;
            final float n2 = 1.0f / this.c;
            for (final JsonRect jsonRect : this.d) {
                final int a2 = jsonRect.a;
                if (a2 >= 0 && jsonRect.b >= 0 && jsonRect.c > 0 && jsonRect.d > 0) {
                    final float min = Math.min(a2 * n, 1.0f);
                    final float min2 = Math.min(jsonRect.b * n2, 1.0f);
                    final float min3 = Math.min((jsonRect.a + jsonRect.c) * n, 1.0f);
                    final float min4 = Math.min((jsonRect.b + jsonRect.d) * n2, 1.0f);
                    if (min < min3 && min2 < min4) {
                        h.p((Object)new abm(min, min2, min3, min4));
                    }
                }
            }
            moj$a.c = (List)((h4j)h).e();
        }
        return moj$a;
    }
}
