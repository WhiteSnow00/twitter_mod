// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonUpdateUsers extends lhh<p3w>
{
    @JsonField
    public List<hfv> a;
    @JsonField
    public xrv b;
    @JsonField
    public JsonOcfComponentCollection c;
    
    @Override
    public final h4j t() {
        final p3w$a p3w$a = new p3w$a();
        final JsonOcfComponentCollection c = this.c;
        n16 t;
        if (c != null) {
            t = c.t();
        }
        else {
            t = null;
        }
        ((lsr$a)p3w$a).j = t;
        final int a = w4j.a;
        p3w$a.k = this.a;
        final xrv b = this.b;
        pf8.r(b);
        ((lsr$a)p3w$a).a = b;
        return (h4j)p3w$a;
    }
}
