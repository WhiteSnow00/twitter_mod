// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOpenExternalLink extends lhh<cmj>
{
    @JsonField
    public String a;
    @JsonField
    public xrv b;
    @JsonField
    public xrv c;
    
    @Override
    public final h4j t() {
        final cmj$a cmj$a = new cmj$a();
        final String a = this.a;
        zzd.f((Object)a, "externalLinkUrl");
        cmj$a.k = a;
        ((lsr$a)cmj$a).a = this.b;
        final int a2 = w4j.a;
        cmj$a.l = this.c;
        return (h4j)cmj$a;
    }
}
