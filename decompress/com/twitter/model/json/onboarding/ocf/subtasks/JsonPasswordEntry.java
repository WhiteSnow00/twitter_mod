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
public class JsonPasswordEntry extends lhh<qyj>
{
    @JsonField
    public iej a;
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
    public xrv i;
    @JsonField
    public xrv j;
    @JsonField
    public boolean k;
    @JsonField(typeConverter = xbw.class)
    public int l;
    @JsonField
    public boolean m;
    @JsonField
    public String n;
    @JsonField
    public JsonOcfRichText o;
    @JsonField(typeConverter = lej.class)
    public kej p;
    @JsonField
    public zcj q;
    @JsonField
    public jej r;
    @JsonField
    public jej s;
    @JsonField
    public jej t;
    @JsonField
    public List<ecj> u;
    @JsonField
    public JsonOcfComponentCollection v;
    
    public JsonPasswordEntry() {
        this.p = kej.D0;
    }
    
    @Override
    public final h4j t() {
        final qyj$a qyj$a = new qyj$a();
        ((lsr$a)qyj$a).h = this.a;
        final int a = w4j.a;
        ((lsr$a)qyj$a).f = JsonOcfRichText.s(this.b);
        ((lsr$a)qyj$a).g = JsonOcfRichText.s(this.c);
        qyj$a.k = this.d;
        qyj$a.l = this.e;
        qyj$a.m = this.f;
        qyj$a.n = this.g;
        qyj$a.o = this.h;
        ((lsr$a)qyj$a).a = this.i;
        ((lsr$a)qyj$a).c = this.j;
        qyj$a.p = this.k;
        qyj$a.q = this.l;
        qyj$a.r = this.m;
        qyj$a.s = this.n;
        qyj$a.t = JsonOcfRichText.s(this.o);
        qyj$a.u = this.p;
        qyj$a.v = this.q;
        qyj$a.w = this.r;
        qyj$a.x = this.s;
        qyj$a.y = this.t;
        qyj$a.z = this.u;
        final JsonOcfComponentCollection v = this.v;
        n16 t;
        if (v != null) {
            t = v.t();
        }
        else {
            t = null;
        }
        ((lsr$a)qyj$a).j = t;
        return (h4j)qyj$a;
    }
}
