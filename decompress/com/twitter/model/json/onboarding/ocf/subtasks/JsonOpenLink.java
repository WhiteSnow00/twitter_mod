// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOpenLink extends lhh<jmj>
{
    @JsonField
    public xrv a;
    @JsonField
    public String b;
    
    @Override
    public final h4j t() {
        final jmj$a jmj$a = new jmj$a();
        final xrv a = this.a;
        pf8.r(a);
        jmj$a.k = a;
        jmj$a.l = this.b;
        return (h4j)jmj$a;
    }
}
