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
public class JsonShowCode extends qhh<a4q>
{
    @JsonField
    public oej a;
    @JsonField(typeConverter = y3q.class)
    public x3q b;
    @JsonField
    public String c;
    @JsonField
    public JsonOcfRichText d;
    @JsonField
    public ssv e;
    @JsonField
    public ssv f;
    @JsonField
    public JsonOcfComponentCollection g;
    
    public final n4j t() {
        final a4q$a a4q$a = new a4q$a();
        ((dtr$a)a4q$a).h = this.a;
        final int a = c5j.a;
        final x3q b = this.b;
        jee.l((Object)b);
        czd.f((Object)b, "style");
        a4q$a.k = b;
        final String c = this.c;
        jee.k(c);
        a4q$a.l = c;
        a4q$a.m = JsonOcfRichText.s(this.d);
        ((dtr$a)a4q$a).a = this.e;
        ((dtr$a)a4q$a).b = this.f;
        final JsonOcfComponentCollection g = this.g;
        x06 t;
        if (g != null) {
            t = g.t();
        }
        else {
            t = null;
        }
        ((dtr$a)a4q$a).j = t;
        return (n4j)a4q$a;
    }
}
