// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.people;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSingleUserRecommendation extends nge
{
    @JsonField
    public qgv a;
    @JsonField
    public String b;
    @JsonField
    public boolean c;
    
    public final qgv s() {
        qgv a;
        final qgv qgv = a = this.a;
        if (qgv != null) {
            final qgv$b qgv$b = new qgv$b(qgv);
            final ahv.a a2 = new ahv.a();
            a2.a = this.b;
            ((qgv$a)qgv$b).E = (ahv)a2.e();
            final int a3 = o5j.a;
            a = (qgv)((z4j)qgv$b).e();
        }
        return a;
    }
}
