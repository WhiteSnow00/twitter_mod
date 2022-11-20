// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentCoverMedia extends fih<aph>
{
    @JsonField
    public long a;
    @JsonField
    public jph b;
    @JsonField
    public JsonRenderData c;
    @JsonField
    public kph d;
    
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final aph t() {
        final aph$a aph$a = new aph$a();
        aph$a.a = this.a;
        final jph b = this.b;
        aph$a.b = b;
        final JsonRenderData c = this.c;
        l67 c2;
        if (c != null && b != null) {
            final edq b2 = b.b;
            final l67$a a = c.a;
            if (a == null) {
                final l67$a l67$a = new l67$a();
                l67$a.f = c.c;
                c2 = (l67)((n4j)l67$a).e();
            }
            else {
                a.e = b2;
                a.f = c.c;
                c2 = (l67)((n4j)a).e();
            }
        }
        else {
            c2 = null;
        }
        aph$a.c = c2;
        aph$a.d = this.d;
        return (aph)((n4j)aph$a).e();
    }
}
