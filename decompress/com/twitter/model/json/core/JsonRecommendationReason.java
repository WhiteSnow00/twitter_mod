// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonRecommendationReason extends qhh<c4m>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public boolean c;
    @JsonField
    public boolean d;
    
    public final n4j t() {
        final c4m$a c4m$a = new c4m$a();
        c4m$a.a = this.a;
        c4m$a.b = this.b;
        c4m$a.c = this.c;
        c4m$a.d = this.d;
        return (n4j)c4m$a;
    }
}
