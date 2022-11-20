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
public class JsonSelectBanner extends qhh<bdp>
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
    public vsr e;
    @JsonField
    public JsonOcfComponentCollection f;
    
    public final n4j t() {
        final bdp$a bdp$a = new bdp$a();
        ((dtr$a)bdp$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)bdp$a).g = JsonOcfRichText.s(this.b);
        ((dtr$a)bdp$a).a = this.c;
        ((dtr$a)bdp$a).b = this.d;
        bdp$a.k = this.e;
        final JsonOcfComponentCollection f = this.f;
        x06 t;
        if (f != null) {
            t = f.t();
        }
        else {
            t = null;
        }
        ((dtr$a)bdp$a).j = t;
        return (n4j)bdp$a;
    }
}
