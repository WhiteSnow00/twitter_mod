// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetQuickPromoteEligibility extends tih<apu>
{
    @JsonField(typeConverter = b5l.class)
    public a5l a;
    
    @Override
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final apu t() {
        final apu.a a = new apu.a();
        final a5l a2 = this.a;
        e0e.f((Object)a2, "eligibility");
        a.a = a2;
        return (apu)a.e();
    }
}
