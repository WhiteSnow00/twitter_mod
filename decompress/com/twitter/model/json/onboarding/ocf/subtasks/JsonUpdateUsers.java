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
public class JsonUpdateUsers extends qhh<c4w>
{
    @JsonField
    public List<cgv> a;
    @JsonField
    public ssv b;
    @JsonField
    public JsonOcfComponentCollection c;
    
    public final n4j t() {
        final c4w$a c4w$a = new c4w$a();
        final JsonOcfComponentCollection c = this.c;
        x06 t;
        if (c != null) {
            t = c.t();
        }
        else {
            t = null;
        }
        ((dtr$a)c4w$a).j = t;
        final int a = c5j.a;
        c4w$a.k = this.a;
        final ssv b = this.b;
        jee.l((Object)b);
        ((dtr$a)c4w$a).a = b;
        return (n4j)c4w$a;
    }
}
