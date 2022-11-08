// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.people;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUserRecommendation extends lhh<cgw>
{
    @JsonField
    public hfv a;
    @JsonField
    public String b;
    @JsonField
    public String c;
    @JsonField
    public boolean d;
    
    @Override
    public final h4j t() {
        final cgw$a cgw$a = new cgw$a();
        cgw$a.a = this.a;
        cgw$a.b = this.b;
        cgw$a.c = this.c;
        cgw$a.d = this.d;
        return (h4j)cgw$a;
    }
}
