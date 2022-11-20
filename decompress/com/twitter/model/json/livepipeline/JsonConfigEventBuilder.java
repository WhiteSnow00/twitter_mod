// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonConfigEventBuilder extends qhh<se6>
{
    @JsonField
    public String a;
    @JsonField
    public long b;
    @JsonField
    public long c;
    
    public final n4j t() {
        final se6$a se6$a = new se6$a();
        se6$a.c = this.a;
        se6$a.d = this.b;
        se6$a.e = this.c;
        return (n4j)se6$a;
    }
}
