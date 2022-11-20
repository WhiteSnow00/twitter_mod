// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSelectAvatar extends qhh<wcp>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public ssv c;
    @JsonField
    public ssv d;
    @JsonField
    public JsonOcfComponentCollection e;
    
    public final n4j t() {
        final wcp$a wcp$a = new wcp$a();
        ((dtr$a)wcp$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)wcp$a).g = JsonOcfRichText.s(this.b);
        ((dtr$a)wcp$a).a = this.c;
        ((dtr$a)wcp$a).b = this.d;
        final JsonOcfComponentCollection e = this.e;
        x06 t;
        if (e != null) {
            t = e.t();
        }
        else {
            t = null;
        }
        ((dtr$a)wcp$a).j = t;
        return (n4j)wcp$a;
    }
}
