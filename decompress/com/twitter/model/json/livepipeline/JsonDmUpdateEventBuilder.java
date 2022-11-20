// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonDmUpdateEventBuilder extends qhh<u39>
{
    @JsonField
    public String a;
    @JsonField
    public Long b;
    
    public final n4j t() {
        final u39$a u39$a = new u39$a();
        u39$a.c = this.a;
        u39$a.d = this.b;
        return (n4j)u39$a;
    }
}
