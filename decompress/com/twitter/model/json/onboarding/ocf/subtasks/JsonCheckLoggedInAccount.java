// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCheckLoggedInAccount extends lhh<b74>
{
    @JsonField
    public String a;
    @JsonField
    public xrv b;
    @JsonField
    public xrv c;
    
    @Override
    public final h4j t() {
        final b74$a b74$a = new b74$a();
        b74$a.m = this.a;
        b74$a.l = this.c;
        b74$a.k = this.b;
        return (h4j)b74$a;
    }
}
