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
public class JsonUploadMedia extends lhh<w3w>
{
    @JsonField
    public List<vzg> a;
    @JsonField
    public xrv b;
    @JsonField
    public JsonOcfComponentCollection c;
    
    @Override
    public final h4j t() {
        final w3w$a w3w$a = new w3w$a();
        w3w$a.k = this.a;
        ((lsr$a)w3w$a).a = this.b;
        final int a = w4j.a;
        final JsonOcfComponentCollection c = this.c;
        n16 t;
        if (c != null) {
            t = c.t();
        }
        else {
            t = null;
        }
        ((lsr$a)w3w$a).j = t;
        return (h4j)w3w$a;
    }
}
