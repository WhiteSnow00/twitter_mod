// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCheckLoggedInAccount extends qhh<e64>
{
    @JsonField
    public String a;
    @JsonField
    public ssv b;
    @JsonField
    public ssv c;
    
    public final n4j t() {
        final e64$a e64$a = new e64$a();
        e64$a.m = this.a;
        e64$a.l = this.c;
        e64$a.k = this.b;
        return (n4j)e64$a;
    }
}
