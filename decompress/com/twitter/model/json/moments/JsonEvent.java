// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonEvent extends lhh<aca>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    
    @Override
    public final h4j t() {
        final aca.a a = new aca.a();
        a.a = this.a;
        a.b = this.b;
        return a;
    }
}
