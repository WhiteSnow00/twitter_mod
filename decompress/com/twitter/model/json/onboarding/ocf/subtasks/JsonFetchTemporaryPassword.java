// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonFetchTemporaryPassword extends lhh<cxa>
{
    @JsonField
    public boolean a;
    @JsonField
    public xrv b;
    
    @Override
    public final h4j t() {
        final cxa$a cxa$a = new cxa$a();
        cxa$a.k = this.a;
        ((lsr$a)cxa$a).a = this.b;
        final int a = w4j.a;
        return (h4j)cxa$a;
    }
}
