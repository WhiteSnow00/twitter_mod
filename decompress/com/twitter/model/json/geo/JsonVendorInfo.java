// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVendorInfo extends fih<pqw>
{
    @JsonField
    public pqw$c a;
    @JsonField
    public pqw$a b;
    
    public final Object s() {
        return new pqw(this.b, this.a);
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonFourSquareInfo extends fih<pqw$a>
    {
        @JsonField
        public String a;
        
        public final Object s() {
            String a;
            if ((a = this.a) == null) {
                a = "";
            }
            return new pqw$a(a);
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonYelpInfo extends fih<pqw$c>
    {
        @JsonField
        public String a;
        @JsonField
        public String b;
        @JsonField
        public String c;
        @JsonField
        public int d;
        @JsonField
        public double e;
        
        public final Object s() {
            String a = this.a;
            if (a == null) {
                a = "";
            }
            String b = this.b;
            if (b == null) {
                b = "";
            }
            final String c = this.c;
            final double n = Math.round(this.e * 2.0) / 2.0;
            for (final pqw$c$b e0 : pqw$c$b.values()) {
                if (Math.abs(e0.D0 - n) < 1.0E-8) {
                    return new pqw$c(a, b, c, e0, this.d);
                }
            }
            pqw$c$b e0 = pqw$c$b.E0;
            return new pqw$c(a, b, c, e0, this.d);
        }
    }
}
