// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfButton extends fih<jcj>
{
    @JsonField
    public ssv a;
    @JsonField
    public vjp b;
    @JsonField(typeConverter = h53.class)
    public int c;
    @JsonField
    public mdj d;
    
    public final Object s() {
        final jcj$a jcj$a = new jcj$a();
        jcj$a.c = this.c;
        jcj$a.o(this.a);
        jcj$a.b = this.b;
        final mdj d = this.d;
        if (d != null) {
            jcj$a.e = d;
        }
        return ((n4j)jcj$a).e();
    }
}
