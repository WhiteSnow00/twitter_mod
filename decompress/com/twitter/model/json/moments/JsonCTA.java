// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCTA extends qhh<c73>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public eld c;
    
    public final n4j t() {
        final c73$a c73$a = new c73$a();
        c73$a.a = this.a;
        c73$a.b = this.b;
        c73$a.c = this.c;
        return (n4j)c73$a;
    }
}
