// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments.sports;

import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMomentSportsEvent extends lhh<hph>
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
    public List<hph$b> e;
    
    @Override
    public final h4j t() {
        final hph$a hph$a = new hph$a();
        String a;
        if ((a = this.a) == null) {
            a = "";
        }
        hph$a.a = a;
        hph$a.e = this.b;
        hph$a.d = this.c;
        hph$a.b = this.d;
        hph$a.c = this.e;
        return (h4j)hph$a;
    }
}
