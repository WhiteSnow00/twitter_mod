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
public class JsonEnterEmail extends qhh<s4a>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField
    public wqp d;
    @JsonField
    public ssv e;
    @JsonField
    public ssv f;
    @JsonField
    public List<wqp> g;
    @JsonField
    public JsonOcfComponentCollection h;
    
    public final n4j t() {
        final s4a$a s4a$a = new s4a$a();
        ((dtr$a)s4a$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)s4a$a).g = JsonOcfRichText.s(this.b);
        s4a$a.k = this.c;
        s4a$a.l = this.d;
        s4a$a.m = this.g;
        ((dtr$a)s4a$a).a = this.e;
        ((dtr$a)s4a$a).c = this.f;
        final JsonOcfComponentCollection h = this.h;
        x06 t;
        if (h != null) {
            t = h.t();
        }
        else {
            t = null;
        }
        ((dtr$a)s4a$a).j = t;
        return (n4j)s4a$a;
    }
}
