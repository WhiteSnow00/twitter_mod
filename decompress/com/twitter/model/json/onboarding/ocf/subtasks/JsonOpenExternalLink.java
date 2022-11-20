// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonOpenExternalLink extends qhh<hmj>
{
    @JsonField
    public String a;
    @JsonField
    public ssv b;
    @JsonField
    public ssv c;
    
    public final n4j t() {
        final hmj.a a = new hmj.a();
        final String a2 = this.a;
        czd.f((Object)a2, "externalLinkUrl");
        a.k = a2;
        a.a = this.b;
        final int a3 = c5j.a;
        a.l = this.c;
        return (n4j)a;
    }
}
