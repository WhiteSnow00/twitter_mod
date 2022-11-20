// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCurationMetadata extends fih<a87>
{
    @JsonField
    public sph a;
    @JsonField
    public nge b;
    @JsonField
    public boolean c;
    
    public final Object s() {
        final sph a = this.a;
        final sph d0 = sph.D0;
        sph sph = a;
        if (a == null) {
            sph = d0;
        }
        final nge b = this.b;
        boolean a2 = true;
        if (b != null) {
            a2 = b.a;
        }
        return new a87(sph, Boolean.valueOf(a2), this.c);
    }
}
