// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.ads.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVideoAnalyticsScribe extends fih<z00>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    public final Object s() {
        final bm9 bm9 = new bm9(this.a, this.b);
        final boolean valid = bm9.isValid();
        Object o2;
        final Object o = o2 = null;
        if (!valid) {
            return o2;
        }
        final String c = this.c;
        if (c == null) {
            o2 = o;
            return o2;
        }
        try {
            o2 = new z00(c, bm9);
            return o2;
        }
        catch (final NumberFormatException ex) {
            o2 = o;
            return o2;
        }
    }
}
