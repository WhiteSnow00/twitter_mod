// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonChoiceSelection extends qhh<o84>
{
    @JsonField
    public List<v84> a;
    @JsonField
    public String b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public JsonOcfRichText d;
    @JsonField
    public ssv e;
    @JsonField
    public ssv f;
    @JsonField
    public cbi g;
    @JsonField
    public List<String> h;
    @JsonField
    public JsonOcfRichText i;
    @JsonField(typeConverter = m84.class)
    public l84 j;
    @JsonField
    public k84 k;
    @JsonField
    public noh l;
    @JsonField
    public ydj m;
    @JsonField
    public oej n;
    @JsonField
    public JsonOcfComponentCollection o;
    
    public final n4j t() {
        final o84$a o84$a = new o84$a();
        o84$a.k = this.a;
        o84$a.l = this.b;
        ((dtr$a)o84$a).f = JsonOcfRichText.s(this.c);
        final int a = c5j.a;
        ((dtr$a)o84$a).g = JsonOcfRichText.s(this.d);
        ((dtr$a)o84$a).a = this.e;
        ((dtr$a)o84$a).b = this.f;
        l84 m = this.j;
        if (m == null) {
            m = l84.E0;
        }
        o84$a.m = m;
        o84$a.p = this.k;
        o84$a.n = this.g;
        o84$a.o = JsonOcfRichText.s(this.i);
        o84$a.q = this.h;
        o84$a.r = this.l;
        o84$a.s = this.m;
        ((dtr$a)o84$a).h = this.n;
        final JsonOcfComponentCollection o = this.o;
        x06 t;
        if (o != null) {
            t = o.t();
        }
        else {
            t = null;
        }
        ((dtr$a)o84$a).j = t;
        return (n4j)o84$a;
    }
}
