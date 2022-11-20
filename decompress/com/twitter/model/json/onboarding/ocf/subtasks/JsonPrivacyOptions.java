// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPrivacyOptions extends qhh<k0l>
{
    @JsonField
    public String a;
    @JsonField
    public String b;
    @JsonField
    public Boolean c;
    @JsonField
    public String d;
    @JsonField
    public JsonOcfRichText e;
    @JsonField
    public Boolean f;
    @JsonField
    public String g;
    @JsonField
    public JsonOcfRichText h;
    @JsonField
    public ssv i;
    @JsonField
    public JsonOcfComponentCollection j;
    
    public final n4j t() {
        final k0l$a k0l$a = new k0l$a();
        final String a = this.a;
        jee.l((Object)a);
        k0l$a.k = a;
        k0l$a.l = this.b;
        k0l$a.n = this.d;
        k0l$a.o = JsonOcfRichText.s(this.e);
        k0l$a.q = this.g;
        k0l$a.r = JsonOcfRichText.s(this.h);
        ((dtr$a)k0l$a).a = this.i;
        final int a2 = c5j.a;
        final JsonOcfComponentCollection j = this.j;
        x06 t;
        if (j != null) {
            t = j.t();
        }
        else {
            t = null;
        }
        ((dtr$a)k0l$a).j = t;
        final Boolean c = this.c;
        if (c != null) {
            k0l$a.m = c;
        }
        final Boolean f = this.f;
        if (f != null) {
            k0l$a.p = f;
        }
        return (n4j)k0l$a;
    }
}
