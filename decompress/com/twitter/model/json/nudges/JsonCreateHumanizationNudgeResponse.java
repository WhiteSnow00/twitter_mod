// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCreateHumanizationNudgeResponse extends lhh<r47>
{
    @JsonField
    public gtc a;
    
    @Override
    public final h4j t() {
        final r47$a r47$a = new r47$a();
        r47$a.a = this.a;
        return (h4j)r47$a;
    }
}
