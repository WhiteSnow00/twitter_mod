// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentCoverMedia extends tih<pph>
{
    @JsonField
    public long a;
    @JsonField
    public yph b;
    @JsonField
    public JsonRenderData c;
    @JsonField
    public zph d;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final pph t() {
        final pph.a a = new pph.a();
        a.a = this.a;
        final yph b = this.b;
        a.b = b;
        final JsonRenderData c = this.c;
        q77 c2;
        if (c != null && b != null) {
            final beq b2 = b.b;
            final q77.a a2 = c.a;
            if (a2 == null) {
                final q77.a a3 = new q77.a();
                a3.f = c.c;
                c2 = (q77)a3.e();
            }
            else {
                a2.e = b2;
                a2.f = c.c;
                c2 = (q77)a2.e();
            }
        }
        else {
            c2 = null;
        }
        a.c = c2;
        a.d = this.d;
        return (pph)a.e();
    }
}
