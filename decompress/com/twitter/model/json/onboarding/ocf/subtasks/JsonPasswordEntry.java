// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.List;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonPasswordEntry extends qhh<uyj>
{
    @JsonField
    public oej a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public JsonOcfRichText c;
    @JsonField
    public String d;
    @JsonField
    public String e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    @JsonField
    public ssv i;
    @JsonField
    public ssv j;
    @JsonField
    public boolean k;
    @JsonField(typeConverter = icw.class)
    public int l;
    @JsonField
    public boolean m;
    @JsonField
    public String n;
    @JsonField
    public JsonOcfRichText o;
    @JsonField(typeConverter = rej.class)
    public qej p;
    @JsonField
    public edj q;
    @JsonField
    public pej r;
    @JsonField
    public pej s;
    @JsonField
    public pej t;
    @JsonField
    public List<jcj> u;
    @JsonField
    public JsonOcfComponentCollection v;
    
    public JsonPasswordEntry() {
        this.p = qej.E0;
    }
    
    public final n4j t() {
        final uyj$a uyj$a = new uyj$a();
        ((dtr$a)uyj$a).h = this.a;
        final int a = c5j.a;
        ((dtr$a)uyj$a).f = JsonOcfRichText.s(this.b);
        ((dtr$a)uyj$a).g = JsonOcfRichText.s(this.c);
        uyj$a.k = this.d;
        uyj$a.l = this.e;
        uyj$a.m = this.f;
        uyj$a.n = this.g;
        uyj$a.o = this.h;
        ((dtr$a)uyj$a).a = this.i;
        ((dtr$a)uyj$a).c = this.j;
        uyj$a.p = this.k;
        uyj$a.q = this.l;
        uyj$a.r = this.m;
        uyj$a.s = this.n;
        uyj$a.t = JsonOcfRichText.s(this.o);
        uyj$a.u = this.p;
        uyj$a.v = this.q;
        uyj$a.w = this.r;
        uyj$a.x = this.s;
        uyj$a.y = this.t;
        uyj$a.z = this.u;
        final JsonOcfComponentCollection v = this.v;
        x06 t;
        if (v != null) {
            t = v.t();
        }
        else {
            t = null;
        }
        ((dtr$a)uyj$a).j = t;
        return (n4j)uyj$a;
    }
}
