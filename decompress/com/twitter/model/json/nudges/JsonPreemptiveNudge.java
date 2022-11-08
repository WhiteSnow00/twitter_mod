// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPreemptiveNudge extends lhh<utk>
{
    @JsonField(typeConverter = rhe.class)
    public uuk a;
    @JsonField
    public String b;
    
    @Override
    public final h4j t() {
        final utk$b utk$b = new utk$b();
        utk$b.b = this.a;
        utk$b.a = this.b;
        return (h4j)utk$b;
    }
}
