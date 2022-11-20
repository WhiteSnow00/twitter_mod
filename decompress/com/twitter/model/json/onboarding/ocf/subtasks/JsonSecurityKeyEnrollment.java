// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSecurityKeyEnrollment extends qhh<obp>
{
    @JsonField
    public String a;
    @JsonField
    public ssv b;
    @JsonField
    public ssv c;
    @JsonField
    public ssv d;
    
    public final n4j t() {
        final obp$a obp$a = new obp$a();
        final String a = this.a;
        czd.f((Object)a, "challenge");
        obp$a.k = a;
        final ssv b = this.b;
        czd.f((Object)b, "nextLink");
        obp$a.l = b;
        final ssv c = this.c;
        czd.f((Object)c, "failLink");
        obp$a.m = c;
        czd.f((Object)this.d, "unsupportedLink");
        return (n4j)obp$a;
    }
}
