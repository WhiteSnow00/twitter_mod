// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonContactsLiveSyncPermissionPrompt extends lhh<u1g>
{
    @JsonField
    public String a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public xrv c;
    @JsonField
    public xrv d;
    @JsonField
    public kdj e;
    @JsonField
    public JsonOcfComponentCollection f;
    
    @Override
    public final h4j t() {
        final u1g.a a = new u1g.a();
        a.k = this.a;
        a.l = JsonOcfRichText.s(this.b);
        a.a = this.c;
        final int a2 = w4j.a;
        a.b = this.d;
        a.m = this.e;
        final JsonOcfComponentCollection f = this.f;
        n16 t;
        if (f != null) {
            t = f.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (h4j)a;
    }
}
