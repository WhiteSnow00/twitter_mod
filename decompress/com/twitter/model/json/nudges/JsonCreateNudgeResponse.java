// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCreateNudgeResponse extends lhh<e57>
{
    @JsonField
    public szi a;
    @JsonField
    public szi b;
    
    @Override
    public final h4j t() {
        final e57.a a = new e57.a();
        a.a = this.a;
        a.b = this.b;
        return a;
    }
}
