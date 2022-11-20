// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.model.json.onboarding.ocf.subtasks;

import java.util.ArrayList;
import com.twitter.model.json.onboarding.JsonOcfComponentCollection;
import java.util.List;
import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject$FieldNamingPolicy;
import com.bluelinelabs.logansquare.annotation.JsonObject;

@JsonObject(fieldNamingPolicy = JsonObject$FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
public class JsonSsoSubtask extends qhh<p5r>
{
    @JsonField
    public ssv a;
    @JsonField
    public ssv b;
    @JsonField
    public ssv c;
    @JsonField(typeConverter = k5r.class)
    public j5r d;
    @JsonField
    public List<String> e;
    @JsonField
    public String f;
    @JsonField
    public String g;
    @JsonField
    public String h;
    @JsonField
    public String i;
    @JsonField
    public JsonOcfComponentCollection j;
    
    public final n4j t() {
        final p5r.a a = new p5r.a();
        a.a = this.a;
        final int a2 = c5j.a;
        a.c = this.c;
        final ssv b = this.b;
        czd.f((Object)b, "failLink");
        a.q = b;
        final j5r d = this.d;
        czd.f((Object)d, "provider");
        a.k = d;
        final ArrayList e = this.e;
        jee.l((Object)e);
        czd.f((Object)e, "scopes");
        a.o = e;
        a.l = this.f;
        a.m = this.g;
        a.n = this.h;
        final String i = this.i;
        jee.l((Object)i);
        czd.f((Object)i, "state");
        a.p = i;
        final JsonOcfComponentCollection j = this.j;
        x06 t;
        if (j != null) {
            t = j.t();
        }
        else {
            t = null;
        }
        a.j = t;
        return (n4j)a;
    }
}
