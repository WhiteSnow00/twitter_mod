// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonAuthorInfo extends fih<t51>
{
    @JsonField
    public long a;
    @JsonField(name = { "verified" })
    public boolean b;
    @JsonField
    public String c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    
    public final Object s() {
        return new t51(this.a, this.b, this.c, this.d, this.e);
    }
}
