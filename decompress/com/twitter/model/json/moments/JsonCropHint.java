// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCropHint extends lhh<h77>
{
    @JsonField
    public f77.a a;
    @JsonField(name = { "portrait_3_4" })
    public f77.a b;
    @JsonField(name = { "portrait_9_16" })
    public f77.a c;
    @JsonField(name = { "landscape_16_9" })
    public f77.a d;
    
    @Override
    public final h4j t() {
        final h77$a h77$a = new h77$a();
        h77$a.a = this.a;
        h77$a.b = this.b;
        h77$a.c = this.c;
        h77$a.d = this.d;
        return (h4j)h77$a;
    }
}
