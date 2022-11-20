// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNudgeUserContainer extends qhh<usc>
{
    @JsonField
    public JsonHumanizationNudgeUser a;
    
    public final n4j t() {
        final usc$b usc$b = new usc$b();
        final JsonHumanizationNudgeLegacyUser a = this.a.a;
        usc$b.c = a.e;
        usc$b.d = a.a;
        usc$b.b = a.b;
        usc$b.a = a.c;
        usc$b.e = a.d;
        return (n4j)usc$b;
    }
}
