// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonMenuDialog extends qhh<p4h>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public List<ssv> b;
    @JsonField
    public ssv c;
    @JsonField
    public JsonOcfComponentCollection d;
    
    public final n4j t() {
        final p4h.a a = new p4h.a();
        a.f = JsonOcfRichText.s(this.a);
        final int a2 = c5j.a;
        a.k = this.b;
        a.l = this.c;
        final JsonOcfComponentCollection d = this.d;
        x06 t;
        if (d != null) {
            t = d.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (n4j)a;
    }
}
