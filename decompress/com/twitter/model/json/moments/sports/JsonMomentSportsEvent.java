// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments.sports;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentSportsEvent extends qhh<mph>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public List<String> c;
    @JsonField
    public long d;
    @JsonField
    public List<mph$b> e;
    
    public final n4j t() {
        final mph$a mph$a = new mph$a();
        String a;
        if ((a = this.a) == null) {
            a = "";
        }
        mph$a.a = a;
        mph$a.e = this.b;
        mph$a.d = this.c;
        mph$a.b = this.d;
        mph$a.c = this.e;
        return (n4j)mph$a;
    }
    
    @JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    public static class JsonParticipantScore extends fih<mph$b>
    {
        @JsonField
        public oph a;
        @JsonField
        public String b;
        
        public final Object s() {
            final oph a = this.a;
            Object o;
            if (a != null) {
                String b;
                if ((b = this.b) == null) {
                    b = "";
                }
                o = new mph$b(a, b);
            }
            else {
                o = null;
            }
            return o;
        }
    }
}
