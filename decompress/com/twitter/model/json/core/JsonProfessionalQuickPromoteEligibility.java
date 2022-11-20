// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonProfessionalQuickPromoteEligibility extends fih<z4l>
{
    @JsonField(typeConverter = m4l.class)
    public l4l a;
    @JsonField
    public Boolean b;
    
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final z4l t() {
        final z4l$a z4l$a = new z4l$a();
        z4l$a.a.b((Object)z4l$a, z4l$a.c[0], (Object)(boolean)this.b);
        z4l$a.b = this.a;
        return (z4l)((n4j)z4l$a).e();
    }
}
