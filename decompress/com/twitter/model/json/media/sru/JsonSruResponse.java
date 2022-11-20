// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.media.sru;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSruResponse extends fih<z4r>
{
    @JsonField
    public long a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public JsonProcessingInfo d;
    
    public final Object s() {
        final JsonProcessingInfo d = this.d;
        z4r z4r;
        if (d == null) {
            final long a = this.a;
            int n;
            if (a == 0L) {
                n = 2;
            }
            else {
                n = 0;
            }
            z4r = new z4r(a, n, 0, 0, null);
        }
        else {
            z4r = new z4r(this.a, d.a, d.b, d.c, d.d);
        }
        return z4r;
    }
}
