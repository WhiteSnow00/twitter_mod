// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCTA extends lhh<l73>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public bmd c;
    
    @Override
    public final h4j t() {
        final l73$a l73$a = new l73$a();
        l73$a.a = this.a;
        l73$a.b = this.b;
        l73$a.c = this.c;
        return (h4j)l73$a;
    }
}
