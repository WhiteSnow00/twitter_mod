// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.core;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTweetQuickPromoteEligibility extends fih<oou>
{
    @JsonField(typeConverter = m4l.class)
    public l4l a;
    
    public final /* bridge */ Object s() {
        return this.t();
    }
    
    public final oou t() {
        final oou$a oou$a = new oou$a();
        final l4l a = this.a;
        czd.f((Object)a, "eligibility");
        oou$a.a = a;
        return (oou)((n4j)oou$a).e();
    }
}
