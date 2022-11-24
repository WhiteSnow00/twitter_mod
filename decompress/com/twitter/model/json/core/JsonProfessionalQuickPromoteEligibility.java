// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonProfessionalQuickPromoteEligibility extends tih<o5l>
{
    @JsonField(typeConverter = b5l.class)
    public a5l a;
    @JsonField
    public Boolean b;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final o5l t() {
        final o5l$a o5l$a = new o5l$a();
        o5l$a.a.b((Object)o5l$a, o5l$a.c[0], (Object)(boolean)this.b);
        o5l$a.b = this.a;
        return (o5l)((z4j)o5l$a).e();
    }
}
