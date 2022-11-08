// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSecurityKeyEnrollment extends lhh<xap>
{
    @JsonField
    public String a;
    @JsonField
    public xrv b;
    @JsonField
    public xrv c;
    @JsonField
    public xrv d;
    
    @Override
    public final h4j t() {
        final xap$a xap$a = new xap$a();
        final String a = this.a;
        zzd.f((Object)a, "challenge");
        xap$a.k = a;
        final xrv b = this.b;
        zzd.f((Object)b, "nextLink");
        xap$a.l = b;
        final xrv c = this.c;
        zzd.f((Object)c, "failLink");
        xap$a.m = c;
        zzd.f((Object)this.d, "unsupportedLink");
        return (h4j)xap$a;
    }
}
