// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.geo;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonVendorInfo extends tih<frw>
{
    @JsonField
    public frw$c a;
    @JsonField
    public frw$a b;
    
    @Override
    public final Object s() {
        return new frw(this.b, this.a);
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonFourSquareInfo extends tih<frw$a>
    {
        @JsonField
        public String a;
        
        @Override
        public final Object s() {
            String a;
            if ((a = this.a) == null) {
                a = "";
            }
            return new frw$a(a);
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonYelpInfo extends tih<frw$c>
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
        
        @Override
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
            for (final frw$c$b g0 : frw$c$b.values()) {
                if (Math.abs(g0.F0 - n) < 1.0E-8) {
                    return new frw$c(a, b, c, g0, this.d);
                }
            }
            frw$c$b g0 = frw$c$b.G0;
            return new frw$c(a, b, c, g0, this.d);
        }
    }
}
