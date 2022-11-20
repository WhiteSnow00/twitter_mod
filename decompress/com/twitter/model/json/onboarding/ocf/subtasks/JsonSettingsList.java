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
public class JsonSettingsList extends qhh<sop>
{
    @JsonField
    public JsonOcfRichText a;
    @JsonField
    public JsonOcfRichText b;
    @JsonField
    public String c;
    @JsonField
    public List<wqp> d;
    @JsonField
    public ssv e;
    @JsonField
    public ssv f;
    @JsonField
    public JsonOcfRichText g;
    @JsonField
    public noh h;
    @JsonField
    public boolean i;
    @JsonField
    public oej j;
    @JsonField
    public c3a k;
    @JsonField
    public JsonOcfComponentCollection l;
    @JsonField
    public boolean m;
    
    public final n4j t() {
        final sop$a sop$a = new sop$a();
        ((dtr$a)sop$a).f = JsonOcfRichText.s(this.a);
        final int a = c5j.a;
        ((dtr$a)sop$a).g = JsonOcfRichText.s(this.b);
        ((dtr$a)sop$a).h = this.j;
        sop$a.l = this.c;
        sop$a.k = this.d;
        sop$a.m = JsonOcfRichText.s(this.g);
        ((dtr$a)sop$a).a = this.e;
        ((dtr$a)sop$a).b = this.f;
        sop$a.n = this.h;
        sop$a.p = this.k;
        sop$a.o = this.i;
        final JsonOcfComponentCollection l = this.l;
        x06 t;
        if (l != null) {
            t = l.t();
        }
        else {
            t = null;
        }
        ((dtr$a)sop$a).j = t;
        sop$a.q = this.m;
        return (n4j)sop$a;
    }
}
