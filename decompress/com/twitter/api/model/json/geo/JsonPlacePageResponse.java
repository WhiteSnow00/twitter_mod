// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.api.model.json.geo;

import java.util.ArrayList;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPlacePageResponse extends fih<sev>
{
    @JsonField
    public sev$a a;
    @JsonField
    public sev$b b;
    @JsonField
    public sev$b c;
    
    public final Object s() {
        return new sev(this.a, this.c);
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonPlacePageHeader extends fih<sev$a>
    {
        @JsonField
        public qev a;
        
        public final Object s() {
            final qev a = this.a;
            Object o;
            if (a == null) {
                o = null;
            }
            else {
                o = new sev$a(a);
            }
            return o;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonPlacePageTimeline extends fih<sev$b>
    {
        @JsonField
        public String a;
        @JsonField
        public List<nh0> b;
        
        public final Object s() {
            final String a = this.a;
            if (a != null) {
                final ArrayList b = this.b;
                if (b != null) {
                    return new sev$b(a, (List)b);
                }
            }
            return null;
        }
    }
}
