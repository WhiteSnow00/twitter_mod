// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.moments;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonThemeData extends tih<sls>
{
    @JsonField
    public int a;
    @JsonField
    public int b;
    
    @Override
    public final Object s() {
        return new sls(this.a | 0xFF000000, 0xFF000000 | this.b);
    }
}
