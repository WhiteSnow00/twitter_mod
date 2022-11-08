// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.ads.api;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVideoAnalyticsScribe extends aih<y00>
{
    @JsonField
    public long a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    
    @Override
    public final Object s() {
        final sm9 sm9 = new sm9(this.a, this.b);
        final boolean valid = sm9.isValid();
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
            o2 = new y00(c, sm9);
            return o2;
        }
        catch (final NumberFormatException ex) {
            o2 = o;
            return o2;
        }
    }
}
