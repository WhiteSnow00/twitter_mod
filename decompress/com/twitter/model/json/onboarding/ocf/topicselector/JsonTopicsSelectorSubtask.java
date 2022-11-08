// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.topicselector;

import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.Map;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.twitter.model.json.onboarding.JsonOcfRichText;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonTopicsSelectorSubtask extends lhh<zst>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public m5p c;
    @JsonField
    public List<String> d;
    @JsonField
    public Map<String, lkt> e;
    @JsonField
    public Map<String, akt> f;
    @JsonField
    public List<String> g;
    @JsonField
    public fqt h;
    @JsonField
    public eqt i;
    @JsonField
    public JsonOcfRichText j;
    @JsonField
    public JsonOcfRichText k;
    @JsonField
    public xrv l;
    @JsonField
    public xrv m;
    @JsonField(typeConverter = mqt.class)
    public int n;
    @JsonField
    public JsonOcfComponentCollection o;
    
    public JsonTopicsSelectorSubtask() {
        this.n = 1;
    }
    
    @Override
    public final h4j t() {
        final zst.a a = new zst.a();
        a.f = JsonOcfRichText.s(this.a);
        final int a2 = w4j.a;
        a.g = JsonOcfRichText.s(this.b);
        a.k = this.c;
        a.l = this.d;
        a.m = this.e;
        a.n = this.f;
        a.o = this.g;
        a.p = this.h;
        a.q = this.i;
        a.r = JsonOcfRichText.s(this.j);
        a.s = JsonOcfRichText.s(this.k);
        a.a = this.l;
        a.b = this.m;
        a.t = this.n;
        final JsonOcfComponentCollection o = this.o;
        n16 t;
        if (o != null) {
            t = o.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (h4j)a;
    }
}
