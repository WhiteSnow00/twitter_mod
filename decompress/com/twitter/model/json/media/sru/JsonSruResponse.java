// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.sru;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSruResponse extends tih<y5r>
{
    @JsonField
    public long a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public JsonProcessingInfo d;
    
    @Override
    public final Object s() {
        final JsonProcessingInfo d = this.d;
        y5r y5r;
        if (d == null) {
            final long a = this.a;
            int n;
            if (a == 0L) {
                n = 2;
            }
            else {
                n = 0;
            }
            y5r = new y5r(a, n, 0, 0, null);
        }
        else {
            y5r = new y5r(this.a, d.a, d.b, d.c, d.d);
        }
        return y5r;
    }
}
