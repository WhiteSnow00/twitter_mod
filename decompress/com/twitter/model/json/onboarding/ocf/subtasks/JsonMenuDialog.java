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
public class JsonMenuDialog extends lhh<o4h>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public List<xrv> b;
    @JsonField
    public xrv c;
    @JsonField
    public JsonOcfComponentCollection d;
    
    @Override
    public final h4j t() {
        final o4h$a o4h$a = new o4h$a();
        ((lsr$a)o4h$a).f = JsonOcfRichText.s(this.a);
        final int a = w4j.a;
        o4h$a.k = this.b;
        o4h$a.l = this.c;
        final JsonOcfComponentCollection d = this.d;
        n16 t;
        if (d != null) {
            t = d.t();
        }
        else {
            t = null;
        }
        ((lsr$a)o4h$a).j = t;
        return (h4j)o4h$a;
    }
}
