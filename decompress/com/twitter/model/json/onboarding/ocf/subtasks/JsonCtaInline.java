// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonCtaInline extends qhh<d77>
{
    @JsonField
    public String a;
    @JsonField
    public ssv b;
    @JsonField
    public JsonOcfComponentCollection c;
    
    public final n4j t() {
        final d77$a d77$a = new d77$a();
        d77$a.k = this.a;
        ((dtr$a)d77$a).a = this.b;
        final int a = c5j.a;
        final JsonOcfComponentCollection c = this.c;
        x06 t;
        if (c != null) {
            t = c.t();
        }
        else {
            t = null;
        }
        ((dtr$a)d77$a).j = t;
        return (n4j)d77$a;
    }
}
