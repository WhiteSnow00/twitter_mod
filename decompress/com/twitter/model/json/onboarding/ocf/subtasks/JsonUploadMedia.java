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
public class JsonUploadMedia extends qhh<j4w>
{
    @JsonField
    public List<wzg> a;
    @JsonField
    public ssv b;
    @JsonField
    public JsonOcfComponentCollection c;
    
    public final n4j t() {
        final j4w$a j4w$a = new j4w$a();
        j4w$a.k = this.a;
        ((dtr$a)j4w$a).a = this.b;
        final int a = c5j.a;
        final JsonOcfComponentCollection c = this.c;
        x06 t;
        if (c != null) {
            t = c.t();
        }
        else {
            t = null;
        }
        ((dtr$a)j4w$a).j = t;
        return (n4j)j4w$a;
    }
}
