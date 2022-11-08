// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.livepipeline;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonConfigEventBuilder extends lhh<nf6>
{
    @JsonField
    public String a;
    @JsonField
    public long b;
    @JsonField
    public long c;
    
    @Override
    public final h4j t() {
        final nf6$a nf6$a = new nf6$a();
        nf6$a.c = this.a;
        nf6$a.d = this.b;
        nf6$a.e = this.c;
        return (h4j)nf6$a;
    }
}
