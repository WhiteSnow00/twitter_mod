// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOcfButton extends tih<wcj>
{
    @JsonField
    public dtv a;
    @JsonField
    public rkp b;
    @JsonField(typeConverter = a63.class)
    public int c;
    @JsonField
    public zdj d;
    
    @Override
    public final Object s() {
        final wcj.a a = new wcj.a();
        a.c = this.c;
        a.o(this.a);
        a.b = this.b;
        final zdj d = this.d;
        if (d != null) {
            a.e = d;
        }
        return a.e();
    }
}
