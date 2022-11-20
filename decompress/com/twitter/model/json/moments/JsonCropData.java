// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCropData extends qhh<j67>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    @JsonField
    public int c;
    @JsonField
    public int d;
    
    public final n4j t() {
        final j67$a j67$a = new j67$a();
        j67$a.a = this.a;
        j67$a.b = this.b;
        j67$a.c = this.c;
        j67$a.d = this.d;
        return (n4j)j67$a;
    }
}
