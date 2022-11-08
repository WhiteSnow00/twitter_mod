// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.nudges;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonNudgeUserContainer extends lhh<qtc>
{
    @JsonField
    public JsonHumanizationNudgeUser a;
    
    @Override
    public final h4j t() {
        final qtc$b qtc$b = new qtc$b();
        final JsonHumanizationNudgeLegacyUser a = this.a.a;
        qtc$b.c = a.e;
        qtc$b.d = a.a;
        qtc$b.b = a.b;
        qtc$b.a = a.c;
        qtc$b.e = a.d;
        return (h4j)qtc$b;
    }
}
