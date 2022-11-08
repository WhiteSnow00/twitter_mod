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
public class JsonPlacePageResponse extends aih<xdv>
{
    @JsonField
    public xdv$a a;
    @JsonField
    public xdv$b b;
    @JsonField
    public xdv$b c;
    
    @Override
    public final Object s() {
        return new xdv(this.a, this.c);
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonPlacePageHeader extends aih<xdv$a>
    {
        @JsonField
        public vdv a;
        
        @Override
        public final Object s() {
            final vdv a = this.a;
            Object o;
            if (a == null) {
                o = null;
            }
            else {
                o = new xdv$a(a);
            }
            return o;
        }
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonPlacePageTimeline extends aih<xdv$b>
    {
        @JsonField
        public String a;
        @JsonField
        public List<rh0> b;
        
        @Override
        public final Object s() {
            final String a = this.a;
            if (a != null) {
                final ArrayList b = this.b;
                if (b != null) {
                    return new xdv$b(a, (List)b);
                }
            }
            return null;
        }
    }
}
