// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCtaInline extends lhh<z77>
{
    @JsonField
    public String a;
    @JsonField
    public xrv b;
    @JsonField
    public JsonOcfComponentCollection c;
    
    @Override
    public final h4j t() {
        final z77.a a = new z77.a();
        a.k = this.a;
        a.a = this.b;
        final int a2 = w4j.a;
        final JsonOcfComponentCollection c = this.c;
        n16 t;
        if (c != null) {
            t = c.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (h4j)a;
    }
}
