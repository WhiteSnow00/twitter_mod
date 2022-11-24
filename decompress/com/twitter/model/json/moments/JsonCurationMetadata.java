// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCurationMetadata extends tih<g97>
{
    @JsonField
    public hqh a;
    @JsonField
    public khe b;
    @JsonField
    public boolean c;
    
    @Override
    public final Object s() {
        final hqh a = this.a;
        final hqh f0 = hqh.F0;
        hqh hqh = a;
        if (a == null) {
            hqh = f0;
        }
        final khe b = this.b;
        boolean a2 = true;
        if (b != null) {
            a2 = b.a;
        }
        return new g97(hqh, Boolean.valueOf(a2), this.c);
    }
}
